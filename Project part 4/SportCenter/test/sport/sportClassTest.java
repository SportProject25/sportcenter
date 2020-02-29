/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sport;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LAPTOP_MP0347
 */
public class sportClassTest {
    
   

    
    @Test
    public void testSaturday() {
        sportClass sc =new sportClass();
        String expected ="a";
        String actual=sc.timings;
        assertEquals(expected, actual);
    }

    
    @Test
    public void testSunday() {
        sportClass sc =new sportClass();
        String expected ="a";
        String actual=sc.timings;
        assertEquals(expected, actual);
    }

    
    
    
}
