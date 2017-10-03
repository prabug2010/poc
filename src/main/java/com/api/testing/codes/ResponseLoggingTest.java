package com.api.testing.codes;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;
import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.*;

public class ResponseLoggingTest {

  @BeforeClass
  public void responseSpec () {
    
    RestAssured.baseURI="https://maps.googleapis.com";
   
 }
  
  @Test
  public void loggingTest() {
      
      given()
         .param ("query", "Churchgate Station")
         .param ("key","AIzaSyDHro627WUHGQBzPV83yfaS2xukF47uvjo" )
         .when ()
         .get ("/maps/api/place/textsearch/json")
         .then ()
         .log ().ifError ().assertThat ().statusCode (200);        
  }
}
