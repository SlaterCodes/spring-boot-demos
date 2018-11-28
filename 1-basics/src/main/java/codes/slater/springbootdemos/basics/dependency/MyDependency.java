package codes.slater.springbootdemos.basics.dependency;


import org.springframework.stereotype.Service;

@Service
public class MyDependency {

    private int number = Double.valueOf(Math.random() * 1000).intValue();

    public int randomNumber() {
        return number;
    }

}
