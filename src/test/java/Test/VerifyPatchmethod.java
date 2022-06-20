package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import ApiUtils.Patch;

public class VerifyPatchmethod extends Patch{
	@Test
public void TestPatch() throws FileNotFoundException {
		Patch obj5=new Patch();
		obj5.Pathmethod();
}
}
