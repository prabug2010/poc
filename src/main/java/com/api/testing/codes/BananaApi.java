package com.api.testing.codes;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.given;
import java.util.List;
import com.jayway.jsonpath.JsonPath;

public class BananaApi {

	public void setBaseURI()
	{
		RestAssured.baseURI="http://cmapi.bananaappscenter.com/api/MovieBooking/MovieBooking";
	}

	
	public void test()
	{
		 Response res1 = given().when().post("\"Mov_ID\" : 3,\r\n" + 
		 		"\"Location_ID\" : 5\r\n" + 
		 		"")
		 .then().assertThat().extract().response();
		 
		 String resp = res1.asString();
		 
		 List<Object> l = JsonPath.read(resp, "$..Laocation_Name");
		 System.out.println(l);
	}
	
}
