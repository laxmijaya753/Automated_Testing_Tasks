package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	private static final String URL="http://thedemosite.co.uk/";
	
	
	
	
	@FindBy(xpath="/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
	
	
	
	
	
	//@FindBy(xpath="//small[contains(text(),'Your test username:')]")
	private WebElement addUser;
	//@FindBy(xpath="//a[contains(text(),'4.Login')]")
	@FindBy(xpath="/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement login;
	
	public static String getURL() {
		return URL;
	}
	
	public void navAdduser() {
		addUser.click();
	}
	
	public void navLogin() {
		login.click();
	}
	
}
