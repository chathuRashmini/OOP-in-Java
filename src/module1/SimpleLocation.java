package module1;

public class SimpleLocation {

	/*Make sure that the class name and the file name are same
	That is because in java it is a rule that
	in a case where the class is public, it has to be saved in a file 
	which has the same name as the class*/
	public double mem_latitude;
	public double mem_longitude;
	/*both above variables are member variables,
	because they exists inside the class
	since they are public they can be accessed
	and modified by outside of the class as well.
	scope lies within the whole class*/

	/*to make variables accessed and modified only
	within the class they belong, use 
	access identifier 'privates'. The recomended method
	is to always make member variables private*/
	
	/*In case where outside world need to know the private variables?
	use GETTERS and SETTERS. EX: 
	public double getLatitude(){
		return this.mem_latitude
	} this gives more control over the variables*/
	
	public SimpleLocation() {
		/*The DEFAULT CONSTRUCTOR of the class.*/
		this.mem_latitude = 32.9;
		this.mem_longitude = -117.2;
		/* 'this' is reffered to the calling object.
		this is not compulsory in java*/
	}

	public SimpleLocation(double latitude, double longitude) {
		/*The PARAMETER CONSTRUCTOR of the class.*/
		this.mem_latitude = latitude;
		this.mem_longitude = longitude;
	}

	/*Notice that constructors donot have a return type.
	They have the same name as the class they belong to.
	Here you can see a constructor overloading.*/

	public double distance(SimpleLocation other) {
		double dist;
		dist = getDist(this.mem_latitude, this.mem_longitude, other.mem_latitude, other.mem_longitude);
		return dist;
	}

	public double distance(double other_latitude, double other_longitude) {
		double dist;
		dist = getDist(this.mem_latitude, this.mem_longitude, other_latitude, other_longitude);
		return dist;
	}
	/*Functions overloading
	Functions with same name can be distinguished by each other
	by different parameters. By changing just the return type
	while having the same type of parameters will not
	allowed by the java for function overloading*/

	public double getDist(double x, double y, double w, double z) {
		double dist;
		dist = x + y + z + w;
		return dist;
	}
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
