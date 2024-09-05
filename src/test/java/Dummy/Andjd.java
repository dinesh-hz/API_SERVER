package Dummy;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Andjd {

	@Test
	public void RegistrationSuccessful() {

		RestAssured.baseURI = "https://bookstore.toolsqa.com";
		RequestSpecification request = RestAssured.given();

		String paylod = "{\r\n" + "  \"userName\": \"TOOLSQA-Test\",\r\n" + "  \"password\": \"Test@@123\"\r\n" + "}";

		request.header("Content-Type", "application/json");

		request.body(paylod);

		Response post = request.post("/Account/v1/GenerateToken");

		post.prettyPrint();

		String asString = post.getBody().asString();

		String token = JsonPath.from(asString).get("token");

		// System.out.println("token :" + token);

		/////////////////////////////////////////////////////

		request.header("Authorization", "Bearer" + token);

		request.header("Content-Type", "application/json");

		String addbook = "{\r\n" + "  \"userId\": \"token\"+,\r\n" + "  \"collectionOfIsbns\": [\r\n" + "    {\r\n"
				+ "      \"isbn\": \"string\"\r\n" + "       \r\n" + "    }\r\n" + "  ]\r\n" + "}";

		Response post2 = request.body(addbook).post("/BookStore/v1/Books");

		post2.prettyPrint();

	}

}
