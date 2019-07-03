package com.pld.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.DemandCoverageExp;

public class DemandCoverageExpTest extends PldTestBase{
	
	public DemandCoverageExp demandcoverageexp;
	
	
	@BeforeClass
	public void setUp()
	{
		demandcoverageexp = new DemandCoverageExp();
	}
	
	@Test(priority=1)
	public void clickOnDemandCoverageTileTest()
	{
		demandcoverageexp.clickOnDemandCoverage();
	}
	
	@Test(priority=2)
	public void verifyDemandCoverageTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyAllDropDown());
	}

	@Test(priority=3)
	public void verifyWithInThresholdTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyWithInThreshold());
	}
	@Test(priority=4)
	public void verifyWithPlansTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyWithPlans());
	}
	@Test(priority=5)
	public void verifyWithNoPlansRequiredTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyWithNoPlansRequired());
	}
	@Test(priority=6)
	public void verifyWithNoPlansTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyWithNoPlans());
	}
	
	@Test(priority=7)
	public void verifyViewTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyView());
	}
	@Test(priority=8)
	public void verifyTCV_MTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyTCV_M());
	}
	@Test(priority=9)
	public void verifyTCVTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyTCV());
	}
	@Test(priority=10)
	public void verifyStartDateTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyStartDate());
	}
	@Test(priority=11)
	public void verifySalesStageTest()
	{
		Assert.assertTrue(demandcoverageexp.verifySalesStage());
	}
	@Test(priority=12)
	public void verifyRoadmapStatusTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyRoadMapStatus());
	}
	@Test(priority=13)
	public void verifyOppOwnerNameTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyOppOwnerName());
	}
	@Test(priority=14)
	public void verifyOpportunityNameTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyOpportunityName());
	}
	@Test(priority=15)
	public void verifyOpportunityDetailsTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyOpportunityDetails());
	}
	@Test(priority=16)
	public void verifyOppIDTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyOppID());
	}
	@Test(priority=17)
	public void verifyOfferingTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyOffering());
	}
	@Test(priority=18)
	public void verifyNoOfDealsTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyNoOfDeals());
	}
	@Test(priority=19)
	public void verifyMonthsTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyMonths());
	}
	
	@Test(priority=20)
	public void verifyDuration_MonthsTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyDuration_Months());
	}
	@Test(priority=21)
	public void verifyDecisionDateTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyDecisionDate());
	}
	@Test(priority=22)
	public void verifyDealsTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyDeals());
	}
	@Test(priority=23)
	public void verifyCustNameTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyCustName());
	}
	@Test(priority=24)
	public void verifyAsOfTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyAsOF());
	}
	@Test(priority=25)
	public void verifyFutureTrendDemandCoverageChartTest()
	{
		Assert.assertTrue(demandcoverageexp.verifyFutureTrendDemandCoveragehart());
	}
	@Test(priority=26)
	public void clickOnDashBoard()
	{
		demandcoverageexp.clickOnDashBoardText();
	}
	

}
