package codes.slater.springbootdemos.web.webflux.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class FluxController {


    @GetMapping("/hello")
    public Mono<String> hello() {

        return Mono.just("Hello Spring Web!");

    }

    @GetMapping("/hello-json")
    public Flux<HelloModel> helloJson() {

        List<HelloModel> models = List.of(new HelloModel("Spring Web"), new HelloModel("is in flux"));

        return Flux.fromIterable(models);
    }

}
