package com.pld.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class LearningExp extends PldTestBase{
	
	public LearningExp()
	{
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//learning/ion-card/ion-card-content")
	WebElement LearningExp;
	
	@FindBy(xpath = "//span[contains(text(),'Student Day Distribution')]")
	WebElement StudentDayDistribution;
	
	@FindBy(xpath = "//div[contains(text(),'Metric')]")
	WebElement Metric;
	
	@FindBy(xpath = "//*[@class='distribution-row'][contains(text(),'5+1+1')]")
	WebElement  FivePlusOnePLusOneThemes;
	
	@FindBy(xpath = "//*[@class = 'distribution-row paddingTopTot'][contains(text(),'Total')]")
	WebElement Total;
	
	@FindBy(xpath = "//span[contains(text(),'Training Details')]")
	WebElement TrainingDetails;
	
	@FindBy(xpath = "//*[contains(text(),'Growth Themes')]")
	WebElement GrowthThemesAndOfferings;
	
	@FindBy(xpath = "//ion-grid[contains(@class,'training-details-grid grid')]//ion-grid[contains(@class,'training-details-grid grid')]//ion-row[contains(@class,'hcRowPadding removeRowMargin colRAlign unqPartiLeftPadding headerRowWidth row')]")
	WebElement UniqueParticipants;
	
	@FindBy(xpath = "//ion-grid[contains(@class,'training-details-grid grid')]//ion-grid[1]//ion-row[1]//ion-col[2]//ion-grid[1]//ion-row[1]//ion-col[2]//ion-row[1]")
	WebElement StudentDays;
	
	@FindBy(xpath = "//ion-grid[contains(@class,'training-details-grid grid')]//ion-grid[1]//ion-row[1]//ion-col[2]//ion-grid[1]//ion-row[1]//ion-col[3]//ion-row[1]")
	WebElement Pentperc;
	
	@FindBy(xpath = "//ion-grid[contains(@class,'training-details-grid grid')]//ion-grid[1]//ion-row[1]//ion-col[2]//ion-grid[1]//ion-row[1]//ion-col[4]//ion-row[1]")
	WebElement AvgDaysperpart;
	
	@FindBy(xpath = "//span[contains(text(),'Prescribed Core Capability Learning')]")
	WebElement prescribedCoreCapabilityLearning;
	
	@FindBy(xpath = "//ion-col[contains(text(),'Service Line Sub Areas')]")
	WebElement ServiceLineSubAreas;
	
	@FindBy(xpath = "//ion-row[contains(@class,'hcRowPadding removeRowMargin colRAlign headerRowWidth unqPartiLeftPadding headerRowWidth row')]")
	WebElement ServiceLine_UniqueParticipants;
	
	@FindBy(xpath = "//ion-grid[contains(@class,'training-details-grid grid')]//ion-grid[2]//ion-row[1]//ion-col[2]//ion-grid[1]//ion-row[1]//ion-col[2]//ion-row[1]")
	WebElement Serviceline_StudentDays;
	
	@FindBy(xpath = "//ion-grid[contains(@class,'training-details-grid grid')]//ion-grid[2]//ion-row[1]//ion-col[2]//ion-grid[1]//ion-row[1]//ion-col[3]//ion-row[1]")
	WebElement ServiceLine_Pentperc;
	
	@FindBy(xpath = "//ion-grid[contains(@class,'training-details-grid grid')]//ion-grid[2]//ion-row[1]//ion-col[2]//ion-grid[1]//ion-row[1]//ion-col[4]//ion-row[1]")
	WebElement Serviceline_AvgDaysPerpart;
	
	@FindBy(xpath = "//ion-col[contains(text(),'Industry')]")
	WebElement Industry;
	
	@FindBy(xpath = "//ion-grid[contains(@class,'training-details-grid grid')]//ion-grid[3]//ion-row[1]//ion-col[2]//ion-grid[1]//ion-row[1]//ion-col[1]//ion-row[1]")
	WebElement Industry_UniqueParticipants;
	
	@FindBy(xpath = "//ion-grid[contains(@class,'training-details-grid grid')]//ion-grid[3]//ion-row[1]//ion-col[2]//ion-grid[1]//ion-row[1]//ion-col[2]//ion-row[1]")
	WebElement Industry_StudentDays;
	
	@FindBy(xpath = "//ion-grid[contains(@class,'training-details-grid grid')]//ion-grid[3]//ion-row[1]//ion-col[2]//ion-grid[1]//ion-row[1]//ion-col[3]//ion-row[1]")
	WebElement Industry_pentperc;
	
	@FindBy(xpath = "//ion-grid[contains(@class,'training-details-grid grid')]//ion-grid[3]//ion-row[1]//ion-col[2]//ion-grid[1]//ion-row[1]//ion-col[4]//ion-row[1]")
	WebElement Industry_AvgDaysPerPart;
	
	@FindBy(xpath = "//html/body/ion-app/ng-component/ion-nav/detail-page/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[1]/ion-grid/ion-row/div[2]")
	WebElement BackToDashBoardpage;
	@FindBy(xpath="//student-day-distribution-ytd-chart//*[name()='svg']")
	WebElement Learning_StudentDayDistributionChart;
	public void clickOnLearningTile()
	{
		LearningExp.click();
	}
	
	public boolean verifyStudentDayDistribution()
	{
		return StudentDayDistribution.isDisplayed();
	}
	
	public boolean verifyMetric()
	{
		return Metric.isDisplayed();
	}
	public boolean verifyFivePlusOnePLusOneThemes()
	{
		return FivePlusOnePLusOneThemes.isDisplayed();
	}
	public boolean verifyTotal()
	{
		return Total.isDisplayed();
	}
	public boolean verifyTrainingDetails()
	{
		return TrainingDetails.isDisplayed();
	}
	public boolean verifyGrowthThemesAndOfferings()
	{
		return GrowthThemesAndOfferings.isDisplayed();
	}
	public boolean verifyUniqueParticipants()
	{
		return UniqueParticipants.isDisplayed();
	}
	public boolean verifyStudentDays()
	{
		return StudentDays.isDisplayed();
	}
	public boolean verifyPentperc()
	{
		return Pentperc.isDisplayed();
	}
	public boolean verifyAvgDaysperpart()
	{
		return AvgDaysperpart.isDisplayed();
	}
	public boolean verifyprescribedCoreCapabilityLearning()
	{
		return prescribedCoreCapabilityLearning.isDisplayed();
	}
	public boolean verifyServiceLineSubAreas()
	{
		return ServiceLineSubAreas.isDisplayed();
	}
	public boolean verifyServiceLine_UniqueParticipants()
	{
		return ServiceLine_UniqueParticipants.isDisplayed();
	}
	public boolean verifyServiceline_StudentDays()
	{
		return Serviceline_StudentDays.isDisplayed();
	}
	public boolean verifyServiceLine_Pentperc()
	{
		return ServiceLine_Pentperc.isDisplayed();
	}
	public boolean verifyServiceline_AvgDaysPerpart()
	{
		return Serviceline_AvgDaysPerpart.isDisplayed();
	}
	public boolean verifyIndustry()
	{
		return Industry.isDisplayed();
	}
	public boolean verifyIndustry_UniqueParticipants()
	{
		return Industry_UniqueParticipants.isDisplayed();
	}
	public boolean verifyIndustry_StudentDays()
	{
		return Industry_StudentDays.isDisplayed();
	}
	public boolean verifyIndustry_pentperc()
	{
		return Industry_pentperc.isDisplayed();
	}
	public boolean verifyIndustry_AvgDaysPerPart()
	{
		return Industry_AvgDaysPerPart.isDisplayed();
	}
	public boolean verifyLearning_StudentDayDistributionChart()
	{
		return Learning_StudentDayDistributionChart.isDisplayed();
	}
	public void clickOnDashBoard()
	{
		BackToDashBoardpage.click();
	}
	
}
