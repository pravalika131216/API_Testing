package Test;



import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.Put;

public class Verifyputmethod extends Put{
	@Test
	public void Putmethod() throws FileNotFoundException {
		Put obj4=new Put();
		obj4.PutMethod();
	}

}