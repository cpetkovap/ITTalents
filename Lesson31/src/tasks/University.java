package tasks;

public class University {
	private String universityName;
	private String faculty;
	private String specialty;

	public University(String universityName, String faculty, String specialty) {
		this.universityName = universityName;
		this.faculty = faculty;
		this.specialty = specialty;
	}

	/**
	 * @return the universityName
	 */
	public String getUniversityName() {
		return universityName;
	}

	/**
	 * @param universityName
	 *            the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	/**
	 * @return the faculty
	 */
	public String getFaculty() {
		return faculty;
	}

	/**
	 * @param faculty
	 *            the faculty to set
	 */
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	/**
	 * @return the specialty
	 */
	public String getSpecialty() {
		return specialty;
	}

	/**
	 * @param specialty
	 *            the specialty to set
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "University [universityName=" + universityName + ", faculty="
				+ faculty + ", specialty=" + specialty + "]";
	}

}
