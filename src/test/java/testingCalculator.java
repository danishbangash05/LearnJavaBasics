import org.testng.Assert;
import org.testng.annotations.Test;

public class testingCalculator {

    @Test
    public void addTest() {
        testingCalculator calc = new testingCalculator();
        int actualValue = calc.addition(12,28);
        int expectedValue = 14;
        Assert.assertEquals(actualValue, expectedValue);
    }


    public int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void addition() {
        int a;
        int b;
        int sum;

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number 1");
//        a = sc.nextInt();
//        System.out.println("Enter your number 2");
//        b = sc.nextInt();
//        System.out.println("The total of your numbers is: " + sum);
//        return sum;
    }


//    @Test
//    public void subtractionTest(int a, int b){
//        testingCalculator calc = new testingCalculator();
//        int actualValue = calc.subtractionTest(6,4);
//        int expectedValue = 2;
//        Assert.assertEquals(actualValue,expectedValue );
//    }
//
}
