package com.api.testing.codes;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.ResponseSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.ResponseSpecification;
import static com.jayway.restassured.RestAssured.*;
import io.restassured.RestAssured.*;
import org.hamcrest.Matchers.*;
import io.restassured.matcher.RestAssuredMatchers;

public class ResponseSpecificationTest {

  
  ResponseSpecBuilder builder;
  ResponseSpecification rspec;
  
  @BeforeClass
  public void requestSpec () {
    

    RestAssured.baseURI="https://maps.googleapis.com";
    ResponseSpecBuilder builder = new ResponseSpecBuilder ();
    builder.expectContentType (ContentType.JSON);
    builder.expectStatusCode (200);
    
    rspec= builder.build ();
   
 }
  
  @Test
  public void Test01() {
      
         given()
         .param ("query", "restaurants in mumbai")
         .param ("key","AIzaSyDHro627WUHGQBzPV83yfaS2xukF47uvjo" )
         .when ()
         .get ("/maps/api/place/textsearch/json")
         .then ()
         .spec (rspec);
         
  }
  
}