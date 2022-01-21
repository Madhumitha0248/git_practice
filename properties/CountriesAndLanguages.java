package com.madhu.Ex.properties;

import java.util.Properties;

public class CountriesAndLanguages {
	private Properties countriesandlangs;

	

	public Properties getCountriesandlangs() {
		return countriesandlangs;
	}

	public void setCountriesandlangs(Properties countriesandlangs) {
		this.countriesandlangs = countriesandlangs;
	}
	
	@Override
	public String toString() {
		return "CountriesAndLanguages [countriesandlangs=" + countriesandlangs + "]";
	}
}
