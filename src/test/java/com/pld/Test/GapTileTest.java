package com.pld.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.GapTilePage;
import com.pld.Pages.Loginpage;
import com.pld.Pages.UtilizationPage;

public class GapTileTest extends PldTestBase{
	public static Loginpage loginpage;
	public static UtilizationPage utilizationpage;
	public static GapTilePage gaptilepage;


	public GapTileTest() throws IOException {
		super();


	}

	/*@BeforeClass
	
		public void setUp() throws IOException
		{
			System.out.println("Gap tile execution started");
			initialization();
			loginpage = new Loginpage();
			utilizationpage = loginpage.pldLogin(prop.getProperty("username"), prop.getProperty("password"));
			
	}*/
	
	@BeforeClass
	public void setUp() throws Exception
	{
		System.out.println("Gap tile execution started");
		gaptilepage = new GapTilePage();
	}
	
	@Test
	public void verifyGapTest()
	{
		Assert.assertTrue(gaptilepage.verifyGapTile());
	}
	
	@Test
	public void verifyCurrentTest()
	{
		Assert.assertTrue(gaptilepage.verifyCurrentText());
	}
	@Test
	public void verifyExcessTest()
	{
		Assert.assertTrue(gaptilepage.verifyExcessestext());
	}
	
	@Test
	public void verifyNetgapTest()
	{
		gaptilepage.verifyNetGap();
	}
	
	@Test
	public void verifyShortagesTest()
	{
		Assert.assertTrue(gaptilepage.verifyShortages());
	}
	
	@Test
	public void verifyTextAsOfTest()
	{
		Assert.assertTrue(gaptilepage.verifyTextAsOf());
	}
	
	
	@Test
	public void verifyGapChartTest()
	{
		Assert.assertTrue(gaptilepage.verifyGapChart());
	}
	
	/*@AfterClass
	public void tearDown()
	{
		System.out.println("Gap tile execution ended");
		driver.quit();
	}*/
}
