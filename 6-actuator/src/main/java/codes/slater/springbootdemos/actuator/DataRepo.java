package codes.slater.springbootdemos.actuator;


import org.springframework.data.repository.CrudRepository;

public interface DataRepo extends CrudRepository<Data,Integer> {

}