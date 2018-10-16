package com.example.postgresdemo.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.ReputationEmployee;
import com.example.postgresdemo.repository.ReputationEmpoyeeRepository;
import com.example.postgresdemo.utils.MdcUtils;

@RestController
public class WebController {
	
	private static final Logger logger = LoggerFactory.getLogger(WebController.class);
	
	@Autowired
	ReputationEmpoyeeRepository repository;

	@RequestMapping("/save")
	public String process() {
		repository.save(new ReputationEmployee("RIPL009","Dilip", "Yadav"));
		return "Done";
	}

	@GetMapping("/getReputationEmployeeName")
	public String getReputationEmployee(@RequestParam("id") String id) {
		Optional<ReputationEmployee> findbyid = repository.findById(id);
		ReputationEmployee ReputationEmployee = findbyid.get();
		return ReputationEmployee.getName();
	}

	@PostMapping(value = "/saveReputationEmployee")
	public ReputationEmployee createReputationEmployee(@RequestBody ReputationEmployee ReputationEmployee) {// @RequestBody
																// means to
																// parse JSON
																// data into map
																// or java beans
																// and only
																// support
																// content type
																// is
																// "application/json;charset=UTF-8"
		MdcUtils.put("r_e_name", ReputationEmployee.getFirstName());
		logger.info("Saving ReputationEmployee data");
		logger.info("ReputationEmployee name: {}", ReputationEmployee.getFirstName());
		MdcUtils.removeKey("r_e_name".toString());
		return repository.save(ReputationEmployee);
	}
}
