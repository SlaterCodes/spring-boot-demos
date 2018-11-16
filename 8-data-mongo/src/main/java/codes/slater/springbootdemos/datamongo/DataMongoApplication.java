package codes.slater.springbootdemos.datamongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
public class DataMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataMongoApplication.class, args);
	}
}
