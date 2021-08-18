import java.util.Calendar;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add();
        calculator.subtract();
        multiply();
    }
    public void add(){
        int a = 5;
        int b = 4;
        int c = 3;
        int equal = a + b + c;
        System.out.println(equal);

    }

    public void subtract(){
        int a = 8;
        int b = 4;
        int c = 3;
        int equal = a - b - c;
        System.out.println(equal);
    }
    public static void multiply(){
        int a = 8;
        int b = 4;
        int c = 3;
        int equal = a * b * c;
        System.out.println(equal);
    }
}
