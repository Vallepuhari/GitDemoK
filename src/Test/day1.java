package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void lastexecution() {
		System.out.println("It will execute last");

	}

	@Test
	public void Demo() {
		System.out.println("hello");
		System.out.println("hello1");
		System.out.println("hello2");
		System.out.println("hello3");
		System.out.println("hello4");
		System.out.println("hello5");
		Assert.assertTrue(true);
	}
	
	@Test
	public void Demo1(){
		System.out.println("hei");
		System.out.println("hi1");
		System.out.println("hi2");
	}

	@AfterSuite
	public void Afsuite() {
		System.out.println("I am no 1 from last");

	}

	@Test
	public void SecondTest() {

		System.out.println("Bye");
		
		//bye bye
		System.out.println("Bye bye1");
		System.out.println("Bye bye2");

		System.out.println("Bye1");
		System.out.println("Bye2");
		System.out.println("Bye3");
		System.out.println("Bye4");

		
	}
}
