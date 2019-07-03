package com.pld.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.BenchTileExp;
import com.pld.Pages.UtilizationExpansion;

public class BenchTileExpansionTest extends PldTestBase{
	
	public BenchTileExp benchtileexp;
	
	@BeforeClass
	public void setUp() {
		
		System.out.println("User triggered Bench expansion page");
		benchtileexp =new BenchTileExp();
	}
	
	@Test(priority=1)
	public void clickOnBenchTile()
	{
		benchtileexp.clickOnBenchTile();
	}
	@Test(priority =2)
	public void verifyBenchAndRolloffsByWeekTest()
	{
		Assert.assertTrue(benchtileexp.verifyBenchAndRolloffsByWeek());
	}
	
	@Test(priority=3)
	public void verifyAAIDTest()
	{
		Assert.assertTrue(benchtileexp.verifyAAID());
	}
	
	@Test(priority=4)
	public void verifyAgedbenchHCTest()
	{
		Assert.assertTrue(benchtileexp.verifyAgedBenchHC());
	}
	@Test(priority=5)
	public void verifyAvailDateTest()
	{
		Assert.assertTrue(benchtileexp.verifyAvailDate());
	}
	@Test(priority=6)
	public void verifyAwayTest()
	{
		Assert.assertTrue(benchtileexp.verifyAway());
	}
	@Test(priority=7)
	public void verifyBandTextTest()
	{
		Assert.assertTrue(benchtileexp.verifyBandText());
	}
	@Test(priority=8)
	public void verifyBenchAgeTest()
	{
		Assert.assertTrue(benchtileexp.verifyBenchAge());
	}
	@Test(priority=9)
	public void verifyBenchByAgeTest()
	{
		Assert.assertTrue(benchtileexp.verifyBenchByAge());
	}
	@Test(priority=10)
	public void verifyBenchByDateAndRollOffEmployeesTest()
	{
		Assert.assertTrue(benchtileexp.verifyBenchByDateAndRollOffEmployeesText());
	}
	@Test(priority=11)
	public void verifyCriticalSkillsWithExcessTest()
	
	{
		benchtileexp.verifyAlltext();
		//Assert.assertTrue(benchtileexp.verifyCriticalSkillsWithExcess());
		//Assert.assertTrue(benchtileexp.verifySkillsInExcess());
		//Assert.assertTrue(benchtileexp.verifySkillsInShortage());
		//benchtileexp.clickOnCloseDropDown();
	}
	
	@Test(priority=12)
	public void verifyElevenToThirtyDaysTest()
	{
		Assert.assertTrue(benchtileexp.verifyElevenToThirtyDays());
	}
	@Test(priority=13)
	public void verifyHoursFCTest()
	{
		Assert.assertTrue(benchtileexp.verifyHoursHC());
	}
	@Test(priority=14)
	public void verifyIndustryTest()
	{
		Assert.assertTrue(benchtileexp.verifyIndustry());
	}
	@Test(priority=15)
	public void verifyInPlayTextTest()
	{
		Assert.assertTrue(benchtileexp.verifyInPlayText());
	}
	@Test(priority=16)
	public void verifyJRSSTest()
	{
		Assert.assertTrue(benchtileexp.verifyJRSS());
	}
	@Test(priority=17)
	public void verifyLocationTest()
	{
		Assert.assertTrue(benchtileexp.verifyLocation());
	}
	@Test(priority=18)
	public void verifyMCTest()
	{
		Assert.assertTrue(benchtileexp.verifyMC());
	}
	@Test(priority=19)
	public void verifyNameTextTest()
	{
		Assert.assertTrue(benchtileexp.verifyNametext());
	}
	/*@Test(priority=20)
	public void verifyNewAddsTest()
	{
		Assert.assertTrue(benchtileexp.verifyNewAdds());
	}*/
	@Test(priority=21)
	public void verifyPriorAssignmentTest()
	{
		Assert.assertTrue(benchtileexp.verifyPriorAssignment());
	}
	@Test(priority=22)
	public void verifyQTDCUTest()
	{
		Assert.assertTrue(benchtileexp.verifyQTDCU());
	}
	@Test(priority=23)
	public void verifyQTDPUTest()
	{
		Assert.assertTrue(benchtileexp.verifyQTDPU());
	}
	
	@Test(priority=24)
	public void verifySixtyPlusDaysTest()
	{
		Assert.assertTrue(benchtileexp.verifySixtyPlusDyas());
	}
	@Test(priority=25)
	public void verifyThirtyOneToSixthDaysTest()
	{
		Assert.assertTrue(benchtileexp.verifyThirtyOneToSixtyDays());
	}
	@Test(priority=26)
	public void verifyTotalHCTest()
	{
		Assert.assertTrue(benchtileexp.verifyTotalHC());
	}
	@Test(priority=27)
	public void verifyViewTest()
	{
		Assert.assertTrue(benchtileexp.verifyViewText());
	}
	@Test(priority=28)
	public void verifyZeroToTenDaysTest()
	{
		Assert.assertTrue(benchtileexp.verifyZeroToTenDays());
	}
	
	@Test(priority=29)
	public void verifylegendBenchTest()
	{
		Assert.assertTrue(benchtileexp.verifyLegendBenchText());
	}
	@Test(priority=30)
	public void verifylegend6WeekRollOffsTest()
	{
		Assert.assertTrue(benchtileexp.verifyLegends6WeekRollOffs());
	}
	
	@Test(priority=31)
	public void verifyBenchRollOffChartTest()
	{
		Assert.assertTrue(benchtileexp.verifyBenchRollOffChart());
	}
	@Test(priority=32)
	public void verifyBenchByAgeDoughnutChartTest()
	{
		Assert.assertTrue(benchtileexp.verifyBenchByAgedoughnutChart());
	}
	public void verifyDisplayMessage()
	{
		Assert.assertTrue(benchtileexp.verifyMessageDisplay());
	}
	@Test(priority =33)
	public void backtoDashBoard()
	{
		benchtileexp.clickOnCloseBenchExp();
	}
	
	

}
