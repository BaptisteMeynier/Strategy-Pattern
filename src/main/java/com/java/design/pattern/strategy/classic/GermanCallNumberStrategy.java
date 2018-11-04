package com.java.design.pattern.strategy.classic;

public class GermanCallNumberStrategy implements CountryCallNumberStrategy{

	@Override
	public String getPrefix() {
		return "+49";
	}

}
