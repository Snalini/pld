package com.pld.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class CareerTile extends PldTestBase{
	
	@FindBy(xpath ="//*[contains(text(),'Career')]")
	WebElement Career;
	
	@FindBy(xpath ="//*[contains(text(),'YTD as of')]")
	WebElement YTDasof;
	
	@FindBy(xpath = "//*[contains(text(),'Organic Placement')]")
	WebElement OrganicPlacement;
	
	@FindBy(xpath = "//*[contains(text(),'Promotions')]")
	WebElement Promotions;
	
	@FindBy(xpath ="//*[contains(text(),'Time in Band')]")
	WebElement TimeInBand;
	
	@FindBy(xpath ="//*[contains(text(),'Average')]")
	WebElement Average;
	
	@FindBy(xpath = "//*[contains(text(),'Outliers')]")
	WebElement Outliers;
	
	@FindBy(xpath ="//*[contains(text(),'Actual')]")
	WebElement Actual;
	
	@FindBy(xpath = "//*[contains(text(),'Goal')]")
	WebElement Goal;

	public CareerTile() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyCareerTile()
	{
		return Career.isDisplayed();
	}
	public boolean verifyYTDAsOfText()
	{
		return YTDasof.isDisplayed();
	}

	public boolean verifyOrganicPlacementText()
	{
		return OrganicPlacement.isDisplayed();
	}

	public boolean verifyPromotionsText()
	{
		return Promotions.isDisplayed();
	}

	public boolean verifyTimeInBandText()
	{
		return TimeInBand.isDisplayed();
	}

	public boolean verifyAverageText()
	{
		return Average.isDisplayed();
	}

	public boolean verifyOutliersText()
	{
		return Outliers.isDisplayed();
	}

	public boolean verifyActualText()
	{
		return Actual.isDisplayed();
	}

	public boolean verifyGoalText()
	{
		return Goal.isDisplayed();
	}


}
