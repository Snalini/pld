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

public class LearningTrainingDetailsYTDTableAPITest extends PldTestBase{
	
	@Test
	public void verifyTrainingDetailsYTDTable() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Learning_TrainingTheme")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray jarray = jsonobj.getJSONArray("Pldtrainingthemes");
		int length = jarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject obj = jarray.getJSONObject(k);
			if(obj.has("TABLE_1"))
			{
			JSONObject table1 = obj.getJSONObject("TABLE_1");
			String label = table1.getString("label");
			System.out.println(label);
			
			JSONArray jarray2 = table1.getJSONArray("values");
			int length2 = jarray2.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject obj2 = jarray2.getJSONObject(l);
				String Desc = obj2.getString("DESC");
				int uniqueparticipants = obj2.getInt("UNIQUE_PARTICIPANTS");
				BigDecimal StudentDays = obj2.optBigDecimal("STUDENT_DAYS",null);
				BigDecimal PENET_PERC = obj2.getBigDecimal("PENET_PERC");
				BigDecimal Avg_days = obj2.getBigDecimal("AVG_DAYS");
				int sort = obj2.getInt("SORT");
				System.out.println(Desc);
				System.out.println(uniqueparticipants);
				System.out.println(StudentDays);
				System.out.println(PENET_PERC);
				System.out.println(Avg_days);
				System.out.println(sort);
			}
			}
			
			if(obj.has("TABLE_2"))
			{
			JSONObject table2 = obj.getJSONObject("TABLE_2");
			String label = table2.getString("label");
			System.out.println(label);
			
			JSONArray jarray3 = table2.getJSONArray("values");
			int length3 = jarray3.length();
			for(int m=0;m<length3;m++)
			{
				JSONObject obj3 = jarray3.getJSONObject(m);
				String Desc = obj3.getString("DESC");
				int uniqueparticipants = obj3.getInt("UNIQUE_PARTICIPANTS");
				BigDecimal StudentDays = obj3.optBigDecimal("STUDENT_DAYS",null);
				BigDecimal PENET_PERC = obj3.getBigDecimal("PENET_PERC");
				BigDecimal Avg_days = obj3.getBigDecimal("AVG_DAYS");
				int sort = obj3.getInt("SORT");
				System.out.println(Desc);
				System.out.println(uniqueparticipants);
				System.out.println(StudentDays);
				System.out.println(PENET_PERC);
				System.out.println(Avg_days);
				System.out.println(sort);
			}
			}
			
			if(obj.has("TABLE_3"))
			{
			JSONObject table3 = obj.getJSONObject("TABLE_3");
			String label = table3.getString("label");
			System.out.println(label);
			
			JSONArray jarray4 = table3.getJSONArray("values");
			int length4 = jarray4.length();
			for(int n=0;n<length4;n++)
			{
				JSONObject obj4 = jarray4.getJSONObject(n);
				String Desc = obj4.getString("DESC");
				int uniqueparticipants = obj4.getInt("UNIQUE_PARTICIPANTS");
				BigDecimal StudentDays = obj4.optBigDecimal("STUDENT_DAYS",null);
				BigDecimal PENET_PERC = obj4.getBigDecimal("PENET_PERC");
				BigDecimal Avg_days = obj4.getBigDecimal("AVG_DAYS");
				int sort = obj4.getInt("SORT");
				System.out.println(Desc);
				System.out.println(uniqueparticipants);
				System.out.println(StudentDays);
				System.out.println(PENET_PERC);
				System.out.println(Avg_days);
				System.out.println(sort);
			}
			}
		}
	            		}
	       		}
		}
	}

	@Test
	public void verifyStudentYTD() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Learning_TrainingStudentDays")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldtrainingstudentdays");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Learning_Type = json.getString("LEARNING_TYPE");
			BigDecimal H1 = json.optBigDecimal("H1",null);
			BigDecimal total = json.optBigDecimal("TOTAL",null);
			int sort = json.optInt("SORT");
			
			System.out.println(Learning_Type);
			System.out.println(H1);
			System.out.println(total);
			System.out.println(sort);
			
		}
	            		}
	       		}
			
		}
	}
	
	@Test
	public void verifyPrescribedCoreCapabilitylearning() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Learning_CapabilityLearning")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldtrainingcapabilitylearning");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Band = json.getString("BAND");
			BigDecimal Penet_percent = json.optBigDecimal("PENET_PERC",null);
			BigDecimal YTY = json.optBigDecimal("YTY",null);
			int sort = json.optInt("SORT");
			
			System.out.println(Band);
			System.out.println(Penet_percent);
			System.out.println(YTY);
			System.out.println(sort);
			
			
			
		}
	            		}
	       		}
		}
	}
}
