package com.pld.restassured;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class NewFilters {
	
	private void createFile(String file, ArrayList<String> arrData, String filepath)
            throws IOException,FileNotFoundException 
	{
		File folder= new File(filepath);
		File[] listOfFiles=folder.listFiles();
		String oldFilename=filepath+listOfFiles[0].getName();
	
			if(!listOfFiles[0].canRead())
			{
				listOfFiles[0].setReadable(true);
			}
		
		BufferedReader br = new BufferedReader(new FileReader(oldFilename));
		String line = null;
		ArrayList<String> oldarrData = new ArrayList<String>();
		while ((line = br.readLine()) != null) 
		{
			oldarrData.add(line);
		}
		br.close();
		String newfilename =null;
	/*	for(String olddata :oldarrData)
		{
			System.out.println("old file data"+ olddata);
		}
		for(String newdata :arrData)
		{
			System.out.println("new file data"+ newdata);
		}*/
		if(oldarrData.equals(arrData))
		{
			
			listOfFiles[0].delete();
			System.out.println("SUCCESS.....Contents of the files are matched");
	 DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
	 String filename = file +df.format(new Date());
	 newfilename=filename;
        FileWriter writer = new FileWriter(filepath+filename + ".txt");
        int size = arrData.size();
        for (int i=0;i<size;i++) {
            String str = arrData.get(i).toString();
            writer.write(str);
            if(i < size-1)//This prevent creating a blank like at the end of the file**
                writer.write("\n");
            
        }
        writer.close();
		}
        else 
        	
        {
        	System.out.println("OOPS...!Contents are not matched");
        }
        
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
	als.remove(als.size()-1);
	createFile("LaborPool",als,".\\Filters_PLD\\Laborpool\\");
	
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
	//als.remove(als.size()-1);
	
	createFile("GeographyFilter",als,".\\Filters_PLD\\Geography\\");
}

@Test
public void verifyGeography_IMT() throws IOException
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
	//als.remove(als.size()-1);
	createFile("GeographyFilter_IMT",als,".\\Filters_PLD\\Geography_IMT\\");
	
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
	//als.remove(als.size()-1);
	createFile("GeographyFilter_Region",als,".\\Filters_PLD\\Geography_Region\\");
	
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
	//als.remove(als.size()-1);
	createFile("GeographyFilter_Country",als,".\\Filters_PLD\\Geography_Country\\");

}

@Test
public void verifyGrowthplatform_Filters() throws IOException
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
	//als.remove(als.size()-1);
	createFile("GrowthPlatform",als,".\\Filters_PLD\\GrowthPlatform\\");
	
}

@Test
public void verifyGrowthPlatform_ServiceLine() throws IOException
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
	//als.remove(als.size()-1);
	createFile("GrowthPlatform_ServiceLine",als,".\\Filters_PLD\\GrowthPlatform_Serviceline\\");
	
}


@Test
public void verifyGrowthPlatform_Practice() throws IOException
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
	//als.remove(als.size()-1);
	createFile("GrowthPlatform_Practice",als,".\\Filters_PLD\\Growthplatform_Practice\\");
	
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
	als.remove(als.size()-1);
	createFile("SectorFilter",als,".\\Filters_PLD\\Sector\\");
	
}
}
