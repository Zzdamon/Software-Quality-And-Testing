package practice.dp.state;

public class ExternatState implements PatientStateInterface{

	@Override
	public void describePatientStats() {
		System.out.println("Patient was externated");
		
	}

}
