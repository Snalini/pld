package com.pld.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.CareerExp;

public class CareerExpTest extends PldTestBase{
	
	public  CareerExp careerexp;
	@BeforeClass
	public void setUp()
	{
		careerexp  = new CareerExp();
	}
	
	@Test(priority=1)
	public void clickOnCareerExpTileTest()
	{
		careerexp.clickOnCareerTile();
	}
	
	@Test(priority =2,dependsOnMethods = "clickOnCareerExpTileTest")
	public void verifyBandMixTrendTest()
	{
		Assert.assertTrue(careerexp.verifyBandMixTrend());
	}

	@Test(priority=3)
	public void verifyXfrsOutTextTest()
	{
		Assert.assertTrue(careerexp.verifyXfrsOutText());
	}
	@Test(priority=4)
	public void verifyXfrsOutTest()
	{
		Assert.assertTrue(careerexp.verifyXfrsOut());
	}
	@Test(priority=5)
	public void verifyXfrsInTextTest()
	{
		Assert.assertTrue(careerexp.verifyXfrsInText());
	}
	@Test(priority=6)
	public void verifyXfrsInTest()
	{
		Assert.assertTrue(careerexp.verifyXfrsIn());
	}
	@Test(priority=7)
	public void verifyPromoOutTextTest()
	{
		Assert.assertTrue(careerexp.verifyPromoOutText());
	}
	@Test(priority=8)
	public void verifyPromoOutTest()
	{
		Assert.assertTrue(careerexp.verifyPromoOut());
	}
	@Test(priority=9)
	public void verifyPromoInTextTest()
	{
		Assert.assertTrue(careerexp.verifyPromoInText());
	}
	@Test(priority=10)
	public void verifyPromoInTest()
	{
		Assert.assertTrue(careerexp.verifyPromoIn());
	}
	@Test(priority=11)
	public void verifyProfHiresTextTest()
	{
		Assert.assertTrue(careerexp.verifyProfHiresText());
	}
	@Test(priority=12)
	public void verifyProfHiresTest()
	{
		Assert.assertTrue(careerexp.verifyProfHires());
	}
	@Test(priority=13)
	public void verifyOtherTextTest()
	{
		Assert.assertTrue(careerexp.verifyOtherText());
	}
	@Test(priority=14)
	public void verifyOtherAddsTextTest()
	{
		Assert.assertTrue(careerexp.verifyOtherAddsText());
	}
	@Test(priority=15)
	public void verifyOtherAddsTest()
	{
		Assert.assertTrue(careerexp.verifyOtherAdds());
	}
	@Test(priority=16)
	public void verifyOtherTest()
	{
		Assert.assertTrue(careerexp.verifyOther());
	}
	@Test(priority=17)
	public void verifyAverageTimeInBandTest()
	{
		Assert.assertTrue(careerexp.verifyHeader_AverageTimeInBand());
	}
	@Test(priority=18)
	public void verifyguideLineTest()
	{
		Assert.assertTrue(careerexp.verifyguideline());
	}
	@Test(priority=19)
	public void verifyEPHTextTest()
	{
		Assert.assertTrue(careerexp.verifyEPHText());
	}
	@Test(priority=20)
	public void verifyEPHTest()
	{
		Assert.assertTrue(careerexp.verifyEPH());
	}
	@Test(priority=21)
	public void verifyEISTextTest()
	{
		Assert.assertTrue(careerexp.verifyEISText());
	}
	@Test(priority=22)
	public void verifyEISTest()
	{
		Assert.assertTrue(careerexp.verifyEIS());
	}
	@Test(priority=23)
	public void verifyBandTextTest()
	{
		Assert.assertTrue(careerexp.verifyBandText());
	}
	@Test(priority=24)
	public void verifyBandOutliersTest()
	{
		Assert.assertTrue(careerexp.verifyBandOutliers());
	}
	@Test(priority=25)
	public void verifyBandTest()
	{
		Assert.assertTrue(careerexp.verifyBand());
	}
	@Test(priority=26)
	public void verifyAvgTimeInbandTest()
	{
		Assert.assertTrue(careerexp.verifyAvgTimeInBand());
	}
	@Test(priority=27)
	public void verifyAverageBandTest()
	{
		Assert.assertTrue(careerexp.verifyAverageband());
	}
	@Test(priority=28)
	public void verifyBandMixTrendChartTest()
	{
		Assert.assertTrue(careerexp.verifyCareer_BandMixTrendChart());
	}
	@Test(priority=29)
	public void verifyAddsAndLossesChartTest()
	{
		Assert.assertTrue(careerexp.verifyAddsAndLossesChart());
	}
	/*@Test(priority=28)
	public void verifyAddsandLossesTextTest()
	{
		Assert.assertTrue(careerexp.verifyAddsAndLossesText());
	}
	@Test(priority=29)
	public void verifyAddsandLossesTest()
	{
		Assert.assertTrue(careerexp.verifyAddsandLosses());
	}*/
	@Test(priority=30,dependsOnMethods="verifyBandMixTrendTest")
	public void clickOnDashBoardTest()
	{
		careerexp.clickOnDashBoardText();
	}
	
}
