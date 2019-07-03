package com.pld.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;

public class Dashboardpage extends PldTestBase {
	
	
	@FindBy(xpath= "//div[@class='logoStyle']")
	WebElement IBMLogo;
	@FindBy(xpath = "//div[@class='dashText dashBorder']")
	WebElement DashboardText;
	@FindBy(xpath = "//div[@class='ibmConfidentialStyle']")
	WebElement IBMConfidentialText;
	@FindBy(xpath = "//*[@class='leaderText graySpans'][contains(text(),'Practice Leader')]")
	WebElement PracticeLeaderText;
	@FindBy(xpath = "//ion-icon[@name='person']")
	WebElement PersonIcon;
	
	@FindBy(xpath = "//*[contains(text(),'Filters')]")
	WebElement FilterIcon;
	
	@FindBy(xpath = "//*[@class = 'helpimageStyling']")
	WebElement Helpbutton;
	@FindBy(xpath = "//*[contains(text(),'Help')]")
	WebElement Help;
	@FindBy(xpath = "//div[@class='themeDivHeight']//span[1]//div[1]//img[1]")
	WebElement WhiteTheme;
	@FindBy(xpath = "//div[@class='themeDivHeight']//span[2]//div[1]//img[1]")
	WebElement DarkTheme;
	@FindBy(xpath = "//*[contains(text(),'Filters')]")
	WebElement Filters;
	@FindBy(xpath = "//button[normalize-space()='Labor Pool']")
	WebElement LaborPoolFilter;
	@FindBy(css="span[class='button-inner']")
	List<WebElement> FilterList;
	@FindBy(xpath="//*[@class='selchipLabel label label-md']")
	WebElement Portugal;
	@FindBy(xpath = "/html/body/ion-app/ion-modal/div/page-filters/ion-header/ion-navbar/div[2]/button/span")
	WebElement DoneButton;
	@FindBy(xpath = "//*[contains(text(),'CPS Delivery Center')]/following::button[1]")
	WebElement LaborPool_CPSDelCenter;
	@FindBy(xpath = "//span//ion-chip[1]//ion-label")
	List<WebElement> Geography_FilterValues;
	
	@FindBy(xpath= "/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/ion-row[2]/span[1]/ion-chip/button")
	WebElement AsiaPacific_Drill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[1]/ion-chip/button")
	WebElement IMT;
	@FindBy(xpath="//ion-row/span[1]/ion-chip[1]/button[1]/span[1]/ion-icon[@role='img' and @aria-label='arrow forward']")
	WebElement ANZIMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/ion-row[2]/span[2]/ion-chip/button")
	WebElement EuropeDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/ion-row[2]/span[3]/ion-chip/button")
	WebElement GreaterChinaDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/ion-row[2]/span[4]/ion-chip/button")
	WebElement Japan_Drill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/ion-row[2]/span[5]/ion-chip/button")
	WebElement latinAmerica_Dril;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/ion-row[2]/span[6]/ion-chip/button")
	WebElement MiddleEastDrill;
	@FindBy(xpath = "/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/ion-row[2]/span[7]/ion-chip/button")
	WebElement NorthAmerica_Drill;
	@FindBy(xpath = "//span//ion-chip[1]//ion-label")
	List<WebElement> AP_IMT;
	
