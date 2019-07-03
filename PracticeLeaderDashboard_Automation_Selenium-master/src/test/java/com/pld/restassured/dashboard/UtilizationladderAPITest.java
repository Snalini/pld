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

public class UtilizationladderAPITest extends PldTestBase {
	
	@Test
	public void verifyUtilladAsOF() throws Exception, Exception
	{
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		//System.out.println(sheetData.size());//112
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
           for (int j = 0; j < list.size(); j++)
           		{
                	XSSFCell cell = (XSSFCell) list.get(j);
                	if(cell.getCellType() == CellType.STRING)
                		{
                			String  str=cell.getRichStringCellValue().getString();
                			//cellData.add(j,str);
                			System.out.println(str);
                    	
                     //System.out.print(",");
                			
                			dataurl =prop.getProperty("API")+prop.getProperty("UtilLad_Asof")+prop.getProperty("labortype1")+str; 
                	           //URLEncoder.encode(str.replaceAll(",", prop.getProperty("labortype")), StandardCharsets.UTF_8.toString()
                	           System.out.println("URl is== "+dataurl  );
                	         String response=TestUtil.responseMethod(dataurl);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldutilasof");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String utilDate = json.getString("UTIL_DATE");
			System.out.println(utilDate);
		}
                		}
           		}
		}
	}
	
	@Test
	public void verifyUtilizationLadder() throws Exception, Exception
	{
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		//System.out.println(sheetData.size());//112
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
           for (int j = 0; j < list.size(); j++)
           		{
                	XSSFCell cell = (XSSFCell) list.get(j);
                	if(cell.getCellType() == CellType.STRING)
                		{
                			String  str=cell.getRichStringCellValue().getString();
                			//cellData.add(j,str);
                			System.out.println(str);
                    	
                     //System.out.print(",");
                			
                			dataurl =prop.getProperty("API")+prop.getProperty("Util_ladder")+prop.getProperty("labortype1")+str; 
                	           //URLEncoder.encode(str.replaceAll(",", prop.getProperty("labortype")), StandardCharsets.UTF_8.toString()
                	           System.out.println("URl is== "+dataurl  );
                	         String response=TestUtil.responseMethod(dataurl);
		
		JSONObject jsonobj = new JSONObject(response);
		
		JSONArray ja_data = jsonobj.getJSONArray("Pldutilladder");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Range = json.getString("range");
			BigDecimal HeadCT = json.getBigDecimal("headCT");
			String color = json.getString("color");
			System.out.println(Range);
			System.out.println(HeadCT);
			System.out.println(color);
		}
                		}
           		}
		}
	}
	
	@Test
	public void verifyTotalHC() throws Exception, Exception
	{
		String dataurl =new String();
		List sheetData =new ArrayList();
		List<String> cellData =new ArrayList<String>();
		sheetData=TestUtilOne.getTestData2();
		//System.out.println(sheetData.size());//112
		for(int i=0;i<sheetData.size();i++)
		{
			List list = (List) sheetData.get(i);
           for (int j = 0; j < list.size(); j++)
           		{
                	XSSFCell cell = (XSSFCell) list.get(j);
                	if(cell.getCellType() == CellType.STRING)
                		{
                			String  str=cell.getRichStringCellValue().getString();
                			//cellData.add(j,str);
                			System.out.println(str);
                    	
                     //System.out.print(",");
                			
                			dataurl =prop.getProperty("API")+prop.getProperty("Util_HC")+prop.getProperty("labortype1")+str; 
                	           //URLEncoder.encode(str.replaceAll(",", prop.getProperty("labortype")), StandardCharsets.UTF_8.toString()
                	           System.out.println("URl is== "+dataurl  );
                	         String response=TestUtil.responseMethod(dataurl);
		
		JSONObject jsonobj = new JSONObject(response);
		
		
		JSONArray ja_data = jsonobj.getJSONArray("Pldutilfte");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			int TotalHC = json.optInt("TOTAL_HC");
			System.out.println(TotalHC);
		}
                		}
           		}
		}
	}

}
