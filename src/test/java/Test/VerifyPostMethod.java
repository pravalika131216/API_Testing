package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.Post;

public class VerifyPostMethod extends Post {
@Test
	public void TestPostmethod() throws FileNotFoundException {
	Post obj3=new Post();
	obj3.PostMethod();
		
	}
}
