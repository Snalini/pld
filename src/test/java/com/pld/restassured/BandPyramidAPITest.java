package com.pld.restassured;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.pld.Base.PldTestBase;
import com.pld.Util.TestUtil;
import com.pld.Util.TestUtilOne;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BandPyramidAPITest extends PldTestBase{
	
	public String responsemethod(String url)
	{
		StringBuffer response = new StringBuffer();
		try {
	
		URL url1 = new URL(url);
		
		HttpURLConnection conn = (HttpURLConnection) url1.openConnection();
		String encoded = Base64.getEncoder().encodeToString(("shbudipa@in.ibm.com"+":"+"feb@2019!!").getBytes(StandardCharsets.UTF_8));  //Java 8
		conn.setRequestProperty("Authorization", "Basic "+encoded);
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "Application/json");
		if(conn.getResponseCode()!= 200)
		{
			throw new RuntimeException("HTTP error code :"+conn.getResponseCode());
			
		}
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		
		while((inputLine = in.readLine())!=null)
		{
			response.append(inputLine);
		
		}
		in.close();
		System.out.println("Response Body"+response.toString());
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return response.toString();
		
		
	}
	
	/*@Test
	public void verifyBandPyramidAPI() throws IOException
	{
		//String response=responsemethod("https://pld-dev-api.w3ibm.mybluemix.net/api/Menu/viewSubcon-by/MenuItem/?filter%5Bfields%5D%5Blabel%5D=true&filter%5Bfields%5D%5Bvalue%5D=true&filter%5Border%5D=menuItemId");
		//String response=responsemethod("http://bldbz173018.cloud.dst.ibm.com:9080/api/Menu/viewSubcon-by/MenuItem/?filter%5Bfields%5D%5Blabel%5D=true&filter%5Bfields%5D%5Bvalue%5D=true&filter%5Border%5D=menuItemId");
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
			JSONObject jsonobject  = jsonarray.getJSONObject(i);
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

	/*@Test
	public void verifyColumnByFilter() throws IOException
	{
		//String response=responsemethod("https://pld-dev-api.w3ibm.mybluemix.net/api/Menu/column-by/MenuItem/?filter%5Bfields%5D%5Blabel%5D=true&filter%5Bfields%5D%5Bvalue%5D=true&filter%5Border%5D=menuItemId/");
		//String response=responsemethod("http://bldbz173018.cloud.dst.ibm.com:9080/api/Menu/column-by/MenuItem/?filter%5Bfields%5D%5Blabel%5D=true&filter%5Bfields%5D%5Bvalue%5D=true&filter%5Border%5D=menuItemId/");
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
	
	/*@Test
	public void verifyRowByFilter() throws IOException
	{
		//String response=responsemethod("https://pld-dev-api.w3ibm.mybluemix.net/api/Menu/row-by/MenuItem/?filter[fields][label]=true&filter[fields][value]=true&filter[order]=menuItemId/");
		//String response=responsemethod("http://bldbz173018.cloud.dst.ibm.com:9080/api/Menu/row-by/MenuItem/?filter[fields][label]=true&filter[fields][value]=true&filter[order]=menuItemId/");
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
	public void verifyEmployeeTable2() throws Exception
	{
		/*URL url = new URL("https://pld-dev-api.w3ibm.mybluemix.net/api/pldDemographicsEmployeesTotalOnInit/?flagVal=('Y','N')");
		//URL url = new URL("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldDemographicsEmployeesTotalOnInit/?flagVal=('Y','N')");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String encoded = Base64.getEncoder().encodeToString(("shbudipa@in.ibm.com"+":"+"feb@2019!!").getBytes(StandardCharsets.UTF_8));  //Java 8
		conn.setRequestProperty("Authorization", "Basic "+encoded);
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();
		System.out.println(responsecode);
		
		Scanner sc = new Scanner(url.openStream());
		while(sc.hasNext())
		{
			String inline = sc.nextLine();
		
		System.out.println("\nJSON data in string format");
		System.out.println(inline);*/
	//String response=responsemethod("https://pld-dev-api.w3ibm.mybluemix.net/api/pldDemographicsEmployeesTotalOnInit/?flagVal=('Y','N')\")");
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("BandPyramid_EmployeeTotoninit")+prop.getProperty("type4")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jsonobj = new JSONObject(response);
	JSONArray jarray = jsonobj.getJSONArray("Plddemographicsemployeestotaloninit");
	int length1 = jarray.length();
	for(int k=0;k<length1;k++)
	{
		JSONObject obj1 = jarray.getJSONObject(k);
		JSONObject demographics = obj1.getJSONObject("demographicsData");
		JSONArray jarray2 = demographics.getJSONArray("Plddemographicsemployees");
		int length2 = jarray2.length();
		for(int l=0;l<length2;l++)
		{
			JSONObject obj2 = jarray2.getJSONObject(l);
			String name = obj2.optString("NAME");
			String Band = obj2.getString("BAND");
			String JRSS = obj2.getString("JRSS");
			String location = obj2.getString("LOCATION");
			String industry = obj2.getString("INDUSTRY");
			BigDecimal HPP = obj2.getBigDecimal("HPP");
			BigDecimal QTD_CU = obj2.getBigDecimal("QTD_CU");
			BigDecimal QTD_PU = obj2.getBigDecimal("QTD_PU");
			BigDecimal MC = obj2.getBigDecimal("MC");
			BigDecimal AAID = obj2.getBigDecimal("AAID");
			BigDecimal TIMEAWAY = obj2.getBigDecimal("TIMEAWAY");
			String Assign_acct = obj2.getString("ASSG_ACCT");
			String Avail_date = obj2.getString("AVAIL_DATE");
			int benchage = obj2.getInt("BENCH_AGE");
			int inplay = obj2.optInt("INPLAY");
			String CATEGORY = obj2.getString("CATEGORY");
			String color = obj2.getString("COLOR");
			String EMAIL = obj2.getString("EMAIL");
			String CNUMID = obj2.getString("CNUMID");
			String CNTRCTOR_FLG = obj2.getString("CNTRCTOR_FLG");
			
			
			
			
			System.out.println(name);
			System.out.println(Band);
			System.out.println(JRSS);
			System.out.println(location);
			System.out.println(industry);
			System.out.println(HPP);
			System.out.println(QTD_CU);
			System.out.println(QTD_PU);
			System.out.println(MC);
			System.out.println(AAID);
			System.out.println(TIMEAWAY);
			System.out.println(Assign_acct);
			System.out.println(Avail_date);
			System.out.println(benchage);
			System.out.println(inplay);
			System.out.println(CATEGORY);
			System.out.println(color);
			System.out.println(EMAIL);
			System.out.println(CNUMID);
			System.out.println(CNTRCTOR_FLG);
			
		}
	}
	}
	       		}
		}
	}
	
	@Test
	public void verifyBandPyramidTotalinit() throws Exception
	{
		/*URL url = new URL("https://pld-dev-api.w3ibm.mybluemix.net/api/pldDemographicsBandPyramidTotalOnInit/?flagVal=('Y','N')");
		//URL url = new URL("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldDemographicsBandPyramidTotalOnInit/?flagVal=('Y','N')");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String encoded = Base64.getEncoder().encodeToString(("shbudipa@in.ibm.com"+":"+"feb@2019!!").getBytes(StandardCharsets.UTF_8));  //Java 8
		conn.setRequestProperty("Authorization", "Basic "+encoded);
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();
		System.out.println(responsecode);
		
		Scanner sc = new Scanner(url.openStream());
		while(sc.hasNext())
		{
			String inline = sc.nextLine();
		
		System.out.println("\nJSON data in string format");
		System.out.println(inline);*/
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("BandPyramid_BandpyramidTotoninit")+prop.getProperty("type4")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jobj = new JSONObject(response);
		JSONArray jarray = jobj.getJSONArray("Plddemographicsbandpyramidtotaloninit");
		int length = jarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject obj = jarray.getJSONObject(k);
			String band = obj.getString("BAND");
			System.out.println(band);
			
			JSONArray jarray2 = obj.getJSONArray("SUB_BANDS");
			int length2 = jarray2.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject obj2 = jarray2.getJSONObject(l);
				String sub_band = obj2.getString("SUB_BAND");
				int headcont_qty = obj2.getInt("HEADCNT_QTY");
				BigDecimal Band_Avg_headcnt_pct = obj2.getBigDecimal("BAND_AVG_HEADCNT_PCT");
				BigDecimal Sub_Band_Avg_headcnt_pct = obj2.getBigDecimal("SUB_BAND_AVG_HEADCNT_PCT");
				
				System.out.println(sub_band);
				System.out.println(headcont_qty);
				System.out.println(Band_Avg_headcnt_pct);
				System.out.println(Sub_Band_Avg_headcnt_pct);
				
			}
			
		}
	            		}
	       		}
		}
		
	}
	@Test
	public void verifyHeadCountTable() throws Exception
	{
		//URL url = new URL("https://pld-dev-api.w3ibm.mybluemix.net/api/pldDemographicsHeadcount/?colmnAttr=dshb_org_lvl_1_shrt_nm&rowAttr=dshb_svc_area_grp_shrt_nm&flagVal=('Y','N')");
		//URL url = new URL("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldDemographicsHeadcount/?colmnAttr=dshb_org_lvl_1_shrt_nm&rowAttr=dshb_svc_area_grp_shrt_nm&flagVal=('Y','N')");
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
	            			dataurl =prop.getProperty("API")+prop.getProperty("BandPyramid_HeadCount")+prop.getProperty("type4")+str; 
	            	           
	            	           System.out.println("URl is== "+dataurl  );
	            	         String response=TestUtil.responseMethod(dataurl);
	            	         System.out.println(response);
		JSONObject jobj = new JSONObject(response);
		JSONArray jarray = jobj.getJSONArray("Plddemographicsheadcount");
		int length = jarray.length();
		for(int k=0;k<length;k++)
		{
			JSONObject obj = jarray.getJSONObject(k);
			String col = obj.getString("col");
			System.out.println(col);
			
			JSONArray jarray2 = obj.getJSONArray("values");
			int length2 = jarray2.length();
			for(int l=0;l<length2;l++)
			{
				JSONObject obj2 = jarray2.getJSONObject(l);
				String row = obj2.getString("ROW");
				int HEADCOUNT = obj2.getInt("HEADCOUNT");
				
				
				System.out.println(row);
				System.out.println(HEADCOUNT);
				
				
			}
			
		}
		}
	}
		}
	}
}
	

