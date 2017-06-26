package be.steformation.tunsajan.jd.dao;
import org.springframework.jdbc.core.*;

import java.util.List;

import be.steformation.tunsajan.jd.beans.BeansContact;
import be.steformation.tunsajan.jd.mapper.MapperContact;
import be.steformation.tunsajan.jd.mapper.MapperTag;
import be.steformations.java_data.contacts.interfaces.beans.Contact;
import be.steformations.java_data.contacts.interfaces.beans.Tag;
import be.steformations.java_data.contacts.interfaces.dao.ContactDao;

public class DAOContact implements ContactDao {
	
	private JdbcTemplate _jdbcTemplate;

	public DAOContact(JdbcTemplate jdbcTemplate){
		this._jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Contact getContactByFirstnameAndName(String firstname,
			String name) {
		Contact contact = null;
		if (firstname != null && name != null) {
			String sql = "select c.id, c.nom, c.prenom, c.email, c.pays, p.id, p.abreviation, p.nom "
					   + "from contacts as c left join pays as p on p.id = c.pays "
					   + "where lower(c.prenom) = lower(?) and lower(c.nom) = lower(?)";
			try {
					MapperContact mapper = new MapperContact();
					contact = this._jdbcTemplate.queryForObject(sql, mapper, firstname, name);
			} catch(org.springframework.dao.EmptyResultDataAccessException e) {e.getMessage();}
		}
		System.out.println(contact);
		
		return contact;
	}
	@Override
	public Contact getContactById(int id) {
		Contact contact = null;
		if (id > 0) {
			String sql = "select * "
					   + "from contacts as c left join pays as p on p.id = c.pays "
					   + "where c.id = (?)";
			try {
					MapperContact mapper = new MapperContact();
					contact = this._jdbcTemplate.queryForObject(sql, mapper, id);
			} catch(org.springframework.dao.EmptyResultDataAccessException e) {e.getMessage();}
		}
		
		return contact;
	}
	@Override
	public List<? extends Contact> getContactsByCountry(
			String abbreviation) {
		List<Contact> liste = null;
		
		String sql =  "select c.id, c.nom, c.prenom, c.email, c.pays, p.id, p.abreviation, p.nom "
				   + "from contacts as c left join pays as p on p.id = c.pays "
				   + "where lower(p.abreviation) = lower(?)";
		
		liste = this._jdbcTemplate.query(sql, new MapperContact(), abbreviation);
		return liste;
	}

	@Override
	public List<? extends Contact> getAllContacts() {
		List<Contact> contact = null;
			String sql = "select * from contacts as c left join pays as p on p.id = c.pays ";
			try {
					MapperContact mapper = new MapperContact();
					contact = this._jdbcTemplate.query(sql, mapper);
			} catch(org.springframework.dao.EmptyResultDataAccessException e) {e.getMessage();}
		return contact;
	}

	@Override
	public List<? extends Tag> getTagsByContact(int id) {
		
		List<Tag> tag = null;
		
		String sql = 	"SELECT tags.id, tags.tag "
				+ 	"FROM contacts, contacts_tags, tags "
				+ 	"WHERE contacts.id = contacts_tags.contact "
				+   "AND contacts_tags.tag = tags.id "
				+	"AND contacts.id = ?";
		
		try {
				MapperTag mapper = new MapperTag();
				tag = this._jdbcTemplate.query(sql, mapper, id);
		} catch(org.springframework.dao.EmptyResultDataAccessException e) {e.getMessage();}
		return tag;
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
