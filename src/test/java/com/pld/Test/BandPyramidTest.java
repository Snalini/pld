package com.pld.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.BandPyramidTile;
import com.pld.Pages.Loginpage;
import com.pld.Pages.UtilizationPage;

public class BandPyramidTest extends PldTestBase{
	
	public static Loginpage loginpage;
	public static UtilizationPage utilizationpage;
	public static BandPyramidTile bandpyramidpage;

	public BandPyramidTest() throws IOException {
		super();
		
	}
	
	/*@BeforeClass
	public void setUp() throws IOException
	{
		System.out.println("BandPyramid tile execution started");
		initialization();
		loginpage = new Loginpage();
		utilizationpage = loginpage.pldLogin(prop.getProperty("username"), prop.getProperty("password"));
		bandpyramidpage = new BandPyramidTile();
	
	}*/
	
	@BeforeClass
	public void setUp() throws Exception
	{
		System.out.println("BandPyramid tile execution started");
		bandpyramidpage = new BandPyramidTile();
	}
	@Test
	public void verifyBandPyramidTileTest()
	{
		Assert.assertTrue(bandpyramidpage.verifyBandPyramidTile());
		
	}
	
	@Test
	public void verifyActualHeadCountTest()
	{
		Assert.assertTrue(bandpyramidpage.verifyActualHeadCount());
	}
	
	@Test
	public void verifyAvgbandTest()
	{
		Assert.assertTrue(bandpyramidpage.verifyAvgband());
	}
	
	@Test
	public void verifyBandTest()
	{
		Assert.assertTrue(bandpyramidpage.verifyBandText());
	}
	
	@Test
	public void verifyDistribTest()
	{
		Assert.assertTrue(bandpyramidpage.verifyDistribText());
	}
	
	@Test
	public void verifyHCTest()
	{
		Assert.assertTrue(bandpyramidpage.verifyHCText());
	}
	
	@Test
	public void verifyTotalHCTest()
	{
		Assert.assertTrue(bandpyramidpage.verifyTotalHeadCount());
	}
		
	@Test
	public void verifyExcludeContractorsTest()
	{
		Assert.assertTrue(bandpyramidpage.verifyExcludeContractorstext());
	}
		
	@Test
	public void verifyBandPyramidChartTest()
	{
		Assert.assertTrue(bandpyramidpage.verifybandPyramidChart());
	}
	
	/*@AfterClass
	public void tearDown()
	{
		System.out.println("No of elements verified are: 7");
		
		System.out.println("Bench Pyramid tile execution ended");
		driver.quit();
	}*/
}
