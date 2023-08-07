package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser 
{
	RemoteWebDriver driver;
	@Test(priority=1)
	
	public void open() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  //Launch Fastmail site
		  driver.get("http://www.google.com");
		  Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void close()
	{
		driver.close();
	}
}
