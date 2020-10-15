package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {

	protected WebDriver driver;//if we create static then we cant exec parallel
	protected final static String base_url="https://www.amazon.in/";
	protected final static int implicit_wait=20;
	protected final static String browser="chrome";
	
	@BeforeMethod
	public void set_up() {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe\\" );
		driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("IE")) {
			
		System.setProperty("", "");
		driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(implicit_wait, TimeUnit.SECONDS);
		}

	
	@AfterMethod
	public void clean_up() {
		driver.quit();
		}
	
}
