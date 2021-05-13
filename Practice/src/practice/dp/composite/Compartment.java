package practice.dp.composite;

import java.util.ArrayList;

public class Compartment extends AbstractNode {

	String compartmentName;
	ArrayList<AbstractNode> nodes=new ArrayList<>();
	
	public Compartment(String compartmentName) {
		super();
		this.compartmentName = compartmentName;
	}

	@Override
	public void describe() {
		System.out.println("The "+compartmentName+" compartment:");
		for (AbstractNode node : nodes) {
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
