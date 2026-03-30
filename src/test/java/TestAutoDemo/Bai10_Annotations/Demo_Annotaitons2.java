package TestAutoDemo.Bai10_Annotations;

import TestAutoDemo.common.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo_Annotaitons2 extends BaseTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class child");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class child");
    }

    public static int InputQuantityndAmount(int Quantity, int Amount){
      if(Quantity > 0 && Amount > 0){
          System.out.println("Quantity: " + Quantity);
          System.out.println("Amount: " + Amount);
          int Total = Quantity * Amount;
          System.out.println("Total: " + Total);
          return Total ;
      } else {
          System.out.println("Invalid input. Quantity and Amount must be greater than 0.");
          return 0;
      }
    }

    @Test (description = "Test case for input quantity and amount", timeOut = 3000)
    public static void Total() {
        InputQuantityndAmount(5, 10);
    }


  @Test (groups = {"Success","Happy case"})
    public void payoutSuccess() {
        System.out.println("Payout Success");
    }

    @Test (groups = {"Failed"}, enabled = false)
    public void payoutFailed() {
        System.out.println("Payout Failed");
    }

    @AfterMethod
    public void runByMethod() {
        System.out.println("Run by method");
    }

}
