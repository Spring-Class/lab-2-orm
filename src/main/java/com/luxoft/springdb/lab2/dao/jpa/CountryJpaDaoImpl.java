package com.luxoft.springdb.lab2.dao.jpa;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.luxoft.springdb.lab2.dao.CountryDao;
import com.luxoft.springdb.lab2.model.Country;

import javax.persistence.EntityManager;

@Repository
public class CountryJpaDaoImpl extends AbstractJpaDao implements CountryDao {

	@Override
	public void save(Country country) {
		// TODO: Implement it
		EntityManager entityManager =entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();
		entityManager.persist(country);
		entityManager.getTransaction().commit();
	}

	@Override
	public List<Country> getAllCountries() {
		// TODO: Implement it
		return null;
	}

	@Override
	public Country getCountryByName(String name) {
		// TODO: Implement it
		return null;
	}

}
