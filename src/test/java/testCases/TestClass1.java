package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClass1;

public class TestClass1 extends BaseClass1{


	

	@Test
    public void TC_1_check_website_title() {
    	
    driver.get( base_url);
    String expected_Title="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
    String actual_Title=driver.getTitle();
    
    Assert.assertEquals(expected_Title, actual_Title);
	
    }
	
	
}
