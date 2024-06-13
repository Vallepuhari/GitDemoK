package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups = { "smoke" })
	public void ploan() {
		System.out.println("Good");
	}

	@BeforeTest
	public void prerequiste() {
		System.out.println("It will execute first");
	}

}
