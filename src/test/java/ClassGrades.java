import java.util.Scanner;

public class ClassGrades {

        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please enter the grade : ");

            String grade = userInput.next();
            grade = grade.toUpperCase();
            switch (grade) {
                case "A":
                    System.out.println("Congratulations! Your marks is "
                            + "in the range 100 - 75");
                    break;
                case "B":
                    System.out.println("Your marks is in the range 50 - 75");
                    break;
                case "C":
                    System.out.println("Your marks is in the range 35 - 50");
                    break;
                case "F":
                    System.out.println("Sorry. Your score is not enough "
                            + "less than 35");
                    break;
                default:
                    System.out.println("Error!");
                    System.out.println("The grade you entered is not valid");
            }
        }
    }
