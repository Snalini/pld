package com.pld.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pld.Base.PldTestBase;

public class BenchTileExp extends PldTestBase{
	
	@FindBy(xpath = "//bench/ion-card/ion-card-content/ion-grid")
	WebElement clicksonBench;
	
	@FindBy(xpath ="//span[contains(text(),'Bench & Rolloffs by Week')]")
	WebElement BenchAndRolloffsByWeek;
	
	@FindBy(xpath = "//*[@class='legend-text'][contains(text(),'Bench')]")
	WebElement legends_bench;
	
	@FindBy(xpath = "//*[@class='legend-text'][contains(text(),'6 Week Roll-offs')]")
	WebElement legends_SixweekRollOffs;
	
	@FindBy(xpath = "//span[contains(text(),'Bench by Age')]")
	WebElement BenchByAge;
	
	@FindBy(xpath = "//div[contains(text(),'Total HC')]")
	WebElement TotalHC;
	
	@FindBy(xpath = "//div[contains(text(),'Aged Bench HC')]")
	WebElement AgedBenchHC;
	
	@FindBy(xpath = "//ion-col[contains(text(),'New Adds')]")
	WebElement NewAdds;
	
	@FindBy(xpath = "//ion-col[contains(text(),'0-10 Days')]")
	WebElement ZeroToTenDays;
	
	@FindBy(xpath = "//ion-col[contains(text(),'11-30 Days')]")
	WebElement ElevenToThirtyDays;
	
	@FindBy(xpath = "//ion-col[contains(text(),'31-60 Days')]")
	WebElement ThirtyOneToSixtyDays;
	
	@FindBy(xpath = "//ion-col[contains(text(),'61+ Days')]")
	WebElement SixtyPlusDyas;
	
	@FindBy(xpath = "//div[@class='headerColor lowUtilText']")
	WebElement BenchByDateAndRollOffEmployeesText;
	
	@FindBy(xpath = "//div[contains(@class,'viewAllClass')]")
	WebElement Viewtext;
	
	@FindBy(xpath = "//button//span//div")
	WebElement AllDropDown;
	
	@FindBy(id = "checkbox-25-0")
	WebElement CriticalSkillsWithExcess;
	@FindBy(id = "checkbox-26-0")
	WebElement SkillsInShortage;
	
	@FindBy(id = "checkbox-27-0")
	WebElement SkillsInExcess;

	@FindBy(xpath = "//ion-backdrop[@role='presentation']")
	WebElement CloseDropDown;
	
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
	WebElement HoursHC;
	@FindBy(xpath = "//span[contains(text(),'QTD CU')]")
	WebElement QTDCU;
	@FindBy(xpath = " //span[contains(text(),'QTD PU')]")
	WebElement QTDPU;
	@FindBy(xpath = "//span[contains(text(),'MC')]")
	WebElement MC;
	@FindBy(xpath = "//span[contains(text(),'AAID')]")
	WebElement AAID;
	@FindBy(xpath = "//span[contains(text(),'Away')]")
	WebElement Away;
	@FindBy(xpath = "//span[contains(text(),'Prior Assignment')]")
	WebElement PriorAssignment;
	@FindBy(xpath = "//span[contains(text(),'Avail Date')]")
	WebElement AvailDate;
	@FindBy(xpath ="//span[contains(text(),'Bench Age')]")
	WebElement BenchAge;
	@FindBy(xpath = "//span[contains(text(),'In-Play')]")
	WebElement INPlay;
	@FindBy(xpath = "//*[@class = 'dropDownBtn button button-md button-default button-default-md']")
	WebElement button;
	@FindBy(xpath="//bench-rolloff-chart//*[name()=\"svg\"]")
	WebElement BenchRollOffChart;
	@FindBy(xpath="//util-bench-doughnut-chart//*[name()='svg']")
	WebElement BenchByAgedoughnutChart;
	@FindBy(xpath = "//html/body/ion-app/ng-component/ion-nav/detail-page/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[1]/ion-grid/ion-row/div[2]")
	WebElement BackToDashBoardpage;
	
	
	
	@FindBy(xpath="//div[contains(@class,'grid-bdiv')]")
	WebElement NoDataAvailableMessage;
	
	public BenchTileExp()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBenchTile()
	{
		clicksonBench.click();
	}
	
	public boolean verifyBenchAndRolloffsByWeek() 
	{
		System.out.println("SubTile name is "+ BenchAndRolloffsByWeek.getText());
		return BenchAndRolloffsByWeek.isDisplayed();
	}
	public boolean verifyAlltext() 
	
	{
		
		return AllDropDown.isDisplayed();
	}
	public boolean verifySkillsInShortage() 
	{
		//WebElement wait = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(AllDropDown));
		button.click();
		return SkillsInShortage.isDisplayed();
	}
	public boolean verifySkillsInExcess() 
	{
		return SkillsInExcess.isDisplayed();
	}
	public void clickOnCloseDropDown() 
	{
		CloseDropDown.click();
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
	public boolean verifyHoursHC() 
	{
		return HoursHC.isDisplayed();
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
	public boolean verifyPriorAssignment() 
	{
		return PriorAssignment.isDisplayed();
	}
	public boolean verifyAvailDate() 
	{
		return AvailDate.isDisplayed();
	}
	public boolean verifyBenchAge() 
	{
		return BenchAge.isDisplayed();
	}
	public boolean verifyViewText() 
	{
		return Viewtext.isDisplayed();
	}
	
	public boolean verifyInPlayText() 
	{
		return INPlay.isDisplayed();
	}
	public boolean verifyBenchByDateAndRollOffEmployeesText() 
	{
		System.out.println("Subtile name is "+BenchByDateAndRollOffEmployeesText.getText());
		return BenchByDateAndRollOffEmployeesText.isDisplayed();
	}
	public boolean verifyMessageDisplay()
	{
		return NoDataAvailableMessage.isDisplayed();
	}
	public boolean verifySixtyPlusDyas() 
	{
		return SixtyPlusDyas.isDisplayed();
	}public boolean verifyThirtyOneToSixtyDays() 
	{
		return ThirtyOneToSixtyDays.isDisplayed();
	}
	public boolean verifyElevenToThirtyDays() 
	{
		return ElevenToThirtyDays.isDisplayed();
	}
	public boolean verifyZeroToTenDays() 
	{
		return ZeroToTenDays.isDisplayed();
	}
	public boolean verifyNewAdds() 
	{
		return NewAdds.isDisplayed();
	}
	public boolean verifyAgedBenchHC() 
	{
		return AgedBenchHC.isDisplayed();
	}
	public boolean verifyTotalHC() 
	{
		return TotalHC.isDisplayed();
	}public boolean verifyBenchByAge() 
	{
		System.out.println("SubTile name is "+BenchByAge.getText());
		return BenchByAge.isDisplayed();
	}
	public void clickOnCloseBenchExp()
	{
		//CLoseDropDown.click();
		BackToDashBoardpage.click();
	}
	
	public boolean verifyLegendBenchText()
	{
		return legends_bench.isDisplayed();
	}
	
	public boolean verifyLegends6WeekRollOffs()
	{
		return legends_SixweekRollOffs.isDisplayed();
	}
	
	public boolean verifyBenchRollOffChart()
	{
		return BenchRollOffChart.isDisplayed();
	}
	
	public boolean verifyBenchByAgedoughnutChart()
	{
		return BenchByAgedoughnutChart.isDisplayed();
	}
}
