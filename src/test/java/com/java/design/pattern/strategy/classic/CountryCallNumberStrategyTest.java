package com.java.design.pattern.strategy.classic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CountryCallNumberStrategyTest {

	@Test
	@DisplayName("Inject German strategy with Classic implementation")
	public void shouldReturnGermanPrefix() {
		Context context = new Context();
		context.setStrategy(new GermanCallNumberStrategy());
		String prefix = context.executeStrategy();
		assertThat(prefix,equalTo("+49"));
	}
	
	@Test
	@DisplayName("Inject French strategy with Classic implementation")
	public void shouldReturnFrenchPrefix() {
		Context context = new Context();
		context.setStrategy(new FrenchCallNumberStrategy());
		String prefix = context.executeStrategy();
		assertThat(prefix,equalTo("+33"));
	}
	
	@Test
	@DisplayName("Inject German strategy then French with Classic implementation should return French prefix")
	public void shouldReturnLastStrategyPrefixWhenChangeStrategy() {
		Context context = new Context();
		context.setStrategy(new GermanCallNumberStrategy());
		context.setStrategy(new FrenchCallNumberStrategy());
		String prefix = context.executeStrategy();
		assertThat(prefix,equalTo("+33"));
	}
}