	@FindBy(xpath ="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]")
	List<WebElement> Europe_IMT;
	
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement AseanIMT_Drill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[3]/ion-chip/button/span/ion-icon")
	WebElement ISA_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[4]/ion-chip/button/span/ion-icon")
	WebElement Korea_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[1]/ion-chip/button/span/ion-icon")
	WebElement Benelux_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement CEE_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[3]/ion-chip/button/span/ion-icon")
	WebElement DACH_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[4]/ion-chip/button/span/ion-icon")
	WebElement France_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[5]/ion-chip/button/span/ion-icon")
	WebElement Italy_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[6]/ion-chip/button/span/ion-icon")
	WebElement Nordic_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[7]/ion-chip/button/span/ion-icon")
	WebElement SPGI_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[8]/ion-chip/button/span/ion-icon")
	WebElement UKI_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement GCG_IMtDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement Japan_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement LA_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement MEA_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[1]/ion-chip/button/span/ion-icon")
	WebElement Canada_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[2]/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement US_IMTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement ANZ_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement Asean_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement ISA_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement Korea_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement Benelux_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[1]/ion-chip/button/span/ion-icon")
	WebElement CEE_Central_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement CEE_Poland_regionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[3]/ion-chip/button/span/ion-icon")
	WebElement CEE_RCIS_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[4]/ion-chip/button/span/ion-icon")
	WebElement CEE_SEE_regionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement DACH_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement France_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement Italy_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement Nordic_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement SPGI_regionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement UKI_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement GCG_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement Japan_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[1]/ion-chip/button/span/ion-icon")
	WebElement LA_Brazil_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement LA_Mexico_regionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[3]/ion-chip/button/span/ion-icon")
	WebElement LA_SSA_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[1]/ion-chip/button/span/ion-icon")
	WebElement MEA_EastAfrica_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement MEA_Egypt_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[3]/ion-chip/button/span/ion-icon")
	WebElement MEA_Gulf_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[4]/ion-chip/button/span/ion-icon")
	WebElement MEA_NWA_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[5]/ion-chip/button/span/ion-icon")
	WebElement MEA_Pakistan_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[6]/ion-chip/button/span/ion-icon")
	WebElement MEA_Soudi_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[7]/ion-chip/button/span/ion-icon")
	WebElement SouthernAfrica_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[8]/ion-chip/button/span/ion-icon")
	WebElement MEA_Turkey_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span/ion-chip/button/span/ion-icon")
	WebElement NA_Canada_regionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[1]/ion-chip/button/span/ion-icon")
	WebElement NA_USCommercial_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[2]/ion-grid/div[3]/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement NA_USFedral_RegionDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[3]/ion-grid/ion-row[2]/span[1]/ion-chip/button/span/ion-icon")
	WebElement CAIDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[3]/ion-grid/div[2]/ion-row[2]/span[1]/ion-chip/button/span/ion-icon")
	WebElement ADMInnovationDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[3]/ion-grid/div[2]/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement CAMSDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[3]/ion-grid/div[2]/ion-row[2]/span[3]/ion-chip/button/span/ion-icon")
	WebElement NextGenEADrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[3]/ion-grid/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement CPTDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[3]/ion-grid/div[2]/ion-row[2]/span[1]/ion-chip/button/span/ion-icon")
	WebElement CBDSDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[3]/ion-grid/div[2]/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement CPRDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[3]/ion-grid/div[2]/ion-row[2]/span[3]/ion-chip/button/span/ion-icon")
	WebElement CPSDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[3]/ion-grid/ion-row[2]/span[3]/ion-chip/button/span/ion-icon")
	WebElement DSAndIXDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[3]/ion-grid/div[2]/ion-row[2]/span[1]/ion-chip/button/span/ion-icon")
	WebElement DSDrill;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[3]/ion-grid/div[2]/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement IXDrill;
	
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[1]/ion-chip/button/span/ion-icon")
	WebElement CPSDeliverySel;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[2]/ion-chip/button/span/ion-icon")
	WebElement CenterOFCompitencySel;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[3]/ion-chip/button/span/ion-icon")
	WebElement DomesticAffliateSel;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[4]/ion-chip/button/span/ion-icon")
	WebElement DomesticCenterSel;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[5]/ion-chip/button/span/ion-icon")
	WebElement DomesticRegularSel;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[6]/ion-chip/button/span/ion-icon")
	WebElement DomesticsubKSel;
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/page-filters/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/ion-scroll/div/div/ion-card[1]/ion-grid/ion-row[2]/span[7]/ion-chip/button/span/ion-icon")
	WebElement GlobalCenterSel;
	
	
	@FindBy(xpath="//span//ion-chip[1]//ion-label")
	List<WebElement> LaborPoolType;
	public Dashboardpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public boolean verifyIBMLogo()
	{
		return IBMLogo.isDisplayed();
	}
	
	public boolean verifyDashboardText()
	{
		return DashboardText.isDisplayed();
	}
	
	public boolean verifyIBMConfidentialText()
	{
		return IBMConfidentialText.isDisplayed();
	}
	public boolean verifyPracticeLeaderText()
	{
		return PracticeLeaderText.isDisplayed();
	}
	public boolean verifyPersonIcon()
	{
		return PersonIcon.isDisplayed();
	}
	public boolean verifyFilterIcon()
	{
		return FilterIcon.isDisplayed();
	}
	public boolean verifyHelpbutton()
	{
		return Helpbutton.isDisplayed();
	}
	public boolean verifyHelp()
	{
		return Help.isDisplayed();
	}
	public boolean verifyWhiteTheme()
	{
		return WhiteTheme.isDisplayed();
	}
	public boolean verifyDarkTheme()
	{
		return DarkTheme.isDisplayed();
	}
	
	public boolean verifyPortugalLock()
	{
		return Portugal.isDisplayed();
	}
	
