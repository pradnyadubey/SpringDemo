package com.demo.test;

import org.junit.jupiter.api.Test;

import com.demo.SpringDemo;

public class SpringDemoTest {

	@Test
	public void test() {
		SpringDemo.main(new String[]{
                "--spring.main.web-environment=false",
                "--spring.autoconfigure.exclude=blahblahblah",
                // Override any other environment properties according to your needs
        });
	}

	
}
