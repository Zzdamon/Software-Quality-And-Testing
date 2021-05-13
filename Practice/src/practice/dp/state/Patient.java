package practice.dp.state;

public class Patient {
	PatientStateInterface patientState=new InternatState();
	
	public void interneaza() {
		patientState= new InternatState();
	}
	
	public void externeaza() {
		patientState= new ExternatState();		
	}
	
	public void putUnderObservation() {
		patientState= new UnderObservationState();
	}
	
}
