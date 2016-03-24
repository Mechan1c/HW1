package testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
   ArrayTest.class,
   CyclesTest.class,
   ConditionalTests.class,
   FunctionsTest.class
   })
public class JunitTestSuite {   
}  	