package com.pld.restassured;

import java.io.BufferedReader;
	import java.io.Closeable;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
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

	public class Example {
		
		private void createFile(String file, ArrayList<String> arrData, String filepath)
	            throws IOException,FileNotFoundException 
		{
			File folder= new File(filepath);
			//System.out.println("path is"+folder.getCanonicalPath());
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
		createFile("LaborPool",als,"C:\\Users\\ShireeshaBudida\\Desktop\\PLD_auto_testing\\PracticeLeaderDashboard_Automation_Selenium\\Filters_PLD\\Laborpool\\");
		
	}
		
		
	}



