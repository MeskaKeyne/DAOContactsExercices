package be.steformation.tunsajan.jd.beans;

import be.steformations.java_data.contacts.interfaces.beans.Tag;

public class BeansTag implements Tag {
	private int _id;
	private String _value;

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return this._id;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return this._value;
	}

}
