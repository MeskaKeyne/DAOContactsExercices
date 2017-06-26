package be.steformation.tunsajan.jd.beans;

import be.steformations.java_data.contacts.interfaces.beans.Country;

public class BeansCountry implements Country {
	private int _id;
	private String _abb;
	private String _nom;

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return this._id;
	}

	@Override
	public String getAbbreviation() {
		// TODO Auto-generated method stub
		return this._abb;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this._nom;
	}

}
