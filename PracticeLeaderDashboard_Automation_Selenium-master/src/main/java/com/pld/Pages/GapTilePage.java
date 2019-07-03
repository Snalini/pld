package com.pld.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class GapTilePage extends PldTestBase{
	
	@FindBy(xpath = "//*[contains(text(),'Gap ')]")
	WebElement Gap;
	
	@FindBy(xpath = "//*[contains(text(),'as of ')]")
	WebElement Textasof;
	
	@FindBy(xpath ="//*[contains(text(),'Current')]")
	WebElement Current;
	
	@FindBy(xpath = "//*[starts-with(text(),'Net Gap')]")
	WebElement NetGap;
	
	@FindBy(xpath = "//*[contains(text(),'Shortages')]")
	WebElement Shortages;
	
	@FindBy(xpath = "//*[contains(text(),'Excesses')]")
	WebElement Excesses;
	
	@FindBy(className = "tick")
	List<WebElement> days;
	@FindBy(xpath="//gap//*[name()='svg']")
	WebElement GapChart;

	public GapTilePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyGapTile()
	{
		return Gap.isDisplayed();
	}
	
	public boolean verifyTextAsOf()
	{
		return Textasof.isDisplayed();
	}
	
	public boolean verifyCurrentText()
	{
		return Current.isDisplayed();
	}
	
	public void verifyNetGap()
	{ try {
		NetGap.isDisplayed();
	}catch(Exception e)
	{
		System.out.println(e.getStackTrace());
	}
		 
	}
	
	public boolean verifyShortages()
	{
		return Shortages.isDisplayed();
	}
	
	public boolean verifyExcessestext()
	{
		return Excesses.isDisplayed();
	}
	public List<WebElement> getDays()
	{
System.out.println(days.size());
		
		for(int i=0;i<days.size();i++)
		{
		String text = days.get(i).getText();
		
		System.out.println("Days are: "+ text);
		}
		
		return days;
	}
	public boolean verifyGapChart()
	{
		return GapChart.isDisplayed();
	}
	
}
