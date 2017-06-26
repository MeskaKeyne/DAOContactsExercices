package be.steformation.tunsajan.jd.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import be.steformation.tunsajan.jd.mapper.MapperContact;
import be.steformation.tunsajan.jd.mapper.MapperTag;
import be.steformations.java_data.contacts.interfaces.beans.Contact;
import be.steformations.java_data.contacts.interfaces.beans.Tag;
import be.steformations.java_data.contacts.interfaces.dao.TagDao;

public class DAOTag implements TagDao {
	
	private JdbcTemplate _jdbcTemplate;
	
	public DAOTag(JdbcTemplate jdbcTemplate) {
		this._jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Tag getTagByValue(String value) {
		Tag tag = null;
		if (value != null) {
			String sql = "select * "
					   + "from Tags "
					   + "where Tags.tag = (?)";
			try {
					MapperTag mapper = new MapperTag();
					tag = this._jdbcTemplate.queryForObject(sql, mapper, value);
			} catch(org.springframework.dao.EmptyResultDataAccessException e) {e.getMessage();}
		}
		
		return tag;
	}

	@Override
	public Tag getTagById(int id) {
		Tag tag = null;
		if (id < 0) {
			String sql = "select * "
					   + "from Tags "
					   + "where Tags.id = (?)";
			try {
					MapperTag mapper = new MapperTag();
					tag = this._jdbcTemplate.queryForObject(sql, mapper, id);
			} catch(org.springframework.dao.EmptyResultDataAccessException e) {e.getMessage();}
		}
		
		return tag;
	}

	@Override
	public List<? extends Tag> getAllTags() {
		List<Tag> tag = null;
		String sql = 	"SELECT tags.id, tags.tag FROM Tags ";	
		try {
				MapperTag mapper = new MapperTag();
				tag = this._jdbcTemplate.query(sql, mapper);
		} catch(org.springframework.dao.EmptyResultDataAccessException e) {e.getMessage();}
		return tag;
	}

	@Override
	public Tag createAndSaveTag(String value) {
		Tag tag = this.getTagByValue(value);
		String sql = "insert into Tags(tag) "
				   + "values(?)";
		if(value != null && this.getTagByValue(value) == null){
			this._jdbcTemplate.update(sql, value);
			tag = null;
			tag = this.getTagByValue(value);
		}
		System.out.println(tag);
		return tag;
		
	}
		
	
	

	@Override
	public void removeTag(int id) {
		// TODO Auto-generated method stub
		
	}

}
