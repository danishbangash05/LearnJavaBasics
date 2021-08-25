package restapi;

import io.restassured.path.json.JsonPath;
import okhttp3.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AccessToken {
    public static void main(String[] args) throws IOException {

        getToken();

    }
    public static String getToken() throws IOException {

        String token = null;

        String hostname = "https://izaan-test.auth.us-east-1.amazoncognito.com";
        String endpoint = "/oauth2/token";
        String url = hostname + endpoint;

        //This is making the new client
        OkHttpClient client = new OkHttpClient.Builder().build();

        //What type of data are we sending in
        MediaType mediatype = MediaType.parse("application/x-www-form-urlencoded");

        //What is the Content/Body
        RequestBody request = RequestBody.create(mediatype, "scope=izaan_test/post_info&grant_type=client_credentials");

        //Enter the username and password in Base64 Coding
        String encoding = Base64.getEncoder().encodeToString(("1u5io4va9sr45n79fceg2damjf:1qbkthvp7lbc7aavuhhmfg8f2crekor9h2h7abu2oru1nlpj71fe").getBytes(StandardCharsets.UTF_8));
        //
        //        //Entering the Authorization
        String Auth = "Basic " + encoding;
        System.out.println(Auth);
        //
        //        //Completing our Request
        Request req = new Request.Builder()
                .url(url)
                .method("POST", request)
                .addHeader("Authorization", Auth)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();

        Response res = client.newCall(req).execute();
        System.out.println(res);

       // //Convert responseBody as String
         String resbody = res.body().string();
        System.out.println(resbody);


        //Convert String jsonBody to JsonPath object
         JsonPath jp = new JsonPath(resbody);
         //Gets access-token in json file
         token = jp.get("access_token");


         client.connectionPool().evictAll();
         return token;


    }
}

