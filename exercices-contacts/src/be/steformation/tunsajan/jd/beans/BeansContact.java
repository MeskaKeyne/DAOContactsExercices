package be.steformation.tunsajan.jd.beans;

import be.steformations.java_data.contacts.interfaces.beans.Contact;
import be.steformations.java_data.contacts.interfaces.beans.Country;

public class BeansContact implements Contact {
	private int _id;
	private String _name;
	private String _firstname;
	private String _email;
	private Country _pays;

	public BeansContact(int id, String name, String firstname, String email, Country pays){
		this._id = id;
		this._name = name;
		this._firstname = firstname;
		this._email = email;
		this._pays = pays;
	}
	public BeansContact() {
		// TODO Auto-generated constructor stub
	}
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_email == null) ? 0 : _email.hashCode());
		result = prime * result + ((_firstname == null) ? 0 : _firstname.hashCode());
		result = prime * result + _id;
		result = prime * result + ((_name == null) ? 0 : _name.hashCode());
		result = prime * result + ((_pays == null) ? 0 : _pays.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeansContact other = (BeansContact) obj;
		if (_email == null) {
			if (other._email != null)
				return false;
		} else if (!_email.equals(other._email))
			return false;
		if (_firstname == null) {
			if (other._firstname != null)
				return false;
		} else if (!_firstname.equals(other._firstname))
			return false;
		if (_id != other._id)
			return false;
		if (_name == null) {
			if (other._name != null)
				return false;
		} else if (!_name.equals(other._name))
			return false;
		if (_pays == null) {
			if (other._pays != null)
				return false;
		} else if (!_pays.equals(other._pays))
			return false;
		return true;
	}
	public String toString(){
		StringBuilder build = new StringBuilder();
		build.append("[ Contact ]");
		build.append(System.lineSeparator());
		build.append(this._id);
		build.append(System.lineSeparator());
		build.append(this._name);
		build.append(System.lineSeparator());
		build.append(this._firstname);
		build.append(System.lineSeparator());
		build.append(this._email);
		build.append(System.lineSeparator());
		build.append(this._pays);
			
			return build.toString();
	}

}
