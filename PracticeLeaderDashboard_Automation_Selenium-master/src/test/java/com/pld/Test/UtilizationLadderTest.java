package com.pld.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.BenchTile;
import com.pld.Pages.Loginpage;
import com.pld.Pages.UtilizationLadder;
import com.pld.Pages.UtilizationPage;

public class UtilizationLadderTest extends PldTestBase {
	public Loginpage loginpage;
	public UtilizationPage utilizationpage;
	public UtilizationLadder utilladTile;
	
	public UtilizationLadderTest() throws IOException {
		super();
		
	}

	/*@BeforeClass
	
		public void setUp() throws IOException {
		System.out.println("Utilization Ladder tile execution started");
			
			loginpage = new Loginpage();
			utilizationpage = loginpage.pldLogin(prop.getProperty("username"), prop.getProperty("password"));
			utilladTile = new UtilizationLadder();
	}*/
	
	@BeforeClass
	public void setUp() throws Exception
	{
		System.out.println("Utilization Ladder tile execution started");
		utilladTile = new UtilizationLadder();
	}

	@Test
	public void verifyUtilLadTest()
	{
		Assert.assertTrue(utilladTile.verifyUtilLadTile());
	}
	@Test
	public void verifyChargeableHCTest()
	{
		Assert.assertTrue(utilladTile.verifyChargeableHCText());
	}
	@Test
	public void verifyAbove100Percent()
	{
		Assert.assertTrue(utilladTile.verifyAbove100PercentText());
	}
	
	@Test
	public void verifyQTDAsOfTest()
	{
		Assert.assertTrue(utilladTile.verifyQTDasofText());
	}
	
	@Test
	public void verifyUtilLadChartTest()
	{
		Assert.assertTrue(utilladTile.verifyUtilladchart());
	}
	
	/*@AfterClass
	public void tearDown()
	{
		System.out.println("Utilization Ladder tile execution ended");
		
		System.out.println("No of elements executed are: 3");
		driver.quit();
	}*/
}
