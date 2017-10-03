package com.api.testing.codes;

import static com.jayway.restassured.RestAssured.given;
import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostExample {
	
	  @BeforeClass
	  public void setBaseUri () {

	    RestAssured.baseURI = "http://cmapi.bananaappscenter.com/api/MovieBooking/MovieBooking";
	  }
	  
	  @Test
	  public void testPost()  {
		  
		  //if api supports pojo we can use the below pojo for inputs
	/*	  PostExample pos = new PostExample();
		  pos.setMov_ID(3);
		  pos.setLocation_ID(5);*/
		  
		 Response res = given().body("{\r\n" + 
		 		"\"Mov_ID\" : 3,\r\n" + 
		 		"\"Location_ID\" : 5\r\n" + 
		 		"}").when()
				 .contentType(ContentType.JSON).post("/MovieBooking").then().extract().response();
	    	String s = res.asString();
	    	System.out.println(s);
	    	
	    	ObjectMapper obj = new ObjectMapper();
	    	PostExamplePojo ps = new PostExamplePojo();
	    	Post2Pojo p;
	    	TestPojo tp = new TestPojo();
	    	try {
	 //   		ps = obj.readValue(s, new TypeReference<List<PostExamplePojo>>() {});
	   // 		System.out.println(ps);
	    		p = obj.readValue(s, Post2Pojo.class);
	    		System.out.println(p);
	    	}	
	    	catch (IOException e) {
	            e.printStackTrace();
	        }
	 /*   	try {
	    		tp = obj.readValue(s, TestPojo.class);
	    		System.out.println(tp);
	    	}
	    	catch (IOException e) {
	            e.printStackTrace();
	        }
	    */	
	  }
	}