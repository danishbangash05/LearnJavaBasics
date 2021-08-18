import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grade: ");

        String grade = sc.next();
        switch (grade){
            case "a":
                System.out.println("75 - 100");
                break;

            case "b":
                System.out.println("50 - 75");
                break;

                case "c":
                    System.out.println("35 - 50");
                    break;
                    case "f":
                        System.out.println("below 35");
                        break;
                    }
                }
            }


