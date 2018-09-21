package com.in28minutes.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgorithm{
	public String sort(){
		return "This is Bubble sort algorithm";
	}
}
