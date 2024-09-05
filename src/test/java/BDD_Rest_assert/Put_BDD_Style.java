package BDD_Rest_assert;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Put_BDD_Style {
	
	//import static io.restassured.RestAssured.*;---static method
	
	 @Test (enabled = true)
	  public void put() {
		  given()
		  .baseUri("http://localhost:3000")
		  .header("content-type","application/json")
		  .body("{\r\n"
					+ "    \"name\": \"waste\",\r\n"
					+ "    \"last_name\": \" waste\",\r\n"
					+ "    \"father_name\": \"waste\",\r\n"
					+ "    \r\n"
					+ "  }")
		  .when()
		  .put("/posts/1511")
		  .prettyPrint();
		 
	  
	  }

}
