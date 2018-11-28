package codes.slater.springbootdemos.basics.props;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDefaultProps {

    @Autowired
    JavaProperties properties;

    @Test
    public void testDefaultProps() {

        assertEquals(Integer.valueOf(8), properties.getVersion());
        assertEquals("functional interfaces", properties.getFeatures().get(0));
        assertEquals("https://docs.oracle.com/javase/8/docs/api/", properties.getDocs());


    }


}
