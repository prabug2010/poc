package com.api.testing.codes;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.given;

import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class ZipCodesArrayTestApi {
	
	public void setBaseURI()
	{
		RestAssured.baseURI="http://api.zippopotam.us";
	}

	public void test()
	{
		 Response res1 = given().when().get("/in/600015")
		 .then().assertThat().extract().response();
		 
		 String resp = res1.asString();
		 
		 List<Object> l = JsonPath.read(resp, "$.places[*]");
		 System.out.println(l);
		 
		 String l2 = JsonPath.read(resp, "$.places[0].latitude");
		 System.out.println(l2);
		 
	}
}
