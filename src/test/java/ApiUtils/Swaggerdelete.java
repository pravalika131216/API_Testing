package ApiUtils;

import io.restassured.RestAssured;

public class Swaggerdelete {
	public void deleteMethod(){
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
		 when().log().all().delete("/Authors/1"). then().log().all().assertThat().statusCode(201);
	}
}
