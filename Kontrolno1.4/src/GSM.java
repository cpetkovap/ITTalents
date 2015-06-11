import java.util.ArrayList;
import java.util.Date;


public class GSM {
	private final String model;
	private final String producer;
	private double price;
	private String owner;
	public static String nokia91 = "Nokia95";
	private Battery battery;
	private Display displpay;
	private ArrayList<Call> callHistory;
	
	
	
	public GSM(String model, String producer, double price, String owner,
			Battery battery) {
		if(model != null){
			this.model = model;
		}else{
			this.model = nokia91;
		}
		if(producer != null){
			this.producer = producer;
		}else{
			this.producer = "producer";
		}
		setPrice(price);
		setOwner(owner);
		setBattery(battery);
		setDisplpay(null);
		setCallHistory(null);
	}
	
	public GSM(String model, String producer, double price, String owner){
		this(model, producer, price, owner, null);
	}
	
	public GSM() {
		this(null, null, 10000, null);
	}
	
	
	
	/**
	 * @return the callHistory
	 */
	public ArrayList<Call> getCallHistory() {
		return callHistory;
	}

	/**
	 * @param callHistory the callHistory to set
	 */
	private void setCallHistory(ArrayList<Call> callHistory) {
		if(callHistory != null){
			this.callHistory = callHistory;
		}else{
			this.callHistory = new ArrayList<Call>();
		}
	}

	/**
	 * @param battery the battery to set
	 */
	private void setBattery(Battery battery) {
		if(battery != null){
			this.battery = battery;
		}else{
			this.battery = new Battery();
		}
	}



	/**
	 * @param displpay the displpay to set
	 */
	private void setDisplpay(Display displpay) {
		if(displpay != null){
			this.displpay = displpay;
		}else{
			this.displpay = new Display();
		}
	}



	/**
	 * @return the battery
	 */
	public Battery getBattery() {
		return battery;
	}



	/**
	 * @return the displpay
	 */
	public Display getDisplpay() {
		return displpay;
	}



	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @return the producer
	 */
	public String getProducer() {
		return producer;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * @return the nokia91
	 */
	public static String getNokia91() {
		return nokia91;
	}
	/**
	 * @param price the price to set
	 */
	private void setPrice(double price) {
		if(price > 0){
			this.price = price;
		}else{
			this.price = 1000;
		}
	}
	/**
	 * @param owner the owner to set
	 */
	private void setOwner(String owner) {
		if(owner != null){
			this.owner = owner;
		}else{
			this.owner = "owner";
		}
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GSM [model=" + model + ", producer=" + producer + ", price="
				+ price + ", owner=" + owner + ", battery=" + battery.toString()
				+ ", displpay=" + displpay.toString() + ", callHistory=" + callHistory.toString()
				+ "]";
	}


	public void addCall(Call c){
		if(c == null){
			System.out.println("null call");
			return;
		}
		if(!c.getIncomeCall().equals(c.getOutcomeCall()) && (c.getIncomeCall().equals(this) || c.getOutcomeCall().equals(this))){
			callHistory.add(c);
		}else{
			System.out.println("invalid call, you can't add");
			return;
		}
	}
	
	public void deleteCall(Call c){
		if(c == null){
			System.out.println("null call");
			return;
		}
		
		if(!callHistory.contains(c)){
			System.out.println("this call is not exist");
			return;
		}
		callHistory.remove(c);
		System.out.println("you delete call " + c.toString());
		
	}
	
	public double sum(){
		int sum = 0;
		for(Call c : callHistory){
			if(c.getOutcomeCall().equals(this)){
				sum += c.getDuration();
			}
		}
		return sum * 1.2;
	}

	public static class Battery{
		private final String modelBattery;
		private Date date;
		private double hoursTalk;
		
		
		
		
		public Battery(String modelBattery, Date date, double hoursTalk) {
			if(modelBattery != null){
				this.modelBattery = modelBattery;
			}else{
				this.modelBattery = "mmmm";
			}
			setDate(date);
			setHoursTalk(hoursTalk);
		}
		
		public Battery() {
			this(null, null, 0);
		}
		/**
		 * @return the model
		 */
		public String getModel() {
			return modelBattery;
		}
		/**
		 * @return the date
		 */
		public Date getDate() {
			return date;
		}
		/**
		 * @return the hoursTalk
		 */
		public double getHoursTalk() {
			return hoursTalk;
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
		/**
		 * @param hoursTalk the hoursTalk to set
		 */
		private void setHoursTalk(double hoursTalk) {
			if(hoursTalk > 0){
				this.hoursTalk = hoursTalk;
			}else{
				this.hoursTalk = 1;
			}
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Battery [modelBattery=" + modelBattery + ", date=" + date
					+ ", hoursTalk=" + hoursTalk + "]";
		}
		
		
	}
	
	
	private class Display{
		private double inches;
		

		public Display(double inches) {
			setInches(inches);
		}
		
		public Display() {
			this(0);
		}

		/**
		 * @return the inches
		 */
		public double getInches() {
			return inches;
		}

		/**
		 * @param inches the inches to set
		 */
		private void setInches(double inches) {
			if(inches >= 3){
				this.inches = inches;
			}else{
				inches = 3;
			}
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Display [inches=" + inches + "]";
		}
		
		
		
	}
	

}
