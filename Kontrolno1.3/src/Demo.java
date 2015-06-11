
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City c1 = new City();
		City c2 = new City();
		ClimateInfo climat1 = new ClimateInfo(-3, 22);
		City c3 = new City("Montana", 0.1, "MON", climat1);
		MajorCity c4 = new MajorCity();
		ClimateInfo climat2 = new ClimateInfo(-10, 32);
		MajorCity c5 = new MajorCity("Plovdiv", 0.6, "PL1", climat2, 1000);
		
		//System.out.println(c5);
		
		TouristGuide tg = new TouristGuide();
		tg.addCity(c3);
		tg.addCity(c4);
		tg.addCity(c1);
		tg.addCity(c5);
		tg.addCity(c2);
		
		//System.out.println(c4);
		//System.out.println(tg.toString());
		System.out.println();
		System.out.println(tg.getInfo(false));
		
		System.out.println(tg.isBest());
		System.out.println();
		System.out.println(tg.getInfo(true));
		
		System.out.println(tg.isBest());
		

	}

}
