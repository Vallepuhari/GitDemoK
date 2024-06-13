package HariprasadPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class APSRTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.cssSelector("input[id='fromPlaceName']")).sendKeys("Pul");
		List<WebElement> options = driver.findElements(By.id("ui-id-1"));
		
		for(WebElement option:options) {
		if(option.findElement(By.cssSelector("li[class='PULIVENDULA ui-menu-item']")) != null) {
			option.click();
				break;
		}
		
		
		}
	}

}
