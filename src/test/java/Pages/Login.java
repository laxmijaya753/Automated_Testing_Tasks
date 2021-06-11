package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(name="username")
	private WebElement user;
	@FindBy(name ="password")
	private WebElement passwrd;
	public void signIn(String str,String pwd)
	{
		user.sendKeys(str);
		passwrd.sendKeys(pwd);
		passwrd.submit();
		
	}

}
