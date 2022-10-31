package TestNGEx;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {
	
	
	@Test
	public void HomeLoanUI() {
		System.out.println("HomeLoanUI");
	}
	
	@Parameters("URL")
	@Test
	public void HomeLoanMobile(String urlname) {
		System.out.println("HomeLoanMobile");
		System.out.println(urlname);
		assertTrue(false);
	}
	
	@Test(groups = "Smoke")
	public void HomeLoanAPI() {
		System.out.println("HomeLoanAPI");
	}

}
