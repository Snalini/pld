package com.pld.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class FTEbyContractCodingTile extends PldTestBase{
	
	@FindBy(xpath = "//*[contains(text(),'FTE by Contract Coding')]")
	WebElement FTEbyContractCoding;
	
	@FindBy(xpath = "//*[contains(text(),'CAI')]")
	WebElement CAI;

	@FindBy(xpath = "//*[contains(text(),'CPT')]")
	WebElement CPT;
	
	@FindBy(xpath = "//*[contains(text(),'DS&iX')]")
	WebElement DSandiX;
	
	@FindBy(xpath = "//*[contains(text(),'Other')]")
	WebElement Other;
	
	@FindBy(xpath = "//*[starts-with(text(),'ADMI')]")
	WebElement ADMI;
	
	@FindBy(xpath = "//*[starts-with(text(),'CAMS')]")
	WebElement CAMS;
	
	@FindBy(xpath = "//fte-doughnut/div/div")
	WebElement FTEbyContractCodingDoughnutChart;
	public FTEbyContractCodingTile() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyFTEbyContractCodingTile()
	{
		return FTEbyContractCoding.isDisplayed();
	}

	public boolean verifyCAIText()
	{
		return CAI.isDisplayed();
	}
	
	public boolean verifyCPTText()
	{
		return CPT.isDisplayed();
	}
	
	public boolean verifyDSandiXText()
	{
		return DSandiX.isDisplayed();
	}
	
	public void verifyADMIText()
	{
		try {
			ADMI.isDisplayed();
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		 
	}
	
	public void verifyCAMSText()
	{
		try {
		 CAMS.isDisplayed();
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
		}
	}
	public boolean verifyFTEbyContractCodingDoughnutChart()
	{
		return FTEbyContractCodingDoughnutChart.isDisplayed();
	}
}
