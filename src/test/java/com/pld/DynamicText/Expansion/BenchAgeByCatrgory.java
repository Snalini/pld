package com.pld.DynamicText.Expansion;

import java.math.BigDecimal;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BenchAgeByCatrgory {
	
	
	@Test
	public void verifyBenchByAgedata()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldBenchByAge";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldbenchbyage");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			Integer TotalHC = json.getInt("TOTAL_HC");
			Integer AgedBenchHC = json.getInt("AGED_BENCH_HC");
			BigDecimal AgedBenchHCpercent = json.getBigDecimal("AGED_BENCH_HC_PERC");
			System.out.println("Total headcount is "+TotalHC);
			System.out.println("Aged Bench HC is "+AgedBenchHC);
			System.out.println("Aged bench HC percent is "+AgedBenchHCpercent);
	}

}
	
	@Test
	public void verifyBenchAgeByCategory()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldBenchAgeByCategory";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
	    JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldbenchagebycategory");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Category = json.getString("CATEGORY");
			int HCvalue = json.getInt("HC_VALUE");
			String Color = json.getString("COLOR");
			
			System.out.println(Category);
			System.out.println(HCvalue);
			System.out.println(Color);
			
	}

}
	
	@Test
	public void verifyBenchEmployeeRollOff()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldBenchEmployeeRolloff";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray jsonarray = jsonobj.getJSONArray("Pldbenchemployeerolloff");
		int length =jsonarray.length();
		for(int i=0;i<length;i++)
		{
			JSONObject emp_data = jsonarray.getJSONObject(i);
			JSONObject bench_data = emp_data.getJSONObject("benchData");
			JSONArray jarray2 = bench_data.getJSONArray("Pldbenchemployeerolloff");
			int length2 = jarray2.length();
			for(int j=0;j<length2;j++)
			{
				JSONObject jobj2 = jarray2.getJSONObject(j);
				String name = jobj2.getString("NAME");
				String band = jobj2.getString("BAND");
				String jrss = jobj2.getString("JRSS");
				String location = jobj2.getString("LOCATION");
				String industry = jobj2.getString("INDUSTRY");
				BigDecimal hpp = jobj2.getBigDecimal("HPP");
				BigDecimal qtd_cu = jobj2.getBigDecimal("QTD_CU");
				BigDecimal qtd_pu = jobj2.getBigDecimal("QTD_PU");
				BigDecimal mc = jobj2.getBigDecimal("MC");
				BigDecimal AAID = jobj2.getBigDecimal("AAID");
				BigDecimal timeaway = jobj2.getBigDecimal("TIMEAWAY");
				String prior_assignment = jobj2.getString("PRIOR_ASSIGNMENT");
				String avail_date = jobj2.getString("AVAIL_DATE");
				int bench_Age = jobj2.getInt("BENCH_AGE");
				String inplay = jobj2.optString("INPLAY");
				String category = jobj2.getString("CATEGORY");
				String color = jobj2.getString("COLOR");
				String email = jobj2.getString("EMAIL");
				String cnumID = jobj2.getString("CNUMID");
				int bench_sort = jobj2.getInt("BENCH_SORT");
				
				System.out.println("emp name is=> "+name);
				System.out.println("Emp Band is=>"+band);
				System.out.println("JRSS is =>"+jrss);
				System.out.println("location is=>"+location);
				System.out.println("Industry is =>"+industry);
				System.out.println("HPP is =>"+hpp);
				System.out.println("QTD_CU is =>"+qtd_cu);
				System.out.println("QTD_PU is =>"+qtd_pu);
				System.out.println("MC is =>"+mc);
				System.out.println("AAID is =>"+AAID);
				System.out.println("Time Away is=>"+timeaway);
				System.out.println("Prior_Assignment is=>"+prior_assignment);
				System.out.println("Avail_date =>"+avail_date);
				System.out.println("Bench Age is=>"+bench_Age);
				System.out.println("InPlay is =>"+inplay);
				System.out.println("Category is =>"+category);
				System.out.println("Color is=>"+color);
				System.out.println("Email id is=>"+email);
				System.out.println("CNUM ID =>"+cnumID);
				System.out.println("Bench Sort=>"+bench_sort);
			}
		}
	}
	
	@Test
	public void verifyBenchHCbyWeekdata()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldBenchHCByWeek";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		JSONObject jsonobj = new JSONObject(responsebody);
		JSONArray ja_data = jsonobj.getJSONArray("Pldbenchhcbyweek");
		int length  = ja_data.length();
		for(int i=0;i<length;i++)
		{
			JSONObject json = ja_data.getJSONObject(i);
			String Segment = json.getString("SEGMENT");
			String X_Axis_Weekdate = json.getString("DATE_WEEK");
			int Y_Axis_HeadCount = json.getInt("HC");
			String ThisWeek = json.getString("THIS_WEEK");
			System.out.println(Segment);
			System.out.println(X_Axis_Weekdate);
			System.out.println(Y_Axis_HeadCount);
			System.out.println(ThisWeek);
	}

}
	
	@Test
	public void verifyBenchTableFilters()
	{
		RestAssured.baseURI = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldBenchTablefilters";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		
		    JSONObject jsonobj = new JSONObject(responsebody);
			JSONArray ja_data = jsonobj.getJSONArray("Pldbenchtablefilters");
			int length  = ja_data.length();
			for(int i=0;i<length;i++)
			{
				JSONObject json = ja_data.getJSONObject(i);
				String Category = json.optString("CATEGORY");
				int BenchShort = json.getInt("BENCH_SORT");
				String Color = json.optString("COLOR");
				
				System.out.println(Category);
				
				System.out.println(Color);
				System.out.println(BenchShort);
				
		}
	}

}
