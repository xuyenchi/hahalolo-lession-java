package com.example.covid.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.covid.models.CovidModel;
import com.example.covid.services.ICovidService;
import com.example.covid.ultils.CovidConstants;

@RestController
@RequestMapping(value = "/covid")
public class CovidRest {

	@Autowired
	@Qualifier(value = CovidConstants.CurrentServiceValue)
	ICovidService covid;
	
	@GetMapping("/list")
	public CovidModel getListCovid() {
		return covid.getListCovid();
	}

}
