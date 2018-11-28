package codes.slater.springbootdemos.basics.dependency;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @SpringBootTest Provides a fully working Spring Context that acts just like your running application
 *
 * @RunWith(SpringRunner) tells JUnit to expect a Spring context
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDependency {

    // Inject the service you want to test
    @Autowired
    MyService myService;

    // You can inject any Spring Bean - even framework beans such as the Spring Application Context object
    @Autowired
    ApplicationContext appContext;

    @Test
    public void testSameReference() {

        // We can request beans from the Spring Application Context
        var myDep = appContext.getBean(MyDependency.class);

        assertEquals(myDep, myService.exposeMyDependency());
        assertSame(myDep, myService.exposeMyDependency());
    }

    @Test
    public void testSingleton() {

        var service1 = appContext.getBean(MyService.class);

        assertEquals(myService, service1);
        assertSame(myService, service1);
        assertTrue(myService == service1);

        assertEquals(myService.randomNumber(), service1.randomNumber());


    }


    @Test
    public void testInstances() {

        var p1 = appContext.getBean(MyPrototype.class);
        var p2 = appContext.getBean(MyPrototype.class);

        assertNotEquals(p1, p2);
        assertNotSame(p1, p2);

        assertNotEquals(p1.randomNumber(), p2.randomNumber());
    }
}
