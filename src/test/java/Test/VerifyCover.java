package Test;


import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.Swaggercover;

public class VerifyCover extends Swaggercover {
	@Test
	public void get1() {
		Swaggercover obj2=new Swaggercover ();
		
		obj2.GetCoverPhoto();
	}

	@Test(priority=1)
	public void delete1() {
		Swaggercover obj2=new Swaggercover ();
	obj2.deleteCoverph();
	}
	@Test(priority=3)
	public void Post1() throws FileNotFoundException {
		Swaggercover obj2=new Swaggercover ();
		obj2.CoverphotoPost();
	}
	@Test(priority=4)
	public void Put() throws FileNotFoundException {
		Swaggercover obj2=new Swaggercover ();
		obj2.CoverphotoPut();
}
	@Test(priority=5)
	public void Patch() throws FileNotFoundException {
		Swaggercover obj2=new Swaggercover();
		obj2.CoverphotoPut();
}
}
