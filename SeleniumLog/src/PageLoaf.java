import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageLoaf {
WebDriver driver;
public void PageLoad()
{
	
	
	System.setProperty("webdriver.chrome.driver","C:/Selenium/ChromeDriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
	Log.info("PageLoaded");
	
}
}
