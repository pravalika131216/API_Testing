package StepDef;

import ApiUtils.Deletemethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyDeleteSteps {
	@Given("Calling Delete Ethod")
	public void calling_delete_ethod() {
		Deletemethod obj2=new Deletemethod();
		obj2.deleteMethod();
	}

	@Then("Delete excuted Succesfully")
	public void delete_excuted_succesfully() {
		  System.out.println("Delete Method Excicuted Sucessfully");
	}
}
