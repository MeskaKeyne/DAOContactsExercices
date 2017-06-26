package be.steformation.tunsajan.jd.dao;
import org.springframework.jdbc.core.*;

import java.util.List;

import be.steformations.java_data.contacts.interfaces.beans.Tag;
import be.steformations.java_data.contacts.interfaces.dao.ContactDao;

public class DAOContact implements ContactDao {
	
	private JdbcTemplate _jdbcTemplate;

	public DAOContact(JdbcTemplate jdbcTemplate){
		this._jdbcTemplate = jdbcTemplate;
	}

	@Override
	public be.steformations.java_data.contacts.interfaces.beans.Contact getContactByFirstnameAndName(String firstname,
			String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public be.steformations.java_data.contacts.interfaces.beans.Contact getContactById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends be.steformations.java_data.contacts.interfaces.beans.Contact> getContactsByCountry(
			String abbreviation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends be.steformations.java_data.contacts.interfaces.beans.Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends Tag> getTagsByContact(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public be.steformations.java_data.contacts.interfaces.beans.Contact createAndSaveContact(String firstname,
			String name, String email, String countryAbbreviation, List<String> tagValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeContact(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
