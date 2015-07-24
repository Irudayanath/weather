import org.openqa.selenium.WebDriver;
import org.apache.log4j.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class PageObject {
	public class A
	{
WebDriver driver;	
@Test
public void getElement(WebDriver driver)
{
	driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	Log.info("Opened Page");
}

	}
}
