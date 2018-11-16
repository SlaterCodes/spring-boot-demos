package codes.slater.springbootdemos.datamongo.data;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface DataRepo extends ReactiveMongoRepository<DataModel,String> {

    Flux<DataModel> findAllByText(String text);

}
