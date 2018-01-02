package com.sj.builder.pattern.example;

public final class FullName {
	private final Name lastName;
	private final Name firstName;
	private final Name middleName;
	private final Salutation salutation;
	private final Suffix suffix;

	private FullName(final Name newLastName, final Name newFirstName, final Name newMiddleName,
			final Salutation newSalutation, final Suffix newSuffix) {
		this.lastName = newLastName;
		this.firstName = newFirstName;
		this.middleName = newMiddleName;
		this.salutation = newSalutation;
		this.suffix = newSuffix;
	}

	public Name getLastName() {
		return this.lastName;
	}

	public Name getFirstName() {
		return this.firstName;
	}

	public Name getMiddleName() {
		return this.middleName;
	}

	public Salutation getSalutation() {
		return this.salutation;
	}

	public Suffix getSuffix() {
		return this.suffix;
	}
	
	public static class FullNameBuilder {
		private final Name nestedLastName;
		private final Name nestedFirstName;
		private Name nestedMiddleName;
		private Salutation nestedSalutation;
		private Suffix nestedSuffix;

		public FullNameBuilder(final Name newLastName, final Name newFirstName) {
			this.nestedLastName = newLastName;
			this.nestedFirstName = newFirstName;
		}

		public FullNameBuilder middleName(final Name newMiddleName) {
			this.nestedMiddleName = newMiddleName;
			return this;
		}

		public FullNameBuilder salutation(final Salutation newSalutation) {
			this.nestedSalutation = newSalutation;
			return this;
		}

		public FullNameBuilder suffix(final Suffix newSuffix) {
			this.nestedSuffix = newSuffix;
			return this;
		}

		public FullName createFullName() {
			return new FullName(nestedLastName, nestedFirstName, nestedMiddleName, nestedSalutation, nestedSuffix);
		}
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FullName [");
		if (lastName != null)
			builder.append("lastName=").append(lastName).append(", ");
		if (firstName != null)
			builder.append("firstName=").append(firstName).append(", ");
		if (middleName != null)
			builder.append("middleName=").append(middleName).append(", ");
		if (salutation != null)
			builder.append("salutation=").append(salutation).append(", ");
		if (suffix != null)
			builder.append("suffix=").append(suffix);
		builder.append("]");
		return builder.toString();
	}
}