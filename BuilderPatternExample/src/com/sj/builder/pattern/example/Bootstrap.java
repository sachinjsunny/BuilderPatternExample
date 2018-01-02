/**
 * 
 */
package com.sj.builder.pattern.example;

import org.apache.log4j.Logger;

/**
 * @author sachinjsunny
 *
 */
public class Bootstrap {
	
	private static final Logger log = Logger.getLogger(Bootstrap.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Person person1 = new Person.PersonBuilder(
				new FullName.FullNameBuilder(new Name("Dynamite"), new Name("Napoleon")).createFullName(),
				new Address.AddressBuilder(new City("Preston"), State.ID).createAddress()).gender(Gender.MALE)
						.employment(EmploymentStatus.NOT_EMPLOYED).homeOwner(HomeownerStatus.RENTER).createPerson();

		final Person person2 = new Person.PersonBuilder(
				new FullName.FullNameBuilder(new Name("Coltrane"), new Name("Rosco")).middleName(new Name("Purvis"))
						.createFullName(),
				new Address.AddressBuilder(new City("Hazzard"), State.GA).createAddress()).gender(Gender.MALE)
						.employment(EmploymentStatus.EMPLOYED).gender(Gender.MALE).employment(EmploymentStatus.EMPLOYED)
						.homeOwner(HomeownerStatus.HOME_OWNER).createPerson();

		log.info(person1);

		log.info(person2);
	}

}
