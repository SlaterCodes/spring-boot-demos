package codes.slater.springbootdemos.basics.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Spring scans your classpath to look for annotations declaring services
@Service
public class MyService {

    private final MyDependency myDependency;

    // Tells Spring to Inject Dependencies
    @Autowired
    public MyService(MyDependency myDependency) {
        this.myDependency = myDependency;
    }


    public int randomNumber() {
        return myDependency.randomNumber();
    }

    public MyDependency exposeMyDependency() {
        return myDependency;
    }

}
