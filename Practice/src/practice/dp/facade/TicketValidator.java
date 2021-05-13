package practice.dp.facade;

public class TicketValidator implements TicketValidatorInterface{

	@Override
	public void checkName(int CNP, int ticketNumber) {
		//gets ticket from a db or smth
		//compares to the cnp on the ticket 
		System.out.println("Ticket is valid");
		
	}

}
