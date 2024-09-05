package BDD_Rest_assert;

import org.testng.annotations.Test;


import  static io.restassured.RestAssured.*; ///vary imporanted

public class Get_BDD_Style {
	
	//import static io.restassured.RestAssured.*;---static method

	
	@Test(enabled = true)
	public void Get() {
				
		given()
		.baseUri("http://localhost:3000")
		.when()
		.get("/posts")
		.prettyPrint();
 
	}
	}
