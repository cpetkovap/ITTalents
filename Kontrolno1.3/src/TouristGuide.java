import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


public class TouristGuide {
	private TreeSet<City> cities;
	
	

//	public TouristGuide(HashSet<City> cities) {
//		setCities(cities);
//	}
//	
	public TouristGuide() {
		setCities(null);
	}

	/**
	 * @return the cities
	 */
	public TreeSet<City> getCities() {
		return cities;
	}

	/**
	 * @param cities the cities to set
	 */
	public void setCities(TreeSet<City> cities) {
		if(cities != null){
			this.cities = cities;
		}else{
			this.cities = new TreeSet<City>(new Comparator<City>() {

				
				@Override
				public int compare(City o1, City o2) {
					HomeMegaPolis h = new HomeMegaPolis();
					if(h.getRate(o1) > h.getRate(o2)) return 1;
					if(h.getRate(o1) < h.getRate(o2)) return -1;
					return 0;
				}

				
			});
		}
	}

//	/* (non-Javadoc)
//	 * @see java.lang.Object#toString()
//	 */
//	@Override
//	public String toString() {
//		return "TouristGuide [cities=" + cities.toString() + "]";
//	}
	
	public void addCity(City c){
		if(c == null){
			System.out.println("You can add city");
			return;
		}
		cities.add(c);
	}
	
	public String getInfo(boolean isFahrenhait){
		String result = "[Cities : ";
		if(isFahrenhait){
			for(Iterator<City> i = cities.iterator(); i .hasNext();){
				City city = i .next();
				if(city instanceof City) {
					City new_name = (City) city;
					new_name.getClimat().maxToFahrenhait();
					new_name.getClimat().minToFahrenhait();
					result += new_name.toString();
					result += "\n";
					
				}else if(city instanceof MajorCity){
					MajorCity new_name = (MajorCity) city;
					new_name.getClimat().maxToFahrenhait();
					new_name.getClimat().minToFahrenhait();
					result += new_name.toString();
					result += "\n";
					
				}
			}
			
		}else{
			for(Iterator<City> i = cities.iterator(); i .hasNext();){
				City city = i .next();
				if(city instanceof City) {
					City new_name = (City) city;
					result += new_name.toString();
					result += "\n";
					
				}else if(city instanceof MajorCity){
					MajorCity new_name = (MajorCity) city;
					result += new_name.toString();
					result += "\n";
					
				}
			}
			
		}
		result += "]";
		return result;
	} 
	
	public City isBest(){
//		City c = null;
//		HomeMegaPolis h = new HomeMegaPolis();
//		TreeMap<City, Double> map = new TreeMap<City, Double>(new Comparator<City>() {
//			@Override
//			public int compare(City o1, City o2) {
//				HomeMegaPolis h = new HomeMegaPolis();
//				if(h.getRate(o1) > h.getRate(o2)) return 1;
//				if(h.getRate(o1) < h.getRate(o2)) return -1;
//				return 0;
//			}
//			
//		});
//		for(Iterator<City> i = cities.iterator(); i.hasNext();){
//			City city = i.next();
//			double rate = h.getRate(city);
//			map.put(city, rate);
//		}
//		
//		double max = Integer.MIN_VALUE;
//		for(Map.Entry<City, Double> e : map.entrySet()){
//			if(e.getValue() > max){
//				max = e.getValue(); 
//				c = e.getKey();
//			}
//			
//		}
//		if(c instanceof MajorCity){
//			return (MajorCity)c;
//		}else{
//			return c;
//		}
//		
		
		return cities.last();
	}
	

}
