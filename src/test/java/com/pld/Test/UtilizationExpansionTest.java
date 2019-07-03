package com.pld.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.UtilizationExpansion;
import com.pld.Util.TestUtil;

public class UtilizationExpansionTest extends PldTestBase{
	
	public UtilizationExpansion utilizationexpansion;
	
	
	@BeforeClass
	public void setUp() {
		
		System.out.println("User triggered Utilization expansion page");
		utilizationexpansion =new UtilizationExpansion();
	}
	
	
	
	@Test(priority=1)
	public void verifyClickOnUtilizationTile()
	{
		utilizationexpansion.clickOnUtilizationTile();
	}
	
	@Test(priority=2)
	public void verifyWeekUtilizationActualsOrProjectionsTest()
	{
		Assert.assertTrue(utilizationexpansion.verifyWeekUtilizationText());
	}
	@Test(priority=3)
	public void verifyChargeableDropDown()
	{
		TestUtil.captureScreenShot("Utilization Expansion Tile"); 
		Assert.assertTrue(utilizationexpansion.verifyChargeable_Button());
	}
	
	@Test(priority=4)
	public void verifyChargeableProjectionsTest()
	{
		Assert.assertTrue(utilizationexpansion.verifyChargeableProjections());
	}
	
	@Test(priority=5)
	public void verifyChargeableActuals()
	{
		Assert.assertTrue(utilizationexpansion.verifyChargeableActuals());
	}
	
	/*@Test(priority=6)
	public void clickOnChargeableButton()
	{
		utilizationexpansion.clickOnChargeableButton();
	}*/
	/*@Test(priority=7)
	public void verifyProductiveTest()
	{
		//Assert.assertTrue(utilizationexpansion.verifyProductiveText());
		Assert.assertTrue(utilizationexpansion.verifyBillable_Button());
	}*/
	
	
	
/*	@Test(priority=8)
	public void verifyBillableAndChargeableTest()
	{
		
	}*/
	@Test(priority=9)
	public void verifyQtrEndProjectionTest()
	{
		
		Assert.assertTrue(utilizationexpansion.verifyQtrEndProjection());
	}
	@Test(priority=10)
	public void verifyTargetPtsTest()
	{
		Assert.assertTrue(utilizationexpansion.verifyUtiltile_TargetPtstext());
	}
	@Test(priority=11)
	public void verifyYTYTest()
	{
		Assert.assertTrue(utilizationexpansion.verifyUtiltile_YTYtext());
	}
	@Test(priority=12)
	public void verifyViewTest()
	{
		Assert.assertTrue(utilizationexpansion.verifyViewText());
		
	}
	
	
	
	@Test(priority =13)
	public void verifyTargetTest()
	{
		Assert.assertTrue(utilizationexpansion.verifyTargetText());
	}
	
	/*@Test(priority=14)
	public void closeChargeableDropDown()
	{
		utilizationexpansion.closeChargeabledropdown();
	}*/
	
/*	@Test(priority=15)
	public void verifyBillableViewTest()
	{
		utilizationexpansion.verifyBillableview();
	}*/
	
	@Test(priority=16)
	public void verifyLegendLableTargetTest()
	{
		Assert.assertTrue(utilizationexpansion.verifyLegendlableTarget());
	}
	
	@Test(priority=17)
	public void verifyLegendLablePrevYearTest()
	{
		Assert.assertTrue(utilizationexpansion.verifyLegendlablePrevYear());
	}
	
	@Test(priority=18)
	public void verifyWeeklyUtilizationChartTest()
	{
		Assert.assertTrue(utilizationexpansion.verifyWeeklyutilizationbarChart());
	}
	@Test(priority=19)
	public void verifyQtrEndProjDoughnutChartTest()
	{
		Assert.assertTrue(utilizationexpansion.verifyQtrEndProjDoughnutChart());
	}
	@Test(priority = 20)
	public void clickonutilExp()
	{
		utilizationexpansion.clickOnCloseUtilExp();
	}
	

}
