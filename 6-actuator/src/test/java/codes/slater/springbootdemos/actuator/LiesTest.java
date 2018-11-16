package codes.slater.springbootdemos.actuator;


import codes.slater.springbootdemos.actuator.config.CoolProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("lies")
public class LiesTest {

    @Autowired
    CoolProperties coolProperties;

    @Test
    public void testLies() {


        assertEquals("Banana",coolProperties.getFirstName());
        assertFalse(coolProperties.isCool());

    }

}
