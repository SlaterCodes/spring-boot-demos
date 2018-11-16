package codes.slater.springbootdemos.web.standardweb.basicweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebController {


    @GetMapping("/hello")
    public String hello() {

        return "Hello Spring Web!";

    }

    @GetMapping("/hello-json")
    public HelloModel helloJson() {

        return new HelloModel("Spring Web makes json easy");

    }

}
