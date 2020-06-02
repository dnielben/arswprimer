package edu.escuelaing.arsw.intro;

import edu.escuelaing.arsw.intro.linecounter.FileReader;
import edu.escuelaing.arsw.intro.linecounter.LineCounter;
import edu.escuelaing.arsw.intro.linecounter.PhysicalLinesCounter;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test the main method
     */
    public void testApp()
    {   
        String file = "src/test/resources/App.java";
        FileReader fr= new FileReader();
        LineCounter lc = new PhysicalLinesCounter();        
        fr.readFile(file, lc);
        assertTrue( 17 == lc.getLineCount());   
    }
}
