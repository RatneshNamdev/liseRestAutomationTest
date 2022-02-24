package com.liseInfotech.RestAssuredTest;

import static io.restassured.RestAssured.*;

public class DELETEMethodExample {

	public void deleteTest() {
		
		baseURI ="https://reqres.in/api/users/2";
		
			when()
				.delete(baseURI)
			.then()
				.statusCode(204)
				.log().all();
	}
}
