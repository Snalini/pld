package com.pld.restassured;

import java.io.IOException;
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

public class GapSupplyAndDemandAPITest extends PldTestBase{
	
	@Test
	public void verifySupplyAndDemand() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Gap_SupplyDemand")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldgapsupplydemand");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Month_Date = json.getString("MONTH_DT");
			int RollOffs_Bench = json.getInt("SUP_RB");
			int ANOBs = json.getInt("SUP_ANOBS");
			int Depart = json.getInt("SUP_DEPART");
			int Total_Qty = json.getInt("SUPP_TOT_QTY");
			int Dem_Comm = json.getInt("DEM_COMM");
			int Dem_Oppty = json.getInt("DEM_OPPTY");
			int Dem_Other = json.getInt("DEM_OTHER");
			int Dem_Tot = json.getInt("DEM_TOT");
			
			System.out.println(Month_Date);
			System.out.println(RollOffs_Bench);
			System.out.println(ANOBs);
			System.out.println(Depart);
			System.out.println(Total_Qty);
			System.out.println(Dem_Comm);
			System.out.println(Dem_Oppty);
			System.out.println(Dem_Other);
			System.out.println(Dem_Tot);
		}
	            		}
	       		}
		}
			
	}
	
	@Test
	public void verifyMonthsColumnheader() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Gap_Columnheader")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldcolumnheaders");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Month1 = json.getString("MO1");
			String Month2 = json.getString("MO2");
			String Month3 = json.getString("MO3");
			System.out.println(Month1);
			System.out.println(Month2);
			System.out.println(Month3);
		}
	            		}
	       		}
		}
	}

	@Test
	public void verifyMonthsColumnheader2() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Gap_Columnheader")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray ja_data = jsonobj.getJSONArray("Pldcolumnheaders");
		int length  = ja_data.length();
		for(int k=0;k<length;k++)
		{
			JSONObject json = ja_data.getJSONObject(k);
			String Month1 = json.getString("MO1");
			String Month2 = json.getString("MO2");
			String Month3 = json.getString("MO3");
			System.out.println(Month1);
			System.out.println(Month2);
			System.out.println(Month3);
		}
	            		}
	       		}
		}
	}
	
	@Test
	public void verifyTopExcesses() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Gap_Excesses")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray jarray = jsonobj.getJSONArray("Pldgapexcesses");
		int length =jarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject obj = jarray.getJSONObject(k);
			if(obj.has("JRSS"))
			{
			JSONObject jrss = obj.getJSONObject("JRSS");
			String label = jrss.getString("label");
			System.out.println(label);
			
			JSONArray values = jrss.getJSONArray("values");
			int length2 = values.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject obj2 = values.getJSONObject(l);
				String desc = obj2.getString("DESC");
				int Tot_HC = obj2.getInt("TOT_HC");
				int Sub_HC = obj2.getInt("SUBK_HC");
				int Current_gap = obj2.getInt("CURR_GAP");
				int MO0 = obj2.getInt("MO0");
				int MO1 = obj2.getInt("MO1");
				int MO2 = obj2.getInt("MO2");
				int IND = obj2.optInt("IND");
				System.out.println(desc);
				System.out.println(Tot_HC);
				System.out.println(Sub_HC);
				System.out.println(Current_gap);
				System.out.println(MO0);
				System.out.println(MO1);
				System.out.println(MO2);
				System.out.println(IND);
			}
			
		}
			
			if(obj.has("CAP_GRP"))
			{
			JSONObject Cap_group = obj.getJSONObject("CAP_GRP");
			String label = Cap_group.getString("label");
			System.out.println(label);
			
			JSONArray values = Cap_group.getJSONArray("values");
			int length3 = values.length();
			for(int m=0;m<length3;m++)
			{
				JSONObject obj3 = values.getJSONObject(m);
				String desc = obj3.getString("DESC");
				int Tot_HC = obj3.getInt("TOT_HC");
				int Sub_HC = obj3.getInt("SUBK_HC");
				int Current_gap = obj3.getInt("CURR_GAP");
				int MO0 = obj3.getInt("MO0");
				int MO1 = obj3.getInt("MO1");
				int MO2 = obj3.getInt("MO2");
				int IND = obj3.optInt("IND");
				System.out.println(desc);
				System.out.println(Tot_HC);
				System.out.println(Sub_HC);
				System.out.println(Current_gap);
				System.out.println(MO0);
				System.out.println(MO1);
				System.out.println(MO2);
				System.out.println(IND);
			}
			
		}
			
			if(obj.has("PRAC_GRP"))
			{
			JSONObject Practice_group = obj.getJSONObject("PRAC_GRP");
			String label = Practice_group.getString("label");
			System.out.println(label);
			
			JSONArray values = Practice_group.getJSONArray("values");
			int length4 = values.length();
			for(int n=0;n<length4;n++)
			{
				JSONObject obj4 = values.getJSONObject(n);
				String desc = obj4.getString("DESC");
				int Tot_HC = obj4.getInt("TOT_HC");
				int Sub_HC = obj4.getInt("SUBK_HC");
				int Current_gap = obj4.getInt("CURR_GAP");
				int MO0 = obj4.getInt("MO0");
				int MO1 = obj4.getInt("MO1");
				int MO2 = obj4.getInt("MO2");
				int IND = obj4.optInt("IND");
				System.out.println(desc);
				System.out.println(Tot_HC);
				System.out.println(Sub_HC);
				System.out.println(Current_gap);
				System.out.println(MO0);
				System.out.println(MO1);
				System.out.println(MO2);
				System.out.println(IND);
			}
			
		}
		}
	            		}
	       		}
		}
	}
	
	@Test
	public void verifyTopShortageTable() throws Exception
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("Gap_Shortages")+prop.getProperty("labortype1")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		
		
		JSONObject jsonobj = new JSONObject(response);
		JSONArray jarray = jsonobj.getJSONArray("PldGapShortages");
		int length =jarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject obj = jarray.getJSONObject(k);
			if(obj.has("JRSS"))
			{
			JSONObject jrss = obj.getJSONObject("JRSS");
			String label = jrss.getString("label");
			System.out.println(label);
			
			JSONArray values = jrss.getJSONArray("values");
			int length2 = values.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject obj2 = values.getJSONObject(l);
				String desc = obj2.getString("DESC");
				int Tot_HC = obj2.getInt("TOT_HC");
				int Sub_HC = obj2.getInt("SUBK_HC");
				int Current_gap = obj2.getInt("CURR_GAP");
				int MO0 = obj2.getInt("MO0");
				int MO1 = obj2.getInt("MO1");
				int MO2 = obj2.getInt("MO2");
				int IND = obj2.optInt("IND");
				System.out.println(desc);
				System.out.println(Tot_HC);
				System.out.println(Sub_HC);
				System.out.println(Current_gap);
				System.out.println(MO0);
				System.out.println(MO1);
				System.out.println(MO2);
				System.out.println(IND);
			}
			
		}
			
			if(obj.has("CAP_GRP"))
			{
			JSONObject Cap_group = obj.getJSONObject("CAP_GRP");
			String label = Cap_group.getString("label");
			System.out.println(label);
			
			JSONArray values = Cap_group.getJSONArray("values");
			int length3 = values.length();
			for(int n=0;n<length3;n++)
			{
				JSONObject obj3 = values.getJSONObject(n);
				String desc = obj3.getString("DESC");
				int Tot_HC = obj3.getInt("TOT_HC");
				int Sub_HC = obj3.getInt("SUBK_HC");
				int Current_gap = obj3.getInt("CURR_GAP");
				int MO0 = obj3.getInt("MO0");
				int MO1 = obj3.getInt("MO1");
				int MO2 = obj3.getInt("MO2");
				int IND = obj3.optInt("IND");
				System.out.println(desc);
				System.out.println(Tot_HC);
				System.out.println(Sub_HC);
				System.out.println(Current_gap);
				System.out.println(MO0);
				System.out.println(MO1);
				System.out.println(MO2);
				System.out.println(IND);
			}
			
		}
			
			if(obj.has("PRAC_GRP"))
			{
			JSONObject Practice_group = obj.getJSONObject("PRAC_GRP");
			String label = Practice_group.getString("label");
			System.out.println(label);
			
			JSONArray values = Practice_group.getJSONArray("values");
			int length4 = values.length();
			for(int m=0;m<length4;m++)
			{
				JSONObject obj4 = values.getJSONObject(m);
				String desc = obj4.getString("DESC");
				int Tot_HC = obj4.getInt("TOT_HC");
				int Sub_HC = obj4.getInt("SUBK_HC");
				int Current_gap = obj4.getInt("CURR_GAP");
				int MO0 = obj4.getInt("MO0");
				int MO1 = obj4.getInt("MO1");
				int MO2 = obj4.getInt("MO2");
				int IND = obj4.optInt("IND");
				System.out.println(desc);
				System.out.println(Tot_HC);
				System.out.println(Sub_HC);
				System.out.println(Current_gap);
				System.out.println(MO0);
				System.out.println(MO1);
				System.out.println(MO2);
				System.out.println(IND);
			}
			
		}
		}
	}
	       		}
		}
	}
}
