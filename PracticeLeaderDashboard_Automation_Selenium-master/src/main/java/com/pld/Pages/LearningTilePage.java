package com.pld.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class LearningTilePage extends PldTestBase{
	
	@FindBy(xpath="//*[contains(text(),'Learning')]")
	WebElement Learning;
	
	@FindBy(xpath = "//*[contains(text(),'YTD as of')]")
	WebElement YTDasof;
	
	@FindBy(xpath = "//*[contains(text(),'Total')]")
	WebElement Total;
	@FindBy(xpath = "//*[contains(text(),'Practice Skills')]")
	WebElement PracticeSkills;
	@FindBy(xpath = "//*[contains(text(),'Cross Platform')]")
	WebElement CrossPlatform;
	@FindBy(xpath = "//*[contains(text(),'Industry Skills')]")
	WebElement IndustrySkills;
	
	@FindBy(xpath = "//*[contains(text(),'Professional Dev')]")
	WebElement ProfessionalDev;
	@FindBy(xpath = "//*[contains(text(),'New Hires')]")
	WebElement NewHires;
	@FindBy(xpath = "//*[contains(text(),'Other')]")
	WebElement Other;
	@FindBy(xpath = "//*[contains(text(),'Training Days')]")
	WebElement TrainingDays;
	@FindBy(xpath = "//*[contains(text(),'Think 40')]")
	WebElement ThinkFourty;
	@FindBy(xpath = "//*[contains(text(),'On Track')]")
	WebElement OnTrack;
	@FindBy(xpath = "//*[contains(text(),'Below Track')]")
	WebElement BelowTrack;
	@FindBy(xpath = "//*[contains(text(),'Pro-Rated YTD TGT:')]")
	WebElement ProRatedYTDTGT;
	@FindBy(xpath = "//*[contains(text(),'Days/Person by Delivery Type')]")
	WebElement DaysOrPersonbyDeliveryType;
	@FindBy(xpath = "//*[contains(text(),'F2F ')]")
	WebElement F2F;
	@FindBy(xpath = "//*[contains(text(),'Virtual')]")
	WebElement Virtual;
	@FindBy(xpath = "//*[contains(text(),'eLearn')]")
	WebElement eLearn;
	@FindBy(xpath ="//*[contains(text(),'Self-Rpt')]")
	WebElement SelfRpt;
	@FindBy(xpath="//learning-stack-chart//*[name()='svg']")
	WebElement Learning_bargraph1;
	@FindBy(xpath="//think-forty//*[name()='svg']")
	WebElement Learning_Think40Graph;
	@FindBy(xpath="//days-per-person//*[name()='svg']")
	WebElement learning_DayperPersonChart;

	public LearningTilePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public boolean verifySelfRptText()
	{
		return SelfRpt.isDisplayed();
	}
	public boolean verifyeLearnText()
	{
		return eLearn.isDisplayed();
	}
	public boolean verifyVirtualText()
	{
		return Virtual.isDisplayed();
	}
	public boolean verifyF2FText()
	{
		return F2F.isDisplayed();
	}
	public boolean verifyDaysOrPersonbyDeliveryTypeText()
	{
		return DaysOrPersonbyDeliveryType.isDisplayed();
	}
	public boolean verifyProRatedYTDTGTText()
	{
		return ProRatedYTDTGT.isDisplayed();
	}
	public boolean verifyBelowTrackText()
	{
		return BelowTrack.isDisplayed();
	}
	public boolean verifyOnTrackText()
	{
		return OnTrack.isDisplayed();
	}
	public boolean verifyThinkFourtyText()
	{
		return ThinkFourty.isDisplayed();
	}
	public boolean verifyTrainingDaysText()
	{
		return TrainingDays.isDisplayed();
	}
	public boolean verifyNewHiresText()
	{
		return NewHires.isDisplayed();
	}
	public boolean verifyProfessionalDevText()
	{
		return ProfessionalDev.isDisplayed();
	}
	public boolean verifyIndustrySkillsText()
	{
		return IndustrySkills.isDisplayed();
	}
	public boolean verifyCrossPlatformText()
	{
		return CrossPlatform.isDisplayed();
	}
	public boolean verifyPracticeSkillsText()
	{
		return PracticeSkills.isDisplayed();
	}
	public boolean verifyTotalText()
	{
		return Total.isDisplayed();
	}
	public boolean verifyYTDasofText()
	{
		return YTDasof.isDisplayed();
	}
	public boolean verifyLearningTile()
	{
		return Learning.isDisplayed();
	}
	public boolean verifyLearning_bargraph1()
	{
		return Learning_bargraph1.isDisplayed();
	}
	public boolean verifyLearning_Think40Graph()
	{
		return Learning_Think40Graph.isDisplayed();
	}
	public boolean verifylearning_DayperPersonChart()
	{
		return learning_DayperPersonChart.isDisplayed();
	}
}
