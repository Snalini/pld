package com.pld.Test;

import org.testng.annotations.Test;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UtilizationExpDynamicElementTest {
	
	@Test
	public void verifyQtrEndProjectionvalue() throws UnirestException
	{
		String QtrEndProjApi = "http://bldbz173018.cloud.dst.ibm.com:9080/api/pldQtrProjectionUtilization";
		JsonNode body = Unirest.get(QtrEndProjApi)
				.asJson()
				.getBody();
		
		System.out.println(body);
	}

	
}
