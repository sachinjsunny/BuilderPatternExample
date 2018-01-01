package com.sj.builder.pattern.example;

public final class Name {
	private final String name;

	public Name(final String newName) {
		this.name = newName;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}