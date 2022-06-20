import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Sample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		RestAssured.given().baseUri("https://fakerestapi.azurewebsites.net/api/v1/").
		body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\swaggerpost.txt"))
		.header("Accept","application/json").header("Content-Type","application/json").when().log().all().put("/Activities")
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
