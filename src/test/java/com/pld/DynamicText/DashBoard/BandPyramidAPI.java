package com.pld.DynamicText.DashBoard;

import java.math.BigDecimal;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BandPyramidAPI {
	
	@Test
	public void verifyBandPyramidAsOf()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldPCAsof/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpcasof");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String PyramidDate = json.getString("PYRAMID_DATE");
			System.out.println(PyramidDate);
		}
	}

	
	@Test
	public void verifyBandPyramidChart()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldPCBandPyramid";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject BPChart= new JSONObject(responsebody);
		JSONObject band_0 = BPChart.getJSONObject("Pldpcbandpyramid");
		
		//System.out.println(band_0);
		
		JSONObject Avgband = band_0.getJSONObject("AVG_BAND");
		//System.out.println(Avgband);
		BigDecimal HeadQuantity = Avgband.optBigDecimal("HEADCNT_QTY", null);
		String Band = Avgband.getString("BAND");
		System.out.println(HeadQuantity);
		System.out.println(Band);
		
		JSONObject TotalHeadcount = band_0.getJSONObject("TOTAL_HC");
		//System.out.println(TotalHeadcount);
		BigDecimal Hedqty = TotalHeadcount.optBigDecimal("HEADCNT_QTY", null);
		String HC_Band = TotalHeadcount.getString("BAND");
		System.out.println(Hedqty);
		System.out.println(HC_Band);
		
		JSONObject OutOfPositions = band_0.getJSONObject("OUT_OF_POSITION");
		//System.out.println(TotalHeadcount);
		BigDecimal OOP_Head_Qty = OutOfPositions.optBigDecimal("HEADCNT_QTY", null);
		String OOP_Band = OutOfPositions.getString("BAND");
		System.out.println(OOP_Head_Qty);
		System.out.println(OOP_Band);
		
		JSONObject AvgBandGoal = band_0.getJSONObject("AVG_BAND_GOAL");
		//System.out.println(TotalHeadcount);
		BigDecimal ABG_Head_Qty = AvgBandGoal.optBigDecimal("HEADCNT_QTY", null);
		String ABG_Band = AvgBandGoal.getString("BAND");
		System.out.println(ABG_Head_Qty);
		System.out.println(ABG_Band);
		
		JSONArray band = band_0.getJSONArray("BANDS");
		//System.out.println(band);
		int length = band.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = band.getJSONObject(i);
			String HCTotalGoal = json.optString("HC_TOTAL_GOAL");
			int HCTotal = json.getInt("HC_TOTAL");
			String Band_band = json.getString("BAND");
			System.out.println(HCTotalGoal);
			System.out.println(HCTotal);
			System.out.println(Band_band);
			
			JSONArray sub_band = json.getJSONArray("SUB_BANDS");
			//System.out.println(sub_band);
			int length2 = sub_band.length();
			for(int j=0;j<length2;j++)
			{
				JSONObject json2 =sub_band.getJSONObject(j);
				BigDecimal HeadC_qty = json2.optBigDecimal("HEADCNT_QTY", null);
				BigDecimal Sub_Band_Avg_Headcnt_per = json2.getBigDecimal("SUB_BAND_AVG_HEADCNT_PCT");
				int gap = json2.getInt("GAP");
				String subBand = json2.getString("SUB_BAND");
				int band_avg_headcnt_pct_goal = json2.optInt("BAND_AVG_HEADCNT_PCT_GOAL");
				BigDecimal Band_Avg_Headcnt_pct = json2.getBigDecimal("BAND_AVG_HEADCNT_PCT");
				
				System.out.println(HeadC_qty);
				System.out.println(Sub_Band_Avg_Headcnt_per);
				System.out.println(gap);
				System.out.println(subBand);
				System.out.println(band_avg_headcnt_pct_goal);
				System.out.println(Band_Avg_Headcnt_pct);
				
				
			}
			
			
			
		}
		
		
	}
}
