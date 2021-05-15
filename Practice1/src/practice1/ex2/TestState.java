package practice1.ex2;

public class TestState {
public static void main(String[] args) {
	Robot robot = new Robot();
	CerereStudent cerere= new CerereStudent(12, "asdas");
	CerereStudent cerere2= new CerereStudent(1, "");
	CerereStudent cerere3= new CerereStudent(3, "asdas");
	robot.verificareCerere(cerere);
	robot.verificareCerere(cerere2);
	robot.verificareCerere(cerere3);
}

	
}
