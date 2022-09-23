package jenkins_trial;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice2Test {

	@Test
	public void main1()
	{
		Reporter.log("main1", true);
	}
	
	@Test
	public void main2()
	{
		Reporter.log("main2", true);
	}
}
