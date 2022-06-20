package ApiUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Put {
	public void PutMethod() throws FileNotFoundException{
	RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
	.body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\put.txt"))
.header("Accept", "application/json").header("Content-Type", "application/json")
.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().put("/booking/1144").then()
.log().all().assertThat().statusCode(200);
}
public static String getFileContent(String filePath) throws FileNotFoundException {
File file = new File(filePath);
Scanner sc = new Scanner(file);
sc.useDelimiter("\\Z");
return sc.next();
}
}
