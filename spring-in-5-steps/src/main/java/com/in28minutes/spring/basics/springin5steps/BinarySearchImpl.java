package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl{
	
	@Autowired
	SortAlgorithm sortAlgorithm;
	
	BinarySearchImpl(SortAlgorithm sortAlgorithm){
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public String search(int[] is, int i) {
		String sortAlgorithmName = sortAlgorithm.sort();
		return sortAlgorithmName;
	}

}
