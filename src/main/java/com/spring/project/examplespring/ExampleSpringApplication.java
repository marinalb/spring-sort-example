package com.spring.project.examplespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleSpringApplication {

	public static void main(String[] args) {


		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[] {123, 6}, 3);
		System.out.println(result);

		SpringApplication.run(ExampleSpringApplication.class, args);
	}

}
