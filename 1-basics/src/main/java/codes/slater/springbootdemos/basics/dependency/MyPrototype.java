package codes.slater.springbootdemos.basics.dependency;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * This bean is a singleton
 */
@Service
@Scope(value = "prototype")
public class MyPrototype {

    private int number = Double.valueOf(Math.random() * 1000).intValue();

    public int randomNumber() {
        return number;
    }

}
