package practice.dp.composite;

import java.util.ArrayList;

public class Department extends AbstractNode {

	String departmentName;
	ArrayList<AbstractNode> nodes=new ArrayList<>();
	
	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}

	@Override
	public void describe() {
		System.out.println("The "+ departmentName +" department:");
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
