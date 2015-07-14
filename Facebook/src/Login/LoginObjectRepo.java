package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginObjectRepo {
WebDriver driver;
WebElement user,password,PageTitle,Submit;
@Test
public void login(String username,String uniquepass)
{
	System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	user=driver.findElement(By.xpath("//input[@name='email']"));
	password=driver.findElement(By.xpath("//input[@name='pass']"));
	Submit=driver.findElement(By.xpath("//input[@type='submit']"));
	user.sendKeys(username);
	password.sendKeys(uniquepass);
	Submit.click();
	String s=driver.getTitle();
	System.out.println(s);
	String s1="Welcome to Facebook — Log in, sign up or learn more";
	Assert.assertEquals(s1, s);
	
}

}
