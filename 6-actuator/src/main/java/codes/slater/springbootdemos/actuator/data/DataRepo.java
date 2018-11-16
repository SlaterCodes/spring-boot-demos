package codes.slater.springbootdemos.actuator.data;


import org.springframework.data.repository.CrudRepository;

public interface DataRepo extends CrudRepository<Data,Integer> {

}