package com.pld.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.AttritionTilepage;
import com.pld.Pages.Loginpage;
import com.pld.Pages.UtilizationPage;

public class AttritionTileTest extends PldTestBase{
	public static Loginpage loginpage;
	public static UtilizationPage utilizationpage;
	public static AttritionTilepage attritiontilepage;

	public AttritionTileTest() throws IOException {
		super();
		
	}
	
	/*@BeforeClass
	public void setUp() throws IOException
	{
		System.out.println("Attrition tile execution started");
		initialization();
		loginpage = new Loginpage();
		utilizationpage = loginpage.pldLogin(prop.getProperty("username"), prop.getProperty("password"));
		attritiontilepage = new AttritionTilepage();
	}*/
	
	@BeforeClass
	public void setUp() throws Exception
	{
		System.out.println("Attrition tile execution started");
		attritiontilepage = new AttritionTilepage();
	}
	@Test
	public void verifyAttritionTest()
	{
		Assert.assertTrue(attritiontilepage.verifyAttritionTile());
	}

	@Test
	public void verifyAnnualizedRateTest()
	{
		Assert.assertTrue(attritiontilepage.verifyAnnualizedRateText());
	}

	@Test
	public void verifyAttritbyBandTest()
	{
		Assert.assertTrue(attritiontilepage.verifyAttritbyBandText());
	}

	@Test
	public void verifyCompTest()
	{
		Assert.assertTrue(attritiontilepage.verifyCompText());
	}

	/*@Test
	public void verifyEducationTest()
	{
		Assert.assertTrue(attritiontilepage.verifyEducationText());
	}*/

	@Test
	public void verifyLossReasonTest()
	{
		Assert.assertTrue(attritiontilepage.verifyLossReasontext());
	}
	@Test

	public void verifyOpptyTest()
	{
		Assert.assertTrue(attritiontilepage.verifyOpptyText());
	}

	@Test
	public void verifyOtherTest()
	{
		Assert.assertTrue(attritiontilepage.verifyOtherText());
	}

	@Test
	public void verifyVoluntaryLossesTest()
	{
		Assert.assertTrue(attritiontilepage.verifyVoluntaryLossestext());
	}
	@Test

	public void verifyWorkOrLifeTest()
	{
		Assert.assertTrue(attritiontilepage.verifyWorkOrLifeText());
	}

	@Test

	public void verifyAttr_ByBandChartTest()
	{
		Assert.assertTrue(attritiontilepage.verifyAttr_ByBandChart());
	}
	@Test

	public void verifyAttritionBarGrapghTest()
	{
		Assert.assertTrue(attritiontilepage.verifyAttritionBar1());
	}
	/*@Test
	public void verifyYTDAsOfTest()
	{
		Assert.assertTrue(attritiontilepage.verifyYTDAsOf());
	}*/

	/*@AfterClass
	public void tearDown()
	{
		System.out.println("Attrition Tile execution ended");
		driver.quit();
	}*/
}
