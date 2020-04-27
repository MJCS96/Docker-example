import edu.ubb.store.model.ComputerPart;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class ComputerPartTest {
    ComputerPart computerPart = new ComputerPart();

    @Before
    public void setUp(){
        computerPart = new ComputerPart((long) 1,"Computer Part Name","Desc",214.0);
    }
    @Test
    public void getNameTest(){
        String expected = "Computer Part Name";
        String result = computerPart.getName();
        assertThat(result,is(equalTo(expected)));
    }
}
