package com.java.design.pattern.strategy.classic;

public class EnglishCallNumberStrategy implements CountryCallNumberStrategy{

	@Override
	public String getPrefix() {
		return "+44";
	}

}
