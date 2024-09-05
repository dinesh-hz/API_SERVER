package Non_BDD_style;

import java.io.IOException;

import org.testng.annotations.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import Non_BDD_style_Baseclass.Bass_class_BDD_Style;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONArray;

public class Get_Non_BDD_Style extends Bass_class_BDD_Style {

	public Response re;


	@Test
	public void getmethod() throws IOException {

		RestAssured.baseURI = "http://localhost:3000";

		RequestSpecification given = RestAssured.given();

		re = given.request(Method.GET, "/posts");

		String body = re.getBody().asString();

		DocumentContext context = JsonPath.parse(body);

		JSONArray read = context.read("$.*.id");

		Object[] array = read.toArray();

		// System.out.println("my deleat dat" + read);


		for (int i = 0; i < array.length; i++) {

			// System.out.println(array[i]);


		}


	}

}
