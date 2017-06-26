package be.steformation.tunsajan.jd.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import be.steformation.tunsajan.jd.beans.BeansTag;
import be.steformations.java_data.contacts.interfaces.beans.Tag;

public class MapperTag implements RowMapper<Tag> {

	@Override
	public Tag mapRow(ResultSet rs, int row) throws SQLException {
		Tag tag = null;
		int id = rs.getInt(1);
		String tagg = rs.getString(2);
		tag = new BeansTag(id, tagg);
		return tag;
	}

}
