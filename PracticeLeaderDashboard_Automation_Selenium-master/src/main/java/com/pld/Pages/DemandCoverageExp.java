package com.pld.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class DemandCoverageExp extends PldTestBase{
	
	@FindBy(xpath = "//demand-coverage/ion-card/ion-card-content")
	WebElement DemandCoveragetileexp;
	
	@FindBy(xpath = "//span[contains(text(),'Demand Coverage  ')]")
	WebElement DemandCoverage;
	
	@FindBy(xpath = "//*[contains(text(),'(within threshold)')]")
	WebElement WithInThreshold;
	
	@FindBy(xpath = "//*[contains(text(),'as of')]")
	WebElement AsOF;
	@FindBy(xpath = "//*[contains(text(),'No. of Deals')]")
	WebElement NoOfDeals;
	
	@FindBy(xpath = "//*[contains(text(),'TCV in $M')]")
	WebElement TCV;
	
	@FindBy(xpath = "//*[@class = 'dc-y-axis dc-axis']")
	WebElement Months;
	
	@FindBy(xpath = "//*[contains(text(),'Deals: ')]")
	WebElement Deals;
	
	@FindBy(xpath = "//*[contains(text(),'With No Plans')]")
	WebElement WithNoPlans;
	
	@FindBy(xpath = "//*[contains(text(),'With No Plans Required')]")
	WebElement WithNoPlansRequired;
	
	@FindBy(xpath = "//*[contains(text(),'With Plans')]")
	WebElement WithPlans;
	
	@FindBy(xpath = "//div[@class='headerColor lowUtilText']")
	WebElement OpportunityDetails;
	
	@FindBy(xpath = "//div[contains(@class,'viewAllClass')]")
	WebElement View;
	
	@FindBy(xpath = "//span[@class = 'whiteSpans'][contains(text(),'All')]")
	WebElement AllDropDown;
	
	@FindBy(xpath = "//span[contains(text(),'Cust.Name')]")
	WebElement CustName;
	
	@FindBy(xpath ="//span[contains(text(),'Decision Date')]")
	WebElement DecisionDate;
	
	@FindBy(xpath = "//span[contains(text(),'TCV(M)')]")
	WebElement TCV_M;
	
	@FindBy(xpath = "//span[contains(text(),'Sales Stage')]")
	WebElement SalesStage;
	
	@FindBy(xpath = "//span[contains(text(),'Roadmap')]")
	WebElement RoadMapStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Start Date')]")
	WebElement StartDate;
	
	@FindBy(xpath = "//span[contains(text(),'Duration')]")
	WebElement Duration_Months;
	
	@FindBy(xpath = "//span[contains(text(),'Opp ID')]")
	WebElement OppID;
	
	@FindBy(xpath = "//span[contains(text(),'Opportunity Name')]")
	WebElement OpportunityName;
	
	@FindBy(xpath = "//span[contains(text(),'Opp Owner Name')]")
	WebElement OppOwnerName;
	
	@FindBy(xpath = "//span[contains(text(),'Offering')]")
	WebElement Offering;
	@FindBy(xpath = "//html/body/ion-app/ng-component/ion-nav/detail-page/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[1]/ion-grid/ion-row/div[2]")
	WebElement BackToDashBoardpage;
	
	@FindBy(xpath="//future-trend-chart//*[name()='svg']")
	WebElement FutureTrendDemandCoveragehart;
	public DemandCoverageExp()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDemandCoverage()
	{
		DemandCoveragetileexp.click();
	}
	
	public boolean verifyDemandCoverage()
	{
		return DemandCoverage.isDisplayed();
	}
	
	public boolean verifyWithInThreshold()
	{
		return WithInThreshold.isDisplayed();
	}
	public boolean verifyAsOF()
	{
		return AsOF.isDisplayed();
	}
	public boolean verifyNoOfDeals()
	{
		return NoOfDeals.isDisplayed();
	}
	public boolean verifyTCV()
	{
		return TCV.isDisplayed();
	}
	public boolean verifyMonths()
	{
		String months = Months.getText();
		System.out.println(months);
		return Months.isDisplayed();
	}
	public boolean verifyDeals()
	{
		return Deals.isDisplayed();
	}
	public boolean verifyWithNoPlans()
	{
		return WithNoPlans.isDisplayed();
	}
	public boolean verifyWithNoPlansRequired()
	{
		return WithNoPlansRequired.isDisplayed();
	}
	public boolean verifyWithPlans()
	{
		return WithPlans.isDisplayed();
	}
	public boolean verifyOpportunityDetails()
	{
		return OpportunityDetails.isDisplayed();
	}
	public boolean verifyView()
	{
		return View.isDisplayed();
	}
	public boolean verifyAllDropDown()
	{
		return AllDropDown.isDisplayed();
	}
	public boolean verifyCustName()
	{
		return CustName.isDisplayed();
	}
	public boolean verifyDecisionDate()
	{
		return DecisionDate.isDisplayed();
	}
	public boolean verifyTCV_M()
	{
		return TCV_M.isDisplayed();
	}
	public boolean verifySalesStage()
	{
		return SalesStage.isDisplayed();
	}
	
	public boolean verifyRoadMapStatus()
	{
		return RoadMapStatus.isDisplayed();
	}
	public boolean verifyStartDate()
	{
		return StartDate.isDisplayed();
	}
	public boolean verifyDuration_Months()
	{
		return Duration_Months.isDisplayed();
	}
	public boolean verifyOppID()
	{
		return OppID.isDisplayed();
	}
	public boolean verifyOpportunityName()
	{
		return OpportunityName.isDisplayed();
	}
	public boolean verifyOppOwnerName()
	{
		return OppOwnerName.isDisplayed();
	}
	public boolean verifyOffering()
	{
		return Offering.isDisplayed();
	}
	
	public boolean verifyFutureTrendDemandCoveragehart()
	{
		return FutureTrendDemandCoveragehart.isDisplayed();
	}
	public void clickOnDashBoardText()
	{
		 BackToDashBoardpage.click();
	}

}
