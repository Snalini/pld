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
import com.pld.Pages.FTEbyContractCodingTile;
import com.pld.Pages.Loginpage;
import com.pld.Pages.UtilizationPage;

public class FTEbyContractCoadingTest extends PldTestBase {
	public Loginpage loginpage;
	public UtilizationPage utilizationpage;
	public FTEbyContractCodingTile ftebycontractcoading;

	public FTEbyContractCoadingTest() throws IOException {
		super();
		
	}
	
	/*@BeforeClass
	public void setUp() throws IOException
	{
		System.out.println("FTE By Contract Coading tile execution started");
		initialization();
		loginpage = new Loginpage();
		utilizationpage = loginpage.pldLogin(prop.getProperty("username"), prop.getProperty("password"));
		ftebycontractcoading = new FTEbyContractCodingTile();
		
		
	}*/
	
	@BeforeClass
	public void setUp() throws Exception
	{
		System.out.println("FTE By Contract Coading tile execution started");
		ftebycontractcoading = new FTEbyContractCodingTile();
	}

	@Test
	public void verifyFTETileTest()
	{
		Assert.assertTrue(ftebycontractcoading.verifyFTEbyContractCodingTile());
	}
	@Test
	public void verifyCAITest()
	{
		Assert.assertTrue(ftebycontractcoading.verifyCAIText());
	}
	@Test
	public void verifyCPTTest()
	{
		Assert.assertTrue(ftebycontractcoading.verifyCPTText());
	}
	@Test
	public void verifyDSandiXTest()
	{
		Assert.assertTrue(ftebycontractcoading.verifyDSandiXText());
	}
	@Test
	public void verifyADMITest()
	{
	ftebycontractcoading.verifyADMIText();
	}
	@Test
	public void verifyCAMSTest()
	{
		ftebycontractcoading.verifyCAMSText();
		
	}
	
	@Test
	public void verifyFTEByContractCodingDoughnutChartTest()
	{
		Assert.assertTrue(ftebycontractcoading.verifyFTEbyContractCodingDoughnutChart());
		
	}
	/*@AfterClass
	public void tearDown()
	
	{
		System.out.println("No of elements executed are: 6");
		System.out.println("FTE by Contract Coading tile execution ended");
		driver.quit();
	}*/
}
