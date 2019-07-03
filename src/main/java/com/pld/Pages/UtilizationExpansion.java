package com.pld.Pages;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pld.Base.PldTestBase;

public class UtilizationExpansion extends PldTestBase {
	
	@FindBy(xpath = "//utilization/ion-card/ion-card-content/ion-grid")
	WebElement Utilization_Exp;
	
	@FindBy(xpath = "//div[contains(text(),'Δ Target (Pts)')]")
	WebElement Utiltile_TargetPtstext;
	
	@FindBy(xpath = "//div[contains(text(),'Δ YTY (Pts)')]")
	WebElement Utiltile_YTYtext;
	
	@FindBy(xpath = "//ion-col[@class='removeColpadding col']//ion-row[@class='removeRowMargin row']//ion-grid[@class='grid-padding grid']//ion-row[@class='removeRowMargin row']//ion-grid[@class='grid-padding grid']//ion-row[2]//ion-col[1]//div[1]")
	WebElement TargetText;
	
	@FindBy(xpath = "//*[contains(text(),'Week Utilization Actuals / Projections')]")
	WebElement WeekUtilizationActualsOrProjections;
	
	@FindBy(xpath = "//*[contains(text(),'Chargeable Actuals')]")
	WebElement ChargeableActuals;
	
	@FindBy(xpath = "//*[contains(text(),'Chargeable Projections')]")
	WebElement ChargeableProjections;
	
	@FindBy(xpath = "//*[@class = 'viewAllClass ']")
	WebElement ViewText;
	
	@FindBy(xpath = "//*[@class = 'dropDownBtn button button-md button-default button-default-md']")
	WebElement Billable_Button;
	
	@FindBy(xpath = "//button/span/span[contains(text(),'Chargeable')]")
	WebElement ChargeableText;
	
	@FindBy(xpath = "//span[@class='categoryClass whiteSpans'][contains(text(),'Billable')]")
	WebElement BillableText;
	
	@FindBy(xpath = "//span[@class='categoryClass whiteSpans'][contains(text(),'Productive')]")
	WebElement ProductiveText;
	
	@FindBy(xpath = "//*[contains(text(),'Qtr End Projection')]")
	WebElement QtrEndProjection;
	
	@FindBy(xpath = "//ion-backdrop[@role='presentation']")
	WebElement CLoseDropDown;
	
	@FindBy(xpath = "//*[name()='svg']//*[name()='g']//*[name()='text' and @class='doughnut-centre-text']")
	WebElement QtrEndProjValue;
	
	@FindBy(xpath = "//*[@class = 'legend-label'][contains(text(),'Target')]")
	WebElement legendLabel_Target;
	
	@FindBy(xpath = "//*[@class = 'legend-label'][contains(text(),'Prev. Year')]")
	WebElement legendLabel_PrevYear;
	
	@FindBy(xpath = "//html/body/ion-app/ng-component/ion-nav/detail-page/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[1]/ion-grid/ion-row/div[2]")
	WebElement BackToDashBoardpage;
	
	@FindBy(xpath="//weekly-utilizarion-bar-line-chart//*[name()='svg']")
	WebElement WeeklyutilizationbarChart;
	@FindBy(xpath="//util-doughnut-chart//*[name()='svg']")
	WebElement QtrEndProjDoughnutChart;
	
	public UtilizationExpansion()  {
		super();
		PageFactory.initElements(driver, this);
	}

	public  void clickOnUtilizationTile()
	{
		Utilization_Exp.click();
	}
	
	public boolean verifyWeekUtilizationText()
	{
		try {
			WeekUtilizationActualsOrProjections.isDisplayed();
			String expTitle = WeekUtilizationActualsOrProjections.getText();
			System.out.println("utilization expansion titile is :" +expTitle);
		}catch (NoSuchElementException e) {
			return false;
		}
		return true;
		
	}
	
	public boolean verifyChargeableActuals()
	{
		return ChargeableActuals.isDisplayed();
	}
	
	public boolean verifyChargeableProjections()
	{
		return ChargeableProjections.isDisplayed();
	}
	
	public boolean verifyViewText()
	{
		return ViewText.isDisplayed();
	}
	
	public boolean verifyQtrEndProjection()
	{
		String value = QtrEndProjValue.getText();
		System.out.println("QtrEndProjection value is :" +value);
		
		
		return QtrEndProjection.isDisplayed();
	}
	
	public boolean verifyChargeable_Button()
	{
		//Billable_Button.click();
		//ChargeableText.click();
		try {
		if(ChargeableText.isDisplayed())
		{
			System.out.println("Default view is Chargeable");
			
		}
		else
		{
			System.out.println("Default view has changed");
		}
		
	}catch(NoSuchElementException e) {
		return false;
	}
		return true;
	}
	
	public void clickOnChargeableButton()
	{
		ChargeableText.click();
		
		try {
			
			BillableText.click();
		}catch(NoSuchElementException e)
		{
			System.out.println("Element not found");
		}
		
	}
	
	public boolean verifyProductiveText()
	{
		Billable_Button.click();
		return ProductiveText.isDisplayed();
	}
	
	public boolean verifyUtiltile_TargetPtstext()
	{
		return Utiltile_TargetPtstext.isDisplayed();
	}
	
	public boolean verifyUtiltile_YTYtext()
	{
		return Utiltile_YTYtext.isDisplayed();
	}
	
	public boolean verifyTargetText()
	{
		return TargetText.isDisplayed();
	}
	public void closeChargeabledropdown()
	{
		CLoseDropDown.click();
	}
	public boolean verifyLegendlableTarget()
	{
		return legendLabel_Target.isDisplayed();
		
	}
	
	public boolean verifyLegendlablePrevYear()
	{
		return legendLabel_PrevYear.isDisplayed();
	}
	
	public boolean verifyQtrEndProjDoughnutChart()
	{
		return QtrEndProjDoughnutChart.isDisplayed();
	}
	public boolean verifyWeeklyutilizationbarChart()
	{
		return WeeklyutilizationbarChart.isDisplayed();
	}
	public void clickOnCloseUtilExp()
	{
		//CLoseDropDown.click();
		BackToDashBoardpage.click();
	}
	
	
}

