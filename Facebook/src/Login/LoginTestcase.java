package Login;

import org.testng.annotations.Test;

public class LoginTestcase  {

@Test	
public void fblogin()
{
	LoginObjectRepo n=new LoginObjectRepo();
	
	n.login("irudayanath@gmail.com", "jesuschrist");
}
}
