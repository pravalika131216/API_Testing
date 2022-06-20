package ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class SwaggerPatch {
	public void SwagPathmethod() throws FileNotFoundException {
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1")
		.body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\Spatch.txt"))
	.header("Accept", "application/json").header("Content-Type", "application/json")
	.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().patch("/Authors/0").then()
	.log().all().assertThat().statusCode(200);
	}
	public static String getFileContent(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\Z");
		return sc.next();
	}
}
