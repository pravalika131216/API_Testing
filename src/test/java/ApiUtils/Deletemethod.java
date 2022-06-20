package ApiUtils;

import io.restassured.RestAssured;

public class Deletemethod {
	public void deleteMethod(){
		 RestAssured.given().baseUri("https://restful-booker.herokuapp.com").header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=").
		 when().log().all().delete("/booking/668"). then().log().all().assertThat().statusCode(201);
	}
	
	
}
