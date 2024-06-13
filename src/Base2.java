import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\documents\\chromedriver-win64\\chromedriver.exe");
		//C:\documents\chromedriver-win64\chromedriver-win64
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit seconds)
		//WebDriverWait wait = new WebDriverWait(driver,5);
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		addItems(driver,itemsNeeded);
		
				
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		// TODO Auto-generated method stub
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++) {
			
			String[] name=products.get(i).getText().split("-");
			
			String formatedName = name[0].trim();
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formatedName)) {
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==itemsNeeded.length) {
					break;
					
				}
			}
			
		}		
	}

}
