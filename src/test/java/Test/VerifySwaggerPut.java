package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.SWaggwrPut;

public class VerifySwaggerPut extends SWaggwrPut {
	@Test
public void TestSput() throws FileNotFoundException {
		SWaggwrPut s4=new SWaggwrPut();
		s4.SPostMethod();
	
}
}
