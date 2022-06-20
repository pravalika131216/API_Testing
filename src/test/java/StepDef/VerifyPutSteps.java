package StepDef;

import java.io.FileNotFoundException;

import ApiUtils.Put;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyPutSteps {
	@Given("Calling Put Ethod")
	public void calling_put_ethod() throws FileNotFoundException {
		Put obj4=new Put();
		obj4.PutMethod();
	}

	@Then("PutMethod Excicuted Sucessfully")
	public void put_method_excicuted_sucessfully() {
	    System.out.println("The data updated in id no 1144 Sucessfully");
	}

}
