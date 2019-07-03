package com.pld.DynamicText.DashBoard;

import java.io.IOException;
import java.math.BigDecimal;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Util.TestUtil;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UtilizationAPI extends PldTestBase{
	
	@Test
	public void verifyUtilizationAsOf()
	{
		RestAssured.baseURI = prop.getProperty("Util_AsOf");
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
	}

	@Test
	public void verifyUtilizationQTDGraph() throws Exception, Exception
	{
		//String xldata = TestUtil.setData("LaborType");
	    //System.out.println(xldata);
		RestAssured.baseURI = prop.getProperty("Util_QTDGraph");
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldutilizationtile");
		System.out.println(ja_data);
		int length  = ja_data.length();
		//System.out.println(length);
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			//System.out.println(json);
			
			JSONObject qtd = json.getJSONObject("UtilizationData");
			//System.out.println(qtd);
			
			
			JSONArray jarray2 = qtd.getJSONArray("QTD");
			//System.out.println(jarray2);
		
		//BigDecimal type =jarray2.getBigDecimal(length);
		//System.out.println(type);
			int length2 =jarray2.length();
			for(int j=0;j<length2;j++) 
			{
				JSONObject json2 = jarray2.getJSONObject(j);
				BigDecimal target = json2.getBigDecimal("TARGET");
				BigDecimal Actuals = json2.getBigDecimal("ACTUALS");
				BigDecimal Prior = json2.getBigDecimal("PRIOR");
				String Type = json2.getString("TYPE");
				BigDecimal Target_pts = json2.getBigDecimal("TARGET_PTS");
				BigDecimal Ly_pts = json2.getBigDecimal("LY_PTS");
				
				System.out.println("QTD target -->"+target);
				System.out.println("QTD Actuals-->"+Actuals);
				System.out.println("QTD Prior-->"+Prior);
				System.out.println("QTD Type-->"+Type);
				System.out.println("QTD Target_pts-->"+Target_pts);
				System.out.println("QTD Ly_pts-->"+Ly_pts);
			}
			
			JSONArray jarray3 = qtd.getJSONArray("YTD");
			int length3 = jarray3.length();
			for(int k=0;k<length3;k++)
			{
				JSONObject json3 = jarray3.getJSONObject(k);
				BigDecimal target = json3.getBigDecimal("TARGET");
				BigDecimal Actuals = json3.getBigDecimal("ACTUALS");
				BigDecimal Prior = json3.getBigDecimal("PRIOR");
				String Type = json3.getString("TYPE");
				BigDecimal Target_pts = json3.getBigDecimal("TARGET_PTS");
				BigDecimal Ly_pts = json3.getBigDecimal("LY_PTS");
				
				System.out.println("YTD target-->"+target);
				System.out.println("YTD Actuals-->"+Actuals);
				System.out.println("YTD Prior-->"+Prior);
				System.out.println("YTD Type==>"+Type);
				System.out.println("YTD Target-pts-->"+Target_pts);
				System.out.println("YTD Ly-pts-->"+Ly_pts);
			}
				
			
			//String UtilDate = json.getString("UTIL_DATE");
			//System.out.println(UtilDate);
		}
	}
}
