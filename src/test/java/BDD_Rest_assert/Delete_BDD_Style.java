package BDD_Rest_assert;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Delete_BDD_Style {
	
	//import static io.restassured.RestAssured.*;---static method
	
	@Test (enabled = true)
	  public void delete() {
		
		
		
	//	int s = 100; 
		
	//	for (int i = 0; i <=s; i++) {
			
	//int d = i ;
		  given()
		  .baseUri("http://localhost:3000")
		  .when()
		  .delete("/posts/45")
		  .prettyPrint();
	  
	  }
//	}

}
