package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@BeforeClass
	public void bfclass() {

		System.out.println("before executing any methods in the class");
	}

	@Parameters({ "URL", "APIkey/usrname" })
	@Test
	public void WebLoginCarloan(String urlname, String key) {

		System.out.println("WebLoginCar");
		System.out.println(urlname);
		System.out.println(key);
	}

	@BeforeSuite
	public void Bfsuite() {

		System.out.println("I am no 1");
	}

	@BeforeMethod
	public void beforeevery() {

		System.out.println("It will execute before every test method in day3 class");
	}

	@AfterMethod
	public void afterevery() {

		System.out.println("It will execute after every test method in day3 class");
	}

	@AfterClass
	public void afclass() {

		System.out.println("after executing all methods in the class");
	}

	@Test(groups = { "smoke" })
	public void MobileLoginCarloan() {

		System.out.println("MobileLoginCar");
	}

	@Test(enabled = false)
	public void MobileSigninCarloan() {

		System.out.println("Mobile SIGNIN");
	}

	@Test(dataProvider = "Getdata")
	public void MobileSignoutCarloan(String username, String password) {

		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(dependsOnMethods = { "WebLoginCarloan" })
	// @Test(dependsOnMethods= {"WebLoginCarloan","MobileSignoutCarloan"})
	public void APILoginCarloan() {

		System.out.println("APILoginCar");

	}

	@DataProvider
	public Object[][] Getdata() {

		Object[][] data = new Object[3][2];

		data[0][0] = "firstsetusername";
		data[0][1] = "firstpassword";

		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";

		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";

		return data;

	}
}