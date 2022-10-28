package TestNGEx;
import org.testng.annotations.Test;

public class HomeLoan {
	
	
	@Test
	public void HomeLoanUI() {
		System.out.println("HomeLoanUI");
	}
	
	@Test
	public void HomeLoanMobile() {
		System.out.println("HomeLoanMobile");
	}
	
	@Test(groups = "Smoke")
	public void HomeLoanAPI() {
		System.out.println("HomeLoanAPI");
	}

}
