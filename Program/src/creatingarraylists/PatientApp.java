package creatingarraylists;
import java.util.*;
import java.io.*;

public class PatientApp {
	//declare an ArrayList to store patient info
	
	private static ArrayList<Patient> patList;
	
	public static void main(String[] args) throws FileNotFoundException{
	patList = new ArrayList<Patient>();
	
	loadPatientData();
	displayPatientData();
	findPatient();
	}
	private static void loadPatientData() throws FileNotFoundException{
		System.out.println("loading patient data");
		Scanner myScanner = new Scanner(new File ("Patient.dat")	);
		String patLine;
		
		while(myScanner.hasNextLine()) {
			patLine = myScanner.nextLine();
			String[] patData = patLine.split(";");
			String name = patData[0];
			double height = Double.parseDouble(patData[1]);
			double weight = Double.parseDouble(patData[2]);
			
			patList.add(new Patient(name, height, weight));
		}
		myScanner.close();
	}
	
	private static void displayPatientData() {
		for(Patient pat: patList) {
			System.out.printf("%s \t %3.3f \t %3.3f \t %3.2f\n", pat.getName(), pat.getHeight(), pat.getWeight(),pat.calculateBMI());
		}
	}
	
	private static Patient findPatientByName(String name) {
		Patient pat = null;
		for(Patient p : patList) {
			if(name.equalsIgnoreCase(p.getName())) {
				pat = p; break;
			}
		}
		return (pat);
	}
	
	private static void findPatient() {
		while(true) {
			Scanner keyboardInput = new Scanner(System.in);
			System.out.println("Enter patient name to search or q to quit");
			String name = keyboardInput.nextLine();
			if(name.equalsIgnoreCase("q")) break;
			Patient pat = findPatientByName(name);
			if(pat == null) {
				System.out.println("patient not found");
			}else {
				System.out.println(pat);
			}
		}
	}
}
