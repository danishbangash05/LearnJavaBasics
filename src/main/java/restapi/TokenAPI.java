package restapi;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import okhttp3.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import static io.restassured.RestAssured.given;

public class TokenAPI {
    public static void main(String[] args) throws IOException {
            getToken();
            submitToken();
    }
    public static String getToken() throws IOException {

        String token = null;

        String hostName = "https://izaan-test.auth.us-east-1.amazoncognito.com";
        String endpoint = "/oauth2/token";
        String url = hostName + endpoint;
        // making new client here
        OkHttpClient client = new OkHttpClient.Builder().build();
        //Type of data are we sending
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        //Content Type / body
        RequestBody body = RequestBody.create(mediaType, "scope=izaan_test/post_info&grant_type=client_credentials");
        //Enter username and password in here in Base64 format
        String encoding = Base64.getEncoder().encodeToString(("1u5io4va9sr45n79fceg2damjf:1qbkthvp7lbc7aavuhhmfg8f2crekor9h2h7abu2oru1nlpj71fe").getBytes(StandardCharsets.UTF_8));
        //Entering the authorization
        String authorization = "Basic" + "  " + encoding;
        //Print authorization
        System.out.println(authorization); // done with printing the username and password in encoded format

        //Completing a request now
        Request req = new Request.Builder()
                .url(url)
                .method("POST", body)
                .addHeader("Authorization", authorization)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build(); // once completed with the Request, move to Response
        //Completing our request here
        Response response = client.newCall(req).execute();
        System.out.println(response);
        //Convert response as String
        String responseBody = response.body().string();
        //print the response body now
        System.out.println(responseBody);
        //  Converting String JSONbody to JSONpath object
        JsonPath jp = new JsonPath(responseBody);
        token = jp.get("access_token");
        System.out.println("Access_Token: " + "    " + token);
        client.connectionPool().evictAll();

        return token;
    }
    public static void submitToken() throws IOException {
        String url = "https://5x9m5ed0tj.execute-api.us-east-1.amazonaws.com/test/submit";
        String path = new String(Files.readAllBytes(Paths.get("src/main/java/payloads/submit.json")));

        RequestSpecification rs = given().body(path);
        rs.contentType(ContentType.JSON);
        rs.header("Authorization", getToken());
        io.restassured.response.Response response = rs.post(url);

        String responseBody = response.asString();
        System.out.println(responseBody);

        JsonPath jp = new JsonPath(responseBody);
        String message = jp.get("message");
        System.out.println(message);

    }
}
