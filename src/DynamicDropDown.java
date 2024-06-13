import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\documents\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--Disable-- Notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");
		//driver.switchTo().alert().dismiss();
		
		//driver.findElement(By.className("css-76zvg2 r-jwli3a r-xb2eav r-majxgm r-q4m81j")).click();
	}

}
