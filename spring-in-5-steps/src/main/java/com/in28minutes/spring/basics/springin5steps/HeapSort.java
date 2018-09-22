package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HeapSort implements SortAlgorithm{
	
	@Override
	public String sort(){
		return "This is Heap sort algorithm";
	}
}
