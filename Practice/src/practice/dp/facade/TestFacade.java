package practice.dp.facade;

import java.time.LocalDate;

public class TestFacade {
	
	public static void main(String[] args) {
		IDValidatorFacade.validateID(15342, LocalDate.of(2020, 4, 23), 1423);
		IDValidatorFacade.validateID(15342, LocalDate.of(2022, 4, 23), 1423);
	}
}
