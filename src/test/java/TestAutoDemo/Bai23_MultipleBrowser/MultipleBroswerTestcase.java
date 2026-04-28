package TestAutoDemo.Bai23_MultipleBrowser;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBroswerTestcase {

    @Test
    @Parameters({"value1","value2"})
    public void Sum(@Optional("50") int a, int b){
        int sum = a + b;
        System.out.println("SUM= " +sum);
    }

    @Test
    @Parameters({"value1","value2"})
    public void Cal(int a, int b){
        int cal = a - b;
        System.out.println("SUM= " +cal);
    }


    @Test
    @Parameters({"value1","value2"})
    public void Cal2(int a, int b){
        int cal = a * b;
        System.out.println("SUM= " +cal);
    }
}
