package com.pld.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args)
	{
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver", "./src/main/java/com/pld/Util/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldUtilAsof/");
	

}
}
