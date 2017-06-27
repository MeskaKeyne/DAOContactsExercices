package be.steformation.tunsajan.jd.beans;

import be.steformations.java_data.contacts.interfaces.beans.Tag;

public class BeansTag implements Tag {
	private int _id;
	private String _value;

	
	public BeansTag(int id, String value) {
		this._id = id;
		this._value = value;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + _id;
		result = prime * result + ((_value == null) ? 0 : _value.hashCode());
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
		BeansTag other = (BeansTag) obj;
		if (_id != other._id)
			return false;
		if (_value == null) {
			if (other._value != null)
				return false;
		} else if (_value.compareTo(other._value) !=0)
			return false;
		return true;
	}
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
	@Override
	public String toString() {
		return "BeansTag [_id=" + _id + ", _value=" + _value + "]";
	}
	

}
