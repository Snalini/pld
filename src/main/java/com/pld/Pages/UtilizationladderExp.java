package com.pld.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pld.Base.PldTestBase;

public class UtilizationladderExp extends PldTestBase{
	
	@FindBy(xpath = "//utilization-ladder/ion-card/ion-card-content")
	WebElement clickOnUtilLadTile;
	
	@FindBy(xpath = "//span[contains(text(),'Utilization Distribution by Band')]")
	WebElement UtilizationDistributionbyBand;
	
	@FindBy(xpath = "//*[contains(text(),'QTD')]")
	WebElement QTD;
	
	@FindBy(xpath = "//span[contains(text(),'<= 50% Utilization by Category')]")
	WebElement UtilizationByCategory;
	
	@FindBy(xpath = "//div[contains(text(),'Total Headcount')]")
	WebElement TotalHeadCount;
	
	@FindBy(xpath = "//div[@class='noSpace hc50padding']")
	WebElement HeadCountUnder;
	
	@FindBy(xpath = "//div[contains(text(),'Projection OK')]")
	WebElement ProjectionOk;
	
	@FindBy(xpath = "//div[contains(text(),'Projection OK')]//following::ion-col[1]")
	WebElement ProjectionOkValue;
	
	@FindBy(xpath = "//div[contains(text(),'High Band')]")
	WebElement HighBand;
	@FindBy(xpath = "//div[contains(text(),'High Band')]//following::ion-col[1]")
	WebElement HighBandValue;
	
	@FindBy(xpath = "//div[contains(text(),'Productive Project')]")
	WebElement ProductiveProject;
	
	@FindBy(xpath = "//div[contains(text(),'Productive Project')]//following::ion-col[1]")
	WebElement ProductiveProjectValue;
	
	@FindBy(xpath = "//div[contains(text(),'Deployed Part-Time')]")
	WebElement DeployedPartTime;
	
	@FindBy(xpath = "//div[contains(text(),'Deployed Part-Time')]//following::ion-col[1]")
	WebElement DeployedPartTimeValue;
	
	@FindBy(xpath = "//div[contains(text(),'Awaiting Account ID')]")
	WebElement AwaitingAccountID;
	
	@FindBy(xpath = "//div[contains(text(),'Awaiting Account ID')]//following::ion-col[1]")
	WebElement AwaitingAccountIDValue;
	
	@FindBy(xpath = "//*[contains(text(),'Bench')]")
	WebElement Bench;
	
	@FindBy(xpath = "//*[contains(text(),'Bench')]//following::ion-col[1]")
	WebElement BenchValue;
	
	@FindBy(xpath = "//span[contains(text(),'<= 50% Utilization Employees')]")
	WebElement UtilizationEmployees;
	
	
	@FindBy(xpath = "//span[contains(text(),'Name')]")
	WebElement Nametext;
	
	@FindBy(xpath = "//span[contains(text(),'Band')]")
	WebElement BandText;
	@FindBy(xpath = "//span[contains(text(),'JR/S')]")
	WebElement JRSS;
	
	@FindBy(xpath = "//span[contains(text(),'Location')]")
	WebElement Location;
	@FindBy(xpath = "//span[contains(text(),'Industry')]")
	WebElement Industry;
	@FindBy(xpath = "//span[contains(text(),'Hours FC')]")
	WebElement HoursFC;
	@FindBy(xpath = "//span[contains(text(),'QTD CU')]")
	WebElement QTDCU;
	@FindBy(xpath = " //span[contains(text(),'QTD PU')]")
	WebElement QTDPU;
	@FindBy(xpath = "//span[contains(text(),'MC')]")
	WebElement MC;
	@FindBy(xpath = "//*[contains(text(),'AAID')]")
	WebElement AAID;
	@FindBy(xpath = "//span[contains(text(),'Away')]")
	WebElement Away;
	@FindBy(xpath = "//span[contains(text(),'Assigned Acct')]")
	WebElement AssignedAcct;
	@FindBy(xpath = "//span[contains(text(),'Avail Date')]")
	WebElement AvailDate;
	@FindBy(xpath ="//span[contains(text(),'Bench Age')]")
	WebElement BenchAge;
	@FindBy(xpath = "//span[contains(text(),'In-Play')]")
	WebElement INPlay;
	@FindBy(xpath = "//div[contains(@class,'viewAllClass')]")
	WebElement View;
	@FindBy(xpath = "//button//span//div")
	WebElement AllDropDown;
	@FindBy(xpath = "//html/body/ion-app/ng-component/ion-nav/detail-page/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[1]/ion-grid/ion-row/div[2]")
	WebElement BackToDashBoardpage;
	@FindBy(xpath="//util-distribution-chart//*[name()='svg']")
	WebElement UtilizationDistributionbyBandChart;
	@FindBy(xpath="//util-bench-doughnut-chart//*[name()='svg']")
	WebElement UtilizationByCategoryDoughnutChart;
	
