package com.pld.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.CareerTile;
import com.pld.Pages.Loginpage;
import com.pld.Pages.UtilizationPage;

public class CareerTileTest extends PldTestBase{
	
	public static Loginpage loginpage;
	public static UtilizationPage utilizationpage;
	public static CareerTile careertile;

	public CareerTileTest() throws IOException {
		super();
		
	}
	
	/*@BeforeClass
	public void setUp() throws IOException
	{
		System.out.println("Career tile execution started");
		initialization();
		loginpage = new Loginpage();
		utilizationpage = loginpage.pldLogin(prop.getProperty("username"), prop.getProperty("password"));
		careertile =  new CareerTile();
	}*/
	
	@BeforeClass
	public void setUp() throws Exception
	{
		System.out.println("Career tile execution started");
		careertile =  new CareerTile();
	}
	
	@Test
	public void verifyCareerTest()
	{
		Assert.assertTrue(careertile.verifyCareerTile());
	}

	@Test
	public void verifyActualTextTest()
	{
		Assert.assertTrue(careertile.verifyActualText());
	}

	@Test
	public void verifyAverageTextTest()
	{
		Assert.assertTrue(careertile.verifyAverageText());
	}

	@Test
	public void verifyGoalTextTest()
	{
		Assert.assertTrue(careertile.verifyGoalText());
	}

	@Test
	public void verifyOrganicPlacementTest()
	{
		Assert.assertTrue(careertile.verifyOrganicPlacementText());
	}

	@Test
	public void verifyOutliersTextTest()
	{
		Assert.assertTrue(careertile.verifyOutliersText());
	}

	@Test
	public void verifyPromotionsTest()
	{
		Assert.assertTrue(careertile.verifyPromotionsText());
	}

	@Test
	public void verifyTimeInBandTest()
	{
		Assert.assertTrue(careertile.verifyTimeInBandText());
	}

	@Test
	public void verifyYTDAsOfTextTest()
	{
		Assert.assertTrue(careertile.verifyYTDAsOfText());
	}

	/*@AfterClass
	public void tearDown()
	{
		System.out.println("Career tile execution ended");
		driver.quit();
	}*/

	
}
