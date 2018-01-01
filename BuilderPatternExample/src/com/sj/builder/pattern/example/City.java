package com.sj.builder.pattern.example;

public final class City {
	private final String cityName;

	public City(final String newCityName) {
		this.cityName = newCityName;
	}

	public String getCityName() {
		return this.cityName;
	}

	@Override
	public String toString() {
		return this.cityName;
	}
}