
package sport;

import org.junit.Test;
import static org.junit.Assert.*;


public class championClassTest {
    
    
    @Test
    public void testSomeMethod() {
        championClass cha =new championClass();
        int expected = 0;
        int actual=cha.result;
        assertEquals(expected, actual);
    }
    
}
