package Non_BDD_style;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import Non_BDD_style_Baseclass.Bass_class_BDD_Style;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONArray;

public class Delete_Non_BDD_Style extends Bass_class_BDD_Style {

	Response re;

	@Test(priority = 1)
	public void getmethod() throws IOException {

		RestAssured.baseURI = "http://localhost:3000";

		RequestSpecification given = RestAssured.given();

		re = given.request(Method.GET, "/posts");

		String body = re.getBody().asString();

		DocumentContext context = JsonPath.parse(body);

		JSONArray read = context.read("$.*.your age");

		Object[] array = read.toArray();

		for (int i = 0; i < array.length; i++) {


			RestAssured.baseURI = "http://localhost:3000";

			RequestSpecification requestSpecification = RestAssured.given();

			requestSpecification.request(Method.DELETE, "/posts/"+array[i]);

			int statusCode = re.getStatusCode();

			System.out.println(statusCode);

			Assert.assertEquals(statusCode, 200);

		}

	}

	 //@Test(priority = 0)
	public void getdelectmethod() throws IOException {

		// Object userid = null;

		RestAssured.baseURI = "http://localhost:3000";

		RequestSpecification requestSpecification = RestAssured.given();

		/// File file = new File("./src/test/resources/data.json");

		re = requestSpecification.request(Method.DELETE, "/posts/");

		int statusCode = re.getStatusCode();

		System.out.println(statusCode);

		Assert.assertEquals(statusCode, 200);

		String statusLine = re.getStatusLine();

		System.out.println(statusLine);

	}

}
