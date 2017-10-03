package com.api.testing.codes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.ResponseSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.ResponseSpecification;
import static com.jayway.restassured.RestAssured.*;

public class RequestLoggingTest {

  @BeforeClass
  public void setBaseUri () {
    
    RestAssured.baseURI="https://maps.googleapis.com";
    
 }
  
  @Test
  public void logTest() {
      
         given()
         .param ("query", "Churchgate Station")
         .param ("key","AIzaSyDHro627WUHGQBzPV83yfaS2xukF47uvjo" )
         .when ()
         .log ()
         .all ()
         .get ("/maps/api/place/textsearch/json");
         
  }
  
}