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

public class DemandAPITest extends PldTestBase{
	
	@Test
	public void verifyDemandAsOfTest() throws Exception
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
                			dataurl =prop.getProperty("API")+prop.getProperty("Demand_Asof")+prop.getProperty("labortype1")+str; 
                	           
                	           System.out.println("URl is== "+dataurl  );
                	         String response=TestUtil.responseMethod(dataurl);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandasof");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String DemandDate = json.getString("DEMAND_DATE");
			System.out.println(DemandDate);
		}
       }
      }
     }
	}
	
	@Test
	public void verifyCoverageDelasTest() throws Exception
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
                			dataurl =prop.getProperty("API")+prop.getProperty("Demand_CoverageDeals")+prop.getProperty("labortype1")+str; 
                	           
                	           System.out.println("URl is== "+dataurl  );
                	         String response=TestUtil.responseMethod(dataurl);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcoveragedeals");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			int TotalDeals = json.optInt("TOTAL_DEALS");
			int DealsWithPlans = json.optInt("DEALS_WITH_PLANS");
			int Coverageperc = json.optInt("COVERAGE_PERC");
			
			System.out.println(TotalDeals);
			System.out.println(DealsWithPlans);
			System.out.println(Coverageperc);
			
		}
       }
      }
	}
}
	
	@Test
	public void verifyDemandByCapapcityGroupGraphTest() throws Exception
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
                			dataurl =prop.getProperty("API")+prop.getProperty("Demand_Cap_Gap")+prop.getProperty("labortype1")+str; 
                	           
                	           System.out.println("URl is== "+dataurl  );
                	         String response=TestUtil.responseMethod(dataurl);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcapgrp");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String CapacityGroup = json.getString("CAPACITY_GROUP");
			BigDecimal DemandPerc = json.optBigDecimal("DEMAND_PERC",null);
			String Arrow = json.optString("ARROW");
			BigDecimal Sort = json.getBigDecimal("SORT");
			//String Arrow_Color = json.getString("ARROWCOLOR");
			
			System.out.println(CapacityGroup);
			System.out.println(DemandPerc);
			System.out.println(Arrow);
			System.out.println(Sort);
			//System.out.println(Arrow_Color);
			
		}
       }
      }
	}
}
	
	@Test
	public void verifyTotalTest() throws Exception
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
                			dataurl =prop.getProperty("API")+prop.getProperty("Demand_CapTot")+prop.getProperty("labortype1")+str; 
                	           
                	           System.out.println("URl is== "+dataurl  );
                	         String response=TestUtil.responseMethod(dataurl);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Plddemandcaptot");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			int HC = json.optInt("HC");
			System.out.println(HC);
		}
       }
      }
	}
}
	
	@Test
	public void verifyOpenPositionChartTest() throws Exception
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
                			dataurl =prop.getProperty("API")+prop.getProperty("Demand_OpenPositionChart")+prop.getProperty("labortype1")+str; 
                	           
                	           System.out.println("URl is== "+dataurl  );
                	         String response=TestUtil.responseMethod(dataurl);
		
		JSONObject json = new JSONObject(response);
		JSONArray demand_open_positions = json.getJSONArray("Plddemandoppositions");
		System.out.println(demand_open_positions);
		int length =demand_open_positions.length();
		for(int k=0;k<length;k++)
		{
			JSONObject OpenPosiitonsData = demand_open_positions.getJSONObject(k);
			String Month = OpenPosiitonsData.getString("month");
			System.out.println(Month);
			
			JSONArray Demand_Month_data = OpenPosiitonsData.getJSONArray("values");
			int length2 = Demand_Month_data.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject Month_data = Demand_Month_data.getJSONObject(l);
				int head_count = Month_data.getInt("headcount");
				String category = Month_data.getString("category");
				System.out.println(head_count);
				System.out.println(category);
			}
		}
	}
  }
 }
}
}
