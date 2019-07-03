package com.pld.restassured;

import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FiltersAPI {
	
	private void createFile(String file, ArrayList<String> arrData)
            throws IOException {
	 DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
	 String filename = file +df.format(new Date());
        FileWriter writer = new FileWriter( "C:\\Users\\ShireeshaBudida\\Desktop\\PLD_auto_testing\\PracticeLeaderDashboard_Automation_Selenium\\Filters_PLD\\"+filename + ".txt");
        int size = arrData.size();
        for (int i=0;i<size;i++) {
            String str = arrData.get(i).toString();
            writer.write(str);
            if(i < size-1)//This prevent creating a blank like at the end of the file**
                writer.write("\n");
        }
        writer.close();
    }


@Test
public void verifyLaborPoolfilterdata() throws IOException
{
	
		
	URL url = new URL("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldbFilters/?busAttr=DSHB_LBR_POOL_NM");
	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	conn.setRequestMethod("GET");
	conn.connect();
	int responsecode = conn.getResponseCode();
	System.out.println(responsecode);
	
	
	

	
	Scanner sc = new Scanner(url.openStream());
	ArrayList<String> als= new ArrayList<String>();
	while(sc.hasNext())
	{
		String inline = sc.nextLine();
	
	System.out.println("\n LaborPoolFilters");
	System.out.println(inline);
	
	JSONObject jobj = new JSONObject(inline);
	JSONArray jarray = jobj.getJSONArray("Pldbfilter");
	int length = jarray.length();
	for(int i=0;i<length;i++)
	{
		JSONObject obj = jarray.getJSONObject(i);
		String dshb_lbr_poo_name = obj.optString("DSHB_LBR_POOL_NM");
		System.out.println(dshb_lbr_poo_name);
		als.add(i,dshb_lbr_poo_name);
		
	}
	}
	sc.close();
	createFile("LaborPool",als);
	
}
	
	@Test
	public void verifyGeographyFilter() throws IOException
	{
		URL url = new URL("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldbFilters/?busAttr=DSHB_ORG_LVL_1_TXT");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();
		System.out.println(responsecode);
		
		Scanner sc = new Scanner(url.openStream());
		ArrayList<String> als= new ArrayList<String>();
		while(sc.hasNext())
		{
			String inline = sc.nextLine();
		
		System.out.println("\nGeography filters");
		System.out.println(inline);
		
		JSONObject jobj = new JSONObject(inline);
		JSONArray jarray = jobj.getJSONArray("Pldbfilter");
		int length = jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			String dshb_org_lvl1_txt = obj.optString("DSHB_ORG_LVL_1_TXT");
			System.out.println(dshb_org_lvl1_txt);
			als.add(i,dshb_org_lvl1_txt);
		}
		}
		
		sc.close();
		createFile("GeographyFilter",als);
	}

	@Test
	public void verifyGeography_Filter() throws IOException
	{
		URL url = new URL("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldbFilters/?busAttr=ORG_LVL_3_TXT");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();
		System.out.println(responsecode);
		
		Scanner sc = new Scanner(url.openStream());
		ArrayList<String> als= new ArrayList<String>();
		while(sc.hasNext())
		{
			String inline = sc.nextLine();
		
		System.out.println("\n Geography filter IMT data");
		System.out.println(inline);
		
		JSONObject jobj = new JSONObject(inline);
		JSONArray jarray = jobj.getJSONArray("Pldbfilter");
		int length = jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			String org_lvl3_txt = obj.optString("ORG_LVL_3_TXT");
			System.out.println(org_lvl3_txt);
			als.add(i,org_lvl3_txt);
		}
		}
		sc.close();
		createFile("GeographyFilter_IMT",als);
	}
	
	@Test
	public void verifyGeography_Region() throws IOException
	{
		URL url = new URL("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldbFilters/?busAttr=ORG_LVL_4_TXT");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();
		System.out.println(responsecode);
		
		Scanner sc = new Scanner(url.openStream());
		ArrayList<String> als= new ArrayList<String>();
		while(sc.hasNext())
		{
			String inline = sc.nextLine();
		
		System.out.println("\n geography filter region data");
		System.out.println(inline);
		
		JSONObject jobj = new JSONObject(inline);
		JSONArray jarray = jobj.getJSONArray("Pldbfilter");
		int length = jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			String org_lvl4_txt = obj.optString("ORG_LVL_4_TXT");
			System.out.println(org_lvl4_txt);
			als.add(i,org_lvl4_txt);
		}
		}
		sc.close();
		createFile("GeographyFilter_Region",als);
	}

	@Test
	public void verifyGeography_Country() throws IOException
	{
		URL url = new URL("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldbFilters/?busAttr=CTRY_NM");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();
		System.out.println(responsecode);
		
		Scanner sc = new Scanner(url.openStream());
		ArrayList<String> als= new ArrayList<String>();
		while(sc.hasNext())
		{
			String inline = sc.nextLine();
		
		System.out.println("\nJSON data in string format");
		System.out.println(inline);
		
		JSONObject jobj = new JSONObject(inline);
		JSONArray jarray = jobj.getJSONArray("Pldbfilter");
		int length = jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			String contryName = obj.optString("CTRY_NM");
			System.out.println(contryName);
			als.add(i,contryName);
		}
		}
		sc.close();
		createFile("GeographyFilter_Country",als);
	}

	@Test
	public void verifyGrowthplatform_BUS_Area() throws IOException
	{
		URL url = new URL("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldbFilters/?busAttr=BUS_AREA_NM");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();
		System.out.println(responsecode);
		
		Scanner sc = new Scanner(url.openStream());
		ArrayList<String> als= new ArrayList<String>();
		while(sc.hasNext())
		{
			String inline = sc.nextLine();
		
		System.out.println("\nJSON data in string format");
		System.out.println(inline);
		
		JSONObject jobj = new JSONObject(inline);
		JSONArray jarray = jobj.getJSONArray("Pldbfilter");
		int length = jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			String AreaName = obj.optString("BUS_AREA_NM");
			System.out.println(AreaName);
			als.add(i,AreaName);
		}
		}
		sc.close();
		createFile("GrowthPlatform",als);
	}
	
	@Test
	public void verifyGrowthPlatform_SVC_NM() throws IOException
	{
		URL url = new URL("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldbFilters/?busAttr=SVC_NM");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();
		System.out.println(responsecode);
		
		Scanner sc = new Scanner(url.openStream());
		ArrayList<String> als= new ArrayList<String>();
		while(sc.hasNext())
		{
			String inline = sc.nextLine();
		
		System.out.println("\nJSON data in string format");
		System.out.println(inline);
		
		JSONObject jobj = new JSONObject(inline);
		JSONArray jarray = jobj.getJSONArray("Pldbfilter");
		int length = jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			String SvcName = obj.optString("SVC_NM");
			System.out.println(SvcName);
			als.add(i,SvcName);
		}
		}
		sc.close();
		createFile("GrowthPlatform_ServiceLine",als);
	}
	

	@Test
	public void verifyGrowthPlatform_SVC_Area_grp_name() throws IOException
	{
		URL url = new URL("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldbFilters/?busAttr=SVC_AREA_GRP_NM");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();
		System.out.println(responsecode);
		
		Scanner sc = new Scanner(url.openStream());
		ArrayList<String> als= new ArrayList<String>();
		while(sc.hasNext())
		{
			String inline = sc.nextLine();
		
		System.out.println("\nJSON data in string format");
		System.out.println(inline);
		
		JSONObject jobj = new JSONObject(inline);
		JSONArray jarray = jobj.getJSONArray("Pldbfilter");
		int length = jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			String SvcAreagroupName = obj.optString("SVC_AREA_GRP_NM");
			System.out.println(SvcAreagroupName);
			als.add(i,SvcAreagroupName);
		}
		}
		sc.close();
		createFile("GrowthPlatform_Practice",als);
	}
	
	@Test
	public void verifySectorFilter() throws IOException
	{
		URL url = new URL("http://bldbz173018.cloud.dst.ibm.com:9080/api/pldbFilters/?busAttr=SCTR_NM");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();
		System.out.println(responsecode);
		
		Scanner sc = new Scanner(url.openStream());
		ArrayList<String> als= new ArrayList<String>();
		while(sc.hasNext())
		{
			String inline = sc.nextLine();
		
		System.out.println("\nJSON data in string format");
		System.out.println(inline);
		
		JSONObject jobj = new JSONObject(inline);
		JSONArray jarray = jobj.getJSONArray("Pldbfilter");
		int length = jarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject obj = jarray.getJSONObject(i);
			String SectorName = obj.optString("SCTR_NM");
			System.out.println(SectorName);
			als.add(i,SectorName);
		}
		}
		sc.close();
		createFile("SectorFilter",als);
	}
}
