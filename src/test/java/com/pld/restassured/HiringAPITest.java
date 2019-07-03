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

public class HiringAPITest extends PldTestBase{
	
	@Test
	public void verifyKeyStaticsTable() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Hiring_KeyStatistics")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldhiringkeystatistics");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Band = json.getString("BAND");
			BigDecimal Accepts = json.optBigDecimal("ACCEPTS",null);
			BigDecimal Avg_to_Accept = json.optBigDecimal("AVG_TO_ACCEPT",null);
			BigDecimal Avg_to_Onboard = json.optBigDecimal("AVG_TO_ONBOARD",null);
			String females = json.optString("FEMALES");
			int sort = json.optInt("SORT");
			
			System.out.println(Band);
			System.out.println(Accepts);
			System.out.println(Avg_to_Accept);
			System.out.println(Avg_to_Onboard);
			System.out.println(females);
			System.out.println(sort);
			
		}
	            		}
	       		}
			
		}
	}
	
	@Test
	public void verifyRecentJoiners() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Hiring_RecentJoiners")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray jarray = jsonobj.getJSONArray("Pldrecentjoinerslist");
		int length = jarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject obj = jarray.getJSONObject(k);
			JSONObject joiners_data = obj.getJSONObject("joinersData");
			JSONArray jarray2 = joiners_data.getJSONArray("Pldrecentjoinerslist");
			int length2 = jarray2.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject obj2 = jarray2.getJSONObject(l);
				String name = obj2.getString("NAME");
				String band = obj2.getString("BAND");
				String email = obj2.getString("EMAIL");
				String start_date = obj2.getString("START_DATE");
				String location = obj2.getString("LOCATION");
				System.out.println(name);
				System.out.println(band);
				System.out.println(email);
				System.out.println(start_date);
				System.out.println(location);
			}
		}
	            		}
	       		}
		}
	}
	/*@Test
	public void verifyHiresYTD_ColumnBy() throws IOException
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("UtilLad_DistByBand")+prop.getProperty("labortype1")+str.replaceAll(",", prop.getProperty("labortype2")); 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		
		JSONArray jsonarray  = new JSONArray(response);
		for(int k=0;k<jsonarray.length();k++)
		{
			JSONObject jsonobject  = jsonarray.getJSONObject(k);
			String value = jsonobject.getString("value");
			//String menucd = jsonobject.getString("menuCd");
			//int menuitemid = jsonobject.getInt("menuItemId");
			String label = jsonobject.getString("label");
			//int id = jsonobject.getInt("id");
			
			System.out.println(value);
			//System.out.println(menucd);
			//System.out.println(menuitemid);
			System.out.println(label);
			//System.out.println(id);
		}
	            		}
	       		}
			
		}
	}*/
	
/*	@Test
	public void verifyHiresYTD_RowBy() throws IOException
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("UtilLad_DistByBand")+prop.getProperty("labortype1")+str.replaceAll(",", prop.getProperty("labortype2")); 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONArray jsonarray  = new JSONArray(response);
		for(int k=0;k<jsonarray.length();k++)
		{
			JSONObject jsonobject  = jsonarray.getJSONObject(k);
			String value = jsonobject.getString("value");
			//String menucd = jsonobject.getString("menuCd");
			//int menuitemid = jsonobject.getInt("menuItemId");
			String label = jsonobject.getString("label");
			//int id = jsonobject.getInt("id");
			
			System.out.println(value);
			//System.out.println(menucd);
			//System.out.println(menuitemid);
			System.out.println(label);
			//System.out.println(id);
			
		}
	            		}
	       		}
		}
	}*/
	
	@Test
	public void verifyHiringFunnelAsOF() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Hiring_FunnelAsof")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("pldHiringHiringFunnelAsof");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String pipelinedate = json.getString("ACTIVE_CANDIDATE_PIPELINE_DATE");
			System.out.println(pipelinedate);
		}
	            		}
	       		}
		}
	}
	
	@Test
	public void verifyHiringFunnel() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Hiring_Funnel")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("pldHiringHiringFunnel");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String position = json.getString("POSITION");
			int headcount = json.optInt("HEADCOUNT");
			
			System.out.println(position);
			System.out.println(headcount);
		}
	}
	       		}
		}
	}

}
