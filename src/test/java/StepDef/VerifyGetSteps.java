package StepDef;

import ApiUtils.Deletemethod;
import ApiUtils.getMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyGetSteps {
	@Given("Calling Get Ethod")
	public void calling_get_ethod() {
		getMethod obj=new getMethod();
		obj.GetMethod();
		
		
	}

	@Then("excuted Succesfully")
	public void excuted_succesfully() {
	    System.out.println("Get Method Excicuted Sucessfully");
	   
	}
}
