package codes.slater.springbootdemos.web.webflux.example;

public class HelloModel {

    private String hello;

    public HelloModel(String text) {
        hello = text;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
