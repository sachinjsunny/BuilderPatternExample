/**
 * 
 */
package com.sj.builder.pattern.example;

/**
 * @author Sachin_Jain17
 *
 */
public class Employee {
	private final FullName employeeName;

	private final String employeeId;

	private final Address homeAddress;

	private final Gender gender;

	private final Salutation salutation;

	private final String emailAddress;

	/**
	 * @param employeeName
	 * @param employeeId
	 * @param homeAddress
	 * @param gender
	 * @param salutation
	 * @param emailAddress
	 */
	private Employee(final FullName employeeName,final String employeeId,final Address homeAddress, final Gender gender,
			final Salutation salutation,final String emailAddress) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.homeAddress = homeAddress;
		this.gender = gender;
		this.salutation = salutation;
		this.emailAddress = emailAddress;
	}

	public static class EmployeeBuilder {
		private FullName nestedEmployeeName;

		private String nestedEmployeeId;

		private Address nestedHomeAddress;

		private Gender nestedGender;

		private Salutation nestedSalutation;

		private String nestedEmailAddress;

		/**
		 * @param nestedEmployeeName
		 * @param nestedEmployeeId
		 * @param nestedEmailAddress
		 */
		public EmployeeBuilder(final FullName nestedEmployeeName,final String nestedEmployeeId,final String nestedEmailAddress) {
			super();
			this.nestedEmployeeName = nestedEmployeeName;
			this.nestedEmployeeId = nestedEmployeeId;
			this.nestedEmailAddress = nestedEmailAddress;
		}

		public Employee createEmployee() {
			return new Employee(nestedEmployeeName, nestedEmployeeId, nestedHomeAddress, nestedGender, nestedSalutation,
					nestedEmailAddress);
		}

		public EmployeeBuilder gender(final Gender nestedGender) {
			this.nestedGender = nestedGender;
			return this;
		}

		public EmployeeBuilder salutation(final Salutation nestedSalutation) {
			this.nestedSalutation = nestedSalutation;
			return this;
		}

		public EmployeeBuilder address(final Address nestedHomeAddress) {
			this.nestedHomeAddress = nestedHomeAddress;
			return this;
		}
	}

	/**
	 * @return the employeeName
	 */
	public FullName getEmployeeName() {
		return employeeName;
	}

	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @return the homeAddress
	 */
	public Address getHomeAddress() {
		return homeAddress;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @return the salutation
	 */
	public Salutation getSalutation() {
		return salutation;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [");
		if (employeeName != null)
			builder.append("employeeName=").append(employeeName).append(", ");
		if (employeeId != null)
			builder.append("employeeId=").append(employeeId).append(", ");
		if (homeAddress != null)
			builder.append("homeAddress=").append(homeAddress).append(", ");
		if (gender != null)
			builder.append("gender=").append(gender).append(", ");
		if (salutation != null)
			builder.append("salutation=").append(salutation).append(", ");
		if (emailAddress != null)
			builder.append("emailAddress=").append(emailAddress);
		builder.append("]");
		return builder.toString();
	}
}
