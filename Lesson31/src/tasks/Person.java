package tasks;

public class Person {

	private PersonInfo personInfo;
	private Address address;
	private University university;

	public Person(PersonInfo personInfo, Address address, University university) {
		this.personInfo = personInfo;
		this.address = address;
		this.university = university;
	}

	/**
	 * @return the personInfo
	 */
	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	/**
	 * @param personInfo
	 *            the personInfo to set
	 */
	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the university
	 */
	public University getUniversity() {
		return university;
	}

	/**
	 * @param university
	 *            the university to set
	 */
	public void setUniversity(University university) {
		this.university = university;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [personInfo=" + personInfo.toString() + ", address="
				+ address.toString() + ", university=" + university.toString()
				+ "]";
	}

}
