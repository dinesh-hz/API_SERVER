package Rest_Assert_Authenitcation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class Bearer_TokenAuth {
	
	// https://api.github.com/user/repos 
	// "message": "Requires authentication",
	
	/**
	 * github all accessing code in resposite to bearer_Auth  
	 */
	
	@Test
	public void bearer_Auth() {
		
		String token = "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";
		
		given()
		.baseUri("https://api.github.com/")
		.header("Authorization","Bearer "+token)
		.when()
		.get("user/repos")
		.prettyPrint();
		

	}

}
