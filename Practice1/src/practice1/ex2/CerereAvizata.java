package practice1.ex2;

public class CerereAvizata implements ICerereStudent{

	@Override
	public void confirmare() {
		System.out.println("cerere confirmata");
	}

	@Override
	public void verificare() {
		System.out.println("cerere verificata");

	}

	@Override
	public void avizareDecanat() {
		System.out.println("cerere avizata");

	}

	@Override
	public void respingere() {
	
	}

}
