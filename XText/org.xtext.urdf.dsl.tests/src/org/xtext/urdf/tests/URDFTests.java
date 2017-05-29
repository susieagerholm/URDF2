package org.xtext.urdf.tests;

import org.junit.runner.RunWith; 
import org.junit.runners.Suite;
import org.xtext.urdf.tests.suite.DslCodeGeneratorTest;
import org.xtext.urdf.tests.suite.DslFormatterTest;
import org.xtext.urdf.tests.suite.DslParsingTest;
import org.xtext.urdf.tests.suite.DslValidationTest; 

@RunWith(Suite.class ) 
@Suite.SuiteClasses({     
    DslParsingTest.class,    
    DslValidationTest.class,     
    DslFormatterTest.class, 
    DslCodeGeneratorTest.class
}) 
    

public class URDFTests {

}
