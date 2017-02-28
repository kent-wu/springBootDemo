package com.kentwu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoControllerTests {

	@Autowired
	private TestRestTemplate testRestTemplate;
	
	@Test
	public void should_return_hello_world() {
		ResponseEntity<String> entity = testRestTemplate.getForEntity("/hello", String.class);
		assertThat(entity.getBody()).isEqualTo("Hello World!");
	}

}
