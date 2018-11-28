package codes.slater.springbootdemos.basics.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @SpringBootTest uses the spring-test package and indicates this is an integration test
 * @RunWith(SpringRunner) is making JUnit aware of the Spring context
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestLifecycle {

    @Autowired
    LifecycleBean lifecycleBean;

    @Test
    public void testLifecycleOrder() {

        assertTrue(lifecycleBean.constructor);
        assertTrue(lifecycleBean.init);
        assertFalse(lifecycleBean.myBeanLogic);


        /// init() and destroy() are invoked by Spring
        lifecycleBean.myBeanLogic();
        // Observe LOG output

        assertTrue(lifecycleBean.myBeanLogic);
        assertFalse(lifecycleBean.destroy);

    }
}
