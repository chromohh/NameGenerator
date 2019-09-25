package sindre;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void testRandomNumber(){
        Randomizer asd = new Randomizer();
        int test = asd.randomNumber(15);
        System.out.println(test);
        assertNotNull(test);
    }
}
