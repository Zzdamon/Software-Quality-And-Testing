package practice.dp.facade;

public class WantedValidator implements WantedValidatorInterface{

	@Override
	public void isWantedByPolice(int CNP) {
		//searches in db
		System.out.println("Person is not wanted by police");
		
	}

}
