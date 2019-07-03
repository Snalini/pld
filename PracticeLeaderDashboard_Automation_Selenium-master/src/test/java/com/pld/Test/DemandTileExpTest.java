package com.pld.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.DemandExp;

public class DemandTileExpTest extends PldTestBase{
	
	public DemandExp demandexp;
	
	
	@BeforeClass
	public void setUp()
	{
		demandexp = new DemandExp();
	}
	
	@Test(priority=1)
	public void clickOnDemandTileTest()
	{
		demandexp.clickOnDemandTile();
	}
	
	@Test(priority=2,dependsOnMethods = "clickOnDemandTileTest")
	public void verifyAlltextTest()
	{
		Assert.assertTrue(demandexp.verifyAllText());
	}
	@Test(priority=3)
	public void verifySkillTest()
	{
		Assert.assertTrue(demandexp.verifySkill());
	}
	/*@Test(priority=2)
	public void verifySeatTypeTest()
	{
		Assert.assertTrue(demandexp.verifySeatType());
	}*/
	@Test(priority=4)
	public void verifySeatOwnerTest()
	{
		Assert.assertTrue(demandexp.verifySeatOwner());
	}
	/*@Test(priority=5)
	public void verifyRoyalDutchShellPLCTest()
	{
		Assert.assertTrue(demandexp.verifyRoyalDutchShellPLC());
	}
	@Test(priority=6)
	public void verifyProjectmanagerADMTest()
	{
		Assert.assertTrue(demandexp.verifyprojectManagerADM());
	}
	@Test(priority=7)
	public void verifyProcessServicesprofessionalFinanceTest()
	{
		Assert.assertTrue(demandexp.verifyProcessServicesProfessionalFinance());
	}*/
	@Test(priority=8)
	public void verifyOtherTest()
	{
		Assert.assertTrue(demandexp.verifyOther());
	}
	@Test(priority=9)
	public void verifyOpportunityTest()
	{
		Assert.assertTrue(demandexp.verifyopportunity());
	}
	@Test(priority=10)
	public void verifyOppIDTest()
	{
		Assert.assertTrue(demandexp.verifyOppID());
	}
	/*@Test(priority=2)
	public void verifyOpenSeatidTest()
	{
		Assert.assertTrue(demandexp.verifyOpenSeatId());
	}*/
	@Test(priority=11)
	public void verifyOpenPositionsTest()
	{
		Assert.assertTrue(demandexp.verifyOpenPositions());
	}
	@Test(priority=12)
	public void verifyOpenPosiitonDetailTest()
	{
		Assert.assertTrue(demandexp.verifyOpenPositionDetail());
	}
	/*@Test(priority=13)
	public void verifyMercedezBenzIndiaTest()
	{
		Assert.assertTrue(demandexp.verifyMercedesBenzIndia());
	}*/
	@Test(priority=14)
	public void verifyLocationTest()
	{
		Assert.assertTrue(demandexp.verifyLocation());
	}
	@Test(priority=15)
	public void verifyJobRoleOrSpecialityTest()
	{
		Assert.assertTrue(demandexp.verifyJobRoleOrSpeciality());
	}
	@Test(priority=16)
	public void verifyHistoricalDemandTrendTest()
	{
		Assert.assertTrue(demandexp.verifyHistoricalDemandTrend());
	}
	@Test(priority=17)
	public void verifyFactoredOpenPositionTest()
	{
		Assert.assertTrue(demandexp.verifyFactoredOpenPositons());
	}
	@Test(priority=18)
	public void verifyEndDateTest()
	{
		Assert.assertTrue(demandexp.verifyEndDate());
	}
	@Test(priority=19)
	public void verifyDataAvailabilefromOnlyJuneTest()
	{
		Assert.assertTrue(demandexp.verifyDataAvailablefromOnlyJune2018Onwards());
	}
	/*@Test(priority=20)
	public void verifyConfidentialTest()
	{
		Assert.assertTrue(demandexp.verifyConfidential());
	}*/
	@Test(priority=21)
	public void verifyCommittedTest()
	{
		Assert.assertTrue(demandexp.verifyCommitted());
	}
	@Test(priority=22)
	public void verifyClientNameTest()
	{
		Assert.assertTrue(demandexp.verifyClientName());
	}
	@Test(priority=23)
	public void verifyClientAndSkillbasedDemandTest()
	{
		Assert.assertTrue(demandexp.verifyClientAndSkillbasedDemands());
	}
	@Test(priority=24)
	public void verifyClientTest()
	{
		Assert.assertTrue(demandexp.verifyClient());
	}
	/*@Test(priority=25)
	public void verifyChinaMobileCoomunicationTest()
	{
		Assert.assertTrue(demandexp.verifyChinaMobileCommunicationCo());
	}*/
	/*@Test(priority=26)
	public void verifyBNPParibasTest()
	{
		Assert.assertTrue(demandexp.verifyBNPParibas());
	}*/
	@Test(priority=27)
	public void verifyBandTest()
	{
		Assert.assertTrue(demandexp.verifyBand());
	}
	@Test(priority=28)
	public void verifyBacklogtTest()
	{
		Assert.assertTrue(demandexp.verifyBacklog());
	}
	/*@Test(priority=29)
	public void verifyApplicationDeveloperSapABAPTest()
	{
		Assert.assertTrue(demandexp.verifyApplicationDeveloperSapABAP());
	}
	@Test(priority=30)
	public void verifyApplicationDeveloperJavaFullStackTest()
	{
		Assert.assertTrue(demandexp.verifyApplicationDeveloperJavaFullStack());
	}*/
	@Test(priority=31)
	public void verifyApplicationDeveloperjavaAndWebTechnologiesTest()
	{
		Assert.assertTrue(demandexp.verifyApplicationDeveloperJavaAndWebTechnologies());
	}
	
	@Test(priority=32)
	public void verifyStartDateTest()
	{
		Assert.assertTrue(demandexp.verifyStartDate());
	}
	@Test(priority=33)
	public void verifyTimeFrameTest()
	{
		Assert.assertTrue(demandexp.verifyTimeFrame());
	}
	@Test(priority=34)
	public void verifyTypeTest()
	{
		Assert.assertTrue(demandexp.verifyType());
	}
	@Test(priority=35)
	public void verifyViewtextTest()
	{
		Assert.assertTrue(demandexp.verifyviewText());
	}
	@Test(priority=36)
	public void verifyWinOddsTest()
	{
		Assert.assertTrue(demandexp.verifyWinOdds());
	}
	@Test(priority = 37)
	public void verifyExpansionTitleTest()
	{
		demandexp.verifyTitleofExpansion();
	}
	@Test(priority=38)
	public void verifySkillBasedDemandChartTest()
	{
		Assert.assertTrue(demandexp.verifySkillBasedDemandChart());
	}
	@Test(priority=39)
	public void verifyOpenPositionChartTest()
	{
		Assert.assertTrue(demandexp.verifyOpenPositionChart());
	}
	@Test(priority=40)
	public void verifyClientbasedDemandChartTest()
	{
		Assert.assertTrue(demandexp.verifyClientBasedDemandChart());
	}
	@Test(priority=41,dependsOnMethods="verifyAlltextTest")
	public void clickOnDashBoardTest()
	{
		demandexp.clickOnDashBoard();
	}
	

}
