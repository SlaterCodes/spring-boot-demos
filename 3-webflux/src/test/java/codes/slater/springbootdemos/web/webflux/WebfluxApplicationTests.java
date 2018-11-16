package codes.slater.springbootdemos.web.webflux;

import codes.slater.springbootdemos.web.webflux.example.FluxController;
import codes.slater.springbootdemos.web.webflux.example.HelloModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebfluxApplicationTests {



	@Autowired
	FluxController fluxController;

	@Test
	public void testHello() {

		Mono<String> hello = fluxController.hello();

		assertEquals("Hello Spring Web!", hello.block());

	}


	@Test
	public void testHellos() {

		Flux<HelloModel> helloFlux = fluxController.helloJson();

		List<HelloModel> helloList = helloFlux.collectList().block();

		assert helloList != null;
		assertEquals(2, helloList.size());
		assertTrue(helloList.contains(new HelloModel("Spring Web")));
		assertTrue(helloList.contains(new HelloModel("is in flux")));

	}


}
