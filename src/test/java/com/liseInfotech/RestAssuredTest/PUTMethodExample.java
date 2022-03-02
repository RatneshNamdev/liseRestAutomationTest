package com.liseInfotech.RestAssuredTest;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.MatcherAssert.*;


public class PUTMethodExample {

	@Test
	public void putTest() {

		//		baseURI="https://reqres.in/api/users/2";

		//		Response response= given().contentType(ContentType.JSON).get("https://reqres.in/api/users/2");

		JSONObject jsonObj= new JSONObject();

		jsonObj.put("first_name", "Janet");
		jsonObj.put("last_name", "Weaver");

		//		assertThat(response.getStatusCode(), is(HttpStatus.SC_OK));

		System.out.println(jsonObj);
		System.out.println(jsonObj.toJSONString());


		given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(jsonObj.toJSONString())
		.when()
			.put("https://reqres.in/api/users/2")
		.then()
			.statusCode(200)
			.log().all();

		//		given()
		//		.accept(ContentType.JSON)
		//		.contentType(ContentType.JSON)
		//		.header("Content-Type", "application/json")
		//		.body(jsonObj.toJSONString())
		//		.when()
		//		.put("https://reqres.in/api/users/2")
		//		.then()
		//		.statusCode(200).log().all();
	}


}
