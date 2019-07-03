package com.pld.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.BandPyramidExp;

public class BandPyramidExpTest extends PldTestBase{
	
	public BandPyramidExp bandpyramidexp;
	
	
	@BeforeClass
	public void setUp()
	{
		bandpyramidexp = new BandPyramidExp();
	}
	
	@Test(priority=1)
	public void clickOnBandPyramidTileTest()
	{
		bandpyramidexp.clickOnBandPyramidTile();
	}

	/*@Test(priority=2)
	public void verifyIgniteTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyIgnite());
	}*/
	
	
	/*@Test()
	public void verifyTimeAwayTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyTimeAway());
	}*/
	@Test(priority=3)
	public void verifyTAandEPSTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyTAndEPS());
	}
	@Test(priority=4)
	public void verifySAPADMTest()
	{
		Assert.assertTrue(bandpyramidexp.verifySAPADM());
	}
	@Test(priority=5)
	public void verifyROWTOTTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyROWTOT());
	}
	@Test(priority=6)
	public void verifyRowByTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyRowBy());
	}
	/*@Test()
	public void verifyQTDPUTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyQTDPU());
	}
	@Test()
	public void verifyQTDCUTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyQTDCU());
	}*/
	@Test(priority=7)
	public void verifyPractictionerTypeTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyPractitionerType());
	}
	@Test(priority=8)
	public void verifyPracticeDropDownTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyPracticedropdown());
	}
	@Test(priority=9)
	public void verifyOtherTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyOther());
	}
	@Test(priority=10)
	public void verifyNOrATest()
	{
		Assert.assertTrue(bandpyramidexp.verifyNOrA());
	}
	/*@Test()
	public void verifyNameTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyName());
	}
	@Test
	public void verifyNATest()
	{
		Assert.assertTrue(bandpyramidexp.verifyNA());
	}
	@Test()
	public void verifyMCTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyMC());
	}*/
	/*@Test()
	public void verifyLocationTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyLocation());
	}*/
	@Test(priority=11)
	public void verifyLATest()
	{
		Assert.assertTrue(bandpyramidexp.verifyLA());
	}
	/*@Test()
	public void verifyJRSSTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyJRSS());
	}*/
	@Test(priority=12)
	public void verifyJPTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyJP());
	}
	/*@Test
	public void verifyInPlayTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyInPlay());
	}
	@Test
	public void verifyIndustryTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyIndustry());
	}*/
	/*@Test
	public void verifyHPPTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyHPP());
	}*/
	@Test(priority=13)
	public void verifyHeadCountTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyHeadCount());
	}
	@Test(priority=14)
	public void verifyGeographyTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyGeographyDropDown());
	}
	@Test(priority=15)
	public void verifyGCGTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyGCG());
	}
	@Test(priority=16)
	public void verifyFINPSTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyFINPS());
	}
	@Test(priority=17)
	public void verifyExecTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyExec());
	}
	@Test(priority=18)
	public void verifyEUTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyEU());
	}
	@Test(priority=19)
	public void verifyEmployeesTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyEmployees());
	}
	@Test(priority=20)
	public void verifyCUSTADMTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyCUSTADM());
	}
	@Test(priority=21)
	public void verifyContractorTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyContractor());
	}
	@Test(priority=22)
	public void verifyCOLTOTTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyCOLTOT());
	}
	@Test(priority=23)
	public void verifyClmByTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyClmBy());
	}
	@Test(priority=24)
	public void verifyCEDTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyCED());
	}
	/*@Test
	public void verifyBenchAgeTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyBenchAge());
	}
	@Test
	public void verifyBandTextTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyBandText());
	}*/
	@Test(priority=25)
	public void verifyBandPyramidTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyBandPyramid());
	}
	@Test(priority=26)
	public void verifyBandTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyBand());
	}
	/*@Test
	public void verifyAvailDateTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyAviailDate());
	}
	@Test
	public void verifyAssignAcctTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyAssignAcct());
	}
	@Test(priority=27)
	public void verifyAPTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyAP());
	}*/
	@Test(priority=27)
	public void verifyAllDropDownTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyAllDropDown());
	}
	@Test(priority=28)
	public void verifyActualHCTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyActualHC());
	}
	@Test(priority=29)
	public void verifyBandPyramidChartTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyBandPyramidExpChart());
	}
   /* @Test(priority=4)
	public void verifyAAIDTest()
	{
		Assert.assertTrue(bandpyramidexp.verifyAAID());
	}*/
	@Test(priority=30)
	public void clickOnDashBoard()
	{
		bandpyramidexp.clickOnDashBoardText();
	}
	
}
