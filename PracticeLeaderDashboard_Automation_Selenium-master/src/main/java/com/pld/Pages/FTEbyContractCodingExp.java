package com.pld.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class FTEbyContractCodingExp extends PldTestBase{
	
	@FindBy(xpath = "//labour/ion-card/ion-card-content")
	WebElement FTEbyContractCodingExp;
	
	@FindBy(xpath = "//span[contains(text(),'FTE by Contract Coding')]")
	WebElement FTEByContractCoding;
	
	@FindBy(xpath = "//span[contains(text(),'Cloud Application Innovation')]")
	WebElement CloudApplicationInnovation;
	
	@FindBy(xpath = "//*[contains(text(),'ADMI')]")
	WebElement ADMI;
	
	@FindBy(xpath = "//span[contains(text(),'CAMS')]")
	WebElement CAMS;
	
	@FindBy(xpath = "//span[contains(text(),'NGEA')]")
	WebElement NGEA;
	
	@FindBy(xpath = "//span[contains(text(),'Cognitive Process Transformation')]")
	WebElement cognitiveProcessTransformation;
	
	@FindBy(xpath = "//span[contains(text(),'CBDS')]")
	WebElement CBDS;
	
	@FindBy(xpath = "//span[contains(text(),'CPR')]")
	WebElement CPR;
	
	@FindBy(xpath = "//span[contains(text(),'CPS')]")
	WebElement CPS;
	
	@FindBy(xpath = "//span[contains(text(),'Digital Strategy and iX')]")
	WebElement DigitalStrategyandiX;
	
	@FindBy(xpath = "//*[contains(text(),'DS')]")
	WebElement DS;
	
	@FindBy(xpath = "//span[contains(text(),'IX')]")
	WebElement IX;
	
	@FindBy(xpath = "//span[contains(text(),'Other')]")
	WebElement otherlink;
	
	@FindBy(xpath = "//span[@class='cursorStyle categoryTextDecoration'][contains(text(),'Other')]")
	WebElement Other;
	
	@FindBy(xpath = "//span[contains(text(),'Offering Code Breakdown')]")
	WebElement OfferingCodeBreakDown;
	
	@FindBy(xpath = "//*[contains(text(),'QTD - Total')]")
	WebElement QTDTotal;
	
	@FindBy(xpath ="//*[contains(text(),'Exclude Others')]")
	WebElement ExcludeOthers;
	
	@FindBy(xpath = "//span[@class='viewAllClass viewByTextColor']")
	WebElement ViewBy;
	
	@FindBy(xpath = "//*[contains(text(),'Contract Offering')]")
	WebElement ContractOffering;
	
	@FindBy(xpath = "//*[contains(text(),'AMI-Custom Adm')]")
	WebElement AMICustomAdm;
	
	@FindBy(xpath = "//*[contains(text(),'CPS-Finance Process ...')]")
	WebElement CPSFinanceProcess;
	
	@FindBy(xpath ="//*[contains(text(),'AMI-Sap Adm')]")
	WebElement AMISapAdm;
	
	@FindBy(xpath = "//*[contains(text(),'EAM-SAP')]")
	WebElement EAMSAP;
	
	@FindBy(xpath = "//*[contains(text(),'CAM-Onprem Services')]")
	WebElement CAMCloudApplication;
	
	@FindBy(xpath = "//*[contains(text(),'AMI-Ignite (Test Inn...')]")
	WebElement AMIIgnite;
	
	@FindBy(xpath = "//*[contains(text(),'FTE')]")
	WebElement FTE;
	
	@FindBy(xpath = "//*[contains(text(),'Billable')]")
	WebElement Billable;
	
	@FindBy(xpath = "//*[contains(text(),'Chargeable')]")
	WebElement Chargeable;
	
	@FindBy(xpath = "//*[contains(text(),'Productive')]")
	WebElement Productive;
	
	@FindBy(xpath = "//span[contains(text(),'Contribution Employees')]")
	WebElement ContributionEmployees;
	
	@FindBy(xpath = "//div[contains(@class,'viewAllClass')]")
	WebElement view;
	
	@FindBy(xpath = "//span[contains(text(),'Name')]")
	WebElement name;
	
	@FindBy(xpath = "//span[contains(text(),'Band')]")
	WebElement Band;
	
	@FindBy(xpath = "//span[contains(text(),'JR/S')]")
	WebElement JRSS;
	
	@FindBy(xpath = "//span[contains(text(),'Location')]")
	WebElement Location;
	
	@FindBy(xpath = "//span[@class='noPadding']")
	WebElement ActualHours;
	
	@FindBy(xpath = "//span[contains(text(),'Client Name')]")
	WebElement Clientname;
	
	@FindBy(xpath = "//*[contains(text(),'Account')]")
	WebElement AccountClassification;
	
	@FindBy(xpath = "//span[contains(text(),'Level 30 Code')]")
	WebElement Level30Code;
	
	@FindBy(xpath = "//*[contains(text(),'Last Claim')]")
	WebElement lastclaimDate;
	
	@FindBy(xpath = "//*[contains(text(),'Available')]")
	WebElement AvailableDate;
	
	@FindBy(xpath = "//*[contains(text(),'CAI')]")
	WebElement CAI;

	@FindBy(xpath = "//*[contains(text(),'CPT')]")
	WebElement CPT;
	
	@FindBy(xpath = "//*[contains(text(),'DS&iX')]")
	WebElement DSandiX;
	
	@FindBy(xpath = "//*[contains(text(),'Other')]")
	WebElement Other2;
	@FindBy(xpath = "//html/body/ion-app/ng-component/ion-nav/detail-page/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[1]/ion-grid/ion-row/div[2]")
	WebElement BackToDashBoardpage;
	
	@FindBy(xpath="//fte-doughnut//*[name()='svg']")
	WebElement FTEByContractCodingDoughnutChart;
	@FindBy(xpath="//offering-code-breakdown-chart//*[name()='svg']")
	WebElement OfferingCodeBreakDownChart;
	
	@FindBy(xpath="//span[contains(@class,'headerColor warningMsgDetails')]")
	WebElement MessageDisplay;
	@FindBy(xpath="//div[@class='noDataAvailableMessage']")
	WebElement NodataAvailableMessage;
	
	public FTEbyContractCodingExp()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	public boolean verifyMessageDisplay()
	{
		System.out.println(MessageDisplay.getText());
		return MessageDisplay.isDisplayed();
	}
	public boolean verifyNoDataAvailableDisplay()
	{
		return NodataAvailableMessage.isDisplayed();
	}
	public void clickOnFTEContractCoadingtile()
	{
		FTEbyContractCodingExp.click();	
	}
	
	public boolean verifyFTEByContractCoding()
	{
		return FTEByContractCoding.isDisplayed();
	}
	
	public boolean verifyCloudApplicationInnovation()
	{
		return CloudApplicationInnovation.isDisplayed();
	}
	
	public boolean verifyADMI()
	{
		return ADMI.isDisplayed();
	}
	public boolean verifyCAMS()
	{
		return CAMS.isDisplayed();
	}
	public boolean verifyNGEA()
	{
		return NGEA.isDisplayed();
	}
	public boolean verifycognitiveProcessTransformation()
	{
		return cognitiveProcessTransformation.isDisplayed();
	}
	public boolean verifyCBDS()
	{
		return CBDS.isDisplayed();
	}
	public boolean verifyCPR()
	{
		return CPR.isDisplayed();
	}
	public boolean verifyCPS()
	{
		return CPS.isDisplayed();
	}
	public boolean verifyDigitalStrategyandiX()
	{
		return DigitalStrategyandiX.isDisplayed();
	}
	public boolean verifyDS()
	{
		return DS.isDisplayed();
	}
	public boolean verifyIX()
	{
		return IX.isDisplayed();
	}
	public boolean verifyotherlink()
	{
		return otherlink.isDisplayed();
	}
	public boolean verifyOther()
	{
		return Other.isDisplayed();
	}
	public boolean verifyOfferingCodeBreakDown()
	{
		return OfferingCodeBreakDown.isDisplayed();
	}
	public boolean verifyQTDTotal()
	{
		return QTDTotal.isDisplayed();
	}
	public boolean verifyExcludeOthers()
	{
		return ExcludeOthers.isDisplayed();
	}
	public boolean verifyViewBy()
	{
		return ViewBy.isDisplayed();
	}
	public boolean verifyContractOffering()
	{
		return ContractOffering.isDisplayed();
	}
	public boolean verifyAMICustomAdm()
	{
		return AMICustomAdm.isDisplayed();
	}
	public boolean verifyCPSFinanceProcess()
	{
		return CPSFinanceProcess.isDisplayed();
	}
	public boolean verifyAMISapAdm()
	{
		return AMISapAdm.isDisplayed();
	}
	public boolean verifyEAMSAP()
	{
		return EAMSAP.isDisplayed();
	}
	public boolean verifyCAMCloudApplication()
	{
		return CAMCloudApplication.isDisplayed();
	}
	public boolean verifyAMIIgnite()
	{
		return AMIIgnite.isDisplayed();
	}
	public boolean verifyBillable()
	{
		return Billable.isDisplayed();
	}
	public boolean verifyChargeable()
	{
		return Chargeable.isDisplayed();
	}
	public boolean verifyProductive()
	{
		return Productive.isDisplayed();
	}
	public boolean verifyContributionEmployees()
	{
		return ContributionEmployees.isDisplayed();
	}
	public boolean verifyLocation()
	{
		return Location.isDisplayed();
	}
	public boolean verifyJRSS()
	{
		return JRSS.isDisplayed();
	}
	public boolean verifyActualHours()
	{
		return ActualHours.isDisplayed();
	}
	public boolean verifyBand()
	{
		return Band.isDisplayed();
	}
	public boolean verifyname()
	{
		return name.isDisplayed();
	}
	
	public boolean verifyview()
	{
		return view.isDisplayed();
	}
	public boolean verifyClientname()
	{
		return Clientname.isDisplayed();
	}
	public boolean verifyAccountClassification()
	{
		return AccountClassification.isDisplayed();
	}
	public boolean verifyLevel30Code()
	{
		return Level30Code.isDisplayed();
	}
	public boolean verifylastclaimDate()
	{
		return lastclaimDate.isDisplayed();
	}
	public boolean verifyAvailableDate()
	{
		return AvailableDate.isDisplayed();
	}
	public boolean verifyCAI()
	{
		return CAI.isDisplayed();
	}
	public boolean verifyCPT()
	{
		return CPT.isDisplayed();
	}
	public boolean verifyDSandiX()
	{
		return DSandiX.isDisplayed();
	}
	
	public boolean verifyOther2()
	{
		return Other2.isDisplayed();
	}
	public void clickOnDashBoard()
	{
		BackToDashBoardpage.click();
	}
	public boolean verifyFTEByContractCodingDoughnutChart()
	{
		return FTEByContractCodingDoughnutChart.isDisplayed();
	}
	public boolean verifyOfferingCodeBreakDownChart()
	{
		return OfferingCodeBreakDownChart.isDisplayed();
	}

}
