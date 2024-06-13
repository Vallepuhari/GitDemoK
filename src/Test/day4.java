package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL"})
	@Test
	public void WebLoginHomeloan(String uname) {

		System.out.println("WebLoginHomePersonalloan");
		System.out.println(uname);
	}

	@Test(groups = { "smoke" })
	public void MobileLoginHomeloan() {

		System.out.println("MobileLoginHome");
	}

	@Test
	public void APILoginHomeloan() {

		System.out.println("APILoginHome");

	}
	
	@Test
	public void Demo2(){
		System.out.println("HI");
		System.out.println("HI1");
		System.out.println("HI2");
	}
	
	@Test
	public void D(){
		System.out.println("HI");
		
	}
	
}