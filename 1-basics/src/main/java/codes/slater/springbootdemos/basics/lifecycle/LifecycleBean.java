package codes.slater.springbootdemos.basics.lifecycle;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * The @Service annotation marks this class as a Bean.
 * Spring uses an AnnotationConfigApplicationContext which scans your classpath for beans
 */
@Service
public class LifecycleBean {

    private static final Logger  LOG = LoggerFactory.getLogger(LifecycleBean.class);

    public boolean constructor = false;
    public boolean init = false;
    public boolean myBeanLogic = false;
    public boolean destroy = false;

    public LifecycleBean() {

        constructor = true;
        LOG.info("constructor");

    }


    /**
     * The @PostConstruct method can be called 1 time per-bean and runs after the bean has been constructed
     */
    @PostConstruct
    public void init() {

        init = true;
        LOG.info("init()");

    }

    /**
     * This is a regular method on your bean
     */
    public void myBeanLogic() {

        myBeanLogic = true;
        LOG.info("myBeanLogic()");

    }

    /**
     * The @PreDestroy method is called before the Spring container shuts down
     * Dispose active connection objects, finish flushing data to I/O sources
     */
    @PreDestroy
    public void destroy() {

        destroy = true;
        LOG.info("destroy()");
    }
}
