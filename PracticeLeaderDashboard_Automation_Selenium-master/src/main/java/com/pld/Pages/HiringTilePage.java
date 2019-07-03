package com.pld.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class HiringTilePage extends PldTestBase{
	
	@FindBy(xpath = "//*[contains(text(),'Hiring')]")
	WebElement Hiring;
	
	@FindBy(xpath = "//*[contains(text(),'YTD as of')]")
	WebElement YTDasof;
	
	@FindBy(xpath = "//*[contains(text(),'31 Dec 2018')]")
	WebElement Date;
	
	@FindBy(xpath ="//*[contains(text(),'YTD Hires')]")
	WebElement YTDHires;
	
	@FindBy(xpath ="//*[contains(text(),'ANOBs')]")
	WebElement ANOBs;
	
	@FindBy(xpath = "//*[contains(text(),'Open Requisitions')]")
	WebElement OpenRequisitions;
	
	@FindBy(xpath = "//*[contains(text(),'EPH %')]")
	WebElement EPHPercent;
	
	@FindBy(xpath = "//*[contains(text(),'Actual')]")
	WebElement Actual;
	
	@FindBy(xpath ="//*[contains(text(),'Avg. Band')]")
	WebElement Avg_Band;
	
	@FindBy(xpath = "//*[contains(text(),'Goal')]")
	WebElement Goal;


	public HiringTilePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyHiringTile()
	{
	
		return Hiring.isDisplayed();
	}
	public boolean verifyYTDHiresText()
	{
		return YTDHires.isDisplayed();
	}
	public boolean verifyANOBsText()
	{
		return ANOBs.isDisplayed();
	}
	public boolean verifyOpenRequistionsText()
	{
		return OpenRequisitions.isDisplayed();
	}
	public boolean verifyEPHPercent()
	{
		return EPHPercent.isDisplayed();
	}
	public boolean verifyActualText()
	{
		return Actual.isDisplayed();
	}
	public boolean verifyAvg_BandText()
	{
		return Avg_Band.isDisplayed();
	}

	public boolean verifyGoalText()
	{
		return Goal.isDisplayed();
	}
	public boolean verifyYTDAsOfText()
	{
		return YTDasof.isDisplayed();
	}
	public boolean verifyDateText()
	{
		return Date.isDisplayed();
	}
}
