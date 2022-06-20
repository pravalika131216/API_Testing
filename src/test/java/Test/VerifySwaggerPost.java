package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.SwaggerPost;

public class VerifySwaggerPost extends SwaggerPost {
	@Test
	public void TestSPost() throws FileNotFoundException {
		SwaggerPost s2=new SwaggerPost();
		s2.SPostMethod();
	}

}
