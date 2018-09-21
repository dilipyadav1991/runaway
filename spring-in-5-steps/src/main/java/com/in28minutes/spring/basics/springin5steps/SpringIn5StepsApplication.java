package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		String str = binarySearch.search(new int[] { 1, 2, 3 }, 2);
		System.out.println("Sorting algo: " + str);
	}
}
