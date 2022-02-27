package screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.vel.config.Config;

public class Sshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", Config.driverPath1);  //anotherWay
		WebDriver driver = new ChromeDriver();
		
		driver.get(Config.appURL1); 
		driver.manage().window().maximize();
		
		//Date dt = new Date();
		//System.out.println(dt);
		//String c= dt.toString().replace(":", "__");
		//System.out.println(c);
			
		//source file
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Destination file
		File f = new File("C:\\class\\class data\\image1.jpeg");
		
		FileHandler.copy(source, f);  //static method
	}

}
