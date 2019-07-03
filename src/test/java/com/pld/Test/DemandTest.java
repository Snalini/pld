package com.pld.Test;

import java.io.IOException;
import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.DemandPage;
import com.pld.Pages.Loginpage;
import com.pld.Pages.UtilizationPage;

public class DemandTest extends PldTestBase{
	
	public Loginpage loginpage;
	public UtilizationPage utilizationpage;
	public DemandPage demandpage;

	public DemandTest() throws IOException {
		super();
		
	}
	
	/*@BeforeClass
	public void setUp() throws IOException
	{
		
		System.out.println("Demand Tile execution started");
		initialization();
		loginpage = new Loginpage();
		utilizationpage = loginpage.pldLogin(prop.getProperty("username"), prop.getProperty("password"));
		demandpage = new DemandPage();
		
	}*/
	
	@BeforeClass
	public void setUp() throws Exception
	{
		System.out.println("Demand Tile execution started");
		demandpage = new DemandPage();
	}
	
	
	@Test
	public void verifyDemandTileTest()
	{
		Assert.assertTrue(demandpage.verifyDemandTile());
		
	}
	@Test
	public void verifyBacklogTest()
	{
		Assert.assertTrue(demandpage.verifyBacklogText());
	}
	/*@Test
	public void verifyCEandD_IBM_InteractiveTest()
	{
		Assert.assertTrue(demandpage.verifyCEandD_IBM_InteractiveText());
	}*/
	@Test
	public void verifyCommitTest()
	{
		Assert.assertTrue(demandpage.verifyCommitText());
	}
	/*@Test
	public void verifyJavaAndWebDevTest()
	{
		
		Assert.assertTrue(demandpage.verifyJavaAndWebDevtext());
	}
	@Test
	public void verifyNotApplicableTest()
	{
		Assert.assertTrue(demandpage.verifyNotApplicableText());
	}*/
	@Test
	public void verifyOpenPositionsTest()
	{
		
		Assert.assertTrue(demandpage.verifyOpenPositionsText());
	}
	@Test
	public void verifyOpptyTest()
	{
		Assert.assertTrue(demandpage.verifyOpptyText());
	}
	@Test
	public void verifyUnassignedTest()
	{
		Assert.assertTrue(demandpage.verifyUnassignedText());
		
		
		
	}
	
	@Test
	public void verifyDemandbarChartTest()
	{
		Assert.assertTrue(demandpage.verifyDemand_barchart());
		
		
		
	}
	
	@Test
	public void verifyDemandChartTest()
	{
		Assert.assertTrue(demandpage.verifyDemandChart());
		
		
		
	}
	
	/*@AfterClass
	public void tearDown()
	{
		System.out.println("No of elements executed are : 9");
		
		System.out.println("Demand Tile execution ended");
		driver.quit();
	}*/

}
