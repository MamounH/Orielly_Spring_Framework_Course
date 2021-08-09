package com.demo.spring.basics.demobasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoBasicsApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgo());
		int result = binarySearch.binarySearch(new int[]{12,4,6},3);

		System.out.println(result);

		SpringApplication.run(DemoBasicsApplication.class, args);
	}

}
