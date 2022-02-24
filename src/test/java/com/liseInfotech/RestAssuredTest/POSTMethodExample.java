package com.liseInfotech.RestAssuredTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;


public class POSTMethodExample {
	
	@DataProvider(name="dataForPost")
	public Object[][] dataForPost(){
		
		return new Object[][] {
			{"Graham", "Bell", 1},
			{"Henry", "ford", 2}
		};
	}

	
	@Test(dataProvider = "dataForPost")
	public void postTest( String first_name, String last_name, int id ) {

		baseURI = "https://reqres.in/api/users/";

		JSONObject request= new JSONObject();
		
//		request.put("first_name1", "Ramesh");
//		request.put("last_name1", "cruise");
//		request.put("desn", "Software Tester");
//		request.put("email", "rt.ftrsu@hjj.com");
//		request.put("id", 7);

		given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.header("Content-Type", "application/json")
			.body(request.toJSONString())
		.when()
			.post(baseURI)
		.then()
			.statusCode(201).log().all();

		System.out.println(request.toJSONString());

	}
}
