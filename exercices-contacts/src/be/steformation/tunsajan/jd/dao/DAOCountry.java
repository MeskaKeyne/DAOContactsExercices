package be.steformation.tunsajan.jd.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import be.steformation.tunsajan.jd.mapper.MapperCountry;
import be.steformation.tunsajan.jd.mapper.MapperTag;
import be.steformations.java_data.contacts.interfaces.beans.Country;
import be.steformations.java_data.contacts.interfaces.beans.Tag;
import be.steformations.java_data.contacts.interfaces.dao.CountryDao;

public class DAOCountry implements CountryDao {
	private JdbcTemplate _jdbcTemplate;
	
	public DAOCountry(JdbcTemplate jdbcTemplate) {
		this._jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Country getCountryByAbbreviation(String abbreviation) {
		Country country = null;
		if (abbreviation != null) {
			String sql = "select * "
					   + "from pays "
					   + "where pays.abreviation = (?)";
			try {
					MapperCountry mapper = new MapperCountry();
					country = this._jdbcTemplate.queryForObject(sql, mapper, abbreviation);
			} catch(org.springframework.dao.EmptyResultDataAccessException e) {e.getMessage();}
		}
		
		return country;
	}

	@Override
	public List<? extends Country> getAllCountries() {
		List<Country> country = null;
		String sql = 	"SELECT * FROM pays ";	
		try {
				MapperCountry mapper = new MapperCountry();
				country = this._jdbcTemplate.query(sql, mapper);
		} catch(org.springframework.dao.EmptyResultDataAccessException e) {e.getMessage();}
		return country;
	}
	@Override
	public Country createAndSaveCountry(String abbreviation, String name) {
		Country pays = null;
		
		if (abbreviation != null && name != null && this.getCountryByAbbreviation(abbreviation) == null ) {
			String sql = "insert into pays(nom, abreviation ) "
					   + "values(?, ?)";
			this._jdbcTemplate.update(sql, name, abbreviation);
			pays = this.getCountryByAbbreviation(abbreviation);
		}
		
		return pays;
	}

}
