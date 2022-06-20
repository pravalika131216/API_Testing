package Test;

import org.testng.annotations.Test;


import ApiUtils.Swaggerget;

public class VerifySwaggerget extends Swaggerget{
	@Test
public void Testgetmethod() {
		Swaggerget s=new Swaggerget();
		s.SgetMethod();
}
}
