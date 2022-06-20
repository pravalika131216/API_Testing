import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Swaggerget {

	public static void main(String[] args) throws FileNotFoundException {
		
//		  RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/").
//		 when().log().all().get("/Activities/2").
//		 then().log().all().assertThat().statusCode(200);
		 
		  
		 
//		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/").
//		body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\PostSwagger.txt" )). header("Accept","application/json"). // *
//		  header("Content-Type","application/json").header(  "Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM="). 
//	 when().log().all().post("/Activities"). 
//		  then().log().all().assertThat().statusCode(200); 
		
//		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/")
//		.body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\PostSwagger.txt"))
//	.header("Accept", "application/json").header("Content-Type", "application/json")
//	.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().put("/Activities/0").then()
//	.log().all().assertThat().statusCode(200);
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/")
		.body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\postswagger.txt"))
	.header("Accept", "application/json").header("Content-Type", "application/json")
	.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().delete("/Activities/0").then()
	.log().all().assertThat().statusCode(200);
	}

	public static String getFileContent(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}

}
