package com.pld.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class AttritionTilepage extends PldTestBase{
	
	@FindBy(xpath = "//*[contains(text(),'Attrition')]")
	WebElement Attrition;
	
	@FindBy(xpath = "//*[contains(text(),'YTD as of 31 Dec 2018')]")
	WebElement YTDasof;
	@FindBy(xpath = "//*[contains(text(),'Annualized Rate')]")
	WebElement AnnualizedRate;
	@FindBy(xpath ="//*[contains(text(),'Voluntary Losses')]")
	WebElement VoluntaryLosses;
	@FindBy(xpath = "//*[contains(text(),'Loss Reason')]")
	WebElement LossReason;
	@FindBy(xpath = "//*[contains(text(),'Attrit. by Band')]")
	WebElement AttritbyBand;
	@FindBy(xpath = "//*[contains(text(),'Oppty')]")
	WebElement Oppty;
	@FindBy(xpath = "//*[contains(text(),'Comp')]")
	WebElement Comp;
	@FindBy(xpath = "//*[contains(text(),'Work/Life')]")
	WebElement WorkOrLife;
	@FindBy(xpath = "//*[contains(text(),'Education')]")
	WebElement Education;
	@FindBy(xpath = "//*[@class='attrLossReasonBandFill'][contains(text(),'Other')]")
	WebElement Other;
	@FindBy(xpath = "//loss-reason-chart//*[name()='svg']")
	WebElement AttritionBar1;
	@FindBy(xpath="//attr-by-band-chart//*[name()='svg']")
	WebElement Attr_ByBandChart;

	public AttritionTilepage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	public boolean verifyAttritionTile()
	{
		return Attrition.isDisplayed();
	}
	public boolean verifyYTDAsOf()
	{
		return YTDasof.isDisplayed();
	}
	
	public boolean verifyAnnualizedRateText()
	{
		return AnnualizedRate.isDisplayed();
	}
	public boolean verifyVoluntaryLossestext()
	{
		return VoluntaryLosses.isDisplayed();
	}
	public boolean verifyLossReasontext()
	{
		return LossReason.isDisplayed();
	}
	public boolean verifyAttritbyBandText()
	{
		return AttritbyBand.isDisplayed();
	}
	public boolean verifyOpptyText()
	{
		return Oppty.isDisplayed();
	}
	public boolean verifyCompText()
	{
		return Comp.isDisplayed();
	}
	public boolean verifyWorkOrLifeText()
	{
		return WorkOrLife.isDisplayed();
	}
	public boolean verifyEducationText()
	{
		return Education.isDisplayed();
	}
	public boolean verifyOtherText()
	{
		return Other.isDisplayed();
	}
	public boolean verifyAttritionBar1()
	{
		return AttritionBar1.isDisplayed();
	}
	public boolean verifyAttr_ByBandChart()
	{
		return Attr_ByBandChart.isDisplayed();
	}
	

}
