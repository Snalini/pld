package com.pld.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pld.Base.PldTestBase;

public class BandPyramidExp extends PldTestBase{
	
	@FindBy(xpath = "//career-pyramid/ion-grid/ion-card/ion-card-content")
	WebElement BandPyramidExp;
	
	@FindBy(xpath ="//div[@class='headerColor hcdemoText']" )
	WebElement HeadCount;
	
	@FindBy(xpath = "//div[contains(@class,'headerEmpPopoverClass')]")
	WebElement PractitionerType;
	
	@FindBy(xpath = "//*[contains(text(),'All')]")
	WebElement AllDropDown;
	
	@FindBy(xpath = "//div[contains(text(),'Clm By:')]")
	WebElement ClmBy;
	
	@FindBy(xpath = "//*[contains(text(),'Geography')]")
	WebElement GeographyDropDown;
	
	@FindBy(xpath = "//div[contains(text(),'Row By:')]")
	WebElement RowBy;
	
	@FindBy(xpath = "//span[contains(text(),'Practice')]")
	WebElement Practicedropdown;
	
	@FindBy(xpath = "//div[@class='hcDivPadding wspropert wspropert-pad [i] highlightValues']")
	WebElement COLTOT;
	
	@FindBy(xpath ="//div[@class='hcDivPadding wspropert wspropert-pad [i]'][contains(text(),'AP')]" )
	WebElement AP;
	
	@FindBy(xpath = "//div[contains(text(),'EU')]")
	WebElement EU;
	
	@FindBy(xpath = "//*[contains(text(),'NA')]")
	WebElement NA;
	
	@FindBy(xpath = "//div[contains(text(),'GCG')]")
	WebElement GCG;
	
	@FindBy(xpath = "//div[@class='hcDivPadding wspropert wspropert-pad [i]'][contains(text(),'LA')]")
	WebElement LA;
	
	@FindBy(xpath = "//div[contains(text(),'JP')]")
	WebElement JP;
	
	@FindBy(xpath = "//div[contains(text(),'Other')]")
	WebElement Other;
	
	@FindBy(xpath = "//div[@class='hcDivPadding wspropert tableTooltip hcDivPadding-fS highlightValues']")
	WebElement ROWTOT;
	
	@FindBy(xpath = "//div[contains(text(),'CUST ADM')]")
	WebElement CUSTADM;
	
	@FindBy(xpath = "//div[contains(text(),'N/A')]")
	WebElement NOrA;
	
	@FindBy(xpath = "//div[contains(text(),'FIN PS')]")
	WebElement FINPS;
	
	@FindBy(xpath = "	//div[contains(text(),'SAP ADM')]")
	WebElement SAPADM;
	
	@FindBy(xpath = "//div[contains(text(),'IGNITE')]")
	WebElement Ignite;
	
	@FindBy(xpath = "//div[contains(text(),'DPS')]")
	WebElement DPS;
	
	@FindBy(xpath = "//div[contains(text(),'CAD')]")
	WebElement CAD;
	
	@FindBy(xpath = "//div[contains(text(),'MSFT ADM')]")
	WebElement MSFTADM;
	
	@FindBy(xpath = "//div[contains(text(),'ORCL ADM')]")
	WebElement ORCLADM;
	
	@FindBy(xpath = "//div[contains(text(),'CED')]")
	WebElement CED;
	
	@FindBy(xpath = "//div[contains(text(),'T&E PS')]")
	WebElement TAndEPS;
	
	@FindBy(xpath = "//span[contains(@class,'headerColor bandPyrmdText')]")
	WebElement BandPyramid;
	
	@FindBy(xpath = "//*[@class= 'pyramid-column-header pyramid-column-header-band'][contains(text(),'Band')]")
	WebElement Band;
	
	@FindBy(xpath = "//*[@class='pyramid-column-header pyramid-column-header-headcount'][contains(text(),'Headcount')]")
	WebElement HeadcountText;
	
	@FindBy(xpath = "//*[contains(text(),'Exec')]")
	WebElement Exec;
	
	@FindBy(xpath = "//*[contains(text(),'Actual HC')]")
	WebElement ActualHC;
	
	@FindBy(xpath = "//div[contains(@class,'headerColor lowUtilText')]")
	WebElement Employees;
	
	@FindBy(xpath = "//div[contains(@class,'contractorHeadingStyle')]")
	WebElement Contractor;
	
	@FindBy(xpath = "//td[contains(@class,'name_td namePadding active')]")
	WebElement Name;
	
	@FindBy(xpath = "//td[contains(@class,'band_td active')]")
	WebElement BandText;
	
	@FindBy(xpath = "//td[contains(@class,'jrss_td active')]")
	WebElement JRSS;
	
	@FindBy(xpath = "//td[contains(@class,'location_td active')]")
	WebElement Location;
	
	@FindBy(xpath = "//td[contains(@class,'industry_td active')]")
	WebElement Industry;
	
	@FindBy(xpath = "//td[contains(@class,'hpp_td hpplabelpadding active')]")
	WebElement HPP;
	
	@FindBy(xpath = "//td[contains(@class,'qtdcu_td culabelpadding active')]")
	WebElement QTDCU;
	
	@FindBy(xpath = "//td[contains(@class,'qtdpu_td pulabelpadding active')]")
	WebElement QTDPU;
	
