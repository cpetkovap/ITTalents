
public class ClimateInfo {
	private double maxTemperature;
	private double minTemperature;
	
	
	public ClimateInfo(double minTemperature, double maxTemperature) {
		if(minTemperature <= maxTemperature){
			setMaxTemperature(maxTemperature);
			setMinTemperature(minTemperature);
		}else{
			setMaxTemperature(0);
			setMinTemperature(0);
		}
	}
	
	public ClimateInfo() {
		this(0,0);
	}
	/**
	 * @return the maxTemperature
	 */
	public double getMaxTemperature() {
		return maxTemperature;
	}
	/**
	 * @return the minTemperature
	 */
	public double getMinTemperature() {
		return minTemperature;
	}
	/**
	 * @param maxTemperature the maxTemperature to set
	 */
	private void setMaxTemperature(double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	/**
	 * @param minTemperature the minTemperature to set
	 */
	private void setMinTemperature(double minTemperature) {
		this.minTemperature = minTemperature;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClimateInfo [minTemperature=" + minTemperature
				+ ", maxTemperature=" + maxTemperature + "]";
	}
	
	public void maxToFahrenhait(){
		setMaxTemperature(maxTemperature * 9 / 5 + 32);
	}
	
	public void minToFahrenhait(){
		setMinTemperature(minTemperature * 9 / 5 + 32);
	}
}
