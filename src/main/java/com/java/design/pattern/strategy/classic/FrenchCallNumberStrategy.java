package com.java.design.pattern.strategy.classic;

public class FrenchCallNumberStrategy implements CountryCallNumberStrategy{

	@Override
	public String getPrefix() {
		return "+33";
	}

}
