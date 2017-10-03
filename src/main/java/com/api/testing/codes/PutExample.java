package com.api.testing.codes;

import static com.jayway.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PutExample {
	
		  @BeforeClass
		  public void setBaseUri () {

		    RestAssured.baseURI = "https://reqres.in/";
		  }
		  
		  @Test
		  public void testPut()  {
			  
			 Response res = given().body("{\r\n" + 
			 		"    \"name\": \"morpheus\",\r\n" + 
			 		"    \"job\": \"zion resident\"\r\n" + 
			 		"}").when()
					 .contentType(ContentType.JSON).put("/api/users/2").then().extract().response();
		    	String s = res.asString();
		    	System.out.println(s);
		  }
		}