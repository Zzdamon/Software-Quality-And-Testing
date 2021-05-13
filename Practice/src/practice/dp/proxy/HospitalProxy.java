package practice.dp.proxy;

public class HospitalProxy implements HospitalizationActions {

	HospitalizationActions hospital;
	
	
	public HospitalProxy(HospitalizationActions hospital) {
		super();
		this.hospital = hospital;
	}


	@Override
	public void hospitalize(Patient patient) {
		if(patient.hasInsurance) {
			this.hospital.hospitalize(patient);
		}
		else {
			System.out.println("Patient "+patient.name+ " doesn't have insurance and can't be hospitalized");
		}
		
	}

}
