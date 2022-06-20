import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		RestAssured.given().baseUri("https://restful-booker.herokuapp.com").
		body(getFileContent("C:\\Users\\PKUNDARA\\eclipse-workspace\\API\\src\\main\\resources\\createBooking.txt"))
		.header("Accept","application/json").header("Content-Type","application/json").header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=").when().log().all().patch("/booking/2197")
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
