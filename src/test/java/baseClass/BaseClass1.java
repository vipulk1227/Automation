package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {

	protected WebDriver driver;//if we create static then we cant exec parallel
	protected final static String base_url="https://www.amazon.in/";
	protected final static int implicit_wait=20;
	
	@BeforeMethod
	public void set_up() {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe\\" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(implicit_wait, TimeUnit.SECONDS);
	}	
	
	@AfterMethod
	public void clean_up() {
		driver.quit();
		}
	
}
