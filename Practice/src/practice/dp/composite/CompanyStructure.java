package practice.dp.composite;

import java.util.ArrayList;

public class CompanyStructure extends AbstractNode {
	String name;
	ArrayList<AbstractNode> nodes=new ArrayList<>();

	public CompanyStructure(String name) {
		super();
		this.name = name;
	}

	@Override
	public void describe() {
		System.out.println("Company "+ name+ " :");
		for(AbstractNode node : nodes) {
			node.describe();
		}
		
	}

	@Override
	public void addNode(AbstractNode nod) {
		this.nodes.add(nod);
		
	}

	@Override
	public AbstractNode getNode(int index) {
		return this.nodes.get(index);

	}

	@Override
	public void deleteNode(int index) {
		this.nodes.remove(index);
		
	}

}
