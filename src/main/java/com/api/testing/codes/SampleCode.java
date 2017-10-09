package com.api.testing.codes;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class SampleCode {
	
	 @BeforeClass
	  public void setBaseUri () {

	    RestAssured.baseURI = "http://services.groupkt.com";
	  }
	  
	  @Test
	  public void test01()  {
		Response r =  given ()
	    .when()
	    .get ("/state/get/IND/all")
	    .then().assertThat().contentType(ContentType.JSON).extract().response();
		
		String s = r.asString();
		System.out.println(s);
		System.out.println("test01 success");
	
		JsonPath jp = new JsonPath(s);
		int id1 = jp.getInt("RestResponse.result[0].id");
		assertEquals(56,id1);
		System.out.println(id1);
		Map<Object, Object> x = jp.getMap("RestResponse.result[23]");
		System.out.println(x);
		
	  }
	  
	  @Test
	  public void test02()  {
		 
		 given ()
	    .when()
	    .get ("/state/get/IND/all")
	    .then().assertThat().body("RestResponse.result[23].id", equalTo(79));
		
	  }

	  @Test
	  public void test03()  {
		 
		 given ()
	    .when()
	    .get ("/state/get/IND/all")
	    .then().assertThat().body("RestResponse.result[23].name", is("Tamil Nadu"));
	  }
	  
}