package com.api.testing.codes;

import static com.jayway.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class GetJsonResponseTest {

  @BeforeClass
  public void setBaseUri () {

    RestAssured.baseURI = "https://maps.googleapis.com";
  }
  
  @Test
  public void test01()  {
	  Response res  =given ().param ("query", "Churchgate Station")
    .param ("key", "AIzaSyDHro627WUHGQBzPV83yfaS2xukF47uvjo")
    .when()
    .get ("/maps/api/place/textsearch/json")
    .then()
    .contentType(ContentType.JSON).assertThat()
    .extract().response();
 //   System.out.println (res.asString ());

   String s= res.path("results[0].formatted_address");
    
  Assert.assertEquals(s, "Maharshi Karve Rd, Churchgate, Mumbai, Maharashtra 400020, India");
 System.out.println(s);
    	
  }
  
  @Test
  public void test02()  {
	  given ().param ("query", "Churchgate Station")
    .param ("key", "AIzaSyDHro627WUHGQBzPV83yfaS2xukF47uvjo")
    .when()
    .get ("/maps/api/place/textsearch/json")
    .then()
    .body("results[0].name", equalTo("Churchgate")).and().body("results[0].geometry.location.lat", equalTo(18.9352871f));

  }
  
  @Test
  public void test03()  {
	  given ().param ("query", "Churchgate Station")
    .param ("key", "AIzaSyDHro627WUHGQBzPV83yfaS2xukF47uvjo")
    .when()
    .get ("/maps/api/place/textsearch/json")
    .then()
    .body("results[0].name", equalTo("Churchgate")).and().body("results[0].geometry.location.lat", equalTo(18.9352871f));

  }
  
}