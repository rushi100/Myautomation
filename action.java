package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.vel.config.Configurations;

public class ActionKeys2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", Configurations.driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?r=101");
		driver.manage().window();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='year']"));
		
		Actions a1= new Actions(driver);
		a1.moveToElement(day).perform();
		
		Thread.sleep(1000);
		a1.click().perform();
		Thread.sleep(1500);
		a1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		a1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(500);
		a1.sendKeys(Keys.ENTER).perform();
		
	}

}
