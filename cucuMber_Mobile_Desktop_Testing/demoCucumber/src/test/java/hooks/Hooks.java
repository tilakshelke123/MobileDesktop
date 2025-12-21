package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks {
	@Before
	public void beforeTest() {
		System.out.println("this will run before rach test ");
	}
	
	// "@BeforeAll" and "@AfterAll" must be write Static method  
	@BeforeAll
	public static void beforeAllTest() {
		System.out.println("this will run beforeAllTest ");
	}
	@After("@login") // "@login" this is tag  that is similarly work in testNG as "Groups"
	public void afterTest() {
		System.out.println("this will run afterTest ");
	}
}
