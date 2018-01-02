package com.sj.builder.pattern.example;

public final class Address {
	private final StreetAddress streetAddress;
	private final City city;
	private final State state;

	private Address(final StreetAddress newStreetAddress, final City newCity, final State newState) {
		this.streetAddress = newStreetAddress;
		this.city = newCity;
		this.state = newState;
	}

	public StreetAddress getStreetAddress() {
		return this.streetAddress;
	}

	public City getCity() {
		return this.city;
	}

	public State getState() {
		return this.state;
	}

	public static class AddressBuilder {
		private StreetAddress nestedStreetAddress;
		private final City nestedCity;
		private final State nestedState;

		public AddressBuilder(final City newCity, final State newState) {
			this.nestedCity = newCity;
			this.nestedState = newState;
		}

		public AddressBuilder streetAddress(final StreetAddress newStreetAddress) {
			this.nestedStreetAddress = newStreetAddress;
			return this;
		}

		public Address createAddress() {
			return new Address(nestedStreetAddress, nestedCity, nestedState);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [");
		if (streetAddress != null)
			builder.append("streetAddress=").append(streetAddress).append(", ");
		if (city != null)
			builder.append("city=").append(city).append(", ");
		if (state != null)
			builder.append("state=").append(state);
		builder.append("]");
		return builder.toString();
	}
}