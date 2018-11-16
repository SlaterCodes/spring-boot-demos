package codes.slater.springbootdemos.actuator;

import codes.slater.springbootdemos.actuator.config.CoolProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigTest {

    @Autowired
    CoolProperties coolProperties;

    @Test
    public void testConfigs() {


        assertEquals("Michael",coolProperties.getFirstName());
        assertTrue(coolProperties.cool());

    }

}
