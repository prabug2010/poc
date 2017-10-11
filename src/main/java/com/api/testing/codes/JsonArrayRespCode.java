package com.api.testing.codes;

import com.jayway.jsonpath.JsonPath;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import static com.jayway.restassured.RestAssured.given;

import java.util.List;

import org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JsonArrayRespCode {

	@BeforeClass
	public void setBasrURI()
	{
		RestAssured.baseURI="https://reqres.in";
	}
	
	@Test
	public void test()
	{
		Response res =  given().
		when().
		get("/api/users?page=2").
		then().assertThat().contentType(ContentType.JSON).extract().response();
		
		String w = res.asString();
		System.out.println(w);
		
		//jsonpath trial
		List<Object> l1 = JsonPath.read(w,"$.data[*].id");
		System.out.println(l1);
		
		//json path deep scan example
		List<Object> l2 = JsonPath.read(w,"$..id");
		System.out.println(l2);
		
	}
}
