package ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Swaggercover {
	public void deleteCoverph(){
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
		 when().log().all().delete("/CoverPhotos/5"). then().log().all().assertThat().statusCode(200);
	}
	public void CoverphotoPost() throws FileNotFoundException{
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
			body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\PostSwagger.txt" )). header("Accept","application/json"). // *
		  header("Content-Type","application/json").header(  "Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM="). 
		 when().log().all().post("/CoverPhotos"). 
		  then().log().all().assertThat().statusCode(200); 
	}
	public static String getFileContent(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
	public void GetCoverPhoto() {
		
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
		 when().log().all().get("/CoverPhotos/2"). then().log().all().assertThat().statusCode(200);
	}
	
	public void CoverphotoPut() throws FileNotFoundException{
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
			body(getFile("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\test\\java\\ApiUtils\\SWaggwrPut.java" )). header("Accept","application/json"). // *
		  header("Content-Type","application/json").header(  "Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM="). 
		 when().log().all().put("/CoverPhotos/0"). 
		  then().log().all().assertThat().statusCode(200); 
	}
	public static String getFile(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
	public void CoverPatchMethod() throws FileNotFoundException{
		 RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1").
			body(getFile1("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\test\\java\\ApiUtils\\SwaggerPatch.java" )). header("Accept","application/json"). // *
		  header("Content-Type","application/json").header(  "Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM="). 
		 when().log().all().patch("/CoverPhotos/0"). 
		  then().log().all().assertThat().statusCode(200); 
	}
	public static String getFile1(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
		
}
