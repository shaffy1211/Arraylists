package creatingarraylists;

public class Patient {
//instatance variables
	private String name;
	private double height;
	private double weight;
	
	//constructors
	
	public Patient(String patName, double ht, double wt) {
		this.name = patName;
		this.height = ht;
		this.weight = wt;
		
	}
	
	//getters 
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
	//public methods
	
	public double calculateBMI() {
		double bmi;
		bmi = getWeight()/ (getHeight() * getHeight());
		return bmi;
	}
	
	//print object info
	
	public String toString() {
		return("Name: \t" + getName() + "\nHeight: \t"
				+ getHeight() + "\n Weight: \t" + getWeight());
	}
	
}
