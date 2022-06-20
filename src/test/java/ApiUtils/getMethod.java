package ApiUtils;

import io.restassured.RestAssured;

public class getMethod {
	public void GetMethod(){
	 RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
	 when().log().all().get("/booking/2"). then().log().all().assertThat().statusCode(200);
}
}