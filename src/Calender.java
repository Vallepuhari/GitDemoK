import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\documents\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		// driver.manage().window().fullscreen();
		driver.get("https://www.path2usa.com/travel-companion/");

		// WebElement b = driver.findElement(By.id("form-field-travel_comp_date"));
		Actions a = new Actions(driver);
		WebElement b = driver.findElement(By.id("form-field-travel_comp_date"));
		a.moveToElement(b).build().perform();

		// driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		// input[placeholder$='Date of travel']
		driver.findElement(By.cssSelector("input[placeholder$='Date of travel']")).click();

		while (!driver
				.findElement(By.cssSelector(
						"[class='flatpickr-calendar animate arrowTop open'] [class='flatpickr-current-month']"))
				.getText().contains("December")) {

			driver.findElement(By.cssSelector(
					"[class='flatpickr-calendar animate arrowTop open'] span[class='flatpickr-next-month']")).click();
		}

		List<WebElement> dates = driver.findElements(By.className("dayContainer"));
		int count = driver.findElements(By.className("dayContainer")).size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("dayContainer")).get(i).getText();
			if (text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("dayContainer")).get(i).click();
				break;
			}
		}

	}

}
