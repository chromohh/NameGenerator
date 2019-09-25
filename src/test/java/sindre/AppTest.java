package sindre;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void GenerateTestList() {
        NameService asd = new NameService();
        int expected = 19391;
        int actual = asd.getFlickNamn().size();
        assertEquals(expected, actual);
    }
}
