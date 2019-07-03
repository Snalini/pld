package com.pld.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class DemandCoverage extends PldTestBase{
	
	@FindBy(xpath = "//*[contains(text(),'Demand Coverage')]")
	WebElement DemandCoverage;
	@FindBy(xpath = "//*[contains(text(),'(within threshold)')]")
	WebElement withinthreshold;
	@FindBy(xpath = "//*[contains(text(),'Q as of')]")
	WebElement Qasof;
	@FindBy(xpath = "//*[contains(text(),'TCV Coverage')]")
	WebElement TCVCoverage;
	@FindBy(xpath = "//*[contains(text(),'Total Deals')]")
	WebElement TotalDeals;
	@FindBy(xpath = "//*[contains(text(),'Deal Coverage')]")
	WebElement DealCoverage;
	@FindBy(xpath = "//*[contains(text(),'With No Plans')]")
	WebElement WithNoPlans;
	@FindBy(xpath = "//*[contains(text(),'With Plans')]")
	WebElement WithPlans;
	@FindBy(xpath = "//*[contains(text(),'No Plans Req')]")
	WebElement NoPlansReq;
	@FindBy(xpath = "//*[contains(text(),'TCV')]")
	WebElement TCV;
	@FindBy(xpath="//demand-coverage//*[name()='svg']")
	WebElement DemandCoverageChart;

	public DemandCoverage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyDemandCoverageTile()
	{
		String text1 = DemandCoverage.getText();
		String text2 = withinthreshold.getText();
		String text3 = Qasof.getText();
		
		System.out.println("The Tile name is :" +text1 +"" +text2 +""+text3 );
		
		return DemandCoverage.isDisplayed();
	}
	
	public boolean verifyWithInThresholdText()
	{
		return withinthreshold.isDisplayed();
	}
	public boolean verifyOneQasofText()
	{
		return Qasof.isDisplayed();
	}
	public boolean verifyTCVCoverageText()
	{
		return TCVCoverage.isDisplayed();
	}
	public boolean verifyTotalDealsText()
	{
		return TotalDeals.isDisplayed();
	}
	public boolean verifyDealCoverageText()
	{
		return DealCoverage.isDisplayed();
	}
	public boolean verifyWithNoPlansText()
	{
		return WithNoPlans.isDisplayed();
	}
	public boolean verifyWithPlans()
	{
		return WithPlans.isDisplayed();
	}
	public boolean verifyNoPlansReqText()
	{
		return NoPlansReq.isDisplayed();
	}
	public boolean verifyTCVText()
	{
		return TCV.isDisplayed();
	}
	public boolean verifyDemandCoverageChart()
	{
		return DemandCoverageChart.isDisplayed();
	}
}
