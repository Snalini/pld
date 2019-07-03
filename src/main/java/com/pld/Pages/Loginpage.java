package com.pld.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;
import com.pld.Util.TestUtil;

public class Loginpage extends PldTestBase {
	
	@FindBy(xpath = "//*[contains(text(),'Sign In')]")
	WebElement Signin;
	@FindBy(id = "desktop")
	WebElement W3ID;
	@FindBy(name = "password")
	WebElement W3pass;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement W3Signin;

	
	//@FindBy(xpath = "//util-bar-chart[@ng-reflect-billn-charge-data='[object Object]']//*[@width='100%']")
	//WebElement UtilizationTile;
	
	@FindBy(id = "checkbox-0-0")
	WebElement Checkbox;
	
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement Button;
	
	@FindBy(xpath ="//*[text(),'Utilization']")
	WebElement Util;

	public Loginpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	
	
	public void pldLogin(String un,String pass) throws IOException
	{
		//System.out.println("user id"+un);
		Signin.click();
		//TestUtil.captureScreenShot("Enter Credentials");
		W3ID.sendKeys(un);
		W3pass.sendKeys(pass);
		//TestUtil.captureScreenShot("Sign in");
		W3Signin.click();
		//Checkbox.click();
		//Button.click();
		//System.out.println("Check for contol");
		
		
	}

}
