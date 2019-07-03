package com.pld.Test;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;

import com.pld.Pages.Loginpage;
import com.pld.Pages.UtilizationPage;
import com.pld.Util.TestUtil;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class VerifyUtilizationTest extends PldTestBase{
	
	public Loginpage loginpage;
	public UtilizationPage utilizationpage;
	WebElement TipValue;


	
	/*@BeforeClass()
	public void setUp() throws IOException {
		System.out.println("Bench Tile Execution started");
		initialization();
		loginpage = new Loginpage();
		utilizationpage = loginpage.pldLogin(prop.getProperty("username"), prop.getProperty("password"));
	}*/
	public VerifyUtilizationTest() throws IOException {
		super();
		
	}
	@BeforeClass
	public void setUp() throws Exception
	{
		System.out.println("Utilization Tile Execution started");
		utilizationpage =new UtilizationPage();
	}

	
	@Test(priority =1)
	public void verifyUtiltile()
	{ 
		
		
		if((utilizationpage.verifyUtilTile())==true)
		{
			System.out.println("User is in Util tile");
		
		}else {
			
			   System.out.println("User in other tile");
			   
		}
		utilizationpage.getTextValue();
		
	}
	
	
	@Test(priority =2)
	public void verifyActText()
	{
		TestUtil.captureScreenShot("Utilization Tile");
		Assert.assertTrue(utilizationpage.verifyUtilTileActtext());
	}
	
	@Test(priority=3)
	public void verifyTargettext()
	{
		Assert.assertTrue(utilizationpage.verifyUtilTileTargettext());
	}
	
	@Test(priority=4)
	public void verifyYTYtext()
	{
		Assert.assertTrue(utilizationpage.verifyUtilTileYTYtext());
	}
	@Test(priority=5)
	public void verifyPrioritytext()
	{
		Assert.assertTrue(utilizationpage.verifyUtilTilePrioritytext());
	}
    @Test(priority=6)
	public void verifyBillabletext()
	{
		Assert.assertTrue(utilizationpage.verifyUtilTileBillabletext());
	}
	@Test(priority=7)
	public void verifyChargetext()
	{
		Assert.assertTrue(utilizationpage.verifyUtilTileChargetext());
		
	}

	@Test(priority=8)
	public void verifyTargetUtilizationTest()
	{
		Assert.assertTrue(utilizationpage.verifyTargetUtilizationText());
		
	}
	
	@Test(priority=9)
	public void verifyUtilBarGraph()
	{
		Assert.assertTrue(utilizationpage.verifyUtilBarGraph());
	}
	
	/*@Test(priority=10)
	public void verifyUtilizationAsOf() throws Exception
	{
		String URL = TestUtil.setData("LaborType");
	    System.out.println(URL);
		RestAssured.baseURI = prop.getProperty("Util_AsOf",URL);
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		 JSONObject jsonobj = new JSONObject(responsebody);
			JSONArray ja_data = jsonobj.getJSONArray("Pldutilasof");
			int length  = ja_data.length();
			for(int i=0;i<length;i++)
			{
				JSONObject json = ja_data.getJSONObject(i);
				String UtilDate = json.getString("UTIL_DATE");
				System.out.println("UtilDate asOf is-->"+UtilDate);
			}
	}*/
	
}
