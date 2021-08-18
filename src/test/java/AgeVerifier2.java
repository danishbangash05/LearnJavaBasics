import org.testng.annotations.Test;
import java.util.*;

public class AgeVerifier2 {
    @Test
    public static void age() {
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        age = sc.nextInt();

        if (age < 18) {
            System.out.println("You can not sign up");

        } else if (age == 18) {
            System.out.println("Welcome to facebook");

        } else if (age > 65) {
            System.out.println("Too old for facebook");
        }
    }
}

