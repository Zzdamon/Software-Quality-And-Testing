package practice.dp.proxy;

public class TestProxy {

	public static void main(String[] args) {
		HospitalizationActions hospital = new Hospital();
		hospital= new HospitalProxy(hospital);
		Patient patient1= new Patient("Dominic", false);
		hospital.hospitalize(patient1);
		
	}
}
