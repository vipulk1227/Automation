package baseClass;

import org.openqa.selenium.WebDriver;

public class BaseClass1 {

	protected WebDriver driver;//if we create static then we cant exec parallel
	protected final static String base_url="https://www.amazon.in/";
	protected final static int implicit_wait=20;
	
}
