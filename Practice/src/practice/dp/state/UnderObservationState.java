package practice.dp.state;

public class UnderObservationState implements PatientStateInterface{

	@Override
	public void describePatientStats() {
		System.out.println("Patient is internated and under torough medical observation");
		
	}

}
