package be.steformation.tunsajan.jd.beans;

import be.steformations.java_data.contacts.interfaces.beans.Country;

public class BeansCountry implements Country {
	private int _id;
	private String _abb;
	private String _nom;
	
	public BeansCountry(int id, String abb, String nom) {
		this._id = id;
		this._abb = abb;
		this._nom = nom;
		
	}

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
	public String toString(){
		StringBuilder build = new StringBuilder();
		build.append("[ PAYS ]");
		build.append(System.lineSeparator());
		build.append(this._id);
		build.append(System.lineSeparator());
		build.append(this._abb);
		build.append(System.lineSeparator());
		build.append(this._nom);
		return build.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_abb == null) ? 0 : _abb.hashCode());
		result = prime * result + _id;
		result = prime * result + ((_nom == null) ? 0 : _nom.hashCode());
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
		BeansCountry other = (BeansCountry) obj;
		if (_abb == null) {
			if (other._abb != null)
				return false;
		} else if (!_abb.equals(other._abb))
			return false;
		if (_id != other._id)
			return false;
		if (_nom == null) {
			if (other._nom != null)
				return false;
		} else if (!_nom.equals(other._nom))
			return false;
		return true;
	}

}
