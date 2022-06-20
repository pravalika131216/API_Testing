package ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Sample {
	public void SgetMethod(){
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
		 when().log().all().get("/Authors/5"). then().log().all().assertThat().statusCode(200);
	}
	public void deleteMethod(){
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
		 when().log().all().delete("/Authors/1"). then().log().all().assertThat().statusCode(200);
	}
	public void SPostMethod() throws FileNotFoundException{
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
			body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\PostSwagger.txt" )). header("Accept","application/json"). // *
		  header("Content-Type","application/json").header(  "Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM="). 
		 when().log().all().post("/Authors"). 
		  then().log().all().assertThat().statusCode(200); 
	}
	public static String getFileContent(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
	public void SPutMethod() throws FileNotFoundException{
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
			body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\swaggerput.txt" )). header("Accept","application/json"). // *
		  header("Content-Type","application/json").header(  "Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM="). 
		 when().log().all().put("/Authors/0"). 
		  then().log().all().assertThat().statusCode(200); 
	}
	public static String getFile(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
	public void SPatchMethod() throws FileNotFoundException{
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
			body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\swaggerput.txt" )). header("Accept","application/json"). // *
		  header("Content-Type","application/json").header(  "Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM="). 
		 when().log().all().patch("/Authors/0"). 
		  then().log().all().assertThat().statusCode(405); 
	}
	public static String getFile1(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
}
