package TestAutoDemo.Bai10_Annotations;

import org.testng.annotations.Test;

public class Demo_Priority {

    @Test(priority = 2)
    public void testCase1() {
        System.out.println("Test case 1");
    }

    @Test(priority = 1)
    public void testCase2() {
        System.out.println("Test case 2");
    }

    @Test(priority = 3)
    public void testCase3() {
        System.out.println("Test case 3");
    }
}
