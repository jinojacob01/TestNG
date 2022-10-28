package TestNGEx;
import org.testng.annotations.Test;

public class CarLoan {
	
	
	@Test(groups = "Smoke")
	public void CarLoanUI() {
		System.out.println("CarLoanUI");
	}
	
	@Test(timeOut = 4000)
	public void CarLoanMobile() {
		System.out.println("CarLoanMobile");
	}
	
	@Test(dependsOnMethods = {"CarLoanMobile"})
	public void CarLoanAPI() {
		System.out.println("CarLoanAPI");
	}
	
	@Test(enabled = false)
	public void disableTest() {
		System.out.println("disableTest");
	}


}
