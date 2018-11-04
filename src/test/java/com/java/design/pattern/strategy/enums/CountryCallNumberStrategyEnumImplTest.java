package com.java.design.pattern.strategy.enums;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CountryCallNumberStrategyEnumImplTest {

	@Test
	@DisplayName("Inject German strategy with Classic implementation")
	public void shouldReturnGermanPrefix() {
		assertThat(CountryCallStrategyEnumImpl.GERMAN.getPrefix(),equalTo("+49"));
	}
	
	@Test
	@DisplayName("Inject French strategy with Classic implementation")
	public void shouldReturnFrenchPrefix() {
		assertThat(CountryCallStrategyEnumImpl.FRENCH.getPrefix(),equalTo("+33"));
	}
	
}
