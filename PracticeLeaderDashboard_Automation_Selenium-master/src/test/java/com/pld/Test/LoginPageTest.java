package com.pld.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import com.pld.Base.PldTestBase;

import com.pld.Pages.Dashboardpage;
import com.pld.Pages.Loginpage;
import com.pld.Util.TestUtil;



public class LoginPageTest extends PldTestBase{
    
    public Loginpage loginpage;
    public WebElement Util;
    


	public LoginPageTest() throws IOException {
		super();
		
	}
	
	
	@BeforeSuite
	
	public void setUp() throws IOException, AWTException, InterruptedException
	{
		System.out.println("Login Page test execution started");
		prop = new Properties();
		FileInputStream fp = new FileInputStream("./src/main/java/com/pld/ConfigProperties/config.properties");
		prop.load(fp);
		String browserName = prop.getProperty("browser");
		 
		 if(browserName.equals("IE"))
		 {
			 System.setProperty("webdriver.ie.driver", prop.getProperty("IE_driverPath"));
				driver = new InternetExplorerDriver();
		 }
		 
		 else if(browserName.equals("FF"))
		 {
			 System.setProperty("webdriver.gecko.driver", prop.getProperty("FF_driverPath"));
			
			 //FirefoxProfile profile= new FirefoxProfile();
			//	profile.setPreference( "layout.css.devPixelsPerPx", "0.9" );
			
				driver = new FirefoxDriver();
		 }	
			
		/* Robot robot = new Robot();
			if(prop.getProperty("ZoomLevel")=="90%")
			{
				for(int i=0;i<1;i++)
				{
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_SUBTRACT);
					 robot.keyRelease(KeyEvent.VK_SUBTRACT);
					 robot.keyRelease(KeyEvent.VK_CONTROL);
				}
			}
			
			else if(prop.getProperty("ZoomLevel")=="80%")
				{
				System.out.println("About to Zoom out to 80%");
				
			
			for(int i=0;i<2;i++)
			{
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				 robot.keyRelease(KeyEvent.VK_SUBTRACT);
				 robot.keyRelease(KeyEvent.VK_CONTROL);
			}
				}*/
		 
		 
		/* WebElement html = driver.findElement(By.tagName("html"));
			html.sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));*/
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(Long.parseLong(prop.getProperty("PageLoadTimeOut")), TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("ImplicitlyWait")), TimeUnit.SECONDS);
		 driver.get(prop.getProperty("URL"));
		
		 Robot robot = new Robot();	
		 String zoomlevel = prop.getProperty("ZoomLevel");
		if(zoomlevel.equals("80%"))
		{
		 for(int i=0;i<2;i++)
			{
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				 robot.keyRelease(KeyEvent.VK_SUBTRACT);
				 robot.keyRelease(KeyEvent.VK_CONTROL);
			}
		}
		else if(zoomlevel.equals("90%"))
		{
			for(int i=0;i<1;i++)
			{
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				 robot.keyRelease(KeyEvent.VK_SUBTRACT);
				 robot.keyRelease(KeyEvent.VK_CONTROL);
			}
		}
		loginpage = new Loginpage();
		
		//TestUtil.captureScreenShot("Login Page");
		loginpage.pldLogin(prop.getProperty("username"),prop.getProperty("password"));
		
		 }
	

	
   
@AfterSuite
public void tearDown()
{
    System.out.println("Dash board page executed successfully");
    driver.quit();
}


}
