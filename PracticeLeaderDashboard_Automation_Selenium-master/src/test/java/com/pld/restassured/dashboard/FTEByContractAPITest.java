package com.pld.restassured.dashboard;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Util.TestUtil;
import com.pld.Util.TestUtilOne;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FTEByContractAPITest extends PldTestBase {
	
	@Test
	public void verifyLabourAsOfTest() throws Exception
	{
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
	       for (int j = 0; j < list.size(); j++)
	       		{
	            	XSSFCell cell = (XSSFCell) list.get(j);
	            	if(cell.getCellType() == CellType.STRING)
	            		{
	            			String  str=cell.getRichStringCellValue().getString();
	            			System.out.println(str);
	            			dataurl =prop.getProperty("API")+prop.getProperty("FTE_Asof")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldlabordistasof");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String TrainingDate = json.getString("TRAINING_DATE");
			System.out.println("Training Date as of-->  "+TrainingDate);
			
		}
	            		}
	       		}
		}
		
	}
	
	@Test
	public void verifyDistributionChartTest() throws Exception
	{
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
	       for (int j = 0; j < list.size(); j++)
	       		{
	            	XSSFCell cell = (XSSFCell) list.get(j);
	            	if(cell.getCellType() == CellType.STRING)
	            		{
	            			String  str=cell.getRichStringCellValue().getString();
	            			System.out.println(str);
	            			dataurl =prop.getProperty("API")+prop.getProperty("FTE_DistributionChart")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray jsonarray = jsonobj.getJSONArray("Pldlabordistdashboardfte");
		//System.out.println(jsonarray);
		int length = jsonarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = jsonarray.getJSONObject(k);
			if(json.has("GP_GRP_1"))
			{
				JSONObject GpGRP1 = json.getJSONObject("GP_GRP_1");
				BigDecimal  GpGRP1_FtePerc= GpGRP1.optBigDecimal("FTE_PERC",null);
				String GpGRP1_Category = GpGRP1.optString("CATEGORY");
				BigDecimal  GpGRP1_Fte= GpGRP1.optBigDecimal("FTE",null);
				String GpGRP1_color = GpGRP1.optString("COLOR");
				String GpGRP1_Abbrv = GpGRP1.optString("ABBRV");
				String GpGRP1_HC = GpGRP1.optString("HC");
				
				System.out.println("GpGRP1_FtePerc -->" +GpGRP1_FtePerc);
				System.out.println("GpGRP1_Category -->" +GpGRP1_Category);
				System.out.println("GpGRP1_Fte -->"+GpGRP1_Fte);
				System.out.println("GpGRP1_color -->"+GpGRP1_color);
				System.out.println("GpGRP1_Abbrv -->"+GpGRP1_Abbrv);
				System.out.println("GpGRP1_HC -->"+GpGRP1_HC);
				
				JSONArray GpGRP1_servicelines = GpGRP1.getJSONArray("service_lines");
				int length2 = GpGRP1_servicelines.length();
				for(int l=0;l<length2;l++)
				{
					JSONObject servicelines = GpGRP1_servicelines.getJSONObject(l);
					BigDecimal servicelines_fteperc = servicelines.optBigDecimal("FTE_PERC",null);
					String servicelines_category = servicelines.optString("CATEGORY");
					BigDecimal servicelines_fte = servicelines.optBigDecimal("FTE",null);
					//String servicelines_color = servicelines.getString("COLOR");
					String servicelines_Abbrv = servicelines.optString("ABBRV");
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
					BigDecimal  GpGRP2_FtePerc= GpGRP2.optBigDecimal("FTE_PERC",null);
					String GpGRP2_Category = GpGRP2.optString("CATEGORY");
					BigDecimal  GpGRP2_Fte= GpGRP2.optBigDecimal("FTE",null);
					String GpGRP2_color = GpGRP2.optString("COLOR");
					String GpGRP2_Abbrv = GpGRP2.optString("ABBRV");
					String GpGRP2_HC = GpGRP2.optString("HC");
					
					System.out.println("GpGRP2_FtePerc -->"+GpGRP2_FtePerc);
					System.out.println("GpGRP2_Category -->"+GpGRP2_Category);
					System.out.println("GpGRP2_Fte -->"+GpGRP2_Fte);
					System.out.println("GpGRP2_color--> "+GpGRP2_color);
					System.out.println("GpGRP2_Abbrv -->"+GpGRP2_Abbrv);
					System.out.println("GpGRP2_HC -->" +GpGRP2_HC);
					
					JSONArray GpGRP2_servicelines = GpGRP2.getJSONArray("service_lines");
					int length3 = GpGRP2_servicelines.length();
					for(int m=0;m<length3;m++)
					{
						JSONObject servicelines = GpGRP2_servicelines.getJSONObject(m);
						BigDecimal servicelines_fteperc = servicelines.optBigDecimal("FTE_PERC",null);
						String servicelines_category = servicelines.optString("CATEGORY");
						BigDecimal servicelines_fte = servicelines.optBigDecimal("FTE",null);
						//String servicelines_color = servicelines.getString("COLOR");
						String servicelines_Abbrv = servicelines.optString("ABBRV");
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
					BigDecimal  GpGRP3_FtePerc= GpGRP3.optBigDecimal("FTE_PERC",null);
					String GpGRP3_Category = GpGRP3.optString("CATEGORY");
					BigDecimal  GpGRP3_Fte= GpGRP3.optBigDecimal("FTE",null);
					String GpGRP3_color = GpGRP3.optString("COLOR");
					String GpGRP3_Abbrv = GpGRP3.optString("ABBRV");
					String GpGRP3_HC = GpGRP3.optString("HC");
					
					System.out.println("GpGRP3_FtePerc -->"+GpGRP3_FtePerc);
					System.out.println("GpGRP3_Category--> "+GpGRP3_Category);
					System.out.println("GpGRP3_Fte -->"+GpGRP3_Fte);
					System.out.println("GpGRP3_color--> "+GpGRP3_color);
					System.out.println("GpGRP3_Abbrv--> "+GpGRP3_Abbrv);
					System.out.println("GpGRP3_HC--> "+GpGRP3_HC);
					
					JSONArray GpGRP3_servicelines = GpGRP3.getJSONArray("service_lines");
					int length4 = GpGRP3_servicelines.length();
					for(int n=0;n<length4;n++)
					{
						JSONObject servicelines = GpGRP3_servicelines.getJSONObject(n);
						BigDecimal servicelines_fteperc = servicelines.optBigDecimal("FTE_PERC",null);
						String servicelines_category = servicelines.optString("CATEGORY");
						BigDecimal servicelines_fte = servicelines.optBigDecimal("FTE",null);
						//String servicelines_color = servicelines.getString("COLOR");
						String servicelines_Abbrv = servicelines.optString("ABBRV");
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
					BigDecimal  GpGrpOther_FtePerc= GpGrpOther.optBigDecimal("FTE_PERC",null);
					String GpGrpOther_Category = GpGrpOther.optString("CATEGORY");
					BigDecimal  GpGrpOther_Fte= GpGrpOther.optBigDecimal("FTE",null);
					String GpGrpOther_color = GpGrpOther.optString("COLOR");
					String GpGrpOther_Abbrv = GpGrpOther.optString("ABBRV");
					String GpGrpOther_HC = GpGrpOther.optString("HC");
					
					System.out.println("GpGrpOther_FtePerc--> "+GpGrpOther_FtePerc);
					System.out.println("GpGrpOther_Category--> "+GpGrpOther_Category);
					System.out.println("GpGrpOther_Fte -->"+GpGrpOther_Fte);
					System.out.println("GpGrpOther_color--> "+GpGrpOther_color);
					System.out.println("GpGrpOther_Abbrv -->"+GpGrpOther_Abbrv);
					System.out.println("GpGrpOther_HC -->"+GpGrpOther_HC);
					
					JSONArray GpGrpOther_servicelines = GpGrpOther.getJSONArray("service_lines");
					int length5 = GpGrpOther_servicelines.length();
					for(int p=0;p<length5;p++)
					{
						JSONObject servicelines = GpGrpOther_servicelines.getJSONObject(p);
						BigDecimal servicelines_fteperc = servicelines.optBigDecimal("FTE_PERC",null);
						String servicelines_category = servicelines.optString("CATEGORY");
						BigDecimal servicelines_fte = servicelines.optBigDecimal("FTE",null);
						//String servicelines_color = servicelines.getString("COLOR");
						String servicelines_Abbrv = servicelines.optString("ABBRV");
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
					BigDecimal  Total_FtePerc= Total.optBigDecimal("FTE_PERC",null);
					String Total_Category = Total.optString("CATEGORY");
					BigDecimal  Total_Fte= Total.optBigDecimal("FTE",null);
					String Total_Abbrv = Total.optString("ABBRV");
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
		}
	}
	
	
}
