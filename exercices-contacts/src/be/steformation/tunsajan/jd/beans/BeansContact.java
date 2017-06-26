package be.steformation.tunsajan.jd.beans;

import be.steformations.java_data.contacts.interfaces.beans.Contact;
import be.steformations.java_data.contacts.interfaces.beans.Country;

public class BeansContact implements Contact {
	private int _id;
	private String _name;
	private String _firstname;
	private String _email;
	private Country _pays;

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return this._id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this._name;
	}

	@Override
	public String getFirstname() {
		// TODO Auto-generated method stub
		return this._firstname;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this._email;
	}

	@Override
	public Country getCountry() {
		// TODO Auto-generated method stub
		return this._pays;
	}

}
