package com.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jdo.PersistenceManager;

import com.basis.City;


public class CityService {

	public Long create(City city) {

		if (city == null) {
			throw new NullPointerException("City is null!");
		}

		city.setDate(new Date());

		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try {
			pm.makePersistent(city);
		} finally {
			pm.close();
		}

		return city.getId();
		
	}

	public List<City> getAllCities() {
		List<City> cities = new ArrayList<City>();
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {

			String query = "select from " + City.class.getName();
			cities = (List<City>) pm.newQuery(query).execute();
		} finally {
			pm.close();
		}

		
		
		return cities;
	}

}
