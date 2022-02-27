package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {

	//@Test
	// public void m1() {
		 
//		System.out.println("Welcome to Testng framework");
//}
	@Test //(priority=2)                                //testNg method
	public void TC01() {
		
		System.out.println("TestCase 1 is execucate");
		
	}
	
	@Test  // (priority=3) 
	public void TC02() {
		
		System.out.println("TestCase 2 is execucate");
	}         //IF WE USE PRIORITY =1 THEN TEST CASE 03 IS RUN on 1St priority
	@Test   //(priority=1)          
	public void TC03() {              //THEN THIS 3RD
		
		System.out.println("TestCase 3 is execucate");
		System.out.println(" ");
	}
	@BeforeMethod     //THEN THIS METHOD RUN  2ND
	public void login() {
		
		System.out.println("Application login");
	}
	
	@AfterMethod
	public void logout() {
		
		System.out.println("Application Logut");
		System.out.println(" ");
	}
	@BeforeClass       //IS FIRSTLY OPEN
	public void LaunchBrowser() {
		
		System.out.println("Browser is open");
	}
	
	@AfterClass
	public void BrowserIsClosed() {
		
		System.out.println("Browser is Closed");
	}
	
}
