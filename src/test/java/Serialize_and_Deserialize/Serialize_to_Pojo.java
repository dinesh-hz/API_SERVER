package Serialize_and_Deserialize;

//very impratent
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Serialize_to_Pojo {

	/**
	 * java object covert to json object-----[it this a serialize methode]
	 * 
	 * @throws JsonProcessingException
	 */
	@Test
	public void serlization_to_poja() throws JsonProcessingException {

		// File file = new File("./src/test/resources/jsonread.json");
		/*
		 * this is onther way of file upload to server
		 */

		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();

		map.put("name", "murudu");
		map.put("lastename", "dinesh");
		map.put("mail id", "dineshmeij@gmail.com");
		
		LinkedHashMap<String, Object> maaap = new LinkedHashMap<String, Object>();

		maaap.put("city", "murudu");
		maaap.put("stret", "dinesh");
		maaap.put("landmark", "dineshmeij@gmail.com");
		
		map.put("adders", maaap); 
		/**
		 * above the test result (map) is one object inside onther object method
		 */

		ArrayList<Object> linkedHashSet = new ArrayList<Object>();

		linkedHashSet.add("java");
		linkedHashSet.add("selenium");
		linkedHashSet.add("paythan");

		map.put("skiles", linkedHashSet.toString());

		given().baseUri("http://localhost:3000/")
		.header("Content-Type", "application/json")
		.body(map)
		.when()
		.post("/posts")
		.prettyPrint();

	}

}
