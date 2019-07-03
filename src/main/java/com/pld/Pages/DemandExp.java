package com.pld.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class DemandExp extends PldTestBase{
	
	@FindBy(xpath = "//demand/ion-card/ion-card-content")
	WebElement DemandtileExp;
	
	@FindBy(xpath = "//div[@class='nameStyle'][contains(text(),'Demand')]")
	WebElement ExpTitle;
	
	@FindBy(xpath = "//div[@class='headerColor']")
	WebElement HistoricalDemandTrend;
	@FindBy(xpath = "//ion-segment-button[@value='Type']")
	WebElement Type;
	@FindBy(xpath = "//ion-segment-button[@value='TimeFrame']")
	WebElement TimeFrame;
	
	@FindBy(xpath = "//span[contains(text(),'Open Positions')]")
	WebElement OpenPositions;
	@FindBy(xpath = "//*[@class='removeVerticalPaddingForDemand grid']//ion-row[3]//span[1]")
	WebElement DataAvailablefromOnlyJune2018Onwards;
	@FindBy(xpath = "//span[contains(text(),'Client and Skill based Demands')]")
	WebElement ClientAndSkillbasedDemands;
	@FindBy(xpath = "//ion-col[contains(text(),'*CONFIDENTIAL*')]")
	WebElement Confidential;
	@FindBy(xpath = "//ion-col[contains(text(),'CHINA MOBILE COMMUNICATION CO., LTD')]")
	WebElement ChinaMobileCommunicationCo;
	
	@FindBy(xpath = "//ion-col[contains(text(),'ROYAL DUTCH SHELL PLC')]")
	WebElement RoyalDutchShellPLC;
	@FindBy(xpath = "//ion-col[contains(text(),'MERCEDES-BENZ INDIA PVT. LTD')]")
	WebElement MercedesBenzIndia;
	
	@FindBy(xpath = "//ion-col[contains(text(),'BNP PARIBAS')]")
	WebElement BNPParibas;
	@FindBy(xpath = "//ion-col[contains(text(),'Application Developer-Java & Web Technologies')]")
	WebElement ApplicationDeveloperJavaAndWebTechnologies;
	@FindBy(xpath= "//ion-col[contains(text(),'Application Developer-SAP ABAP')]")
	WebElement ApplicationDeveloperSapABAP;
	@FindBy(xpath = "//ion-col[contains(text(),'Project Manager-ADM')]")
	WebElement projectManagerADM;
	@FindBy(xpath = "//ion-col[contains(text(),'Process Services Professional-Finance')]")
	WebElement ProcessServicesProfessionalFinance;
	@FindBy(xpath = "//ion-col[contains(text(),'Application Developer-Java Full Stack')]")
	WebElement ApplicationDeveloperJavaFullStack;
	@FindBy(xpath ="//div[@class='headerColor lowUtilText']")
	WebElement OpenPositionDetail;
	@FindBy(xpath = "//span[contains(text(),'Job Role/Speciality')]")
	WebElement JobRoleOrSpeciality;
	@FindBy(xpath = "//span[contains(text(),'Open Seat ID')]")
	WebElement OpenSeatId;
	@FindBy(xpath = "//span[contains(text(),'Band')]")
	WebElement Band;
	@FindBy(xpath = "//span[contains(text(),'Start Date')]")
	WebElement StartDate;
	@FindBy(xpath = "//span[contains(text(),'End Date')]")
	WebElement EndDate;
	@FindBy(xpath = "//span[contains(text(),'Seat type')]")
	WebElement SeatType;
	@FindBy(xpath = "//span[contains(text(),'Client Name')]")
	WebElement ClientName;
	@FindBy(xpath = "//span[contains(text(),'Win Odds')]")
	WebElement WinOdds;
	@FindBy(xpath = "//span[contains(text(),'Seat Owner')]")
	WebElement SeatOwner;
	@FindBy(xpath = "//span[contains(text(),'Opp.ID')]")
	WebElement OppID;
	@FindBy(xpath = "//span[contains(text(),'Location')]")
	WebElement Location;
	@FindBy(xpath="//*[@class='monthly-trend-legend-text'][contains(text(),'Backlog')]")
	WebElement Backlog;
	@FindBy(xpath = "//*[@class='monthly-trend-legend-text'][contains(text(),'Committed')]")
	WebElement Committed;
	@FindBy(xpath = "//*[@class='monthly-trend-legend-text'][contains(text(),'Opportunity')]")
	WebElement opportunity;
	@FindBy(xpath = "//*[@class='monthly-trend-legend-text'][contains(text(),'Other')]")
	WebElement Other;
	@FindBy(xpath = "//*[@class='monthly-trend-legend-text'][contains(text(),'Factored Open Positions')]")
	WebElement FactoredOpenPositons;
	@FindBy(xpath = "//*[@class='textColor'][contains(text(),'Client')]")
	WebElement Client;
	@FindBy(xpath = "//*[@class='textColor'][contains(text(),'Skill')]")
	WebElement Skill;
	@FindBy(xpath = "//div[@class='viewAllClass']")
	WebElement view;
	@FindBy(xpath = "//*[contains(text(),'All')]")
	WebElement AllText;
	@FindBy(xpath = "//html/body/ion-app/ng-component/ion-nav/detail-page/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[1]/ion-grid/ion-row/div[2]")
	WebElement BackToDashBoardpage;
	
	@FindBy(xpath="//open-seat-chart//*[name()='svg']")
	WebElement OpenPositionChart;
	@FindBy(xpath="//*[@id='totalClient']//*[name()='svg']")
	WebElement ClientBasedDemandChart;
	@FindBy(xpath="//*[@id='totalSkill']//*[name()='svg']")
	WebElement SkillBasedDemandChart;
	
	public DemandExp()
	
	{
		super();
		PageFactory.initElements(driver, this);
	}

	public void clickOnDemandTile()
	{
		DemandtileExp.click();
	}
	public boolean verifyAllText()
	{
		return AllText.isDisplayed();
	}
	public boolean verifyviewText()
	{
		return view.isDisplayed();
	}
	public boolean verifySkill()
	{
		return Skill.isDisplayed();
	}
	public boolean verifyClient()
	{
		return Client.isDisplayed();
	}
	public boolean verifyFactoredOpenPositons()
	{
		return FactoredOpenPositons.isDisplayed();
	}
	public boolean verifyOther()
	{
		return Other.isDisplayed();
	}
	public boolean verifyopportunity()
	{
		return opportunity.isDisplayed();
	}
	public boolean verifyCommitted()
	{
		return Committed.isDisplayed();
	}
	public boolean verifyBacklog()
	{
		return Backlog.isDisplayed();
	}
	public boolean verifyLocation()
	{
		return Location.isDisplayed();
	}
	public boolean verifyOppID()
	{
		return OppID.isDisplayed();
	}
	public boolean verifySeatOwner()
	{
		return SeatOwner.isDisplayed();
	}
	public boolean verifyWinOdds()
	{
		return WinOdds.isDisplayed();
	}
	public boolean verifyClientName()
	{
		return ClientName.isDisplayed();
	}
	public boolean verifySeatType()
	{
		return SeatType.isDisplayed();
	}
	public boolean verifyEndDate()
	{
		return EndDate.isDisplayed();
	}
	public boolean verifyStartDate()
	{
		return StartDate.isDisplayed();
	}
	public boolean verifyBand()
	{
		return Band.isDisplayed();
	}
	public boolean verifyOpenSeatId()
	{
		return OpenSeatId.isDisplayed();
	}
	public boolean verifyOpenPositionDetail()
	{
		return OpenPositionDetail.isDisplayed();
	}
	public boolean verifyApplicationDeveloperJavaFullStack()
	{
		return ApplicationDeveloperJavaFullStack.isDisplayed();
	}
	public boolean verifyJobRoleOrSpeciality()
	{
		return JobRoleOrSpeciality.isDisplayed();
	}
	public boolean verifyProcessServicesProfessionalFinance()
	{
		return ProcessServicesProfessionalFinance.isDisplayed();
	}
	public boolean verifyprojectManagerADM()
	{
		return projectManagerADM.isDisplayed();
	}
	public boolean verifyApplicationDeveloperSapABAP()
	{
		return ApplicationDeveloperSapABAP.isDisplayed();
	}
	public boolean verifyApplicationDeveloperJavaAndWebTechnologies()
	{
		return ApplicationDeveloperJavaAndWebTechnologies.isDisplayed();
	}
	public boolean verifyBNPParibas()
	{
		return BNPParibas.isDisplayed();
	}
	public boolean verifyMercedesBenzIndia()
	{
		return MercedesBenzIndia.isDisplayed();
	}
	public boolean verifyRoyalDutchShellPLC()
	{
		return RoyalDutchShellPLC.isDisplayed();
	}
	public boolean verifyChinaMobileCommunicationCo()
	{
		return ChinaMobileCommunicationCo.isDisplayed();
	}
	public boolean verifyConfidential()
	{
		return Confidential.isDisplayed();
	}
	public boolean verifyClientAndSkillbasedDemands()
	{
		return ClientAndSkillbasedDemands.isDisplayed();
	}
	public boolean verifyDataAvailablefromOnlyJune2018Onwards()
	{
		return DataAvailablefromOnlyJune2018Onwards.isDisplayed();
	}
	public boolean verifyHistoricalDemandTrend()
	{
		return HistoricalDemandTrend.isDisplayed();
	}
	public boolean verifyType()
	{
		return Type.isDisplayed();
	}
	public boolean verifyTimeFrame()
	{
		return TimeFrame.isDisplayed();
	}
	public boolean verifyOpenPositions()
	{
		return OpenPositions.isDisplayed();
	}
	
	public void verifyTitleofExpansion()
	{
		String str = ExpTitle.getText();
		if(str.equals("Demand"))
		{
			System.out.println("User triggered to Demand expansion page");
		}
		else
		{
			System.out.println("User is in wrong page");
		}
	}
	public void clickOnDashBoard()
	{
		BackToDashBoardpage.click();
	}
	public boolean verifyOpenPositionChart()
	{
		return OpenPositionChart.isDisplayed();
	}
	public boolean verifyClientBasedDemandChart()
	{
		return ClientBasedDemandChart.isDisplayed();
	}
	public boolean verifySkillBasedDemandChart()
	{
		return SkillBasedDemandChart.isDisplayed();
	}
	
}
