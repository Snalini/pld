package com.pld.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.FTEbyContractCodingExp;

public class FTEByContractCodingExpTest extends PldTestBase{
	
	public FTEbyContractCodingExp ftebycontractcodingexp;
	
	@BeforeClass
	
	public void setUp()
	{
		ftebycontractcodingexp = new FTEbyContractCodingExp();
	}
	
	@Test(priority=1)
	
	public void clickOnFTEContractCodingTileTest()
	{
		ftebycontractcodingexp.clickOnFTEContractCoadingtile();
	}
	
	@Test(priority=2,dependsOnMethods="clickOnFTEContractCodingTileTest")
	public void verifyAccountClassificationTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyAccountClassification());
    }
	
	@Test(priority=3)
	public void verifyProductiveTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyProductive());
    }
	@Test(priority=4)
	public void verifyOtherLinkTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyotherlink());
    }
	@Test(priority=5)
	public void verifyOther2Test()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyOther2());
    }
	@Test(priority=6)
	public void verifyOtherTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyOther());
    }
	@Test(priority=7)
	public void verifyOfferingCodeBreakdownTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyOfferingCodeBreakDown());
    }
	@Test(priority=8)
	public void verifyNGEATest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyNGEA());
    }
	@Test(priority=9)
	public void verifyNameTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyname());
    }
	@Test(priority=10)
	public void verifyLocationTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyLocation());
    }
	@Test(priority=11)
	public void verifyLevel30CodeTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyLevel30Code());
    }
	@Test(priority=12)
	public void verifylastClaimDateTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifylastclaimDate());
    }
	@Test(priority=13)
	public void verifyJRSSTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyJRSS());
    }
	@Test(priority=14)
	public void verifyIXTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyIX());
    }
	@Test(priority=15)
	public void verifyExcludeOthersTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyExcludeOthers());
    }
	@Test(priority=16)
	public void verifyEAMSAPTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyEAMSAP());
    }
	@Test(priority=17)
	public void verifyDSandiXTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyDSandiX());
    }
	@Test(priority=18)
	public void verifyDSTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyDS());
    }
	@Test(priority=19)
	public void verifyDigitalStratrgyandiXTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyDigitalStrategyandiX());
    }
	@Test(priority=20)
	public void verifyCPTTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyCPT());
    }
	
	@Test(priority=21)
	public void verifyCPSFinanceprocessTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyCPSFinanceProcess());
    }
	@Test(priority=22)
	public void verifyCPSTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyCPS());
    }
	@Test(priority=23)
	public void verifyCPRTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyCPR());
    }
	@Test(priority=24)
	public void verifyContributionEmployeesTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyContributionEmployees());
    }
	@Test(priority=25)
	public void verifyContractOfferingTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyContractOffering());
    }
	@Test(priority=26)
	public void verifyCognitiveProcessTransformationTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifycognitiveProcessTransformation());
    }
	@Test(priority=27)
	public void verifyCloudApplicationInnovationTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyCloudApplicationInnovation());
    }
	@Test(priority=28)
	public void verifyClientnameTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyClientname());
    }
	@Test(priority=29)
	public void verifyChargeableTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyChargeable());
    }
	@Test(priority=30)
	public void verifyCBDSTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyCBDS());
    }
	@Test(priority=31)
	public void verifyCAMSTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyCAMS());
    }
	@Test(priority=32)
	public void verifyCAMCloudApplicationTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyCAMCloudApplication());
    }
	@Test(priority=33)
	public void verifyCAITest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyCAI());
    }
	@Test(priority=34)
	public void verifybillableTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyBillable());
    }
	@Test(priority=35)
	public void verifyBandTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyBand());
    }
	@Test(priority=36)
	public void verifyAvailableDateTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyAvailableDate());
    }
	/*@Test(priority=37)
	public void verifyAMISapAdmTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyAMISapAdm());
    }
	@Test(priority=38)
	public void verifyAMIIgniteTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyAMIIgnite());
    }*/
	@Test(priority=39)
	public void verifyAMICustomeAdmTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyAMICustomAdm());
    }
	@Test(priority=40)
	public void verifyADMITest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyADMI());
    }
	@Test(priority=41)
	public void verifyActualHoursTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyActualHours());
    }
	
	@Test(priority=42)
	public void verifyViewByTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyViewBy());
    }
	@Test(priority=43)
	public void verifyviewTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyview());
    }
	@Test(priority=44)
	public void verifyOfferingCodeBreakDownChartTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyOfferingCodeBreakDownChart());
    }
	@Test(priority=45)
	public void verifyFTEBYContractCodingDoughnutChartTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyFTEByContractCodingDoughnutChart());
    }
	@Test(priority=46)
	public void verifyMessageDisplayTest()
	{
		Assert.assertTrue(ftebycontractcodingexp.verifyMessageDisplay());
	}
	/*@Test(priority=47)
	public void verifyNoDataMessageDisplayTest()
	{
		Assert.assertTrue(ftebycontractcodingexp.verifyNoDataAvailableDisplay());
	}*/
	/*@Test
	public void verifyQTDTotalTest()
    {
	Assert.assertTrue(ftebycontractcodingexp.verifyQTDTotal());
    }*/
	@Test(priority=48,dependsOnMethods="verifyAccountClassificationTest")
	public void clickOnDashBoardTest()
	{
		ftebycontractcodingexp.clickOnDashBoard();
	}


}
