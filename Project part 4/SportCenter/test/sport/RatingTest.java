
package sport;

import org.junit.Test;
import static org.junit.Assert.*;


public class RatingTest {
    
   

    /**
     * Test of rating method, of class Rating.
     */
    @Test
    public void testRating() {
        Rating ra =new Rating();
        String expected =" ";
        String actual=ra.review;
        assertEquals(expected, actual);
        
    }
    
}
