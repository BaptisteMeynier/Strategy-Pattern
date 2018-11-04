package com.java.design.pattern.strategy.classic;

public class Context {

	 private CountryCallNumberStrategy strategy;

	   public void setStrategy(CountryCallNumberStrategy strategy){
	     this.strategy = strategy;
	   }

	   public String executeStrategy(){
	     return this.strategy.getPrefix();
	   }
	
}
