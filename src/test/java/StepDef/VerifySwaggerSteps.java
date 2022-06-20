package StepDef;

import java.io.FileNotFoundException;

import ApiUtils.SwaggerUIUser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifySwaggerSteps {
	@Given("Calling SwagerGet Ethod")
	public void calling_swager_get_ethod() {
		SwaggerUIUser obj1=new SwaggerUIUser ();
		obj1.GetSwaggwer();
	}

	@Then("Get excuted Succesfully")
	public void get_excuted_succesfully() {
	   System.out.println("Get method excicuted Sucessfully");
	}
	@Given("Calling SwagerCreate Ethod")
	public void calling_swager_create_ethod() {
	   
	}

	@Then("Create excuted Succesfully")
	public void create_excuted_succesfully() throws FileNotFoundException {
		SwaggerUIUser obj1=new SwaggerUIUser();
		obj1.SwaggerUIPost();
	}


}
