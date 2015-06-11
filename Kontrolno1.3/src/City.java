public class City {
	private final String name;
	private double develelopmentIndex;
	private String cityCode;
	private ClimateInfo climat;

	public City(String name, double develelopmentIndex, String cityCode,
			ClimateInfo climat) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "default name";
		}
		setDevelelopmentIndex(develelopmentIndex);
		setCityCode(cityCode);
		setClimat(climat);
	}

	public City() {
		this(null, 0.1, null, null);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the develelopmentIndex
	 */
	public double getDevelelopmentIndex() {
		return develelopmentIndex;
	}

	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}

	/**
	 * @return the climat
	 */
	public ClimateInfo getClimat() {

		return climat;
	}

	/**
	 * @param develelopmentIndex
	 *            the develelopmentIndex to set
	 */
	private void setDevelelopmentIndex(double develelopmentIndex) {
		if (develelopmentIndex >= 0 && develelopmentIndex <= 1) {
			this.develelopmentIndex = develelopmentIndex;
		} else {
			develelopmentIndex = 0.1;
		}
	}

	/**
	 * @param cityCode
	 *            the cityCode to set
	 */
	private void setCityCode(String cityCode) {
		boolean help = true;
		if (cityCode == null) {
			help = false;
		}
		if (help) {
			if (cityCode.length() != 3) {
				help = false;
			}
		}
		if (help) {
			char helpChar[] = cityCode.toCharArray();
			for (int i = 0; i < helpChar.length; i++) {
				if (!Character.isUpperCase(helpChar[i])) {
					help = false;
				}
			}
		}
		if (help) {
			this.cityCode = cityCode;
		} else {
			this.cityCode = "AAA";
		}
	}

	/**
	 * @param climat
	 *            the climat to set
	 */
	private void setClimat(ClimateInfo climat) {
		if (climat != null) {
			this.climat = climat;
		} else {
			this.climat = new ClimateInfo();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "City [name=" + name + ", develelopmentIndex="
				+ develelopmentIndex + ", cityCode=" + cityCode + ", climat="
				+ climat.toString() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return name.equals(((City)obj).getName());
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name
				.hashCode();
	}

}
