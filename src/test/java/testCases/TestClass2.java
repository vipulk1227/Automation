package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseClass1;

public class TestClass2 extends BaseClass1{

	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe\\" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(implicit_wait, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void TC_2_search_product() {
		driver.get(base_url);
		
		WebElement search_product=driver.findElement(By.id("twotabsearchtextbox"));
		search_product.sendKeys("laptop");
		
		WebElement search_click=driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input']"));
		search_click.click();
		
		String expected_product="https://www.amazon.in/s?k=laptop";
		String actual_product=driver.getCurrentUrl();
		
		Assert.assertEquals(actual_product, expected_product);
		
	}
	
	public void clean_up1() {
		driver.quit();
	}
}
