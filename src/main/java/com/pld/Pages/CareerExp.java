package com.pld.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class CareerExp extends PldTestBase{
	
	@FindBy(xpath = "//career/ion-card")
	WebElement CareerExptile;
	
	@FindBy(xpath = "//span[contains(text(),'Band Mix Trend')]")
	WebElement BandMixTrend;
	
	@FindBy(xpath = "//ion-card[@class='card cardStyle demandCardHeight card-md card-md-dark']//span[@class='headerColor'][contains(text(),'Adds & Losses (Oct-Dec)')]")
	WebElement AddsandLosses;
	
	@FindBy(xpath = "//span[contains(text(),'Average Time in Band')]")
	WebElement Header_AverageTimeInBand;
	
	@FindBy(xpath = "//td[@class='career_band_width']")
	WebElement Band;
	
	@FindBy(xpath = "//td[@class='career_Avgtime_width']")
	WebElement AvgTimeInBand;
	
	@FindBy(xpath = "	//td[@class='career_guidelines_width']")
	WebElement guideline;
	
	@FindBy(xpath = "//td[@class='career_Outlines_width']")
	WebElement BandOutliers;
	
	@FindBy(xpath = "//ion-card[@class='card cardStyle cardHeight card-md card-md-dark']//span[@class='headerColor'][contains(text(),'Adds & Losses (Oct-Dec)')]")
	WebElement AddsAndLossesText;
	
	@FindBy(xpath = "//td[@class='bandWidth leftpadding']")
	WebElement BandText;
	
	@FindBy(xpath = "//ion-col[@class='rightCardPadding col']//tr[@class='theader_first theader_career']//td[2]")
	WebElement Other;
	
	@FindBy(xpath = "//td[contains(text(),'Xfrs Out')]")
	WebElement XfrsOut;
	
	@FindBy(xpath = "//td[contains(text(),'Promo Out')]")
	WebElement PromoOut;
	
	@FindBy(xpath = "//td[@class='eisBorder valWidth']")
	WebElement EIS;
	
	@FindBy(xpath = "//td[@class='valWidth']")
	WebElement EPH;
	
	@FindBy(xpath = "//td[contains(text(),'Prof Hires')]")
	WebElement ProfHires;
	
	@FindBy(xpath = "//td[contains(text(),'Promo In')]")
	WebElement PromoIn;
	
	@FindBy(xpath = "//td[contains(text(),'Xfrs In')]")
	WebElement XfrsIn;
	
	@FindBy(xpath = "//td[@class='noWrap othWidth rightpadding']")
	WebElement OtherAdds;
	
	@FindBy(xpath = "//*[contains(text(),'Average Band')]")
	WebElement Averageband;
	
	@FindBy(xpath = "//*[@class = 'legend-text'][contains(text(),'Other')]")
	WebElement OtherText;
	
	@FindBy(xpath = "//*[@class = 'legend-text'][contains(text(),'Other Adds')]")
	WebElement OtherAddsText;
	
	@FindBy(xpath = "//*[contains(text(),'Xfrs Out')]")
	WebElement XfrsOutText;
	
	@FindBy(xpath = "//*[@class = 'legend-text'][contains(text(),'Promo Out')]")
	WebElement PromoOutText;
	
	@FindBy(xpath = "//*[@class = 'legend-text'][contains(text(),'EIS')]")
	WebElement EISText;
	
	@FindBy(xpath = "//*[@class = 'legend-text'][contains(text(),'EPH')]")
	WebElement EPHText;
	
	@FindBy(xpath = "//*[@class = 'legend-text'][contains(text(),'Prof Hires')]")
	WebElement ProfHiresText;
	
	@FindBy(xpath = "//*[@class = 'legend-text'][contains(text(),'Promo In')]")
	WebElement PromoInText;
	
	@FindBy(xpath = "//*[@class = 'legend-text'][contains(text(),'Xfrs In')]")
	WebElement XfrsInText;
	
	@FindBy(xpath = "//html/body/ion-app/ng-component/ion-nav/detail-page/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[1]/ion-grid/ion-row/div[2]")
	WebElement BackToDashBoardpage;
	
	@FindBy(xpath="//pyramid-monthly-trend-chart//*[name()='svg']")
	WebElement Career_BandMixTrendChart;
	@FindBy(xpath="//quaterly-adds-losses-trends-chart//*[name()='svg']")
	WebElement AddsAndLossesChart;
	public CareerExp()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnCareerTile()
	{
		CareerExptile.click();
	}
	
	public boolean verifyBandMixTrend()
	{
		return BandMixTrend.isDisplayed();
	}
	
	public boolean verifyAddsandLosses()
	{
		return AddsandLosses.isDisplayed();
	}
	public boolean verifyHeader_AverageTimeInBand()
	{
		return Header_AverageTimeInBand.isDisplayed();
	}
	public boolean verifyBand()
	{
		return Band.isDisplayed();
	}
	public boolean verifyAvgTimeInBand()
	{
		return AvgTimeInBand.isDisplayed();
	}
	public boolean verifyguideline()
	{
		return guideline.isDisplayed();
	}
	public boolean verifyBandOutliers()
	{
		return BandOutliers.isDisplayed();
	}
	public boolean verifyAddsAndLossesText()
	{
		return AddsAndLossesText.isDisplayed();
	}
	public boolean verifyBandText()
	{
		return BandText.isDisplayed();
	}
	public boolean verifyOther()
	{
		return Other.isDisplayed();
	}
	public boolean verifyXfrsOut()
	{
		return XfrsOut.isDisplayed();
	}
	public boolean verifyPromoOut()
	{
		return PromoOut.isDisplayed();
	}
	public boolean verifyEIS()
	{
		return EIS.isDisplayed();
	}
	public boolean verifyEPH()
	{
		return EPH.isDisplayed();
	}
	public boolean verifyProfHires()
	{
		return ProfHires.isDisplayed();
	}
	public boolean verifyAverageband()
	{
		return Averageband.isDisplayed();
	}
	public boolean verifyOtherAdds()
	{
		return OtherAdds.isDisplayed();
	}
	public boolean verifyXfrsIn()
	{
		return XfrsIn.isDisplayed();
	}
	public boolean verifyPromoIn()
	{
		return PromoIn.isDisplayed();
	}
	
	public boolean verifyXfrsInText()
	{
		return XfrsInText.isDisplayed();
	}
	public boolean verifyPromoInText()
	{
		return PromoInText.isDisplayed();
	}
	public boolean verifyProfHiresText()
	{
		return ProfHiresText.isDisplayed();
	}
	public boolean verifyEPHText()
	{
		return EPHText.isDisplayed();
	}
	public boolean verifyEISText()
	{
		return EISText.isDisplayed();
	}
	public boolean verifyPromoOutText()
	{
		return PromoOutText.isDisplayed();
	}
	public boolean verifyXfrsOutText()
	{
		return XfrsOutText.isDisplayed();
	}
	public boolean verifyOtherAddsText()
	{
		return OtherAddsText.isDisplayed();
	}
	public boolean verifyOtherText()
	{
		return OtherText.isDisplayed();
	}
	public boolean verifyCareer_BandMixTrendChart()
	{
		return Career_BandMixTrendChart.isDisplayed();
	}
	public boolean verifyAddsAndLossesChart()
	{
		return AddsAndLossesChart.isDisplayed();
	}
	public void clickOnDashBoardText()
	{
		 BackToDashBoardpage.click();
	}

}
