
public class main {

	public static void main(String[] args) {
		
		Motorcycle Superbike = new Motorcycle();   //create first object
		
			Superbike.printMotorcycle("Yamaha YZF Superbike", "Blue", "998", "186");
			Superbike.printEngine("4 stroke, 4-cylinder", "Self start", "17");
			Superbike.printFeaturesAndSafety("Dual Channel", "Digital", "Alloy");
					
		System.out.println("--------------------------------------------------");
			
		Motorcycle Scooter = new Motorcycle();    //create second object
		
			Scooter.printMotorcycle("Yamaha NVX Scooter", "Yellow", "155", "100");
			Scooter.printEngine("4 stroke, single-cylinder", "Electric", "4.6");
			Scooter.printFeaturesAndSafety("No", "Digital", "Alloy");
			
			
			
	}

}
