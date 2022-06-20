package Test;


import org.testng.annotations.Test;
import java.io.FileNotFoundException;

import ApiUtils.Sample;
import ApiUtils.SwaggerUIUser;

public class VerifySUsers extends SwaggerUIUser{
	@Test(priority=2)
	public void get1() {
		SwaggerUIUser obj1=new SwaggerUIUser ();
			obj1.GetSwaggwer();
		}

	@Test(priority=1)
	public void delete1() {
		SwaggerUIUser obj1=new SwaggerUIUser();
	obj1.SwUIdelete();
	}
	@Test(priority=3)
	public void Post1() throws FileNotFoundException {
		SwaggerUIUser obj1=new SwaggerUIUser();
		obj1.SwaggerUIPost();
	}
	@Test(priority=4)
	public void Put() throws FileNotFoundException {
		SwaggerUIUser obj1=new SwaggerUIUser();
		obj1.SPutMethod();
}
	@Test(priority=5)
	public void Patch() throws FileNotFoundException {
		SwaggerUIUser obj1=new SwaggerUIUser();
		obj1.SPatchMethod();
}
	}
