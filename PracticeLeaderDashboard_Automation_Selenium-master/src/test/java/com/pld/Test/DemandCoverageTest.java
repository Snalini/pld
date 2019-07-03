package com.pld.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.DemandCoverage;
import com.pld.Pages.Loginpage;
import com.pld.Pages.UtilizationPage;

public class DemandCoverageTest extends PldTestBase{
	
public static Loginpage loginpage;
public static UtilizationPage utilizationpage;
public static DemandCoverage demandcoveragepage;

	public DemandCoverageTest() throws IOException {
		super();
		
	}
	
	/*@BeforeClass
	
	public void setUp() throws IOException
	{
		System.out.println("DemandCoverage tile execution started");
		initialization();
		loginpage = new Loginpage();
		utilizationpage = loginpage.pldLogin(prop.getProperty("username"), prop.getProperty("password"));
		demandcoveragepage = new DemandCoverage();
	}*/
	
	@BeforeClass
	public void setUp() throws Exception
	{
		System.out.println("DemandCoverage tile execution started");
		demandcoveragepage = new DemandCoverage();
	}
	@Test
	public void verifyDemandCoverageTileTest()
	{
		Assert.assertTrue(demandcoveragepage.verifyDemandCoverageTile());
		
		
}
	@Test
	public void verifyTCVCoverageTest()
	{
		Assert.assertTrue(demandcoveragepage.verifyTCVCoverageText());
	}
	
	@Test 
	public void verifyTotalDealsTest()
	{
		Assert.assertTrue(demandcoveragepage.verifyTotalDealsText());
	}
	
	@Test 
	public void verifyWithInThresholdTest()
	{
		Assert.assertTrue(demandcoveragepage.verifyWithInThresholdText());
	}
	
	@Test 
	public void verifyWithNpPlansTest()
	{
		Assert.assertTrue(demandcoveragepage.verifyWithNoPlansText());
	}
	@Test 
	public void verifyNpPlansReqTest()
	{
		Assert.assertTrue(demandcoveragepage.verifyNoPlansReqText());
	}
	@Test 
	public void verifyWithPlansTest()
	{
		Assert.assertTrue(demandcoveragepage.verifyWithPlans());
	}
	@Test 
	public void verifyDemandCoverageChartTest()
	{
		Assert.assertTrue(demandcoveragepage.verifyDemandCoverageChart());
	}
	
	/*@AfterClass
	public void tearDown()
	{
		driver.quit();
	}*/
	
}

