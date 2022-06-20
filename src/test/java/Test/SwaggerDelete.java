package Test;

import org.testng.annotations.Test;

import ApiUtils.Swaggerdelete;

public class SwaggerDelete extends Swaggerdelete{
	@Test
	public void deleteM() {
		Swaggerdelete s1=new Swaggerdelete();
		s1.deleteMethod();
	}

}
