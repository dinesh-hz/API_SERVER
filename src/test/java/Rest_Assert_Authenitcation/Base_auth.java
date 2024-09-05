package Rest_Assert_Authenitcation;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.AuthenticationSpecification;
import io.restassured.specification.RequestSpecification;

//import static io.restassured.RestAssured.*;

public class Base_auth {
	@Test

	public void baseur() {

		RestAssured.baseURI = "https://postman-echo.com";

		RequestSpecification httpRequest = RestAssured.given();

		AuthenticationSpecification auth = httpRequest.auth();

		auth.basic("postman", "password");
		
		Response res = httpRequest.request(Method.GET,"/basic-auth");
		
		ResponseBody body = res.getBody();
		
		String asString = body.asString();
		
		
		System.out.println(asString);
		
		
		System.out.println(res.getStatusLine());
		
	}

}
