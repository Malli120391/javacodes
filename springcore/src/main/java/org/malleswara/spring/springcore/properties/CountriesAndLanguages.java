package org.malleswara.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguages {

	private Properties contryAndlangs;

	public Properties getContryAndlangs() {
		return contryAndlangs;
	}

	public void setContryAndlangs(Properties contryAndlangs) {
		this.contryAndlangs = contryAndlangs;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguages [contryAndlangs=" + contryAndlangs + "]";
	}
	
	
}
