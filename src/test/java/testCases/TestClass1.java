package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	WebDriver driver;
	String base_url="https://www.amazon.in/";
	int implicit_wait=20;
	

	@BeforeMethod
    public void set_up() {
	System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe\\" );
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(implicit_wait, TimeUnit.SECONDS);
	
    }
	

	@Test
    public void TC_1_check_website_title() {
    	
    driver.get( base_url);
    String expected_Title="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
    String actual_Title=driver.getTitle();
    
    Assert.assertEquals(expected_Title, actual_Title);
	
    }
	
	@AfterMethod
	public void clean_up() {
	driver.quit();
	}
}
