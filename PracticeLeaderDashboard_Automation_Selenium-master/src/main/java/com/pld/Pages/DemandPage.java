package com.pld.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class DemandPage extends PldTestBase {
	
	@FindBy(xpath = "//*[contains(text(),'Demand')]")
	WebElement Demand;
	
	@FindBy(xpath = "//*[contains(text(),'Java & Web Dev')]")
	WebElement Java_and_WebDev;
	
	@FindBy(xpath = "//*[contains(text(),'Unassigned')]")
	WebElement Unassigned;
	
	@FindBy(xpath = "//*[contains(text(),'CE&D IBM Interactive')]")
	WebElement CEandD_IBM_Interactive;
	
	@FindBy(xpath = "//*[contains(text(),'Not Applicable')]")
	WebElement NotApplicable;
	
	@FindBy(xpath = "//*[contains(text(),'Open Positions')]")
	WebElement OpenPositions;
	
	@FindBy(xpath = "//*[contains(text(),'Backlog')]")
	WebElement Backlog;
	
	@FindBy(xpath = "//*[contains(text(),'Commit')]")
	WebElement Commit;
	
	@FindBy(xpath = "//*[contains(text(),'Oppty')]")
	WebElement Oppty;
	
	@FindBy(xpath = "//*[contains(text(),'Other')]")
	WebElement Other;
	
	@FindBy(xpath="//demand-by-capacity-chart/div")
	WebElement DemandChart;
	@FindBy(id="stackedBarChart")
	WebElement Demand_barchart;

	public DemandPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public boolean verifyDemandTile()
	{
		return Demand.isDisplayed();
	}
	
	public boolean verifyJavaAndWebDevtext()
	{
		return Java_and_WebDev.isDisplayed();
	}
	
	public boolean verifyUnassignedText()
	{
		return Unassigned.isDisplayed();
	}
	
	public boolean verifyCEandD_IBM_InteractiveText()
	{
		return CEandD_IBM_Interactive.isDisplayed();
	}
	
	public boolean verifyNotApplicableText()
	{
		return NotApplicable.isDisplayed();
	}
	
	public boolean verifyOpenPositionsText()
	{
		return OpenPositions.isDisplayed();
	}
	
	public boolean verifyBacklogText()
	{
		return Backlog.isDisplayed();
	}
	
	public boolean verifyCommitText()
	{
		return Commit.isDisplayed();
	}
	
	public boolean verifyOpptyText()
	{
		return Oppty.isDisplayed();
	}
	public boolean verifyDemandChart()
	{
		return DemandChart.isDisplayed();
	}
	public boolean verifyDemand_barchart()
	{
		return Demand_barchart.isDisplayed();
	}
}
