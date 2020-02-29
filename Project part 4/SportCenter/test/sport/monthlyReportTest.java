
package sport;

import org.junit.Test;
import static org.junit.Assert.*;


public class monthlyReportTest {
 

    
    @Test
    public void testRating() {
        
         monthlyReport mr =new  monthlyReport();
        int expected = 0;
        int actual=mr.month;
        assertEquals(expected, actual);
    }
    
}
