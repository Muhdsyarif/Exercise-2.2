
public class Motorcycle {
	
	void printMotorcycle(String b, String c, String cc, String m) {
		System.out.println("1. Motorcycle Information:" + "\n");
		System.out.println("   Motorcycle Brand -> " + b);
		System.out.println("   Motorcycle Colour -> " + c);
		System.out.println("   Motorcycle cc -> " + cc + "cc");
		System.out.println("   Motorcycle Max Speed -> " + m + "mph" + "\n");
	}
	
	void printEngine(String cy, String ss, String fl) {
		System.out.println("2. Engine Information:" + "\n");
		System.out.println("   Engine type (cylinder) -> " + cy);
		System.out.println("   Starting system -> " + ss);
		System.out.println("   Fuel tank capacity -> " + fl + "litres" + "\n");
	}
	
	void printFeaturesAndSafety(String A, String C, String wt) {
		System.out.println("3. Features And Safety Information:" + "\n");
		System.out.println("   ABS -> " + A);
		System.out.println("   Console type -> " + C);
		System.out.println("   Wheels Type -> " + wt);
	}
}
