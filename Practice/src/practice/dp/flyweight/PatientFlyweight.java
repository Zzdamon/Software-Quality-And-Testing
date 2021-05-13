package practice.dp.flyweight;

public class PatientFlyweight implements PatientInterface{
	String name;
	String cnp;
	String address;
	
	public PatientFlyweight(String name, String cnp, String address) {
		super();
		this.name = name;
		this.cnp = cnp;
		this.address = address;
		System.out.println("New patient created with cnp "+cnp);
	}

	@Override
	public void hospitalize(Salon salon) {
		System.out.println(String.format("Patient %s CNP %s is now hospitalized at"
				+ " salon no. %d bed %d for %d days",
				this.name,this.cnp,salon.salonNumber,salon.bedNumber,
				salon.numberOfHospitalizationDays));
		
	}

}
