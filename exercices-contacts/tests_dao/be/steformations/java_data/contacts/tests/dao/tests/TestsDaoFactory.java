package be.steformations.java_data.contacts.tests.dao.tests;

import be.steformation.tunsajan.jd.dao.DAOFactory;
import be.steformations.java_data.contacts.interfaces.dao.DaoFactory;

public class TestsDaoFactory {
	
	public static DaoFactory getDaoFactory() {
	
		return new DAOFactory();
	}
}
