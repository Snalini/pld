package com.pld.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.LearningExp;

public class LearningExpTest extends PldTestBase{
	LearningExp learningexp;
	
	@BeforeClass
	public void setUp()
	{
		learningexp = new LearningExp();
	}

	@Test(priority=1)
	public void clickOnLearningTileTest()
	{
		learningexp.clickOnLearningTile();
	}
	
	@Test(priority=2,dependsOnMethods = "clickOnLearningTileTest")
	public void verifyStudentDayDistributionTest()
	{
		Assert.assertTrue(learningexp.verifyStudentDayDistribution());
	}
	
	@Test(priority=3)
	public void verifyAvgDaysperPartTest()
	{
		Assert.assertTrue(learningexp.verifyAvgDaysperpart());
	}
	
	@Test(priority=4)
	public void verifyFivePlusOnePlusOneThemesTest()
	{
		Assert.assertTrue(learningexp.verifyFivePlusOnePLusOneThemes());
	}
	
	@Test(priority=5)
	public void verifyGrowthThemesAndOfferingsTest()
	{
		Assert.assertTrue(learningexp.verifyGrowthThemesAndOfferings());
	}
	@Test(priority=6)
	public void verifyIndustryTest()
	{
		Assert.assertTrue(learningexp.verifyIndustry());
	}
	@Test(priority=7)
	public void verifyIndustry_AvgDaysPerPartTest()
	{
		Assert.assertTrue(learningexp.verifyIndustry_AvgDaysPerPart());
	}
	
	@Test(priority=8)
	public void verifyIndustry_PentPercTest()
	{
		Assert.assertTrue(learningexp.verifyIndustry_pentperc());
	}
	@Test(priority=9)
	public void verifyIndustry_StudentDaysTest()
	{
		Assert.assertTrue(learningexp.verifyIndustry_StudentDays());
	}
	@Test(priority=10)
	public void verifyIndustry_UniqueParticipantsTest()
	{
		Assert.assertTrue(learningexp.verifyIndustry_UniqueParticipants());
	}
	@Test(priority=11)
	public void verifyMetricTest()
	{
		Assert.assertTrue(learningexp.verifyMetric());
	}
	@Test(priority=12)
	public void verifyPentPercTest()
	{
		Assert.assertTrue(learningexp.verifyPentperc());
	}
	/*@Test(priority=13)
	public void verifyPrescribedCoreCapabilityLearningTest()
	{
		Assert.assertTrue(learningexp.verifyprescribedCoreCapabilityLearning());
	}*/
	@Test(priority=14)
	public void verifyServiceLine_AvgDaysPerpartTest()
	{
		Assert.assertTrue(learningexp.verifyServiceline_AvgDaysPerpart());
	}
	@Test(priority=15)
	public void verifyServiceLine_pentpercTest()
	{
		Assert.assertTrue(learningexp.verifyServiceLine_Pentperc());
	}
	@Test(priority=16)
	public void verifyServiceLine_StudentDaysTest()
	{
		Assert.assertTrue(learningexp.verifyServiceline_StudentDays());
	}
	@Test(priority=17)
	public void verifyServiceline_uniqueParticipantsTest()
	{
		Assert.assertTrue(learningexp.verifyServiceLine_UniqueParticipants());
	}
	@Test(priority=18)
	public void verifyServiceLineSubAreasTest()
	{
		Assert.assertTrue(learningexp.verifyServiceLineSubAreas());
	}
	@Test(priority=19)
	public void verifyStudentDaysTest()
	{
		Assert.assertTrue(learningexp.verifyStudentDays());
	}
	@Test(priority=20)
	public void verifyTotalTest()
	{
		Assert.assertTrue(learningexp.verifyTotal());
	}
	@Test(priority=21)
	public void verifyTrainingDetailsTest()
	{
		Assert.assertTrue(learningexp.verifyTrainingDetails());
	}
	@Test(priority=22)
	public void verifyUniqueParticipantsTest()
	{
		Assert.assertTrue(learningexp.verifyUniqueParticipants());
	}
	@Test(priority=23)
	public void verifyStudentDayDistributionChartTest()
	{
		Assert.assertTrue(learningexp.verifyLearning_StudentDayDistributionChart());
	}
	@Test(priority=24,dependsOnMethods="verifyStudentDayDistributionTest")
	public void clickonDashBoard()
	{
		learningexp.clickOnDashBoard();
	}
	
}
