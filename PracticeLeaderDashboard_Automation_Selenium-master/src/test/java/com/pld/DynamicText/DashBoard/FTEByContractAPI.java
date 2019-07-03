package com.pld.DynamicText.DashBoard;

import java.math.BigDecimal;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FTEByContractAPI {
	
	@Test
	public void verifyLabourAsOf()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldLaborDistAsof";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldlabordistasof");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String TrainingDate = json.getString("TRAINING_DATE");
			System.out.println("Training Date as of-->  "+TrainingDate);
			
		}
	}
	
	@Test
	public void verifyDistributionChart()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldLaborDistDashboardFTE";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray jsonarray = jsonobj.getJSONArray("Pldlabordistdashboardfte");
		//System.out.println(jsonarray);
		int length = jsonarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = jsonarray.getJSONObject(i);
			if(json.has("GP_GRP_1"))
			{
				JSONObject GpGRP1 = json.getJSONObject("GP_GRP_1");
				BigDecimal  GpGRP1_FtePerc= GpGRP1.getBigDecimal("FTE_PERC");
				String GpGRP1_Category = GpGRP1.getString("CATEGORY");
				BigDecimal  GpGRP1_Fte= GpGRP1.getBigDecimal("FTE");
				String GpGRP1_color = GpGRP1.getString("COLOR");
				String GpGRP1_Abbrv = GpGRP1.getString("ABBRV");
				String GpGRP1_HC = GpGRP1.optString("HC");
				
				System.out.println("GpGRP1_FtePerc -->" +GpGRP1_FtePerc);
				System.out.println("GpGRP1_Category -->" +GpGRP1_Category);
				System.out.println("GpGRP1_Fte -->"+GpGRP1_Fte);
				System.out.println("GpGRP1_color -->"+GpGRP1_color);
				System.out.println("GpGRP1_Abbrv -->"+GpGRP1_Abbrv);
				System.out.println("GpGRP1_HC -->"+GpGRP1_HC);
				
				JSONArray GpGRP1_servicelines = GpGRP1.getJSONArray("service_lines");
				int length2 = GpGRP1_servicelines.length();
				for(int j=0;j<length2;j++)
				{
					JSONObject servicelines = GpGRP1_servicelines.getJSONObject(j);
					BigDecimal servicelines_fteperc = servicelines.getBigDecimal("FTE_PERC");
					String servicelines_category = servicelines.getString("CATEGORY");
					BigDecimal servicelines_fte = servicelines.getBigDecimal("FTE");
					//String servicelines_color = servicelines.getString("COLOR");
					String servicelines_Abbrv = servicelines.getString("ABBRV");
					String servicelines_HC = servicelines.optString("HC");
					
					System.out.println("servicelines_fteperc -->"+servicelines_fteperc);
					System.out.println("servicelines_category -->"+servicelines_category);
					System.out.println("servicelines_fte -->"+servicelines_fte);
					//System.out.println(servicelines_color);
					System.out.println("servicelines_Abbrv -->"+servicelines_Abbrv);
					System.out.println("servicelines_HC -->"+servicelines_HC);
					
				}
				
			}
				if(json.has("GP_GRP_2"))
				{
					JSONObject GpGRP2 = json.getJSONObject("GP_GRP_2");
					BigDecimal  GpGRP2_FtePerc= GpGRP2.getBigDecimal("FTE_PERC");
					String GpGRP2_Category = GpGRP2.getString("CATEGORY");
					BigDecimal  GpGRP2_Fte= GpGRP2.getBigDecimal("FTE");
					String GpGRP2_color = GpGRP2.getString("COLOR");
					String GpGRP2_Abbrv = GpGRP2.getString("ABBRV");
					String GpGRP2_HC = GpGRP2.optString("HC");
					
					System.out.println("GpGRP2_FtePerc -->"+GpGRP2_FtePerc);
					System.out.println("GpGRP2_Category -->"+GpGRP2_Category);
					System.out.println("GpGRP2_Fte -->"+GpGRP2_Fte);
					System.out.println("GpGRP2_color--> "+GpGRP2_color);
					System.out.println("GpGRP2_Abbrv -->"+GpGRP2_Abbrv);
					System.out.println("GpGRP2_HC -->" +GpGRP2_HC);
					
					JSONArray GpGRP2_servicelines = GpGRP2.getJSONArray("service_lines");
					int length3 = GpGRP2_servicelines.length();
					for(int k=0;k<length3;k++)
					{
						JSONObject servicelines = GpGRP2_servicelines.getJSONObject(k);
						BigDecimal servicelines_fteperc = servicelines.getBigDecimal("FTE_PERC");
						String servicelines_category = servicelines.getString("CATEGORY");
						BigDecimal servicelines_fte = servicelines.getBigDecimal("FTE");
						//String servicelines_color = servicelines.getString("COLOR");
						String servicelines_Abbrv = servicelines.getString("ABBRV");
						String servicelines_HC = servicelines.optString("HC");
						
						System.out.println("servicelines_fteperc -->"+servicelines_fteperc);
						System.out.println("servicelines_category -->"+servicelines_category);
						System.out.println("servicelines_fte -->"+servicelines_fte);
						//System.out.println(servicelines_color);
						System.out.println("servicelines_Abbrv--> "+servicelines_Abbrv);
						System.out.println("servicelines_HC -->"+servicelines_HC);
						
					}
			}
			
				if(json.has("GP_GRP_3"))
				{
					JSONObject GpGRP3 = json.getJSONObject("GP_GRP_3");
					BigDecimal  GpGRP3_FtePerc= GpGRP3.getBigDecimal("FTE_PERC");
					String GpGRP3_Category = GpGRP3.getString("CATEGORY");
					BigDecimal  GpGRP3_Fte= GpGRP3.getBigDecimal("FTE");
					String GpGRP3_color = GpGRP3.getString("COLOR");
					String GpGRP3_Abbrv = GpGRP3.getString("ABBRV");
					String GpGRP3_HC = GpGRP3.optString("HC");
					
					System.out.println("GpGRP3_FtePerc -->"+GpGRP3_FtePerc);
					System.out.println("GpGRP3_Category--> "+GpGRP3_Category);
					System.out.println("GpGRP3_Fte -->"+GpGRP3_Fte);
					System.out.println("GpGRP3_color--> "+GpGRP3_color);
					System.out.println("GpGRP3_Abbrv--> "+GpGRP3_Abbrv);
					System.out.println("GpGRP3_HC--> "+GpGRP3_HC);
					
					JSONArray GpGRP3_servicelines = GpGRP3.getJSONArray("service_lines");
					int length4 = GpGRP3_servicelines.length();
					for(int l=0;l<length4;l++)
					{
						JSONObject servicelines = GpGRP3_servicelines.getJSONObject(l);
						BigDecimal servicelines_fteperc = servicelines.getBigDecimal("FTE_PERC");
						String servicelines_category = servicelines.getString("CATEGORY");
						BigDecimal servicelines_fte = servicelines.getBigDecimal("FTE");
						//String servicelines_color = servicelines.getString("COLOR");
						String servicelines_Abbrv = servicelines.getString("ABBRV");
						String servicelines_HC = servicelines.optString("HC");
						
						System.out.println("servicelines_fteperc--> "+servicelines_fteperc);
						System.out.println("servicelines_category--> "+servicelines_category);
						System.out.println("servicelines_fte--> "+servicelines_fte);
						//System.out.println(servicelines_color);
						System.out.println("servicelines_Abbrv--> "+servicelines_Abbrv);
						System.out.println("servicelines_HC -->"+servicelines_HC);
						
					}
			}
			
				if(json.has("GP_GRP_OTHER"))
				{
					JSONObject GpGrpOther = json.getJSONObject("GP_GRP_OTHER");
					BigDecimal  GpGrpOther_FtePerc= GpGrpOther.getBigDecimal("FTE_PERC");
					String GpGrpOther_Category = GpGrpOther.getString("CATEGORY");
					BigDecimal  GpGrpOther_Fte= GpGrpOther.getBigDecimal("FTE");
					String GpGrpOther_color = GpGrpOther.getString("COLOR");
					String GpGrpOther_Abbrv = GpGrpOther.getString("ABBRV");
					String GpGrpOther_HC = GpGrpOther.optString("HC");
					
					System.out.println("GpGrpOther_FtePerc--> "+GpGrpOther_FtePerc);
					System.out.println("GpGrpOther_Category--> "+GpGrpOther_Category);
					System.out.println("GpGrpOther_Fte -->"+GpGrpOther_Fte);
					System.out.println("GpGrpOther_color--> "+GpGrpOther_color);
					System.out.println("GpGrpOther_Abbrv -->"+GpGrpOther_Abbrv);
					System.out.println("GpGrpOther_HC -->"+GpGrpOther_HC);
					
					JSONArray GpGrpOther_servicelines = GpGrpOther.getJSONArray("service_lines");
					int length5 = GpGrpOther_servicelines.length();
					for(int m=0;m<length5;m++)
					{
						JSONObject servicelines = GpGrpOther_servicelines.getJSONObject(m);
						BigDecimal servicelines_fteperc = servicelines.getBigDecimal("FTE_PERC");
						String servicelines_category = servicelines.getString("CATEGORY");
						BigDecimal servicelines_fte = servicelines.getBigDecimal("FTE");
						//String servicelines_color = servicelines.getString("COLOR");
						String servicelines_Abbrv = servicelines.getString("ABBRV");
						String servicelines_HC = servicelines.optString("HC");
						
						System.out.println("servicelines_fteperc -->"+servicelines_fteperc);
						System.out.println("servicelines_category -->"+servicelines_category);
						System.out.println("servicelines_fte--> "+servicelines_fte);
						//System.out.println(servicelines_color);
						System.out.println("servicelines_Abbrv--> "+servicelines_Abbrv);
						System.out.println("servicelines_HC--> "+servicelines_HC);
						
					}
				}
				
				if(json.has("TOTAL"))
				{
					JSONObject Total = json.getJSONObject("TOTAL");
					BigDecimal  Total_FtePerc= Total.getBigDecimal("FTE_PERC");
					String Total_Category = Total.getString("CATEGORY");
					BigDecimal  Total_Fte= Total.getBigDecimal("FTE");
					String Total_Abbrv = Total.getString("ABBRV");
					String Total_HC = Total.optString("HC");
					
					System.out.println("Total_FtePerc -->"+Total_FtePerc);
					System.out.println("Total_Category -->"+Total_Category);
					System.out.println("Total_Fte--> "+Total_Fte);
					System.out.println("Total_Abbrv -->"+Total_Abbrv);
					System.out.println("Total_HC -->"+Total_HC);
				}
	    }

}
	
	
	
	
}
