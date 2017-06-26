package be.steformation.tunsajan.jd.dao;

import be.steformations.java_data.contacts.interfaces.dao.ContactDao;
import be.steformations.java_data.contacts.interfaces.dao.CountryDao;
import be.steformations.java_data.contacts.interfaces.dao.DaoFactory;
import be.steformations.java_data.contacts.interfaces.dao.TagDao;

public class DAOFactory implements DaoFactory {
	DAOContact _daoContact;
	
	public DAOFactory(){
		javax.sql.DataSource dataSource 
		= new org.springframework.jdbc.datasource.DriverManagerDataSource("jdbc:postgresql://PRIM2014-14/contact", "postgres", "postgres");
	org.springframework.jdbc.core.JdbcTemplate jdbcTemplate
		= new org.springframework.jdbc.core.JdbcTemplate(dataSource);
		this._daoContact = new DAOContact(jdbcTemplate);
	}

	@Override
	public ContactDao getContactDao() {
		return this._daoContact;
	}

	@Override
	public CountryDao getCountryDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TagDao getTagDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
