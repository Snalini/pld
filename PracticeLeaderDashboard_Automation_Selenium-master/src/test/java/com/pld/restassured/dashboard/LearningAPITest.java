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

public class LearningAPITest extends PldTestBase{
	
	@Test
	public void verifyLearningAsOf() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Learning_Asof")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldtrainingasof");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String TrainingDate = json.getString("TRAINING_DATE");
			System.out.println(TrainingDate);
			
		}
	            		}
	       		}
		}
	}
	
	@Test
	public void verifyTrainingDaysTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Learning_TrainingDays")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldtrainingtypes");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Reason = json.getString("REASON");
			BigDecimal Loss_Perc = json.optBigDecimal("LOSS_PERC",null);
			int Sort = json.getInt("SORT");
			System.out.println(Reason);
			System.out.println(Loss_Perc);
			System.out.println(Sort);
			
			
		}
	            		}
	       		}
		}
	}
	
	@Test
	public void verifyThinkFourtyTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Learning_Thinkfourty")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldtrainingthinkforty");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Reason = json.getString("REASON");
			BigDecimal Loss_Perc = json.getBigDecimal("LOSS_PERC");
			int LossSort = json.getInt("LOSS_SORT");
			System.out.println(Reason);
			System.out.println(Loss_Perc);
			System.out.println(LossSort);
		}
	            		}
	       		}
		}
	}
	
	@Test
	public void verifyDaysOrpersonByDeliveryTypeTest() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Learning_DeliveryType")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldtrainingdeliverytype");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			int Year = json.getInt("YEAR");
			BigDecimal ClassCount = json.getBigDecimal("CLASS_COUNT");
			BigDecimal VirtualCount = json.getBigDecimal("VIRTUAL_COUNT");
			BigDecimal e_LearningCount = json.getBigDecimal("ELEARNING_COUNT");
			BigDecimal SelfReportedCount = json.getBigDecimal("SELF_REPORTED_COUNT");
			BigDecimal Total = json.getBigDecimal("TOTAL");
			System.out.println(Year);
			System.out.println(ClassCount);
			System.out.println(VirtualCount);
			System.out.println(e_LearningCount);
			System.out.println(SelfReportedCount);
			System.out.println(Total);
		}
	}
	       		}
		}
	}

}
