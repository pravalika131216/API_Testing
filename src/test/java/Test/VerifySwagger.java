package Test;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;


import ApiUtils.Sample;
	


public class VerifySwagger extends Sample{
	@Test(priority=4)
	public void get() {
	Sample obj=new Sample();
		obj.SgetMethod();
	}

@Test(priority=1)
public void delete() {
Sample obj=new Sample();
obj.deleteMethod();
}
@Test(priority=3)
public void Post() throws FileNotFoundException {
	Sample obj=new Sample();
	obj.SPostMethod();
}
@Test(priority=2)
public void Put() throws FileNotFoundException {
	Sample obj=new Sample();
	obj.SPutMethod();
}
@Test(priority=5)
public void Patch() throws FileNotFoundException {
	Sample obj=new Sample();
	obj.SPatchMethod();
} 
	
}
