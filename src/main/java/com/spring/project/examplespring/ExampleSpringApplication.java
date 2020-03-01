package com.spring.project.examplespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExampleSpringApplication {

	public static void main(String[] args) {

       ApplicationContext applicationContext =
                SpringApplication.run(ExampleSpringApplication.class, args);

        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {123, 4, 6}, 3);

		System.out.println(result);

	}

}
