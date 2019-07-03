package com.pld.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.BenchTileExp;
import com.pld.Pages.UtilizationladderExp;

public class UtilLadExpansionTest extends PldTestBase{
	
	public UtilizationladderExp utilladexp;

	
	@BeforeClass
	public void setUp() {
		
		System.out.println("User triggered utillad expansion page");
		utilladexp =new UtilizationladderExp();

}
	
	@Test(priority=1)
	public void clickOnUtilLadderTiletest()
	{
		utilladexp.clickOnUtilladTile();
	}
	
	@Test(priority=2)
	public void verifyUtilizationDistributionbyBandTest()
	{
		Assert.assertTrue(utilladexp.verifyUtilizationDistributionbyBand());
	}
	@Test(priority=3)
	public void verifyQTDCUTest()
	{
		Assert.assertTrue(utilladexp.verifyQTDCU());
	}
	@Test(priority=4)
	public void verifyQTDTest()
	{
		Assert.assertTrue(utilladexp.verifyQTD());
	}
	@Test(priority=5)
	public void verifyProjectionOkTest()
	{
		Assert.assertTrue(utilladexp.verifyProjectionOk());
	}
	@Test(priority=6)
	public void verifyProductiveProjectTest()
	{
		Assert.assertTrue(utilladexp.verifyProductiveProject());
	}
	@Test(priority=7)
	public void verifyNameTest()
	{
		Assert.assertTrue(utilladexp.verifyNametext());
	}
	@Test(priority=8)
	public void verifyMCTest()
	{
		Assert.assertTrue(utilladexp.verifyMC());
	}
	@Test(priority=9)
	public void verifyLocationTest()
	{
		Assert.assertTrue(utilladexp.verifyLocation());
	}
	@Test(priority=10)
	public void verifyJRSSTest()
	{
		Assert.assertTrue(utilladexp.verifyJRSS());
	}
	@Test(priority=11)
	public void verifyInPlayTest()
	{
		Assert.assertTrue(utilladexp.verifyInPlayText());
	}
	@Test(priority=12)
	public void verifyIndustryTest()
	{
		Assert.assertTrue(utilladexp.verifyIndustry());
	}
	@Test(priority=13)
	public void verifyHoursHCTest()
	{
		Assert.assertTrue(utilladexp.verifyHoursFC());
	}
	@Test(priority=14)
	public void verifyHighBandTest()
	{
		Assert.assertTrue(utilladexp.verifyHighBand());
	}
	@Test(priority=15)
	public void verifyHeadCounterUnderTest()
	{
		Assert.assertTrue(utilladexp.verifyHeadCountUnder());
	}
	@Test(priority=16)
	public void verifyDeployedPartTimeTest()
	{
		Assert.assertTrue(utilladexp.verifyDeployedPartTime());
	}
	@Test(priority=17)
	public void verifyBenchAgeTest()
	{
		Assert.assertTrue(utilladexp.verifyBenchAge());
	}
	/*@Test
	public void verifyBenchTest()
	{
		Assert.assertTrue(utilladexp.verifyBench());
	}*/
	@Test(priority=18)
	public void verifyBandTextTest()
	{
		Assert.assertTrue(utilladexp.verifyBandText());
	}
	@Test(priority=19)
	public void verifyAwayTest()
	{
		Assert.assertTrue(utilladexp.verifyAway());
	}
	@Test(priority=20)
	public void verifyAwaitingAccountIDTest()
	{
		Assert.assertTrue(utilladexp.verifyAwaitingAccountID());
	}
	@Test(priority=21)
	public void verifyAvailDateTest()
	{
		Assert.assertTrue(utilladexp.verifyAvailDate());
	}
	@Test(priority=22)
	public void verifyAssignedAcctTest()
	{
		Assert.assertTrue(utilladexp.verifyAssignedAcct());
	}
	@Test(priority=23)
	public void verifyAllDropDownTest()
	{
		Assert.assertTrue(utilladexp.verifyAllDropDown());
	}
	@Test(priority=24)
	public void verifyAAIDTest()
	{
		Assert.assertTrue(utilladexp.verifyAAID());
	}
	@Test(priority=25)
	public void verifyQTDPUTest()
	{
		Assert.assertTrue(utilladexp.verifyQTDPU());
	}
	@Test(priority=26)
	public void verifyTotalHeadCountTest()
	{
		Assert.assertTrue(utilladexp.verifyTotalHeadCount());
	}
	@Test(priority=27)
	public void verifyUtilizationByCategoryTest()
	{
		Assert.assertTrue(utilladexp.verifyUtilizationByCategory());
	}
	@Test(priority=28)
	public void verifyUtilizationEmployeesTest()
	{
		Assert.assertTrue(utilladexp.verifyUtilizationEmployees());
	}
	@Test(priority=29)
	public void verifyUtilizationDistributionByBandChartTest()
	{
		Assert.assertTrue(utilladexp.verifyUtilizationDistributionbyBandChart());
	}
	@Test(priority=30)
	public void verifyUtilizationByCategoryDoughnutChartTest()
	{
		Assert.assertTrue(utilladexp.verifyUtilizationByCategoryDoughnutChart());
	}
	@Test(priority=31)
	public void verifyMessageDisplayTest()
	{
		Assert.assertTrue(utilladexp.verifyMessageDisplay());
	}
	/*@Test
	public void verifyNoDataDisplayMessageTest()
	{
		Assert.assertTrue(utilladexp.verifyNodataMessageDisplay());
	}*/
	@Test(priority=32)
	public void clickOnDashBoard()
	{
		utilladexp.clickOnDashBoardText();
	}
	
	
	
	
}