	public void verifyGeographyFilter() throws Exception
	{
		Thread.sleep(5000);
		Filters.click();
		Thread.sleep(3000);
		
		System.out.println(FilterList.size());
		
		for(int a=0;a<FilterList.size();a++)
		{
		
			WebElement text = FilterList.get(a);
	
			String values  = text.getText();
			System.out.println("FilterValues are " +values);
			
		
		
		//JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	
		if(values.equals("Geography"))
		{
			Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(4));
		
		System.out.println("Size of geo"+Geography_FilterValues.size());
		
		for(int b=0;b<Geography_FilterValues.size();b++)
		{
			WebElement geo=Geography_FilterValues.get(b);
			String text1 = geo.getText();
			System.out.println(text1);
			
			if(text1.equals("Asia Pacific"))	
			{
			
			((JavascriptExecutor)driver).executeScript("arguments[0].click()",AsiaPacific_Drill);
			Thread.sleep(2000);
			
			System.out.println(AP_IMT.size());
			for(int c=7;c<AP_IMT.size()-1;c++)
			{
				WebElement imt=AP_IMT.get(c);
				String IMT_values = imt.getText();
				System.out.println("IMT values are "+IMT_values);
				
				Thread.sleep(2000);
				if(IMT_values.equals("ANZ"))
				{
					System.out.println("..............");
					((JavascriptExecutor)driver).executeScript("arguments[0].click()",ANZIMTDrill);
					
					Thread.sleep(2000);
			
		
					for(int d=11;d<AP_IMT.size();d++)
					{
						WebElement region=AP_IMT.get(d);
						String Region_Values = region.getText();
						System.out.println("ANZ Region Values are :"+Region_Values);
						
						if(Region_Values.equals("ANZ"))
						{
							System.out.println("Enters ANZ Region ");
							((JavascriptExecutor)driver).executeScript("arguments[0].click()",ANZ_RegionDrill);
							Thread.sleep(2000);
							System.out.println(AP_IMT.size());
						
							for(int e=12;e<AP_IMT.size();e++)
							{
								WebElement country = AP_IMT.get(e);
								String Country_Values = country.getText();
								System.out.println("Country values are" +Country_Values);
							}
							break;
						}
						
						
					}
				}	
			
			
			
					else if(IMT_values.equals("Asean"))
					{
						System.out.println("Enters Asean IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",AseanIMT_Drill);
						Thread.sleep(2000);
						for(int f=11;f<AP_IMT.size();f++)
						{
							WebElement region=AP_IMT.get(f);
							String Region_Values = region.getText();
							System.out.println("Asean Region Values are :"+Region_Values);
							
							if(Region_Values.equals("Asean"))
							{
								System.out.println("Enters Asean Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",Asean_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int g=12;g<AP_IMT.size();g++)
								{
									WebElement country = AP_IMT.get(g);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							break;
							}
							
						}
					}
					else if(IMT_values.equals("ISA"))
					{
						System.out.println("Enters ISA IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",ISA_IMTDrill);
						Thread.sleep(2000);
						for(int h=11;h<AP_IMT.size();h++)
						{
							WebElement region=AP_IMT.get(h);
							String Region_Values = region.getText();
							System.out.println("ISA Region Values are :"+Region_Values);
							
							if(Region_Values.equals("ISA"))
							{
								System.out.println("Enters ISA Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",ISA_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int i=12;i<AP_IMT.size();i++)
								{
									WebElement country = AP_IMT.get(i);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							break;
							}
						}
					}
					
					else if(IMT_values.equals("Korea"))
					{
						System.out.println("Enters Korea IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",Korea_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int j=11;j<AP_IMT.size();j++)
						{
							WebElement region=AP_IMT.get(j);
							String Region_Values = region.getText();
							System.out.println("Korea Region Values are :"+Region_Values);
							
							if(Region_Values.equals("Korea"))
							{
								System.out.println("Enters Korea Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",Korea_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int k=12;k<AP_IMT.size();k++)
								{
									WebElement country = AP_IMT.get(k);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							break;
							}
							
						}
						break;
					}
					
					
				
			}
			
			}
			
		
			else if(text1.equals("Europe"))
			{
				Thread.sleep(2000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",EuropeDrill);
				Thread.sleep(2000);
				System.out.println(AP_IMT.size());
				Thread.sleep(2000);
				for(int l=7;l<AP_IMT.size()-1;l++)
				{
					WebElement Europ_IMT = AP_IMT.get(l);
					String Europe_IMT_Vlaues = Europ_IMT.getText();
					System.out.println("Europe IMT Values are "+Europe_IMT_Vlaues);
					
					if(Europe_IMT_Vlaues.equals("Benelux"))
					{
						Thread.sleep(2000);
						System.out.println("Enters Benelux IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",Benelux_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int m=15;m<AP_IMT.size();m++)
						{
							WebElement region=AP_IMT.get(m);
							String Region_Values = region.getText();
							System.out.println("Benelux Region Values are :"+Region_Values);
							
							if(Region_Values.equals("Benelux"))
							{
								System.out.println("Enters Benelux Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",Benelux_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int n=17;n<AP_IMT.size()-1;n++)
								{
									WebElement country = AP_IMT.get(n);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
								break;
							}
						}
					}
					if(Europe_IMT_Vlaues.equals("CEE"))
					{
						Thread.sleep(2000);
						System.out.println("Enters CEE IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",CEE_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int o=15;o<AP_IMT.size();o++)
						{
							WebElement region=AP_IMT.get(o);
							String Region_Values = region.getText();
							System.out.println("CEE Region Values are :"+Region_Values);
							
							if(Region_Values.equals("Central"))
							{
								System.out.println("Enters Central Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",CEE_Central_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int p=20;p<AP_IMT.size();p++)
								{
									WebElement country = AP_IMT.get(p);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
								
							}
							else if(Region_Values.equals("Poland"))
							{
								System.out.println("Enters Poland Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",CEE_Poland_regionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int q=20;q<AP_IMT.size();q++)
								{
									WebElement country = AP_IMT.get(q);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
							else if(Region_Values.equals("RCIS"))
							{
								System.out.println("Enters RCIS Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",CEE_RCIS_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int r=20;r<AP_IMT.size();r++)
								{
									WebElement country = AP_IMT.get(r);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
							
							else if(Region_Values.equals("SEE"))
							{
								System.out.println("Enters SEE Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",CEE_SEE_regionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int s=20;s<AP_IMT.size();s++)
								{
									WebElement country = AP_IMT.get(s);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
						}
					}
					
					if(Europe_IMT_Vlaues.equals("DACH"))
					{
						Thread.sleep(2000);
						System.out.println("Enters DACH IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",DACH_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int t=15;t<AP_IMT.size();t++)
						{
							WebElement region=AP_IMT.get(t);
							String Region_Values = region.getText();
							System.out.println("DACH Region Values are :"+Region_Values);
							
							if(Region_Values.equals("DACH"))
							{
								System.out.println("Enters DACH Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",DACH_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int u=17;u<AP_IMT.size();u++)
								{
									WebElement country = AP_IMT.get(u);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
						}
					}
					
					if(Europe_IMT_Vlaues.equals("France"))
					{
						Thread.sleep(2000);
						System.out.println("Enters France IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",France_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int v=15;v<AP_IMT.size();v++)
						{
							WebElement region=AP_IMT.get(v);
							String Region_Values = region.getText();
							System.out.println("France Region Values are :"+Region_Values);
							
							if(Region_Values.equals("France"))
							{
								System.out.println("Enters France Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",France_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int w=17;w<AP_IMT.size();w++)
								{
									WebElement country = AP_IMT.get(w);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
						}
					}
					if(Europe_IMT_Vlaues.equals("Italy"))
					{
						Thread.sleep(2000);
						System.out.println("Enters Italy IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",Italy_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int x=15;x<AP_IMT.size();x++)
						{
							WebElement region=AP_IMT.get(x);
							String Region_Values = region.getText();
							System.out.println("Italy Region Values are :"+Region_Values);
							
							if(Region_Values.equals("Italy"))
							{
								System.out.println("Enters Italy Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",Italy_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int y=17;y<AP_IMT.size();y++)
								{
									WebElement country = AP_IMT.get(y);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
						}
					}
					if(Europe_IMT_Vlaues.equals("Nordic"))
					{
						Thread.sleep(2000);
						System.out.println("Enters Nordic IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",Nordic_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int z=15;z<AP_IMT.size();z++)
						{
							WebElement region=AP_IMT.get(z);
							String Region_Values = region.getText();
							System.out.println("Nordic Region Values are :"+Region_Values);
							
							if(Region_Values.equals("Nordic"))
							{
								System.out.println("Enters Nordic Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",Nordic_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int aa=17;aa<AP_IMT.size();aa++)
								{
									WebElement country = AP_IMT.get(aa);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
						}
					}
					if(Europe_IMT_Vlaues.equals("SPGI"))
					{
						Thread.sleep(2000);
						System.out.println("Enters SPGI IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",SPGI_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int bb=15;bb<AP_IMT.size();bb++)
						{
							WebElement region=AP_IMT.get(bb);
							String Region_Values = region.getText();
							System.out.println("SPGI Region Values are :"+Region_Values);
							
							if(Region_Values.equals("SPGI"))
							{
								System.out.println("Enters Nordic Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",SPGI_regionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int cc=17;cc<AP_IMT.size();cc++)
								{
									WebElement country = AP_IMT.get(cc);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
						}
					}
					
					if(Europe_IMT_Vlaues.equals("UKI"))
					{
						Thread.sleep(2000);
						System.out.println("Enters UKI IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",UKI_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int dd=15;dd<AP_IMT.size();dd++)
						{
							WebElement region=AP_IMT.get(dd);
							String Region_Values = region.getText();
							System.out.println("UKI Region Values are :"+Region_Values);
							
							if(Region_Values.equals("UKI"))
							{
								System.out.println("Enters UKI Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",UKI_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int ee=17;ee<AP_IMT.size();ee++)
								{
									WebElement country = AP_IMT.get(ee);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
						}
					}
				}
			}
			
			else if(text1.equals("Greater China Group"))
			{
				Thread.sleep(2000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",GreaterChinaDrill);
				Thread.sleep(2000);
				System.out.println(AP_IMT.size());
				for(int ff=7;ff<AP_IMT.size();ff++)
				{
					WebElement GCG_IMT =AP_IMT.get(ff);
					String GCG_IMT_values = GCG_IMT.getText();
					System.out.println(GCG_IMT_values);
					
					if(GCG_IMT_values.equals("GCG"))
					{
						Thread.sleep(2000);
						System.out.println("Enters GCG IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",GCG_IMtDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int gg=8;gg<AP_IMT.size();gg++)
						{
							WebElement region=AP_IMT.get(gg);
							String Region_Values = region.getText();
							System.out.println("GCG Region Values are :"+Region_Values);
							
							if(Region_Values.equals("GCG"))
							{
								System.out.println("Enters GCG Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",GCG_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int hh=9;hh<AP_IMT.size();hh++)
								{
									WebElement country = AP_IMT.get(hh);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
								break;
							}
							break;
						}
					}
				}
			}
			else if(text1.equals("Japan"))
			{
				Thread.sleep(2000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",Japan_Drill);
			Thread.sleep(2000);
				for(int ii=7;ii<AP_IMT.size();ii++)
				{
					String Japan_IMT = AP_IMT.get(ii).getText();
					System.out.println(Japan_IMT);
					
					if(Japan_IMT.equals("Japan"))
					{
						Thread.sleep(2000);
						System.out.println("Enters Japan IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",Japan_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int jj=8;jj<AP_IMT.size();jj++)
						{
							WebElement region=AP_IMT.get(jj);
							String Region_Values = region.getText();
							System.out.println("Japan Region Values are :"+Region_Values);
							
							if(Region_Values.equals("Japan"))
							{
								System.out.println("Enters Japan Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",Japan_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int kk=9;kk<AP_IMT.size();kk++)
								{
									WebElement country = AP_IMT.get(kk);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
								break;
							}
						}
					}
				}
			}
			
			else if(text1.equals("Latin America"))
			{
				Thread.sleep(2000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",latinAmerica_Dril);
				
				Thread.sleep(2000);
				for(int ll=7;ll<AP_IMT.size();ll++)
				{
					String LA_IMT = AP_IMT.get(ll).getText();
					System.out.println(LA_IMT);
					
					if(LA_IMT.equals("LA"))
					{
						Thread.sleep(2000);
						System.out.println("Enters LA IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",LA_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int mm=8;mm<AP_IMT.size();mm++)
						{
							WebElement region=AP_IMT.get(mm);
							String Region_Values = region.getText();
							System.out.println("LA Region Values are :"+Region_Values);
							
							if(Region_Values.equals("Brazil"))
							{
								System.out.println("Enters Brazil Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",LA_Brazil_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int nn=11;nn<AP_IMT.size();nn++)
								{
									WebElement country = AP_IMT.get(nn);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
							
							if(Region_Values.equals("Mexico"))
							{
								System.out.println("Enters Mexico Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",LA_Mexico_regionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int oo=11;oo<AP_IMT.size();oo++)
								{
									WebElement country = AP_IMT.get(oo);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
							
							if(Region_Values.equals("SSA"))
							{
								System.out.println("Enters SSA Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",LA_SSA_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int pp=11;pp<AP_IMT.size();pp++)
								{
									WebElement country = AP_IMT.get(pp);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
								break;
							}
						}
					}
				}
			}
			else if(text1.equals("Middle East & Africa"))
			{
				Thread.sleep(2000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",MiddleEastDrill);
				Thread.sleep(2000);
				for(int qq=7;qq<AP_IMT.size();qq++)
				{
					String MEA_IMT = AP_IMT.get(qq).getText();
					System.out.println(MEA_IMT);
					
					if(MEA_IMT.equals("MEA"))
					{
						Thread.sleep(2000);
						System.out.println("Enters MEA IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",MEA_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int rr=8;rr<AP_IMT.size();rr++)
						{
							WebElement region=AP_IMT.get(rr);
							String Region_Values = region.getText();
							System.out.println("MEA Region Values are :"+Region_Values);
							
							if(Region_Values.equals("East Africa"))
							{
								System.out.println("Enters East Africa Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",MEA_EastAfrica_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int tt=16;tt<AP_IMT.size();tt++)
								{
									WebElement country = AP_IMT.get(tt);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
							
							if(Region_Values.equals("Egypt"))
							{
								System.out.println("Enters Egypt Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",MEA_Egypt_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int uu=16;uu<AP_IMT.size();uu++)
								{
									WebElement country = AP_IMT.get(uu);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
							if(Region_Values.equals("Gulf & Levant"))
							{
								System.out.println("Enters Gulf & Levant Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",MEA_Gulf_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int vv=16;vv<AP_IMT.size();vv++)
								{
									WebElement country = AP_IMT.get(vv);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
							
							if(Region_Values.equals("North West Africa"))
							{
								System.out.println("Enters North West Africa Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",MEA_NWA_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int ww=16;ww<AP_IMT.size();ww++)
								{
									WebElement country = AP_IMT.get(ww);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
							if(Region_Values.equals("Pakistan"))
							{
								System.out.println("Enters Pakistan Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",MEA_Pakistan_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int xx=16;xx<AP_IMT.size();xx++)
								{
									WebElement country = AP_IMT.get(xx);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
							if(Region_Values.equals("Saudi Arabia"))
							{
								System.out.println("Enters Saudi Arabia Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",MEA_Soudi_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int yy=16;yy<AP_IMT.size();yy++)
								{
									WebElement country = AP_IMT.get(yy);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
							
							if(Region_Values.equals("Southern Africa"))
							{
								System.out.println("Enters Southern Africa Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",SouthernAfrica_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int zz=16;zz<AP_IMT.size();zz++)
								{
									WebElement country = AP_IMT.get(zz);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
							
							if(Region_Values.equals("Turkey"))
							{
								System.out.println("Enters Turkey Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",MEA_Turkey_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int az=16;az<AP_IMT.size();az++)
								{
									WebElement country = AP_IMT.get(az);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
								break;
							}
						}
					}
				}
			}
			else if(text1.equals("North America"))
			{
				Thread.sleep(2000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",NorthAmerica_Drill);
				Thread.sleep(2000);
				for(int ab=7;ab<AP_IMT.size();ab++)
				{
					String NA_IMT = AP_IMT.get(ab).getText();
					System.out.println(NA_IMT);
					
					if(NA_IMT.equals("Canada/LCR"))
					{
						Thread.sleep(2000);
						System.out.println("Enters Canada IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",Canada_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int ac=9;ac<AP_IMT.size();ac++)
						{
							WebElement region=AP_IMT.get(ac);
							String Region_Values = region.getText();
							System.out.println("Canada Region Values are :"+Region_Values);
							
							if(Region_Values.equals("Canada"))
							{
								System.out.println("Enters Canada Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",NA_Canada_regionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int ad=10;ad<AP_IMT.size();ad++)
								{
									WebElement country = AP_IMT.get(ad);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
								
								break;
							}
						}
					}
					else if(NA_IMT.equals("United States"))
					{
						Thread.sleep(2000);
						System.out.println("Enters US IMT");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",US_IMTDrill);
						Thread.sleep(2000);
						System.out.println(AP_IMT.size());
						for(int ae=9;ae<AP_IMT.size();ae++)
						{
							WebElement region=AP_IMT.get(ae);
							String Region_Values = region.getText();
							System.out.println("US Region Values are :"+Region_Values);
							
							if(Region_Values.equals("US Commercial"))
							{
								System.out.println("Enters US Commercial Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",NA_USCommercial_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int af=11;af<AP_IMT.size();af++)
								{
									WebElement country = AP_IMT.get(af);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							}
							
							else if(Region_Values.equals("US Federal"))
							{
								System.out.println("Enters US Federal Region ");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",NA_USFedral_RegionDrill);
								Thread.sleep(2000);
								System.out.println(AP_IMT.size());
							
								for(int ag=11;ag<AP_IMT.size();ag++)
								{
									WebElement country = AP_IMT.get(ag);
									String Country_Values = country.getText();
									System.out.println("Country values are" +Country_Values);
								}
							break;
							}
						}
					}
				}
			}
			
			
			
		}
		
			
		}
		
		
		}
		DoneButton.click();
		}
	
	public void verifyLaborPoolFilter() throws Exception
	{
		Thread.sleep(5000);
		Filters.click();
		Thread.sleep(3000);
		
		System.out.println(FilterList.size());
		
		for(int a=0;a<FilterList.size();a++)
		{
		
			WebElement text = FilterList.get(a);
	
			String values  = text.getText();
			System.out.println("FilterValues are " +values);
			
			if(values.equals("Labor Pool"))
			{
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(3));
				
				System.out.println("Size of laborpool "+LaborPoolType.size());
				for(int ah=0;ah<LaborPoolType.size();ah++)
				{
					WebElement laborpool = LaborPoolType.get(ah);
					String LaborType = laborpool.getText();
					System.out.println("LaborType values are "+LaborType);
				}
			}
			
			if(values.equals("Sector"))
			{
				Thread.sleep(2000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(6));
				
				System.out.println("Size of Sector "+LaborPoolType.size());
				for(int ai=0;ai<LaborPoolType.size();ai++)
				{
					WebElement Sector = LaborPoolType.get(ai);
					String SectorValue = Sector.getText();
					System.out.println("Sector values are "+SectorValue);
				}
				
			}
			
			if(values.equals("Growth Platform"))
			{
				Thread.sleep(2000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(5));
				
				System.out.println("Size of GrowthPlatform "+LaborPoolType.size());
				for(int aj=0;aj<LaborPoolType.size();aj++)
				{
					WebElement GrowthPlatform = LaborPoolType.get(aj);
					String GrowthPlatformValue = GrowthPlatform.getText();
					System.out.println("growthPlatform values are "+GrowthPlatformValue);
					
					if(GrowthPlatformValue.equals("Cloud Application Innovation"))
					{
						Thread.sleep(2000);
						System.out.println("Enters Cloud application Innovation");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",CAIDrill);
						Thread.sleep(2000);
						for(int ak=3;ak<AP_IMT.size();ak++)
						{
							WebElement CAI = AP_IMT.get(ak);
							String CAI_Values = CAI.getText();
							System.out.println("CAI_Values are "+CAI_Values);
							
							if(CAI_Values.equals("ADM Innovation"))
							{
								Thread.sleep(2000);
								System.out.println("Enters ADM Innovation Service line");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",ADMInnovationDrill);
								Thread.sleep(2000);
								for(int al=6;al<AP_IMT.size();al++)
								{
									WebElement Practice=AP_IMT.get(al);
									String Practice_Values = Practice.getText();
									System.out.println("Practice Values are "+Practice_Values );
								}
								
							}
							else if(CAI_Values.equals("Cloud Application Migration Services"))
							{
								Thread.sleep(2000);
								System.out.println("Enters CAMS Service");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",CAMSDrill);
								Thread.sleep(2000);
								for(int am=6;am<AP_IMT.size();am++)
								{
									WebElement Practice=AP_IMT.get(am);
									String Practice_Values = Practice.getText();
									System.out.println("Practice Values are "+Practice_Values );
								}
							}
							else if(CAI_Values.equals("Next Gen EA"))
							{
								Thread.sleep(2000);
								System.out.println("Enters Next Gen EA service line");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",NextGenEADrill);
								Thread.sleep(2000);
								for(int an=6;an<AP_IMT.size();an++)
								{
									WebElement Practice=AP_IMT.get(an);
									String Practice_Values = Practice.getText();
									System.out.println("Practice Values are "+Practice_Values );
								}
							}
						}
					}
					
					else if(GrowthPlatformValue.equals("Cognitive Process Transformation"))
					{
						Thread.sleep(2000);
						System.out.println("Enters Cognitive Process Transformation");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",CPTDrill);
						Thread.sleep(2000);
						for(int ao=3;ao<AP_IMT.size();ao++)
						{
							WebElement CPT=AP_IMT.get(ao);
							String CPT_Values = CPT.getText();
							System.out.println("CPT Values are "+CPT_Values );
							
							if(CPT_Values.equals("Cognitive Business Decision Support"))
							{
								Thread.sleep(2000);
								System.out.println("Enters CBDS service line");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",CBDSDrill);
								Thread.sleep(2000);
								for(int ap=6;ap<AP_IMT.size();ap++)
								{
									WebElement Practice=AP_IMT.get(ap);
									String Practice_Values = Practice.getText();
									System.out.println("Practice Values are "+Practice_Values );
								}
							}
							else if(CPT_Values.equals("Cognitive Process Re-engineering"))
							{
								Thread.sleep(2000);
								System.out.println("Enters CPR service line");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",CPRDrill);
								Thread.sleep(2000);
								for(int aq=6;aq<AP_IMT.size();aq++)
								{
									WebElement Practice=AP_IMT.get(aq);
									String Practice_Values = Practice.getText();
									System.out.println("Practice Values are "+Practice_Values );
								}
							}
							else if(CPT_Values.equals("Cognitive Process Services"))
							{
								Thread.sleep(2000);
								System.out.println("Enters CPS service line");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",CPSDrill);
								Thread.sleep(2000);
								for(int ar=6;ar<AP_IMT.size();ar++)
								{
									WebElement Practice=AP_IMT.get(ar);
									String Practice_Values = Practice.getText();
									System.out.println("Practice Values are "+Practice_Values );
								}
							}
						}
					}
					else if(GrowthPlatformValue.equals("Digital Strategy and iX"))
					{
						Thread.sleep(2000);
						System.out.println("Enters Digital Strategy and iX");
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",DSAndIXDrill);
						Thread.sleep(2000);
						for(int as=3;as<AP_IMT.size();as++)
						{
							WebElement DSIX = AP_IMT.get(as);
							String DSIX_Values = DSIX.getText();
							System.out.println("DS and iX values are "+DSIX_Values);
							
							if(DSIX_Values.equals("Digital Strategy"))
							{
								Thread.sleep(2000);
								System.out.println("Enters DS service line");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",DSDrill);
								Thread.sleep(2000);
								for(int at=6;at<AP_IMT.size();at++)
								{
									WebElement Practice=AP_IMT.get(at);
									String Practice_Values = Practice.getText();
									System.out.println("Practice Values are "+Practice_Values );
								}
							}
							if(DSIX_Values.equals("iX"))
							{
								Thread.sleep(2000);
								System.out.println("Enters iX service line");
								((JavascriptExecutor)driver).executeScript("arguments[0].click()",IXDrill);
								Thread.sleep(2000);
								for(int at=6;at<AP_IMT.size();at++)
								{
									WebElement Practice=AP_IMT.get(at);
									String Practice_Values = Practice.getText();
									System.out.println("Practice Values are "+Practice_Values );
								}
							}
						}
					}
				}
				
				
			}
		}
		
	}
	
	public void verifyLaborPoolType() throws Exception
	{
		Thread.sleep(5000);
		Filters.click();
		Thread.sleep(3000);
		
		System.out.println(FilterList.size());
		
		for(int a=0;a<FilterList.size();a++)
		{
		
			WebElement text = FilterList.get(a);
	
			String values  = text.getText();
			System.out.println("FilterValues are " +values);
			
			if(values.equals("Labor Pool"))
			{
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(3));
				
				System.out.println("Size of laborpool "+LaborPoolType.size());
				for(int ah=0;ah<LaborPoolType.size();ah++)
				{
					WebElement laborpool = LaborPoolType.get(ah);
					String LaborType = laborpool.getText();
					System.out.println("LaborType values are "+LaborType);
					
					if(LaborType.equals("CPS Delivery Center"))
					{
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",CPSDeliverySel);
						
						
					}
				}
				DoneButton.click();
			}
		}
	}
	
	public void verifyLaborPoolType2() throws Exception
	{
		Thread.sleep(5000);
		Filters.click();
		Thread.sleep(3000);
		
		System.out.println(FilterList.size());
		
		for(int a=0;a<FilterList.size();a++)
		{
		
			WebElement text = FilterList.get(a);
	
			String values  = text.getText();
			System.out.println("FilterValues are " +values);
			
			if(values.equals("Labor Pool"))
			{
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(3));
				
				System.out.println("Size of laborpool "+LaborPoolType.size());
				for(int ah=0;ah<LaborPoolType.size();ah++)
				{
					WebElement laborpool = LaborPoolType.get(ah);
					String LaborType = laborpool.getText();
					System.out.println("LaborType values are "+LaborType);
					
					if(LaborType.equals("Center of Competency"))
					{
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",CenterOFCompitencySel);
						
						
					}
				}
				DoneButton.click();
			}
		}
	}
	
	public void verifyLaborPoolType3() throws Exception
	{
		Thread.sleep(5000);
		Filters.click();
		Thread.sleep(3000);
		
		System.out.println(FilterList.size());
		
		for(int a=0;a<FilterList.size();a++)
		{
		
			WebElement text = FilterList.get(a);
	
			String values  = text.getText();
			System.out.println("FilterValues are " +values);
			
			if(values.equals("Labor Pool"))
			{
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(3));
				
				System.out.println("Size of laborpool "+LaborPoolType.size());
				for(int ah=0;ah<LaborPoolType.size();ah++)
				{
					WebElement laborpool = LaborPoolType.get(ah);
					String LaborType = laborpool.getText();
					System.out.println("LaborType values are "+LaborType);
					
					if(LaborType.equals("Center of Competency"))
					{
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",DomesticAffliateSel);
						
						
					}
				}
				DoneButton.click();
			}
		}
	}
	
	public void verifyLaborPoolType4() throws Exception
	{
		Thread.sleep(5000);
		Filters.click();
		Thread.sleep(3000);
		
		System.out.println(FilterList.size());
		
		for(int a=0;a<FilterList.size();a++)
		{
		
			WebElement text = FilterList.get(a);
	
			String values  = text.getText();
			System.out.println("FilterValues are " +values);
			
			if(values.equals("Labor Pool"))
			{
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(3));
				
				System.out.println("Size of laborpool "+LaborPoolType.size());
				for(int ah=0;ah<LaborPoolType.size();ah++)
				{
					WebElement laborpool = LaborPoolType.get(ah);
					String LaborType = laborpool.getText();
					System.out.println("LaborType values are "+LaborType);
					
					if(LaborType.equals("Center of Competency"))
					{
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",DomesticCenterSel);
						
						
					}
				}
				DoneButton.click();
			}
		}
	}
	
	public void verifyLaborPoolType5() throws Exception
	{
		Thread.sleep(5000);
		Filters.click();
		Thread.sleep(3000);
		
		System.out.println(FilterList.size());
		
		for(int a=0;a<FilterList.size();a++)
		{
		
			WebElement text = FilterList.get(a);
	
			String values  = text.getText();
			System.out.println("FilterValues are " +values);
			
			if(values.equals("Labor Pool"))
			{
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(3));
				
				System.out.println("Size of laborpool "+LaborPoolType.size());
				for(int ah=0;ah<LaborPoolType.size();ah++)
				{
					WebElement laborpool = LaborPoolType.get(ah);
					String LaborType = laborpool.getText();
					System.out.println("LaborType values are "+LaborType);
					
					if(LaborType.equals("Center of Competency"))
					{
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",DomesticRegularSel);
						
						
					}
				}
				DoneButton.click();
			}
		}
	}
	
	public void verifyLaborPoolType6() throws Exception
	{
		Thread.sleep(5000);
		Filters.click();
		Thread.sleep(3000);
		
		System.out.println(FilterList.size());
		
		for(int a=0;a<FilterList.size();a++)
		{
		
			WebElement text = FilterList.get(a);
	
			String values  = text.getText();
			System.out.println("FilterValues are " +values);
			
			if(values.equals("Labor Pool"))
			{
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(3));
				
				System.out.println("Size of laborpool "+LaborPoolType.size());
				for(int ah=0;ah<LaborPoolType.size();ah++)
				{
					WebElement laborpool = LaborPoolType.get(ah);
					String LaborType = laborpool.getText();
					System.out.println("LaborType values are "+LaborType);
					
					if(LaborType.equals("Center of Competency"))
					{
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",DomesticsubKSel);
						
						
					}
				}
				DoneButton.click();
			}
		}
	}
	
	public void verifyLaborPoolType7() throws Exception
	{
		Thread.sleep(5000);
		Filters.click();
		Thread.sleep(3000);
		
		System.out.println(FilterList.size());
		
		for(int a=0;a<FilterList.size();a++)
		{
		
			WebElement text = FilterList.get(a);
	
			String values  = text.getText();
			System.out.println("FilterValues are " +values);
			
			if(values.equals("Labor Pool"))
			{
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(3));
				
				System.out.println("Size of laborpool "+LaborPoolType.size());
				for(int ah=0;ah<LaborPoolType.size();ah++)
				{
					WebElement laborpool = LaborPoolType.get(ah);
					String LaborType = laborpool.getText();
					System.out.println("LaborType values are "+LaborType);
					
					if(LaborType.equals("Global Center"))
					{
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",GlobalCenterSel);
						
						
					}
				}
				DoneButton.click();
			}
		}
	}
	public void verifyCombinationOflaborType() throws Exception
	{
		Thread.sleep(5000);
		Filters.click();
		Thread.sleep(3000);
		
		System.out.println(FilterList.size());
		
		for(int a=0;a<FilterList.size();a++)
		{
		
			WebElement text = FilterList.get(a);
	
			String values  = text.getText();
			System.out.println("FilterValues are " +values);
			
			if(values.equals("Labor Pool"))
			{
				Thread.sleep(3000);
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",FilterList.get(3));
				
				System.out.println("Size of laborpool "+LaborPoolType.size());
				for(int ah=0;ah<LaborPoolType.size();ah++)
				{
					WebElement laborpool = LaborPoolType.get(ah);
					String LaborType = laborpool.getText();
					System.out.println("LaborType values are "+LaborType);
					
					if(LaborType.equals("Global Center"))
					{
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",GlobalCenterSel);
						((JavascriptExecutor)driver).executeScript("arguments[0].click()",DomesticsubKSel);
						
						
					}
				}
				DoneButton.click();
			}
		}
	}
}

		
	
	

