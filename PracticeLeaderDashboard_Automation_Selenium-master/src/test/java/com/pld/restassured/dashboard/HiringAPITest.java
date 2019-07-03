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

public class HiringAPITest extends PldTestBase {
	
	@Test
	public void verifyHiringAsOfTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Hiring_Asof")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpcasof");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String PyramidDate = json.getString("PYRAMID_DATE");
			System.out.println(PyramidDate);
			
		}
	            		}
	       		}
		}
		
	}
	
	@Test
	public void verifyHiringTableTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Hiring_Table")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldpchiring");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			int YtdHiresActual = json.optInt("YTD_HIRES_ACTUAL");
			int ANOBsActual = json.optInt("ANOBS_ACTUAL");
			int OpenReqsActual = json.optInt("OPEN_REQS_ACTUAL");
			BigDecimal EPHActual = json.optBigDecimal("EPH_ACTUAL",null);
			String YtdHiresAvgBnd = json.optString("YTD_HIRES_AVG_BND");
			String ANOBsAvgBnd = json.optString("ANOBS_AVG_BND");
			String OpenReqsAvgBnd = json.optString("OPEN_REQS_AVG_BND");
			String EphAvgBnd = json.optString("EPH_AVG_BND");
			
			System.out.println(YtdHiresActual);
			System.out.println(ANOBsActual);
			System.out.println(OpenReqsActual);
			System.out.println(EPHActual);
			System.out.println(YtdHiresAvgBnd);
			System.out.println(ANOBsAvgBnd);
			System.out.println(OpenReqsAvgBnd);
			System.out.println(EphAvgBnd);
			
			
			
			
		}
	}
	       		}
		}
	}

}
