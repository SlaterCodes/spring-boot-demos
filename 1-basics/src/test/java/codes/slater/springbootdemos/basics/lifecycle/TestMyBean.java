package codes.slater.springbootdemos.basics.lifecycle;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMyBean {


    @Autowired
    LifecycleBean lifecycleBean;

    @Test
    public void testLifecycleOrder() {

        // Only call myFunc()... init() and destroy() are called for us
        lifecycleBean.myFunc();
        // Observe LOG output

    }
}
