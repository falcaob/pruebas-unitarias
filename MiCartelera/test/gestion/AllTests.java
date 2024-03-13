package gestion;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(EspectadorTest.class);
		suite.addTestSuite(PeliculaTest.class);
		suite.addTestSuite(MiCineTest.class);
		//$JUnit-END$
		return suite;
	}

}
