import org.testng.Assert;

public class Test {
    @org.testng.annotations.Test
    public void add(){
        Calculator  cal = new Calculator();
        int a = 4;
        int b = 4;
        int sum = a + b;
        int actualValue = sum;
        int expectedValue = 8;
        Assert.assertEquals(actualValue, expectedValue);
        System.out.println(actualValue);
    }
}
