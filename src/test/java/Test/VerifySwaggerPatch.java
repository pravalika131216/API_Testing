package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.SwaggerPatch;

public class VerifySwaggerPatch extends SwaggerPatch{
	@Test
	public void TestSPatch() throws FileNotFoundException {
		SwaggerPatch s6=new SwaggerPatch();
		s6.SwagPathmethod();
	}

}
