package com.in28minutes.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements SortAlgorithm {

	@Override
	public String sort() {
		return "This Quick sort Algorithm";
	}

}
