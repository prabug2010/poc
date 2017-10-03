package com.api.testing.codes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;
import static com.jayway.restassured.RestAssured.*;

public class RequestSpecificationTest {

  RequestSpecification rspec;
  RequestSpecBuilder build;
  
  @BeforeClass
  public void requestSpec () {
    
    build = new RequestSpecBuilder();
    build.setBaseUri ("https://maps.googleapis.com");
    build.setBasePath ("maps/api/place/textsearch/json");
    build.addParam ("query", "restaurants in mumbai");
    build.addParam ("key", "AIzaSyDHro627WUHGQBzPV83yfaS2xukF47uvjo");
    
    rspec = build.build ();

 }
  
  @Test
  public void test01 () {
    
         given()
        .spec (rspec)
        .when ()
        .get ("")
        .then ()
        .contentType (ContentType.JSON)
        .statusCode (200);     
  }
  
}