package Rest_Assert_Authenitcation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Api_auth {
	
	@Test
	public void Apikey() {
		//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
		
		given()
		.baseUri("https://api.openweathermap.org/")
		.queryParam("q", "chennai")
		.queryParam("appid", "fe1d12b332f1882bcc82259091713b3b")
		.when()
		.get("data/2.5/weather")
        .prettyPrint();
		
	//	.prettyPrint()
	}
	

}
