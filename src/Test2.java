import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("100041868036259");
		//driver.findElement(By.name("pass")).sendKeys("9502249741");
		//driver.findElement(By.name("login")).click();
		
		driver.findElement(By.id("email")).sendKeys("100041868036258");
		driver.findElement(By.name("pass")).sendKeys("9502249741");
		driver.findElement(By.name("login")).click();
		
		// The above lines give error message like "The email address or mobile number you entered isn't connected to an account. Find your account and log in."
		
		System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).sendKeys("9502249741");
		driver.findElement(By.xpath("(//input[@id='identify_email'])[1]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(1)")).sendKeys("9490239001");
		
		
	}

}
