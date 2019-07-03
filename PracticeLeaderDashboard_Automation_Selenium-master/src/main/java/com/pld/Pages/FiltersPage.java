package com.pld.Pages;

import java.io.Console;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pld.Base.PldTestBase;

public class FiltersPage extends PldTestBase{
	
	
	@FindBy(xpath = "//*[contains(text(),'Filters')]")
	WebElement Filters;
	@FindBy(xpath = "//span[contains(text(),'Labor Pool')]")
	WebElement LaborPool;
	@FindBy(xpath = "//button[normalize-space()='Labor Pool']")
	WebElement LaborPoolFilter;
	
			
	public FiltersPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFilters()
	{
		Filters.click();
	}
	
	public boolean verifyLaborPool()
	{
		return LaborPool.isDisplayed();
	}
	
	public void clickOnlaborPool()
	
	{
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+LaborPoolFilter.getLocation().y+")");
		LaborPoolFilter.click();
	}
	
	public void clicksOnPool()
	{
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+LaborPoolFilter.getLocation().x+")");
		LaborPoolFilter.click();
	}
	public void clickonlabor()
	{
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", LaborPoolFilter); 
		LaborPoolFilter.click();
	}
}
