package practice.dp.bulider;

import java.time.LocalDate;

import practice.dp.bulider.ex1.TransportPackage;
import practice.dp.bulider.ex2.GymMembership;
import practice.dp.bulider.ex2.GymMembershipType;
import practice.dp.bulider.ex2.Trainer;

public class TestBuilder {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		TransportPackage package1= new TransportPackage.TransportPackageBuilder().setHasAC().build();
		GymMembership gymMembership= new GymMembership.GymMembershipBuilder("Damon Lepirda", GymMembershipType.FULL_TIME)
				.setHasPoolAccess()
				.setPersonalTrainer(new Trainer("Alex Tilinca", 20))
				.build();
		
//		System.out.println(LocalDate.of(2020, 3, 28).compareTo(LocalDate.now()) ); 
	}

}
