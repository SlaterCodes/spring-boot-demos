package codes.slater.springbootdemos.basics.lifecycle;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class LifecycleBean {

    private static final Logger  LOG = LoggerFactory.getLogger(LifecycleBean.class);

    public LifecycleBean() {

        LOG.info("constructor");

    }


    @PostConstruct
    public void init() {

        LOG.info("init()");

    }

    public void myFunc() {

        LOG.info("myFunc()");

    }

    @PreDestroy
    public void destroy() {

        LOG.info("destroy()");
    }
}
