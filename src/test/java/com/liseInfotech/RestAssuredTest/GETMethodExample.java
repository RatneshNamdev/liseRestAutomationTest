package com.liseInfotech.RestAssuredTest;

import org.testng.annotations.Test;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import java.util.Map;

import static org.hamcrest.MatcherAssert.*;

public class GETMethodExample {

	@Test 
	public void getTest() {
		baseURI = "https://reqres.in/api/users?page=2";

		Response response= given().contentType(ContentType.JSON).get();
		System.out.println(response.asString());
		
		//Map data=response.then().extract().path("data");
		response.prettyPrint();

		assertThat(response.getStatusCode(), is(HttpStatus.SC_OK));
		JsonPath jsonObj= response.jsonPath();

		assertThat(jsonObj.get("total"), is(12));
		assertThat(jsonObj.get("page"), is(equalTo(1)));
		assertThat(jsonObj.get("per_page"), is(equalTo(6)));
		assertThat(jsonObj.get("total_pages"), is(equalTo(2)));

//		assertThat(jsonObj.get("data.first_name"), equalTo("Michael"));
//		assertThat(jsonObj.get("data.email"), is(equalTo("michael.lawson@reqres.in")));
//		assertThat(jsonObj.get("data.last_name"), is("Lawson"));

		System.out.println("total : "+ jsonObj.get("total"));
		System.out.println("page : "+ jsonObj.get("page"));
		System.out.println("per_page : "+ jsonObj.get("per_page"));
		System.out.println("total_pages : "+ jsonObj.get("total_pages"));
		System.out.println("---------------------------------------------------------------");
		
//		System.out.println("id-7 => first_name : " + jsonObj.get("data.first_name"));
//		System.out.println("email :" + jsonObj.get("data.email"));
//		System.out.println("last_name : " + jsonObj.get("data.last_name"));
	}

//	@Test
	public void getDataObjTest() {
		baseURI="https://reqres.in/api/users?page=2";

		Response response= given().contentType(ContentType.JSON).get();
		JsonPath jsonObj=response.jsonPath();

//		Map data=response.then().extract().path("data");

		response.prettyPrint();

		assertThat(response.getStatusCode(), is(HttpStatus.SC_OK));
		
//		assertThat(jsonObj.get("data.first_name"), is(equalTo("Lindsay")));
//		assertThat(jsonObj.get("data.email"), equalTo("lindsay.ferguson@reqres.in"));

		System.out.println("first_name : " + jsonObj.get("data.first_name"));
		System.out.println("email : " + jsonObj.get("data.email"));
	}
}