	@FindBy(xpath="//div[@class='lowUtilText']")
	WebElement MessageDisplay;
	@FindBy(xpath="//div[@class='noDataAvailableMessage']")
	WebElement NodataMessage;
	
public	UtilizationladderExp()
{
	super();
	PageFactory.initElements(driver, this);
}

public void clickOnUtilladTile()
{
	WebDriverWait wait = new WebDriverWait(driver,10);
wait.until(ExpectedConditions.elementToBeClickable(clickOnUtilLadTile));
	clickOnUtilLadTile.click();
}

public boolean verifyUtilizationDistributionbyBand()
{
	System.out.println("SubTile Name is "+UtilizationDistributionbyBand.getText());
	return UtilizationDistributionbyBand.isDisplayed();
}

public boolean verifyQTD()
{
	return QTD.isDisplayed();
}
public boolean verifyUtilizationByCategory()
{
	System.out.println("Subtile Name is "+UtilizationByCategory.getText());
	return UtilizationByCategory.isDisplayed();
}
public boolean verifyTotalHeadCount()
{
	return TotalHeadCount.isDisplayed();
}
public boolean verifyHeadCountUnder()
{
	return HeadCountUnder.isDisplayed();
}
public boolean verifyProjectionOk()
{
	System.out.println("Projecti ok value is "+ProjectionOkValue.getText());
	
	return ProjectionOk.isDisplayed();
}
public boolean verifyHighBand()
{
	System.out.println("High Band Value is "+HighBandValue.getText());
	return HighBand.isDisplayed();
}
public boolean verifyProductiveProject()
{
	System.out.println("Productive Project value is "+ProductiveProjectValue.getText());
	return ProductiveProject.isDisplayed();
}
public boolean verifyDeployedPartTime()
{
	System.out.println("Deployed Part Time value is "+DeployedPartTimeValue.getText());
	return DeployedPartTime.isDisplayed();
}
public boolean verifyAwaitingAccountID()
{
	System.out.println("Awaiting Account ID value is "+AwaitingAccountIDValue.getText());
	return AwaitingAccountID.isDisplayed();
}
public boolean verifyBench()
{
	System.out.println("Bench Value is "+BenchValue.getText());
	return Bench.isDisplayed();
}
public boolean verifyUtilizationEmployees()
{
	System.out.println("SubTile Name is "+UtilizationEmployees.getText());
	return UtilizationEmployees.isDisplayed();
}
public boolean verifyView()
{
	return View.isDisplayed();
}
public boolean verifyAllDropDown()
{
	return AllDropDown.isDisplayed();
}
public boolean verifyNametext() 
{
	return Nametext.isDisplayed();
}
public boolean verifyBandText() 
{
	return BandText.isDisplayed();
}
public boolean verifyJRSS() 
{
	return JRSS.isDisplayed();
}
public boolean verifyLocation() 
{
	return Location.isDisplayed();
}
public boolean verifyIndustry() 
{
	return Industry.isDisplayed();
}
public boolean verifyHoursFC() 
{
	return HoursFC.isDisplayed();
}
public boolean verifyQTDCU() 
{
	return QTDCU.isDisplayed();
}
public boolean verifyQTDPU() 
{
	return QTDPU.isDisplayed();
}
public boolean verifyMC() 
{
	return MC.isDisplayed();
}
public boolean verifyAAID() 
{
	return AAID.isDisplayed();
}
public boolean verifyAway() 
{
	return Away.isDisplayed();
}
public boolean verifyAssignedAcct() 
{
	return AssignedAcct.isDisplayed();
}
public boolean verifyAvailDate() 
{
	return AvailDate.isDisplayed();
}
public boolean verifyBenchAge() 
{
	return BenchAge.isDisplayed();
}


public boolean verifyInPlayText() 
{
	return INPlay.isDisplayed();
}
public void clickOnDashBoardText()
{
	 BackToDashBoardpage.click();
}
public boolean verifyUtilizationDistributionbyBandChart() 
{
	return UtilizationDistributionbyBandChart.isDisplayed();
}
public boolean verifyUtilizationByCategoryDoughnutChart() 
{
	return UtilizationByCategoryDoughnutChart.isDisplayed();
}
public boolean verifyMessageDisplay()
{
	System.out.println(MessageDisplay.getText());
	return MessageDisplay.isDisplayed();
}
public boolean verifyNodataMessageDisplay()
{
	return NodataMessage.isDisplayed();
}
}
