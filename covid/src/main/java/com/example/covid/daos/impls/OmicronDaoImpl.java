package com.example.covid.daos.impls;

import org.springframework.stereotype.Repository;

import com.example.covid.daos.ICovidDao;
import com.example.covid.models.Alpha;
import com.example.covid.models.CovidModel;
import com.example.covid.models.Omicron;
import com.example.covid.ultils.CovidConstants;

@Repository(value = CovidConstants.OmicronDaoValue)
public class OmicronDaoImpl implements ICovidDao{

	private CovidModel alpha;
	@Override
	public CovidModel getListCovid() {
		alpha = new Omicron();
		alpha.setName("omicron1");
		alpha.setSpeed(2000);
		return alpha;
	}

	@Override
	public CovidModel createCovid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleateCovid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCovid() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
