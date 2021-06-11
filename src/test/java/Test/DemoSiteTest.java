package Test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.AddUser;
import Pages.HomePage;
import Pages.Login;

public class DemoSiteTest {
	static WebDriver driver;
	@BeforeClass
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().fullscreen();
	}
	
	@Before
	
	public void setup()
	{
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get(HomePage.getURL());
		
		
	}
	
	@AfterClass
	public static void  teardown()
	{
		driver.quit();
	}
	
	@Test
	
	public void test() throws InterruptedException
	{
		HomePage nav=PageFactory.initElements(driver,HomePage.class);
		AddUser add=PageFactory.initElements(driver,AddUser.class);
		Login info=PageFactory.initElements(driver,Login.class);
		
		
		
		nav.navAdduser();
		Thread.sleep(3000);
		add.signup("test","test1");
		Thread.sleep(3000);
		nav.navLogin();
		Thread.sleep(3000);
		info.signIn("test","test1");
		assertEquals("**Successful Login**",driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText());
		Thread.sleep(3000);
		
	}
	
	

}
