package practice.dp.facade;

import java.time.LocalDate;

public class IDExpirationValidator implements IDExpirationValidatorInterface{

	@Override
	public void isExpired(LocalDate date) {
			if(date.compareTo(LocalDate.now())>0) {
				System.out.println("ID is valid");
			}
			else {
				System.out.println("ID is expired");
			}
		
	}

}
