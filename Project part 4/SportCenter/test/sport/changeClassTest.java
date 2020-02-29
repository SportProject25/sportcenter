package sport;

import org.junit.Test;
import static org.junit.Assert.*;


public class changeClassTest {
    
  

    /**
     * Test of saturday method, of class changeClass.
     */
    @Test
    public void testSaturday() {
        
        changeClass ch =new changeClass();
        String expected ="";
        String actual=ch.timings;
        assertEquals(expected, actual);
    }

    /**
     * Test of sunday method, of class changeClass.
     */
    @Test
    public void testSunday() {
       changeClass ch =new changeClass();
        String expected ="";
        String actual=ch.timings;
        assertEquals(expected, actual);
    }

    
    
}
