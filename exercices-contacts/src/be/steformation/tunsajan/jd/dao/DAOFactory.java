package be.steformation.tunsajan.jd.dao;

import javax.activation.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import be.steformations.java_data.contacts.interfaces.dao.ContactDao;
import be.steformations.java_data.contacts.interfaces.dao.CountryDao;
import be.steformations.java_data.contacts.interfaces.dao.DaoFactory;
import be.steformations.java_data.contacts.interfaces.dao.TagDao;

public class DAOFactory implements DaoFactory {
	private DAOContact _daoContact;
	private DAOCountry _daoCountry;
	private DAOTag _daoTag;
	
	public DAOFactory(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:postgresql://localhost/contact", "postgres", "postgres");
	//DataSource dataSource = new org.springframework.jdbc.datasource.DriverManagerDataSource("jdbc:postgresql://PRIM2014-14/contact", "postgres", "postgres");
	JdbcTemplate jdbcTemplate = new JdbcTemplate((javax.sql.DataSource) dataSource);
		this._daoContact = new DAOContact(jdbcTemplate);
		this._daoCountry = new DAOCountry(jdbcTemplate);
		this._daoTag = new DAOTag(jdbcTemplate);
	}

	@Override
	public ContactDao getContactDao() {
		return this._daoContact;
	}

	@Override
	public CountryDao getCountryDao() {
		// TODO Auto-generated method stub
		return this._daoCountry;
	}

	@Override
	public TagDao getTagDao() {
		// TODO Auto-generated method stub
		return this._daoTag;
	}

}
