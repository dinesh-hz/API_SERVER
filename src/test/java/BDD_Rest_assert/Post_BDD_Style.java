package BDD_Rest_assert;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

public class Post_BDD_Style {
	
	//import static io.restassured.RestAssured.*;---static method
	
	 @Test (enabled = true)
	  public void post() {
		 File file = new File("./src/test/resources/jsonread.json");
		  given()
		  .baseUri("http://localhost:3000")
		  .header("content-Type","application/json")
//		  .body("{\r\n"
//					+ "\r\n"
//					+ "     \"name\":\"hai\",\r\n"
//					+ "    \"last_name\":\" holl\",\r\n"
//					+ "    \"father_name\":\"holl\"\r\n"
//					+ "}\r\n"
//					+ "    ")
		  .body(file)
		  .when()
		  .post("/posts")
		  .prettyPrint();
		  
		  
	  
	  }
	 
/*
 * 
 * 
 */

}
