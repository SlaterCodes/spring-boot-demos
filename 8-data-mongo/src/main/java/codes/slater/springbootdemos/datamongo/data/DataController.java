package codes.slater.springbootdemos.datamongo.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class DataController {

    private final DataRepo dataRepo;


    @Autowired
    public DataController(DataRepo dataRepo) {
        this.dataRepo = dataRepo;
    }

    @GetMapping("/create")
    public Flux<DataModel> createIt() {
        return dataRepo.saveAll(List.of(new DataModel("1","hello"),new DataModel("2","hello"),new DataModel("3","goodbye")));
    }

    @GetMapping("/id/{value}")
    public Mono<DataModel> findById(@PathVariable String value) {
        return dataRepo.findById(value);
    }

    @GetMapping("/text/{text}")
    public Flux<DataModel> findByText(@PathVariable String text) {
        return dataRepo.findAllByText(text);
    }

    @GetMapping("/all")
    public Flux<DataModel> findAll() {
        return dataRepo.findAll();
    }

    @GetMapping("/test")
    public Mono<String> test() {
        return Mono.just("test");
    }
}
