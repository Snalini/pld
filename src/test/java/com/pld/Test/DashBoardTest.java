package com.pld.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Pages.Dashboardpage;
import com.pld.Util.TestUtil;

public class DashBoardTest extends PldTestBase {
	public Dashboardpage dashboardpage;
	
	
	@BeforeClass
	public void setUp() throws Exception
	{
		 dashboardpage = new Dashboardpage();
	}

	@Test(priority=2)
	public void verifyIBMLogoTest()
	{
		Assert.assertTrue(dashboardpage.verifyIBMLogo());
	}
	
	@Test(priority=1)
	public void verifyDashboardTextTest()
	{
		Assert.assertTrue(dashboardpage.verifyDashboardText());
	}
	
	@Test(priority=3)
	public void verifyIBMConfidentialTextTest()
	{
		Assert.assertTrue(dashboardpage.verifyIBMConfidentialText());
	}
	
	@Test(priority=4)
	public void verifyPersonIconTest()
	{
		Assert.assertTrue(dashboardpage.verifyPersonIcon());
	}
	
	@Test(priority=5)
	public void verifyFilterIconTest()
	{
		Assert.assertTrue(dashboardpage.verifyFilterIcon());
	}
	
	@Test(priority=6)
	public void verifyHelpButtonTest()
	{
		Assert.assertTrue(dashboardpage.verifyHelpbutton());
	}
	@Test(priority=7)
	public void verifyPracticeLeaderTextTest()
	{
		Assert.assertTrue(dashboardpage.verifyPracticeLeaderText());
	}
	@Test(priority=8)
	public void verifyWhiteThemeTest()
	{
		Assert.assertTrue(dashboardpage.verifyWhiteTheme());
	}
	@Test(priority=9)
	public void verifyDarkThemeTest()
	{
		Assert.assertTrue(dashboardpage.verifyDarkTheme());
	}
	
	/*@Test
	public void verifyPortugalLock()
	{
		Assert.assertTrue(dashboardpage.verifyPortugalLock());
	}*/
	
	/*@Test(priority=10)
	
	public void SelectSecurityFilterTest() throws Exception
	{
		dashboardpage.verifyGeographyFilter();
	}*/
	
	/*@Test(priority=11)
	public void verifyLaborPoolFiltersTest() throws Exception
	{
		dashboardpage.verifyLaborPoolFilter();
	}*/
	
	/*@Test(priority=12)
	public void selectionofCPSDeliveryCenterTest() throws Exception
	{
		dashboardpage.verifyLaborPoolType();
	}
	@Test(priority=13)
	public void selectionofCenterOfCompitencyTest() throws Exception
	{
		dashboardpage.verifyLaborPoolType2();
	}
	@Test(priority=14)
	public void selectionofDomesticAffliateTest() throws Exception
	{
		dashboardpage.verifyLaborPoolType3();
	}
	@Test(priority=15)
	public void selectionofDomesticCenterTest() throws Exception
	{
		dashboardpage.verifyLaborPoolType4();
	}
	@Test(priority=16)
	public void selectionofDomesticRegularTest() throws Exception
	{
		dashboardpage.verifyLaborPoolType5();
	}
	@Test(priority=17)
	public void selectionofDomesticSubKTest() throws Exception
	{
		dashboardpage.verifyLaborPoolType6();
	}*/
	/*@DataProvider
	public Object[][] dataProviderMethod() throws IOException, Exception
	{
		Object data[][] = TestUtil.getTestData("LaborType");
		return data;
	}*/
	@Test(priority=18)
	public void selectionofGlobalCenterTest() throws Exception
	{
		//TestUtil.getTestData("LaborType");
		//TestUtil.getTestData1("LaborType");
		//dashboardpage.verifyLaborPoolType7();
	}
	/*@Test(priority=19)
	public void selectionofComboTest() throws Exception
	{
		dashboardpage.verifyCombinationOflaborType();
	}*/
}

