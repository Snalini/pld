package com.pld.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class BandPyramidTile extends PldTestBase {
	
	@FindBy(xpath = "//*[contains(text(),'Band Pyramid')]")
	WebElement BandPyramid;
	
	@FindBy(xpath = "//*[contains(text(),'Total HC')]")
	WebElement Total_HC;
	
	@FindBy(xpath = "//*[contains(text(),'Avg Band')]")
	WebElement Avg_Band;
	
	@FindBy(xpath = "//*[contains(text(),'Actual HC')]")
	WebElement Actual_HC;
	
	@FindBy(xpath = "//*[contains(text(),'Band')]")
	WebElement BandText;
	
	@FindBy(xpath = "//*[contains(text(),'HC')]")
	WebElement HC_text;
	
	@FindBy(xpath = "//*[contains(text(),'Distrib.')]")
	WebElement Distrib;
	
	@FindBy(xpath = "//*[contains(text(),'Other : Excludes Contractors')]")
	WebElement ExcludesContractors;
	
	@FindBy(xpath="//bar-pyramid-chart-v2//*[name()='svg']")
	WebElement bandPyramidChart;

	public BandPyramidTile() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public boolean verifyBandPyramidTile()
	{
		return BandPyramid.isDisplayed();
	}
	
	public boolean verifyTotalHeadCount()
	{
		return Total_HC.isDisplayed();
	}
	
	public boolean verifyAvgband()
	{
		return Avg_Band.isDisplayed();
	}
	
	public boolean verifyActualHeadCount()
	{
		return Actual_HC.isDisplayed();
	}
	
	public boolean verifyBandText()
	{
		return BandText.isDisplayed();
	}
	
	public boolean verifyHCText()
	{
		return HC_text.isDisplayed();
	}
	
	public boolean verifyDistribText()
	{
		return Distrib.isDisplayed();
	}
	
	public boolean verifyExcludeContractorstext()
	{
		return ExcludesContractors.isDisplayed();
	}
	
	public boolean verifybandPyramidChart()
	{
		return bandPyramidChart.isDisplayed();
	}
}

