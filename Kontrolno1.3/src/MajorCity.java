
public class MajorCity extends City{
	private int citizen;
	
	

	public MajorCity(String name, double develelopmentIndex, String cityCode,
			ClimateInfo climat, int citizen) {
		super(name, develelopmentIndex, cityCode, climat);
		setCitizen(citizen);
	}
	
	public MajorCity() {
		super();
		setCitizen(citizen);
	}

	/**
	 * @return the citizen
	 */
	public int getCitizen() {
		return citizen;
	}

	/**
	 * @param citizen the citizen to set
	 */
	private void setCitizen(int citizen) {
		if(citizen > 10){
			this.citizen = citizen;
		}else{
			this.citizen = 100;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  super.toString() +"citizen=" + citizen + "]";
	}
	
	

}
