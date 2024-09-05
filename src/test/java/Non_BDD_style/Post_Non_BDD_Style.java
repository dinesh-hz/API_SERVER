package Non_BDD_style;

import org.testng.annotations.Test;

import Non_BDD_style_Baseclass.Bass_class_BDD_Style;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Non_BDD_Style extends Bass_class_BDD_Style {

	@Test(enabled = true)
	public void postmethod() {

		RestAssured.baseURI = "http://localhost:3000";

		RequestSpecification given = RestAssured.given();

		// given.contentType(ContentType.JSON);

		given.header("Content-Type", "application/json");

		given.body("{" + "		\"name\": \"hai\"," + "		\"role\": \"hhj\"," + "		\"age\": 400,"
				+ "		\"class\": \"hsdjh\"}");

		Response response = given.request(Method.POST, "/posts");

		Object path = response.path("id");

		System.out.println("the id number is : "+path);

		response.prettyPrint();

		/**
		 * prettyPrint is just print value in console that all .
		 */

	}

}
