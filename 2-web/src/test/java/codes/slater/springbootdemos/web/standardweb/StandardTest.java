package codes.slater.springbootdemos.web.standardweb;

import codes.slater.springbootdemos.web.standardweb.basicweb.MyWebController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * Test the Objects returned by your controllers
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StandardTest {

	@Autowired
	MyWebController myWebController;

	@Test
	public void testHello() {

		String hello = myWebController.hello();

		Assert.assertEquals("Hello Spring Web!", hello);

	}


}
