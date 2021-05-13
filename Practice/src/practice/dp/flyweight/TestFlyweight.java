package practice.dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		
		PatientInterface patient= PatientFactory.getPatient("1950522527455", "Bob Bobescu", "Str. Tractorului 34");
		Salon salon1= new Salon(1, 1, 23);
		Salon salon2= new Salon(2, 12, 55);
		
		patient.hospitalize(salon1);
		PatientInterface patient2=PatientFactory.getPatient("1950522527455", "Bob Bobescu", "Str. Tractorului 34");
		patient2.hospitalize(salon2);
	}

}
