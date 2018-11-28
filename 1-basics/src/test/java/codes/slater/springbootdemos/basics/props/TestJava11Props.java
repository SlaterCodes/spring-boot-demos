package codes.slater.springbootdemos.basics.props;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

// You can integration test your environment profiles
@ActiveProfiles("java11")
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestJava11Props {

    @Autowired
    JavaProperties properties;

    @Test
    public void testOverrideProps() {


        assertEquals(Integer.valueOf(11), properties.getVersion());
        assertEquals("local-variable syntax for lambdas", properties.getFeatures().get(0));
        assertEquals("https://docs.oracle.com/en/java/javase/11/docs/api/index.html", properties.getDocs());

    }

}
