package com.pld.restassured;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hpsf.Decimal;
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

public class CareerAPITest extends PldTestBase{
	
	@Test
	public void verifyMonthlyTrendChartTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Career_Monthlytrend")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpcmonthlytrend");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			
			String Month = json.getString("Month");
			Double Band_Avg = json.optDouble("BandAvg");
			String Color = json.getString("color");
			String current = json.getString("Current");
			
			System.out.println(Month);
			System.out.println(Band_Avg);
			System.out.println(Color);
			System.out.println(current);
			
			JSONArray jarray = json.getJSONArray("segments");
			int length2 = jarray.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject obj = jarray.getJSONObject(l);
				String range = obj.optString("RANGE");
				String color = obj.optString("COLOR");
				int avg_hc = obj.optInt("AVGHC");
				int Band_Sort = obj.optInt("BAND_SORT");
				System.out.println(range);
				System.out.println(color);
				System.out.println(avg_hc);
				System.out.println(Band_Sort);
				
			}
			
		}
			
		}
	       		}
		}
	}
	
	@Test
	public void verifyAddsAndLossesChart() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Career_QuarterlyAddLosses")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpcquarterlyaddslosses");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Band = json.getString("BAND");
			int net = json.optInt("NET");
			
			System.out.println(Band);
			System.out.println(net);
			
			JSONArray jarray = json.getJSONArray("ALTs");
			int length2 = jarray.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject obj = jarray.getJSONObject(j);
				String category = obj.getString("CATEGORY");
				String color = obj.getString("COLOR");
				int count = obj.optInt("COUNT");
				
				System.out.println(category);
				System.out.println(color);
				System.out.println(count);
				
			}
		}
			
		}
	       		}
		}
	}
	
	@Test
	public void verifyAverageTimeinBand() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Career_AvgTimeInband")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpcavgtimeinband");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Band = json.getString("BAND");
			BigDecimal AvgTimeInband = json.optBigDecimal("AVGTIB",null);
			int guideline = json.optInt("GUIDELINE");
			int band_outliers = json.optInt("BAND_OUTLIERS");
			System.out.println(Band);
			System.out.println(AvgTimeInband);
			System.out.println(guideline);
			System.out.println(band_outliers);
			
			
			
			
		}
	}
	       		}
		}
	}
}
