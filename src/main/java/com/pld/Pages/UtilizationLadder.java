package com.pld.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class UtilizationLadder extends PldTestBase{
	
	@FindBy(xpath ="//*[contains(text(),'Utilization Ladder')]")
	WebElement UtilizationLadder;
	
	@FindBy(xpath="//*[contains(text(),'Chargeable HC')]")
	WebElement ChargeableHC;
	
	@FindBy(xpath = "//*[contains(text(),'Above 100%')]")
	WebElement Above100percent;
	
	@FindBy(xpath = "//*[contains(text(),'QTD as of')]")
	WebElement QTDasof;

	@FindBy(xpath = "//util-headcount-chart/div")
	WebElement Utilladchart;
	
	public UtilizationLadder() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public boolean verifyUtilLadTile()
	{
		return UtilizationLadder.isDisplayed();
	}
	public boolean verifyChargeableHCText()
	{
		return ChargeableHC.isDisplayed();
	}
	
	public boolean verifyAbove100PercentText()
	{
		return Above100percent.isDisplayed();
	}
	public boolean verifyQTDasofText()
	{
		return QTDasof.isDisplayed();
	}
	public boolean verifyUtilladchart()
	{
		return Utilladchart.isDisplayed();
	}
}
