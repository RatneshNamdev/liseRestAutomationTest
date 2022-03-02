package com.liseInfotech.RestAssuredTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PATCHMethodExample {

	@Test
	public void patchTest() {
		
		baseURI ="https://reqres.in/api/users/2";
		
//		Map<String, Object> map=new HashMap<String, Object>();
//		
//		map.put("name", "Jitendra");
//		map.put("job", "Developer");
//		
//		System.out.println(map);
//		
		JSONObject request=new JSONObject();
		request.put("name", "Ram");
		request.put("desn", "Software Tester");
		
		System.out.println(request.toJSONString());
		
		given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.patch(baseURI)
		.then()
			.statusCode(200)
			.log().all();
	}
}
