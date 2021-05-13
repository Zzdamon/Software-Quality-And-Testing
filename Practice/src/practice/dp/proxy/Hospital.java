package practice.dp.proxy;

public class Hospital implements HospitalizationActions{

	@Override
	public void hospitalize(Patient patient) {
		System.out.println("Patient "+patient.name+" is now hospitalized");
		
	}

}
