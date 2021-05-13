package practice.dp.state;

public class TestState {

	public static void main(String[] args) {
		Patient patient = new Patient();
		patient.patientState.describePatientStats();
		patient.externeaza();
		patient.patientState.describePatientStats();
		patient.interneaza();
		patient.patientState.describePatientStats();
		patient.putUnderObservation();
		patient.patientState.describePatientStats();

	}

}
