package com.api.testing.codes;

import static com.jayway.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

	public class DeleteExample {
				  @BeforeClass
				  public void setBaseUri () {

				    RestAssured.baseURI = "https://reqres.in/";
				  }
				  
				  @Test
				  public void testDelete()  {
					  
					 Response res = given().when()
							 .contentType(ContentType.JSON).delete("/api/users/2").then().extract().response();
				    	String s = res.asString();
				    	System.out.println(s);
				  }
				}