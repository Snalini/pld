package com.pld.Test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.HiringTilePage;
import com.pld.Pages.Loginpage;
import com.pld.Pages.UtilizationPage;

public class HiringTileTest extends PldTestBase{
	
	public static Loginpage loginpage;
	public static UtilizationPage utilizationpage;
	public static HiringTilePage hiringtilepage;

	public HiringTileTest() throws IOException {
		super();
		

}
	
/*@BeforeClass

public void setUp() throws IOException
{
	System.out.println("Hiring tile execution started");
	initialization();
	loginpage = new Loginpage();
	utilizationpage = loginpage.pldLogin(prop.getProperty("username"), prop.getProperty("password"));
	hiringtilepage = new HiringTilePage();
	
}*/
	
	@BeforeClass
	public void setUp() throws Exception
	{
		System.out.println("Hiring tile execution started");
		hiringtilepage = new HiringTilePage();
	}
@Test
public void verifyHiringTest()
{
	Assert.assertTrue(hiringtilepage.verifyHiringTile());
}
@Test
public void verifyActualTest()
{
	Assert.assertTrue(hiringtilepage.verifyActualText());
}
@Test
public void verifyANOBsTest()
{
	Assert.assertTrue(hiringtilepage.verifyANOBsText());
}
@Test
public void verifyAvg_BandTest()
{
	Assert.assertTrue(hiringtilepage.verifyAvg_BandText());
}
/*@Test
public void verifyDateTest()
{
	Assert.assertTrue(hiringtilepage.verifyDateText());
}*/
@Test
public void verifyEPHPercentTest()
{
	Assert.assertTrue(hiringtilepage.verifyEPHPercent());
}
@Test
public void verifyGoalTest()
{
	Assert.assertTrue(hiringtilepage.verifyGoalText());
}
@Test
public void verifyOpenRequistionsTest()
{
	Assert.assertTrue(hiringtilepage.verifyOpenRequistionsText());
}
@Test
public void verifyYTDAsOfTest()
{
	Assert.assertTrue(hiringtilepage.verifyYTDAsOfText());
}
@Test
public void verifyYTDHiresTest()
{
	Assert.assertTrue(hiringtilepage.verifyYTDHiresText());
}

/*@AfterClass
public void tearDown() {
	System.out.println("Hiring Tile execution ended");
	driver.quit();
}*/

}
