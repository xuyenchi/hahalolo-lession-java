package com.example.covid.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.covid.daos.ICovidDao;
import com.example.covid.models.CovidModel;
import com.example.covid.services.ICovidService;
import com.example.covid.ultils.CovidConstants;

@Service(value = CovidConstants.AlphaServiceValue)
public class AlphaServiceImpl implements ICovidService{

	@Autowired
	@Qualifier(value = CovidConstants.AlphaDaoValue)
	ICovidDao alpha;

	@Override
	public CovidModel getListCovid() {		
		return alpha.getListCovid();
	}
	
}
