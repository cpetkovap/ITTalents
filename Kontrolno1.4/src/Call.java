import java.util.Date;


public class Call {
	private GSM incomeCall;
	private GSM outcomeCall;
	private double duration;
	private Date date;
	
	
	
	public Call(GSM incomeCall, GSM outcomeCall, double duration, Date date) {
		
		setIncomeCall(incomeCall);
		setOutcomeCall(outcomeCall);
		
		
		setDuration(duration);
		setDate(date);
	}
	
	public Call() {
		this(null, null, 1, null);
	}
	
	/**
	 * @return the incomeCall
	 */
	public GSM getIncomeCall() {
		return incomeCall;
	}
	/**
	 * @return the outcomeCall
	 */
	public GSM getOutcomeCall() {
		return outcomeCall;
	}
	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param incomeCall the incomeCall to set
	 */
	public void setIncomeCall(GSM incomeCall) {
		if(incomeCall != null){
			this.incomeCall = incomeCall;
		}else{
			this.incomeCall = new GSM();
		}
	}
	/**
	 * @param outcomeCall the outcomeCall to set
	 */
	public void setOutcomeCall(GSM outcomeCall) {
		if(outcomeCall != null){
			this.outcomeCall = outcomeCall;
		}else{
			this.outcomeCall = new GSM();
		}
	}
	/**
	 * @param duration the duration to set
	 */
	private void setDuration(double duration) {
		if(duration > 0){
			this.duration = duration;
		}else{
			this.duration = 1;
		}
	}
	/**
	 * @param date the date to set
	 */
	private void setDate(Date date) {
		if(date != null){
			this.date = date;
		}else{
			this.date = new Date();
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Call [incomeCall=" + incomeCall.getModel() + ", outcomeCall="
				+ outcomeCall.getModel() + ", duration=" + duration + ", date=" + date
				+ "]";
	}
	
	

}
