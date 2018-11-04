package com.java.design.pattern.strategy.enums;

public enum CountryCallStrategyEnumImpl {

	ENGLISH {
		@Override
		public String getPrefix() {
			return "+44";
		}
	},FRENCH {
		@Override
		public String getPrefix() {
			return "+33";
		}
	},GERMAN {
		@Override
		public String getPrefix() {
			return "+49";
		}
	};

	public abstract String getPrefix();

}

