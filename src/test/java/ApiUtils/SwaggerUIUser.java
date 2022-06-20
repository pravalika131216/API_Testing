package ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class SwaggerUIUser {
	
	public void SwUIdelete(){
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
		 when().log().all().delete("/Users/7"). then().log().all().assertThat().statusCode(200);
	}
	public void SwaggerUIPost() throws FileNotFoundException{
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
			body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\PostSwagger.txt" )). header("Accept","application/json"). // *
		  header("Content-Type","application/json").header(  "Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM="). 
		 when().log().all().post("/Users"). 
		  then().log().all().assertThat().statusCode(200); 
	}
	public static String getFileContent(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
	public void GetSwaggwer() {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
		 when().log().all().get("/Users/2"). then().log().all().assertThat().statusCode(200);
	}
	
	public void SPutMethod() throws FileNotFoundException{
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
			body(getFile("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\swaggerput.txt" )). header("Accept","application/json"). // *
		  header("Content-Type","application/json").header(  "Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM="). 
		 when().log().all().put("/Users/0"). 
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
			body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\patch.txt" )). header("Accept","application/json"). // *
		  header("Content-Type","application/json").header(  "Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM="). 
		 when().log().all().patch("/Users/0"). 
		  then().log().all().assertThat().statusCode(405); 
	}
	public static String getFile1(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
		
	}
	

