package com.example.covid.daos;

import com.example.covid.models.CovidModel;

public interface ICovidDao {

	public CovidModel getListCovid();
	public CovidModel createCovid();
	public boolean deleateCovid();
	public boolean updateCovid();
	
}
