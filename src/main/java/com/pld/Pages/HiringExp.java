package com.pld.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class HiringExp extends PldTestBase{
	
	@FindBy(xpath = "//hiring/ion-card/ion-card-content")
	WebElement HiringTileExp;
	
	@FindBy(xpath = "//*[@class='headerColor lowUtilText']")
	WebElement KeyStatistics;
	
	@FindBy(xpath = "//td[@class='keyStatisticsMetric keyStatisticsMetricHead']")
	WebElement Metric;
	
	@FindBy(xpath = "//td[contains(text(),'Accept %')]")
	WebElement AcceptPer;
	
	@FindBy(xpath = "//td[contains(text(),'Avg Days to Accept')]")
	WebElement AvgDaysToAccept;
	
	@FindBy(xpath = "//td[contains(text(),'Avg Days to Onboard')]")
	WebElement AvgDayToOnBoard;
	
	@FindBy(xpath = "//td[contains(text(),'Total')]")
	WebElement Total;
	
	@FindBy(xpath = "//div[@class='headerColor ytddemoText']")
	WebElement HiresYTD;
	
	@FindBy(xpath = "//div[contains(text(),'Clm By:')]")
	WebElement columnBy;
	
	@FindBy(xpath = "//*[contains(text(),'Practice')]")
	WebElement PracticeText;
	
	@FindBy(xpath = "//div[contains(text(),'B1-5')]")
	WebElement HiredYTD_BOneToFive;
	
	@FindBy(xpath = "//div[contains(text(),'B7')]")
	WebElement HiredYTD_BSeven;
	
	@FindBy(xpath = "//div[contains(text(),'B8')]")
	WebElement HiresYTD_BEight;
	
	@FindBy(xpath = "//div[contains(text(),'B9')]")
	WebElement HiresYTD_BNine;
	
	@FindBy(xpath = "//div[contains(text(),'Other')]")
	WebElement Others;
	
	@FindBy(xpath = "//span[@class='headerColor joiners_head']")
	WebElement RecentJoiners;
	
	@FindBy(xpath = "//*[contains(text(),'Name')]")
	WebElement Name;
	
	@FindBy(xpath = "//*[contains(text(),'Band')]")
	WebElement Band;
	
	@FindBy(xpath = "//*[contains(text(),'Email')]")
	WebElement Email;
	
	@FindBy(xpath = "//*[contains(text(),'Start Date')]")
	WebElement StartDate;
	
	@FindBy(xpath = "//*[contains(text(),'Location')]")
	WebElement location;
	
	@FindBy(xpath = "//*[contains(text(),'Candidate Yield')]")
	WebElement CandidateYield;
	
	@FindBy(xpath = "//span[contains(text(),'as of')]")
	WebElement asOF;
	
	@FindBy(className = "hiringFunnelAsOf")
	WebElement hiringfunneldate;
	
	@FindBy(xpath = "//*[contains(text(),'Applied')]")
	WebElement Applied;
	
	@FindBy(xpath = "//*[contains(text(),'Interviewed')]")
	WebElement interviewed;
	@FindBy(xpath = "//*[contains(text(),'Offer Sent')]")
	WebElement Offersent;
	@FindBy(xpath = "//*[contains(text(),'ANOB')]")
	WebElement ANOB;
	
	@FindBy(xpath = "//html/body/ion-app/ng-component/ion-nav/detail-page/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[1]/ion-grid/ion-row/div[2]")
	WebElement BackToDashBoardpage;
	@FindBy(xpath="//hiring-funnel//*[name()='svg']")
	WebElement HiringFunnelChart;
	
	public HiringExp()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnHiringExp()
	{
		HiringTileExp.click();
	}
	
	public boolean verifyTotal()
	{
		return Total.isDisplayed();
	}

	public boolean verifyAvgDayToOnBoard()
	{
		return AvgDayToOnBoard.isDisplayed();
	}
	public boolean verifyAcceptPer()
	{
		return AcceptPer.isDisplayed();
	}
	public boolean verifyAvgDaysToAccept()
	{
		return AvgDaysToAccept.isDisplayed();
	}
	public boolean verifyMetric()
	{
		return Metric.isDisplayed();
	}
	public boolean verifyKeyStatistics()
	{
		return KeyStatistics.isDisplayed();
	}
	public boolean verifyKeyHiresYTD()
	{
		return HiresYTD.isDisplayed();
	}
	public boolean verifyPracticeText()
	{
		return PracticeText.isDisplayed();
	}
	public boolean verifyHiredYTD_BOneToFive()
	{
		return HiredYTD_BOneToFive.isDisplayed();
	}
	public boolean verifyHiredYTD_BSeven()
	{
		return HiredYTD_BSeven.isDisplayed();
	}
	public boolean verifyHiresYTD_BEight()
	{
		return HiresYTD_BEight.isDisplayed();
	}
	public boolean verifyHiresYTD_BNine()
	{
		return HiresYTD_BNine.isDisplayed();
	}
	public boolean verifyOthers()
	{
		return Others.isDisplayed();
	}
	public boolean verifyRecentJoiners()
	{
		return RecentJoiners.isDisplayed();
	}
	public boolean verifyName()
	{
		return Name.isDisplayed();
	}
	public boolean verifyBand()
	{
		return Band.isDisplayed();
	}
	public boolean verifyEmail()
	{
		return Email.isDisplayed();
	}
	public boolean verifyStartDate()
	{
		return StartDate.isDisplayed();
	}
	public boolean verifyLocation()
	{
		return location.isDisplayed();
	}
	public boolean verifyCandidateYield()
	{
		return CandidateYield.isDisplayed();
	}
	public boolean verifyAsOF()
	{
		return asOF.isDisplayed();
	}
	public boolean verifyHiringFunnelDate()
	{
		return hiringfunneldate.isDisplayed();
	}
	public boolean verifyApplied()
	{
		return Applied.isDisplayed();
	}
	public boolean verifyInterviewed()
	{
		return interviewed.isDisplayed();
	}
	public boolean verifyOfferSent()
	{
		return Offersent.isDisplayed();
	}
	
	public boolean verifyANOB()
	{
		return ANOB.isDisplayed();
	}
	public boolean verifyHiringFunnelChart()
	{
		return HiringFunnelChart.isDisplayed();
	}
	public void clickOnDashBoard()
	{
		BackToDashBoardpage.click();
	}
}