package StepDef;

import java.io.FileNotFoundException;

import ApiUtils.Patch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyPatchStep {
	@Given("Calling Patch Ethod")
	public void calling_patch_ethod() throws FileNotFoundException {
		Patch obj5=new Patch();
		obj5.Pathmethod();
	}

	@Then("PatchMethod Excicuted Sucessfully")
	public void patch_method_excicuted_sucessfully() {
		 System.out.println("The data updated in id no 1144 Partially ");
	}
}
