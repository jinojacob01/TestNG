package TestNGEx;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	int i = 1;
	int j = 1;

	@DataProvider
	public static Object[][] getData() {
		Object[][] data = new Object[3][2];

		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";

		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";

		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		return data;
	}

	@Test(dataProvider = "getData")
	public static void printData(String un, String pass) {
		System.out.println(un);
		System.out.println(pass);

	}

	@AfterMethod
	public void am() {
		System.out.println("after run = " + i);
		i++;
	}

	@BeforeMethod
	public void bm() {
		System.out.println("before run = " + j);
		j++;
	}

	@Test
	public void test() {

		System.out.println("Test for Before and After test annotation");
	}

}
