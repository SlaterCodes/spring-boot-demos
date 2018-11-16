package codes.slater.springbootdemos.web.webflux.example;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloModel that = (HelloModel) o;
        return Objects.equals(hello, that.hello);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hello);
    }
}
