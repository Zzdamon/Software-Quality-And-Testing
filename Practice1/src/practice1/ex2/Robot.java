package practice1.ex2;

public class Robot{
	
	ICerereStudent stareCerereStudent;
	
	public Robot() {
	
		this.stareCerereStudent = new CerereTrimisa();
	}

	public void verificareCerere(CerereStudent cerere) {
		if(cerere.noDays>10|| cerere.motiv.length()==0) {
			stareCerereStudent= new CerereRespinsa();
		}
		
	this.stareCerereStudent.confirmare();
	this.stareCerereStudent.verificare();
	this.stareCerereStudent.avizareDecanat();		
	this.stareCerereStudent.respingere();
		
	}

	
}
