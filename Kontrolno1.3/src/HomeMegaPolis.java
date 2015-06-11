import java.util.Comparator;

public class HomeMegaPolis {
	public double getRate(City c) {
		if (c instanceof City) {
			return (Math.abs(c.getClimat().getMaxTemperature()) + Math.abs(c
					.getClimat().getMinTemperature())) / 2;
		}else if(c instanceof MajorCity){
			return ( (Math.abs(c.getClimat().getMaxTemperature()) + Math.abs(c
					.getClimat().getMinTemperature())) / 2 ) * 2;
			
		}
		return 0;
	}

}
