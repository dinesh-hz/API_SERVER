
package Non_BDD_style_Baseclass;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Bass_class_BDD_Style {

	public static RequestSpecification given;

	public static void bassURI(String url) {

		RestAssured.baseURI = url;
		given = RestAssured.given();

	}

	public static void qurpatha(String name, String valu) {
		given.queryParam(name, valu);

	}

	public static void pathaparameter(String name, String value) {
		given.pathParam(name, value);
	}

	public static Response Requst_Method(String requesttype, String resourseurl) {

		if (requesttype.equals("GET")) {
			return given.request(Method.GET, resourseurl);

		} else if (requesttype.equals("POST")) {
			return given.request(Method.POST, resourseurl);

		} else if (requesttype.equals("PUT")) {
			return given.request(Method.PUT, resourseurl);

		} else {
			return given.request(Method.DELETE, resourseurl);
		}

	}

	public static int Response_code(Response resorce) {

		return resorce.getStatusCode();

	}

	public static void Print_The_Body(Response valuee) {

		System.out.println(valuee.getBody().asPrettyString());

	}

	public static void addbody(String body) {

		given.body(body);

	}

	public static void hadertype(String content, String type) {

		given.header(content, type);

	}

}
