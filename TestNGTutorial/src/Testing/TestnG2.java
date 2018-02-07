package Testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestnG2 {
	
	@Parameters("URL")
	@Test
	void carLoan()
	{
		System.out.println("CARLOAN");
		System.out.println();
	}

}
