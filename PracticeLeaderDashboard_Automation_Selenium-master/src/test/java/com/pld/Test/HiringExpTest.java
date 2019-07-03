package com.pld.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.HiringExp;

public class HiringExpTest extends PldTestBase{
	
	public HiringExp hiringexp;
	
	@BeforeClass
	public void setUp()
	{
		hiringexp = new HiringExp();
	}
	
	@Test(priority=1)
	public void clickOnHiringExp()
	{
		hiringexp.clickOnHiringExp();
	}
	
	@Test(priority=2)
	public void verifyKeyStatistics()
	{
		Assert.assertTrue(hiringexp.verifyKeyStatistics());
	}
	@Test(priority=3)
	public void verifyTotalTest()
	{
		Assert.assertTrue(hiringexp.verifyTotal());
	}
	@Test(priority=4)
	public void verifyMetricTest()
	{
		Assert.assertTrue(hiringexp.verifyMetric());
	}
	@Test(priority=5)
	public void verifyAvgDayToOnBoardTest()
	{
		Assert.assertTrue(hiringexp.verifyAvgDayToOnBoard());
	}
	@Test(priority=5)
	public void verifyAvgDaysToAcceptTest()
	{
		Assert.assertTrue(hiringexp.verifyAvgDaysToAccept());
	}
	@Test(priority=6)
	public void verifyAcceptperTest()
	{
		Assert.assertTrue(hiringexp.verifyAcceptPer());
	}
	@Test(priority=7)
	public void verifyAppliedTest()
	{
		Assert.assertTrue(hiringexp.verifyApplied());
	}
	@Test(priority=8)
	public void verifyAsOFTest()
	{
		Assert.assertTrue(hiringexp.verifyAsOF());
	}
	@Test(priority=9)
	public void verifyBandTest()
	{
		Assert.assertTrue(hiringexp.verifyBand());
	}
	@Test(priority=10)
	public void verifyCandidateYieldTest()
	{
		Assert.assertTrue(hiringexp.verifyCandidateYield());
	}
	@Test(priority=11)
	public void verifyEmailTest()
	{
		Assert.assertTrue(hiringexp.verifyEmail());
	}
	@Test(priority=12)
	public void verifyHiresYTD_BandOneToFiveTest()
	{
		Assert.assertTrue(hiringexp.verifyHiredYTD_BOneToFive());
	}
	@Test(priority=13)
	public void verifybandSevenTest()
	{
		Assert.assertTrue(hiringexp.verifyHiredYTD_BSeven());
	}
	@Test(priority=14)
	public void verifyBandEightTest()
	{
		Assert.assertTrue(hiringexp.verifyHiresYTD_BEight());
	}
	@Test(priority=15)
	public void verifyBandNineTest()
	{
		Assert.assertTrue(hiringexp.verifyHiresYTD_BNine());
	}
	@Test(priority=16)
	public void verifyHiringFunnelDateTest()
	{
		Assert.assertTrue(hiringexp.verifyHiringFunnelDate());
	}
	@Test(priority=17)
	public void verifyInterviewedTest()
	{
		Assert.assertTrue(hiringexp.verifyInterviewed());
	}
	@Test(priority=18)
	public void verifyLocationTest()
	{
		Assert.assertTrue(hiringexp.verifyLocation());
	}
	@Test(priority=19)
	public void verifyNameTest()
	{
		Assert.assertTrue(hiringexp.verifyName());
	}
	@Test(priority=20)
	public void verifyOffersentTest()
	{
		Assert.assertTrue(hiringexp.verifyOfferSent());
	}
	@Test(priority=21)
	public void verifyOthersTest()
	{
		Assert.assertTrue(hiringexp.verifyOthers());
	}
	@Test(priority=22)
	public void verifyRecentJoinersTest()
	{
		Assert.assertTrue(hiringexp.verifyRecentJoiners());
	}@Test(priority=23)
	public void verifyStartDateTest()
	{
		Assert.assertTrue(hiringexp.verifyStartDate());
	}
	
	@Test(priority=24)
	public void verifyANOBTest()
	{
		Assert.assertTrue(hiringexp.verifyANOB());
	}
	@Test(priority=25)
	public void verifyHiringFunnelChartTest()
	{
		Assert.assertTrue(hiringexp.verifyHiringFunnelChart());
	}
	@Test(priority=26)
	public void clickOnDashBoardTest()
	{
		hiringexp.clickOnDashBoard();
	}
	

}
