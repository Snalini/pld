package com.pld.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.BenchTile;
import com.pld.Pages.Loginpage;
import com.pld.Pages.UtilizationPage;

public class BenchTileTest extends PldTestBase{
	public Loginpage loginpage;
	public UtilizationPage utilizationpage;
	public BenchTile benchtile;

	public BenchTileTest() throws IOException {
		super();
		
	}
	
	/*@BeforeClass()
	public void setUp() throws IOException {
		System.out.println("Bench Tile Execution started");
		
		loginpage = new Loginpage();
		utilizationpage = loginpage.pldLogin(prop.getProperty("username"), prop.getProperty("password"));
		benchtile = new BenchTile();
		
	}*/
	
	@BeforeClass
	public void setUp() throws Exception
	{
		System.out.println("Bench Tile Execution started");
		benchtile = new BenchTile();
	}
	
	@Test(priority =1)
	public void verifyBenchTileTest()
	{
		Assert.assertTrue(benchtile.verifyBenchTile());
		
		
	}
	
	@Test(priority=2)
	public void verifyGetSkillTest()
	{
		
		Assert.assertTrue(benchtile.getSkillvalues());
	}
	
	@Test(priority=3)
	public void verifySkillsInShortageTest()
	{
		Assert.assertTrue(benchtile.verifySkillsinshortage());
	}
	@Test(priority=4)
	public void verifyMTMTest()
	{
		Assert.assertTrue(benchtile.verifyMTMText());
	}
	@Test(priority=5)
	public void verifyHCTest()
	{
		Assert.assertTrue(benchtile.verifyHCText());
	}
	@Test(priority=6)
	public void verifyCriticalSkillWithExcessTest()
	{
		Assert.assertTrue(benchtile.verifyCriticalskillwithexcessText());
	}
	@Test(priority=7)
	public void verifyBenchMixTest()
	{
		Assert.assertTrue(benchtile.verifyBenchMixText());
	}
	@Test(priority=8)
	public void verifyBenchByDateTest()
	{
		Assert.assertTrue(benchtile.verifyBenchbyDate());
	}
	@Test(priority=9)
	public void verifyAsOfTest()
	{
		Assert.assertTrue(benchtile.verifyAsOfText());
	}
	@Test(priority=10)
	public void verifyAgedBenchTest()
	{
		Assert.assertTrue(benchtile.verifyAgedBenchText());
	}
	@Test(priority=11)
	public void verifyWeekRoll_OffsTest()
	{
		Assert.assertTrue(benchtile.verifyWeekRoll_offsText());
	}
		
	@Test(priority=12)
	public void verifyPercentOfTotTest()
	{
		Assert.assertTrue(benchtile.verifyPercentOfTot());
	}	
	
	@Test(priority=13)
	public void verifyBenchDoughnutChartTest()
	{
		Assert.assertTrue(benchtile.verifyBenchDoughnutChart());
	}
	/*@AfterClass
	public void tearDown()
	{
		
		System.out.println("Bench tile execution ended");
		driver.quit();
	}*/

}
