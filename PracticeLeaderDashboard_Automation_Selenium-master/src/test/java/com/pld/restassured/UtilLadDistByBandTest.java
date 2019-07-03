package com.pld.restassured;

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

public class UtilLadDistByBandTest extends PldTestBase{
	
	@Test
	public void verifyUtilladDistByBandTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("UtilLad_DistByBand")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldutildistbyband");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Segment = json.optString("SEGMENT");
			int Band1to5 = json.getInt("B1_5");
			int Band6 = json.getInt("B6");
			int Band7 = json.getInt("B7"); 
			int Band8 = json.getInt("B8");
			int Band9 = json.getInt("B9");
			int Band10 = json.getInt("B10");
			int Exec = json.getInt("EXEC");
			String color = json.getString("COLOR");
			
			System.out.println(Segment);
			
			System.out.println(Band1to5);
			System.out.println(Band6);
			System.out.println(Band7);
			System.out.println(Band8);
			System.out.println(Band9);
			System.out.println(Band10);
			System.out.println(Exec);
			System.out.println(color);
			
	}
	            		}
	       		}
		}

}
	
	@Test
	public void verifyTotalheadCountTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("UtilLad_TotalHC")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldutillowutilizationtotalhc");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String lowutilcatnm = json.getString("LOW_UTIL_CAT_NM");
			int hcvalue = json.getInt("HC_VALUE");
			String color = json.getString("COLOR");
			int lowutilsort = json.getInt("LOW_UTIL_SORT");
			
			System.out.println(lowutilcatnm);
			System.out.println(hcvalue);
			
			System.out.println(color);
			System.out.println(lowutilsort);
			
	}
	            		}
	       		}
		}

}
	
	@Test
	public void verifyTotalheadcountTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("UtilLad_lowutilizationHC")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("PldutillowutilizationHC50");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			int totalhc = json.optInt("TOTAL_HC");
			int lowutilhc = json.getInt("LOW_UTIL_HC");
			
			int hcunder50 = json.getInt("HC_UNDER_50");
			
			System.out.println(totalhc);
			System.out.println(lowutilhc);
			
		
			System.out.println(hcunder50);
	}
	            		}
	       		}
		}

}
	
	@Test
	public void verifyUtilizationEmployeesTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("UtilLad_Lowutillist")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		
		JSONArray jarray = jsonobj.getJSONArray("Pldutillowutilizationlist");
		int length = jarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject obj = jarray.getJSONObject(k);
			JSONObject utilizationdata = obj.getJSONObject("utilizationData");
			JSONArray jarray2 = utilizationdata.getJSONArray("Pldutilizationlist");
			int length2 = jarray2.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject obj2 = jarray2.getJSONObject(l);
				String name = obj2.getString("NAME");
				int band =obj2.optInt("BAND");
				String jrss = obj2.getString("JRSS");
				String location = obj2.getString("LOCATION");
				String industry = obj2.getString("INDUSTRY");
				BigDecimal HPP = obj2.getBigDecimal("HPP");
				BigDecimal QTD_CU = obj2.getBigDecimal("QTD_CU");
				BigDecimal QTD_PU = obj2.getBigDecimal("QTD_PU");
				BigDecimal MC = obj2.getBigDecimal("MC");
				BigDecimal AAID = obj2.getBigDecimal("AAID");
				BigDecimal TIMEAWAY = obj2.getBigDecimal("TIMEAWAY");
				String assgn_acct = obj2.getString("ASSG_ACCT");
				String avail_date = obj2.getString("AVAIL_DATE");
				int BenchAge = obj2.getInt("BENCH_AGE");
				int InPlay = obj2.optInt("INPLAY");
				String category = obj2.getString("CATEGORY");
				String color = obj2.getString("COLOR");
				String email = obj2.getString("EMAIL");
				String cnumid = obj2.getString("CNUMID");
				int lowutilsort = obj2.getInt("LOW_UTIL_SORT");
				
				System.out.println(name);
				System.out.println(band);
				System.out.println(jrss);
				System.out.println(location);
				System.out.println(industry);
				System.out.println(HPP);
				System.out.println(QTD_CU);
				System.out.println(QTD_PU);
				System.out.println(MC);
				System.out.println(AAID);
				System.out.println(TIMEAWAY);
				System.out.println(assgn_acct);
				System.out.println(avail_date);
				System.out.println(BenchAge);
				System.out.println(InPlay);
				System.out.println(category);
				System.out.println(color);
				System.out.println(email);
				System.out.println(cnumid);
				System.out.println(lowutilsort);
				
				
			}
		}
	            		}
	       		}
		}
	}
	
	@Test
	public void verifyUtiltableFiltersTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("UtilLad_tablefilters")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldutiltablefilters");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Category = json.getString("CATEGORY");
			String color = json.getString("COLOR");
			
			int lowutilsort = json.getInt("LOW_UTIL_SORT");
			
			System.out.println(Category);
			System.out.println(color);
			
		
			System.out.println(lowutilsort);
	}
	}
	       		}
		}
	}

}
