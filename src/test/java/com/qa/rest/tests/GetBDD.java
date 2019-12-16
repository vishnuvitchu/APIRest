package com.qa.rest.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetBDD {
	
	@Test
	public void testCircuits() {
		
		given().
		when().get("http://ergast.com/api/f1/2017/circuits.json").
		then().assertThat().statusCode(200).
		and().
		body("MRData.CircuitTable.Circuits.CircuitId",hasSize(20)).
		and().
		header("content-length", equalTo("4551"));
	

	}
	

}
