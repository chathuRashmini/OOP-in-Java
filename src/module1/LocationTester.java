package module1;

public class LocationTester {
	public static void main(String[] args) {
		SimpleLocation ucsd = new SimpleLocation(32.9, -117.2);
		SimpleLocation lima = new SimpleLocation(-12.0, -77.0);

		System.out.println(ucsd.distance(lima));
	}
	
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	/*There are three variables here in the code
	01. ucsd - a local variable
	02. lima - a local variable
	03. args in main method - a local variable*/
}
