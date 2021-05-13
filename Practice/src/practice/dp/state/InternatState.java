package practice.dp.state;

public class InternatState implements PatientStateInterface{

	@Override
	public void describePatientStats() {
		System.out.println("Patient is internated but is feeling well");
		
	}

}
