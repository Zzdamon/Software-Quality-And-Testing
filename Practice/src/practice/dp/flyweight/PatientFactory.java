package practice.dp.flyweight;

import java.util.HashMap;

import practice.dp.proxy.Patient;

public class PatientFactory {
	private static HashMap<String, PatientInterface> patients= new HashMap<>();
	
	public static PatientInterface getPatient(String cnp,String name, String address) {
		
		if(patients.get(cnp) ==null) {
			patients.put(cnp, new PatientFlyweight(name,cnp,address));
		}
		return patients.get(cnp);
		
	}
}
