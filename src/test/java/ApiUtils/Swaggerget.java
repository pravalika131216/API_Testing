package ApiUtils;

import io.restassured.RestAssured;

public class Swaggerget {
	public void SgetMethod(){
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
		 when().log().all().get("/Authors/5"). then().log().all().assertThat().statusCode(200);
	}
}
