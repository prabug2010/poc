package com.api.testing.codes;

import static com.jayway.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.hamcrest.Matcher;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.parsing.Parser;
import com.jayway.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;

	public class GetStatusCodeTest {

	  @BeforeClass
	  public static void setBaseUri () {

	    RestAssured.baseURI = "https://maps.googleapis.com";
	  }

	  @Test
	  public void testStatusCode () {
	    
		  Response res  =given ().param ("query", "Churchgate Station")
				    .param ("key", "AIzaSyDHro627WUHGQBzPV83yfaS2xukF47uvjo")
				    .when()
				    .get ("/maps/api/place/textsearch/json")
				    .then()
				    .contentType(ContentType.JSON)
				    .extract().response();
		//    System.out.println (res.asString ());
		  given().header("Accept", "APPLICATION_JSON").options("https://maps.googleapis.com");
		  
				   String s= res.path("results[0].formatted_address");
				   String x = res.asString();
				    
		//		  Assert.assertEquals(s, "Maharshi Karve Rd, Churchgate, Mumbai, Maharashtra 400020, India");
				 System.out.println(s);
				 
				 JsonPath jp = new JsonPath(x);
				 float f = jp.getFloat("results[0].geometry.location.lat");
				 System.out.println(f);
				 
			//	 assertEquals("Maharshi Karve Rd, Churchgate, Mumbai, Maharashtra 400020, India", jp.get("results[0].formatted_address"));
	  }
	}