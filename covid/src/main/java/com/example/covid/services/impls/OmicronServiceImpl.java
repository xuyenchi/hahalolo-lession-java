package com.example.covid.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.covid.daos.ICovidDao;
import com.example.covid.models.CovidModel;
import com.example.covid.services.ICovidService;
import com.example.covid.ultils.CovidConstants;

@Service(value = CovidConstants.OmicronServiceValue)
public class OmicronServiceImpl implements ICovidService{

	@Autowired
	@Qualifier(value = CovidConstants.OmicronDaoValue)
	ICovidDao omicron;

	@Override
	public CovidModel getListCovid() {		
		return omicron.getListCovid();
	}
	
}
