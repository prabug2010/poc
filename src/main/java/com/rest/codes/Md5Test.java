package com.rest.codes;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Md5Test {
	
	    public static void main(String args[]) {
	         
	        given().
	            parameters("text", "test").
	        when().
	            get("http://md5.jsontest.com").
	        then().
	            body("md5",equalTo("098f6bcd4621d373cade4e832627b4f6")).
	        and().
	            body("original", equalTo("incorrect"));
	    }
	}