	@FindBy(xpath = " //td[contains(@class,'mc_td mclabelpadding active')]")
	WebElement MC;
	
	@FindBy(xpath = "//td[contains(@class,'aaid_td aaidlabelpadding active')]")
	WebElement AAID;
	
	@FindBy(xpath = "//td[contains(@class,'timeaway_td awaylabelpadding active')]")
	WebElement TimeAway;
	
	@FindBy(xpath = "//td[contains(@class,'assgacct_td asslabelpadding active')]")
	WebElement AssignAcct;
	
	@FindBy(xpath = "//td[contains(@class,'date_td active')]")
	WebElement AviailDate;
	
	@FindBy(xpath = "//td[contains(@class,'benchage_td bench_padding active')]")
	WebElement BenchAge;
	
	@FindBy(xpath = "//td[contains(@class,'inplay_td inplay_head active')]")
	WebElement InPlay;
	@FindBy(xpath="//bar-pyramid-chart//*[name()='svg']")
	WebElement BandPyramidExpChart;
	@FindBy(xpath = "//html/body/ion-app/ng-component/ion-nav/detail-page/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[1]/ion-grid/ion-row/div[2]")
	WebElement BackToDashBoardpage;
	
	public BandPyramidExp()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBandPyramidTile()
	{
		BandPyramidExp.click();
	}
	
	public boolean verifyHeadCount()
	{
		return HeadCount.isDisplayed();
	}
	
	public boolean verifyPractitionerType()
	{
		return PractitionerType.isDisplayed();
	}
	public boolean verifyInPlay()
	{
		return InPlay.isDisplayed();
	}
	public boolean verifyBenchAge()
	{
		return BenchAge.isDisplayed();
	}
	public boolean verifyAviailDate()
	{
		return AviailDate.isDisplayed();
	}
	public boolean verifyAssignAcct()
	{
		return AssignAcct.isDisplayed();
	}
	public boolean verifyTimeAway()
	{
		return TimeAway.isDisplayed();
	}
	public boolean verifyAAID()
	{
		return AAID.isDisplayed();
	}
	public boolean verifyMC()
	{
		return MC.isDisplayed();
	}
	public boolean verifyQTDPU()
	{
		return QTDPU.isDisplayed();
	}
	public boolean verifyQTDCU()
	{
		return QTDCU.isDisplayed();
	}
	public boolean verifyHPP()
	{
		return HPP.isDisplayed();
	}
	public boolean verifyIndustry()
	{
		return Industry.isDisplayed();
	}
	public boolean verifyBandText()
	{
		return BandText.isDisplayed();
	}
	public boolean verifyName()
	{
		return Name.isDisplayed();
	}
	public boolean verifyContractor()
	{
		return Contractor.isDisplayed();
	}
	public boolean verifyEmployees()
	{
		return Employees.isDisplayed();
	}
	public boolean verifyJRSS()
	{
		return JRSS.isDisplayed();
	}
	public boolean verifyActualHC()
	{
		return ActualHC.isDisplayed();
	}
	public boolean verifyExec()
	{
		return Exec.isDisplayed();
	}
	public boolean verifyOther()
	{
		return Other.isDisplayed();
	}
	public boolean verifyJP()
	{
		return JP.isDisplayed();
	}
	public boolean verifyLocation()
	{
		return Location.isDisplayed();
	}
	public boolean verifySAPADM()
	{
		return SAPADM.isDisplayed();
	}
	public boolean verifyGCG()
	{
		return GCG.isDisplayed();
	}
	public boolean verifyLA()
	{
		return LA.isDisplayed();
	}
	public boolean verifyCED()
	{
		return CED.isDisplayed();
	}
	public boolean verifyNA()
	{
		return NA.isDisplayed();
	}
	public boolean verifyBandPyramid()
	{
		return BandPyramid.isDisplayed();
	}
	public boolean verifyEU()
	{
		return EU.isDisplayed();
	}
	public boolean verifyAP()
	{
		return AP.isDisplayed();
	}
	public boolean verifyCOLTOT()
	{
		return COLTOT.isDisplayed();
	}
	public boolean verifyPracticedropdown()
	{
		return Practicedropdown.isDisplayed();
	}
	
	public boolean verifyBand()
	{
		return Band.isDisplayed();
	}
	public boolean verifyTAndEPS()
	{
		return TAndEPS.isDisplayed();
	}
	public boolean verifyRowBy()
	{
		return RowBy.isDisplayed();
	}
	public boolean verifyGeographyDropDown()
	{
		return GeographyDropDown.isDisplayed();
	}
	public boolean verifyClmBy()
	{
		return ClmBy.isDisplayed();
	}
	public boolean verifyAllDropDown()
	{
		return AllDropDown.isDisplayed();
	}
	public boolean verifyFINPS()
	{
		return FINPS.isDisplayed();
	}
	public boolean verifyNOrA()
	{
		return NOrA.isDisplayed();
	}
	public boolean verifyCUSTADM()
	{
		return CUSTADM.isDisplayed();
	}
	public boolean verifyROWTOT()
	{
		return ROWTOT.isDisplayed();
	}
	public boolean verifyIgnite()
	{
		return Ignite.isDisplayed();
	}
	public void clickOnDashBoardText()
	{
		 BackToDashBoardpage.click();
	}

	public boolean verifyBandPyramidExpChart()
	{
		return BandPyramidExpChart.isDisplayed();
	}

}
