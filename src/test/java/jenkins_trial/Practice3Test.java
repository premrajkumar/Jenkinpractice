package jenkins_trial;

import org.testng.annotations.Test;

public class Practice3Test {

	@Test
	public void main3()
	{
		String browser = System.getProperty("ky");
		String url = System.getProperty("ul");
		System.out.println(browser);
		System.out.println(url);
	}
}
