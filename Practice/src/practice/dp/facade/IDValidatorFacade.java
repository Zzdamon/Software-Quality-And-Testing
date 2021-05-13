package practice.dp.facade;

import java.time.LocalDate;

public interface IDValidatorFacade {

	public static void validateID(int CNP, LocalDate expirationDate, int ticketID) {
		//check if ID is expired
		IDExpirationValidator expirationValidator = new IDExpirationValidator();
		expirationValidator.isExpired(expirationDate);
		
		//check if it is the client's ticket
		TicketValidator ticketValidator =new TicketValidator();
		ticketValidator.checkName(CNP, ticketID);
		
		// check if wanted by police
		WantedValidator wantedValidator= new WantedValidator();
		wantedValidator.isWantedByPolice(CNP);
	}
}
