package Non_BDD_style;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import Non_BDD_style_Baseclass.Bass_class_BDD_Style;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_Non_BDD_Style extends Bass_class_BDD_Style {

	@Test(enabled = true)
	public void getputmethod() throws JsonProcessingException {

		RestAssured.baseURI = "http://localhost:3000";

		RequestSpecification specification = RestAssured.given();

		specification.header("Content-Type", "application/json");

		specification
				.body(" {" + "    \"name\": \"dinessh\"," + "    \"role \" : \"Tester\"," + "\"ponit\" : \"nick\"}");

		Response request = specification.request(Method.PUT, "/posts/b235");

		String asPrettyString = request.asPrettyString();

		System.out.println(asPrettyString);

		String statusLine = request.getStatusLine();

		System.out.println(statusLine);

		/*
		 * only wo can use put requset to take all body and whatever you want to change
		 * that specfic value only you changed then you dont change onther value in the
		 * body
		 */

		/*
		 * 
		 * if you take the body in hard core the must be json formate
		 */
	}
}
