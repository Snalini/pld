package com.pld.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.LearningTilePage;
import com.pld.Pages.Loginpage;
import com.pld.Pages.UtilizationPage;

public class LearningTileTest extends PldTestBase{
	public static Loginpage loginpage;
	public static UtilizationPage utilizationpage;
	public static LearningTilePage learningtilepage;

	public LearningTileTest() throws IOException {
		super();
		
	}
	
	/*@BeforeClass
	public void setUp() throws IOException
	{
		System.out.println("Learning tile execution started");
		initialization();
		loginpage = new Loginpage();
		utilizationpage = loginpage.pldLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}*/
	@BeforeClass
	public void setUp() throws Exception
	{
		System.out.println("Learning tile execution started");
		learningtilepage = new LearningTilePage();
	}
	@Test
	public void verifyLearningTest()
	{
		Assert.assertTrue(learningtilepage.verifyLearningTile());
	}
	@Test
	public void verifyTrainingDaysTest()
	{
		Assert.assertTrue(learningtilepage.verifyTrainingDaysText());
	}
	@Test
	public void verifyTotalTest()
	{
		Assert.assertTrue(learningtilepage.verifyTotalText());
	}
	@Test
	public void verifyThinkFourtyTest()
	{
		Assert.assertTrue(learningtilepage.verifyThinkFourtyText());
	}
	@Test
	public void verifySelfRptTest()
	{
		Assert.assertTrue(learningtilepage.verifySelfRptText());
	}
	@Test
	public void verifyProRatedYTDTGTTTest()
	{
		Assert.assertTrue(learningtilepage.verifyProRatedYTDTGTText());
	}
	@Test
	public void verifyProfessionalDevTest()
	{
		Assert.assertTrue(learningtilepage.verifyProfessionalDevText());
	}
	@Test
	public void verifyPracticeSkillsTest()
	{
		Assert.assertTrue(learningtilepage.verifyPracticeSkillsText());
	}
	@Test
	public void verifyOnTrackTest()
	{
		Assert.assertTrue(learningtilepage.verifyOnTrackText());
	}
	/*@Test
	public void verifyNewHiresTest()
	{
		Assert.assertTrue(learningtilepage.verifyNewHiresText());
	}*/
	@Test
	public void verifyIndustrySkillsTest()
	{
		Assert.assertTrue(learningtilepage.verifyIndustrySkillsText());
	}
	@Test
	public void verifyF2FTest()
	{
		Assert.assertTrue(learningtilepage.verifyF2FText());
	}
	@Test
	public void verifyeLearnTest()
	{
		Assert.assertTrue(learningtilepage.verifyeLearnText());
	}
	@Test
	public void verifyDaysOrPersonbyDeliveryTypeTest()
	{
		Assert.assertTrue(learningtilepage.verifyDaysOrPersonbyDeliveryTypeText());
	}
	@Test
	public void verifyCrossPlatformTest()
	{
		Assert.assertTrue(learningtilepage.verifyCrossPlatformText());
	}
	@Test
	public void verifyBelowTrackTest()
	{
		Assert.assertTrue(learningtilepage.verifyBelowTrackText());
	}
	@Test
	public void verifyVirtualTest()
	{
		Assert.assertTrue(learningtilepage.verifyVirtualText());
	}
	@Test
	public void verifyYTDAsOfTest()
	{
		Assert.assertTrue(learningtilepage.verifyYTDasofText());
	}
	
	@Test
	public void verifyLearning_DayPerPersonChartTest()
	{
		Assert.assertTrue(learningtilepage.verifylearning_DayperPersonChart());
	}
	@Test
	public void verifyLearning_Think40GraphTest()
	{
		Assert.assertTrue(learningtilepage.verifyLearning_Think40Graph());
	}
	@Test
	public void verifyLearningBarGraph1Test()
	{
		Assert.assertTrue(learningtilepage.verifyLearning_bargraph1());
	}
	/*@AfterClass
	public void tearDown()
	{
		System.out.println("Learning Tile execution ended");
		driver.quit();
	}*/

}
