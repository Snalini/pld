package com.pld.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class BenchTile extends PldTestBase{
	
	@FindBy(xpath = "//*[contains(text(),'Bench')]")
	WebElement Benchtile;

	@FindBy(xpath = "//*[contains(text(), 'Skills with excess')]")
	WebElement  Skillswithexcess;
	
	@FindBy(xpath = "//*[contains(text(),'Skills with excess')]//following::div[1]")
	WebElement SkillsWithExcessValue;
	
	@FindBy(xpath = "//*[contains(text(),'Skills in shortage')]")
	WebElement Skillsinshortage;
	
	@FindBy(xpath = "//*[contains(text(),'Skills in shortage')]//following::div[1]")
	WebElement SkillsinShortageValue;
	
	@FindBy(xpath = "//*[contains(text(),' as of')]")
	WebElement  asofText;
	
	@FindBy(xpath = "//*[contains(text(),'Bench by Date')]")
	WebElement BenchbyDate;
	
	@FindBy(xpath = "//*[contains(text(),'Aged Bench (>30 Days)')]")
	WebElement AgedBench;
	@FindBy(xpath = "//*[contains(text(),'6 Week Roll-offs')]")
	WebElement WeekRoll_offs;
	
	@FindBy(xpath = "//*[contains(text(),'Critical skill with excess')]")
	WebElement Criticalskillwithexcess;
	@FindBy(xpath ="//*[contains(text(),'Critical skill with excess')]//following::div[1]")
	WebElement CriticalSkillwithExcessvalue;
	
	@FindBy(xpath = "//*[contains(text(),'Bench Mix')]")
	WebElement BenchMix;
	
	@FindBy(xpath ="//*[contains(text(),' HC ')]")
	WebElement  HC;
	@FindBy(xpath = "//*[contains(text(),'  % of Tot ')]")
	WebElement   PercentOfTot;
	@FindBy(xpath = "//*[contains(text(),'MTM Δ ')]")
	WebElement MTM;
	@FindBy(xpath = "//bench-doughnut-chart/div")
	WebElement BenchDoughnutChart;
	public BenchTile() throws IOException {
		super();
		PageFactory.initElements(driver, this);

	}
	
	public boolean verifyBenchTile()
	{
		return Benchtile.isDisplayed();
	}

	

	public boolean getSkillvalues() {
		
		System.out.println("Skills With Excess value is "+SkillsWithExcessValue.getText());
		
		return Skillswithexcess.isDisplayed();
	}
	
public boolean verifySkillsinshortage() {
		
	System.out.println("Skills in Shortage value is "+SkillsinShortageValue.getText());
		return Skillsinshortage.isDisplayed();
	}

public boolean verifyAsOfText() {
	
	return asofText.isDisplayed();
}
public boolean verifyBenchbyDate() {
	
	return BenchbyDate.isDisplayed();
}
public boolean verifyAgedBenchText() {
	
	return AgedBench.isDisplayed();
}
public boolean verifyWeekRoll_offsText() {
	
	return WeekRoll_offs.isDisplayed();
}
public boolean verifyCriticalskillwithexcessText() {
	System.out.println("Critical Skill with Excess value is "+CriticalSkillwithExcessvalue.getText());
	return Criticalskillwithexcess.isDisplayed();
}
public boolean verifyBenchMixText() {
	
	return BenchMix.isDisplayed();
}
public boolean verifyHCText() {
	
	return HC.isDisplayed();
}
public boolean verifyPercentOfTot() {
	
	return PercentOfTot.isDisplayed();
}
public boolean verifyMTMText() {
	
	return MTM.isDisplayed();
}

public boolean verifyBenchDoughnutChart() {
	
	return BenchDoughnutChart.isDisplayed();
}

}
