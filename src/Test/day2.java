package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups = { "smoke" })
	public void ploan() {
		System.out.println("Good");
<<<<<<< HEAD
		
=======
		//commit from gitdemok
		System.out.println("Fine");
		System.out.println("Bad");
>>>>>>> 051378644997c41a75c8d24ad4d9e8ca580084f8
	}

	@BeforeTest
	public void prerequiste() {
		System.out.println("It will execute first");
		//commit from gitdemok
		System.out.println("First");
		System.out.println("Second");
	}

}
