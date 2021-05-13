package practice.dp.composite;

public class Section extends AbstractNode {

	String sectionName;
	public Section(String sectionName) {
		super();
		this.sectionName = sectionName;
	}

	@Override
	public void describe() {
		System.out.println("The "+sectionName+" section");
		
	}

	@Override
	public void addNode(AbstractNode nod) {
		throw new UnsupportedOperationException();
	}

	@Override
	public AbstractNode getNode(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteNode(int index) {
		throw new UnsupportedOperationException();
		
	}

}
