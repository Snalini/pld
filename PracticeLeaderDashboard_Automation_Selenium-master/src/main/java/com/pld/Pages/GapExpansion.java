package com.pld.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class GapExpansion extends PldTestBase{
	
	public GapExpansion()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//gap/ion-card/ion-card-content")
	WebElement GapTileexp;
	@FindBy(xpath = "//span[contains(text(),'GAP Trend')]")
	WebElement GAPTrend;
	@FindBy(xpath = "//span[contains(text(),'Supply and Demand')]")
	WebElement SupplyAndDemand;
	@FindBy(xpath = "//span[contains(text(),'Available Supply')]")
	WebElement AvailableSupply;
	@FindBy(xpath = "//span[contains(text(),'Demand Open Positions')]")
	WebElement DemandOpenPositions;
	@FindBy(xpath = "//td[contains(text(),'Month')]")
	WebElement Month;
	@FindBy(xpath = "//td[contains(@class,'noWrap rolWidth')]")
	WebElement RollOffsAndbench;
	@FindBy(xpath = "//td[contains(@class,'noWrap anWidth')]")
	WebElement ANOBs;
	@FindBy(xpath = "//td[contains(@class,'noWrap deptWidth')]")
	WebElement Depart;
	@FindBy(xpath = "//td[contains(@class,'totalWidth tBorder')][contains(text(),'Total')]")
	WebElement Supply_Total;
	@FindBy(xpath = "//td[contains(text(),'Comtd.')]")
	WebElement Comtd;
	@FindBy(xpath = "//td[contains(text(),'Oppy.')]")
	WebElement Oppy;
	@FindBy(xpath = "//td[contains(@class,'noWrap othWidth')]")
	WebElement Other;
	@FindBy(xpath = "//td[contains(@class,'noWrap totWidth')]")
	WebElement Demand_Total;
	@FindBy(xpath = "//div[contains(text(),'Top Shortages')]")
	WebElement TopShortages;
	@FindBy(xpath = "//ion-col[contains(@class,'leftCardPadding col')]//div[contains(@class,'viewAllClass')][contains(text(),'View:')]")
	WebElement TopShortages_View;
	@FindBy(xpath = "//div[contains(text(),'Top Excesses')]")
	WebElement TopExcess;
	@FindBy(xpath = "//ion-col[contains(@class,'rightCardPadding col')]//div[contains(@class,'viewAllClass')][contains(text(),'View:')]")
	WebElement TopExcess_View;
	@FindBy(xpath = "//td[contains(@class,'jrss-width onlyTSPadRight')]")
	WebElement TopShortages_JRSS;
	@FindBy(xpath = "//ion-col[contains(@class,'leftCardPadding col')]//tr[contains(@class,'theader_first theader_gap')]//td[2]")
	WebElement TopShortges_TOTHC;
	@FindBy(xpath = "//ion-col[contains(@class,'leftCardPadding col')]//tr[contains(@class,'theader_first theader_gap')]//td[3]")
	WebElement TopShortages_SubKHC;
	@FindBy(xpath = "//ion-col[contains(@class,'leftCardPadding col')]//tr[contains(@class,'theader_first theader_gap')]//td[4]")
	WebElement TopShortages_CurrentGap;
	
	@FindBy(xpath = "//ion-col[contains(@class,'leftCardPadding col')]//tr[contains(@class,'theader_first theader_gap')]//td[5]")
	WebElement TopShortages_MayGap;
	@FindBy(xpath = "//ion-col[contains(@class,'leftCardPadding col')]//tr[contains(@class,'theader_first theader_gap')]//td[6]")
	WebElement TopShortages_JunGap;
	@FindBy(xpath = "//ion-col[contains(@class,'leftCardPadding col')]//td[contains(@class,'gap-width-hl')]")
	WebElement TopShortages_JulGap;
	@FindBy(xpath = "//td[contains(@class,'jrss-width onlyTEPadRight')]")
	WebElement TopExcesses_JRSS;
	@FindBy(xpath = "//ion-col[contains(@class,'rightCardPadding col')]//tr[contains(@class,'theader_first theader_gap')]//td[2]")
	WebElement TopExcesses_TOTHC;
	@FindBy(xpath = "//ion-col[contains(@class,'rightCardPadding col')]//tr[contains(@class,'theader_first theader_gap')]//td[3]")
	WebElement TopExcesses_SubkHC;
	@FindBy(xpath = "//ion-col[@class='rightCardPadding col']//tr[@class='theader_first theader_gap']//td[4]")
	WebElement TopExcesses_Currentgap;
	
	@FindBy(xpath = "//html/body/ion-app/ng-component/ion-nav/detail-page/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[1]/ion-grid/ion-row/div[2]")
	WebElement BackToDashBoardpage;
	
	public void clickOnGapTile()
	{
		GapTileexp.click();
	}
	
	public boolean verifygapTrend()
	{
		return GAPTrend.isDisplayed();
	}
	
	public boolean verifySupplyAndDemand()
	{
		return SupplyAndDemand.isDisplayed();
	}
	public boolean verifyAvailableSupply()
	{
		return AvailableSupply.isDisplayed();
	}
	public boolean verifyDemandOpenPosiitons()
	{
		return DemandOpenPositions.isDisplayed();
	}
	public boolean verifyMonth()
	{
		return Month.isDisplayed();
	}
	public boolean verifyRollOffsAndBench()
	{
		return RollOffsAndbench.isDisplayed();
	}
	public boolean verifyANOBs()
	{
		return ANOBs.isDisplayed();
	}
	public boolean verifyDepart()
	{
		return Depart.isDisplayed();
	}
	public boolean verifySupply_Total()
	{
		return Supply_Total.isDisplayed();
	}
	public boolean verifyComtd()
	{
		return Comtd.isDisplayed();
	}
	
	public boolean verifyOppy()
	{
		return Oppy.isDisplayed();
	}
	public boolean verifyOther()
	{
		return Other.isDisplayed();
	}
	public boolean verifyDemand_Total()
	{
		return Demand_Total.isDisplayed();
	}
	public boolean verifyTopShortages()
	{
		return TopShortages.isDisplayed();
	}
	public boolean verifyTopShortages_View()
	{
		return TopShortages_View.isDisplayed();
	}
	public boolean verifyTopExcess()
	{
		return TopExcess.isDisplayed();
	}
	public boolean verifyTopExcess_View()
	{
		return TopExcess_View.isDisplayed();
	}
	public boolean verifyTopShortges_TOTHC()
	{
		return TopShortges_TOTHC.isDisplayed();
	}
	public boolean verifyTopShortages_SubKHC()
	{
		return TopShortages_SubKHC.isDisplayed();
	}
	public boolean verifyTopShortages_CurrentGap()
	{
		return TopShortages_CurrentGap.isDisplayed();
	}
	public boolean verifyTopExcesses_TOTHC()
	{
		return TopExcesses_TOTHC.isDisplayed();
	}
	public boolean verifyTopExcesses_SubkHC()
	{
		return TopExcesses_SubkHC.isDisplayed();
	}
	public boolean verifyTopExcesses_Currentgap()
	{
		return TopExcesses_Currentgap.isDisplayed();
	}
	
	public void clickOnDashBoard()
	{
		BackToDashBoardpage.click();
	}

}
