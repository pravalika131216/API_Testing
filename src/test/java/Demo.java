import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
		body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\createbooking1"))
		.header("Accept","application/json").header("Content-Type","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().put("/booking/2118")
	.then().log().all();
	
	}
	public static String getFileContent(String filePath) throws FileNotFoundException 
    {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        return sc.next();



	}

	}


