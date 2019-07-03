package com.pld.restassured.dashboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

//import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.When;
import com.pld.Base.PldTestBase;
import com.pld.Util.TestUtil;
import com.pld.Util.TestUtilOne;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UtilisationAPIOneTest extends PldTestBase{
	
	@Test(priority=1)
	public void verifyUtilizationQTDGraphTest() throws Exception
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
          
                	//String str1 = str.replaceAll(",", prop.getProperty("labortype"));
           		
         /* if(cellData.size()==1)
        	   {
        	   		dataurl =prop.getProperty("Util_QTDGraph")+URLEncoder.encode(cellData.get(0), StandardCharsets.UTF_8.toString());
        	   		System.out.println(dataurl);
        	   }
           else
        	   {
        	   		dataurl=prop.getProperty("Util_QTDGraph")+URLEncoder.encode(cellData.get(0), StandardCharsets.UTF_8.toString());
        	   		for(int k=1;k<cellData.size();k++)
        	   			{
        	   				dataurl=dataurl+prop.getProperty("labortype")+cellData.get(i);
        	   			
        	   			}
        	   }*/
           
           dataurl =prop.getProperty("API")+prop.getProperty("Util_QTDGraph")+prop.getProperty("labortype1")+str; 
           //URLEncoder.encode(str.replaceAll(",", prop.getProperty("labortype")), StandardCharsets.UTF_8.toString()
           System.out.println("URl is== "+dataurl  );
         String response=TestUtil.responseMethod(dataurl);
    		JSONObject jsonobj = new JSONObject(response);
    		JSONArray ja_data = jsonobj.getJSONArray("Pldutilizationtile");
    		System.out.println(ja_data);
    		int length  = ja_data.length();
    		//System.out.println(length);
    		for(int k=0;k<length;k++)
    		{
    			JSONObject json = ja_data.getJSONObject(k);
    			//System.out.println(json);
    			
    			JSONObject qtd = json.getJSONObject("UtilizationData");
    			//System.out.println(qtd);
    			
    			
    			JSONArray jarray2 = qtd.getJSONArray("QTD");
    			//System.out.println(jarray2);
    		
    		//BigDecimal type =jarray2.getBigDecimal(length);
    		//System.out.println(type);
    			int length2 =jarray2.length();
    			for(int l=0;l<length2;l++) 
    			{
    				JSONObject json2 = jarray2.getJSONObject(l);
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
    			for(int m=0;m<length3;m++)
    			{
    				JSONObject json3 = jarray3.getJSONObject(m);
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
           
		}
	}	

	@Test(priority=2)
	public void verifyUtilizationAsOfTest() throws Exception
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
                			
                			dataurl =prop.getProperty("API")+prop.getProperty("Util_AsOf")+prop.getProperty("labortype1")+str; 
                	           //URLEncoder.encode(str.replaceAll(",", prop.getProperty("labortype")), StandardCharsets.UTF_8.toString()
                	           System.out.println("URl is== "+dataurl  );
                	         String response=TestUtil.responseMethod(dataurl);
            
		/*(RestAssured.baseURI = prop.getProperty("Util_AsOf");
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);*/
          
		 JSONObject jsonobj = new JSONObject(response);
			JSONArray ja_data = jsonobj.getJSONArray("Pldutilasof");
			int length  = ja_data.length();
			for(int k=0;k<length;k++)
			{
				JSONObject json = ja_data.getJSONObject(k);
				String UtilDate = json.getString("UTIL_DATE");
				System.out.println("UtilDate asOf is-->"+UtilDate);
			}
	}
	}
		}
	}
	}
	




	


