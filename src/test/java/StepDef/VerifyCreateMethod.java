package StepDef;

import java.io.FileNotFoundException;

import ApiUtils.Post;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyCreateMethod {
	@Given("Calling Create Ethod")
	public void calling_create_ethod() throws FileNotFoundException {
		Post obj3=new Post();
		obj3.PostMethod();
	}

	@Then("Excicuted Sucessfully")
	public void excicuted_sucessfully() {
	    System.out.println("New Id created Sucessfully");
	}

}
