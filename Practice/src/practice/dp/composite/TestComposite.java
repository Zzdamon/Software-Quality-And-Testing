package practice.dp.composite;

public class TestComposite {
	public static void main(String[] args) {
		Department department= new Department("IT");
		Compartment compartment1= new Compartment("Programming");
		Compartment compartment2= new Compartment("QA");
		Section section1 = new Section("Backend");
		Section section2 = new Section("Frontend");

		department.addNode(compartment1);
		department.addNode(compartment2);
		compartment1.addNode(section1);
		compartment1.addNode(section2);
		
		CompanyStructure companyStructure = new CompanyStructure("Flying SRL");
		companyStructure.addNode(department);
		companyStructure.describe();
	}
	
}
