package com.pld.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.GapExpansion;

public class GapTileExpTest extends PldTestBase{
	GapExpansion gapexpansion;
	
	@BeforeClass
	public void setUp()
	{
		gapexpansion = new GapExpansion();
	}
	
	@Test(priority=1)
	public void clickOnGapTileTest()
	{
		gapexpansion.clickOnGapTile();
	}
	
	@Test(priority=2)
	public void verifyGapTrendTest()
	{
		Assert.assertTrue(gapexpansion.verifygapTrend());
	}

	@Test(priority=3)
	public void verifyTopShortages_TOTHCTest()
	{
		Assert.assertTrue(gapexpansion.verifyTopShortges_TOTHC());
	}
	@Test(priority=4)
	public void verifyTopShortages_ViewTest()
	{
		Assert.assertTrue(gapexpansion.verifyTopShortages_View());
	}
	@Test(priority=5)
	public void verifyTopShortages_SubkHCTest()
	{
		Assert.assertTrue(gapexpansion.verifyTopShortages_SubKHC());
	}
	@Test(priority=6)
	public void verifyTopShortages_CurrentGapTest()
	{
		Assert.assertTrue(gapexpansion.verifyTopShortages_CurrentGap());
	}
	@Test(priority=7)
	public void verifyTopShortagesTest()
	{
		Assert.assertTrue(gapexpansion.verifyTopShortages());
	}
	@Test(priority=8)
	public void verifyTopExcesses_TOTHCTest()
	{
		Assert.assertTrue(gapexpansion.verifyTopExcesses_TOTHC());
	}
	@Test(priority=9)
	public void verifyTopExcesses_SubkHCTest()
	{
		Assert.assertTrue(gapexpansion.verifyTopExcesses_SubkHC());
	}
	@Test(priority=10)
	public void verifyTopExcesses_CurrentGApTest()
	{
		Assert.assertTrue(gapexpansion.verifyTopExcesses_Currentgap());
	}
	@Test(priority=11)
	public void verifyTopExcess_viewTest()
	{
		Assert.assertTrue(gapexpansion.verifyTopExcess_View());
	}
	@Test(priority=12)
	public void verifyTopExcessTest()
	{
		Assert.assertTrue(gapexpansion.verifyTopExcess());
	}
	@Test(priority=13)
	public void verifySupplyAndDemandTest()
	{
		Assert.assertTrue(gapexpansion.verifySupplyAndDemand());
	}
	@Test(priority=14)
	public void verifySupply_TotalTest()
	{
		Assert.assertTrue(gapexpansion.verifySupply_Total());
	}
	
	@Test(priority=15)
	public void verifyRollOffsAndbenchTest()
	{
		Assert.assertTrue(gapexpansion.verifyRollOffsAndBench());
	}
	@Test(priority=16)
	public void verifyOtherTest()
	{
		Assert.assertTrue(gapexpansion.verifyOther());
	}
	@Test(priority=17)
	public void verifyOppyTest()
	{
		Assert.assertTrue(gapexpansion.verifyOppy());
	}
	@Test(priority=18)
	public void verifyMonthTest()
	{
		Assert.assertTrue(gapexpansion.verifyMonth());
	}
	@Test(priority=19)
	public void verifyDepartTest()
	{
		Assert.assertTrue(gapexpansion.verifyDepart());
	}
	@Test(priority=20)
	public void verifyDemandOpenPositionsTest()
	{
		Assert.assertTrue(gapexpansion.verifyDemandOpenPosiitons());
	}
	@Test(priority=21)
	public void verifyDemand_TotalTest()
	{
		Assert.assertTrue(gapexpansion.verifyDemand_Total());
	}
	@Test(priority=22)
	public void verifyComtdTest()
	{
		Assert.assertTrue(gapexpansion.verifyComtd());
	}
	@Test(priority=23)
	public void verifyAvailableSupplyTest()
	{
		Assert.assertTrue(gapexpansion.verifyAvailableSupply());
	}
	@Test(priority=24)
	public void verifyANOBsTest()
	{
		Assert.assertTrue(gapexpansion.verifyANOBs());
	}
	
	@Test(priority=25)
	public void clickondashboard()
	{
		gapexpansion.clickOnDashBoard();
	}
	
}
