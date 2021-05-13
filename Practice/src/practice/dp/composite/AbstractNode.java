package practice.dp.composite;

public abstract class AbstractNode implements CompanyActionsInterface {
	public abstract void addNode(AbstractNode nod);
	public abstract AbstractNode getNode(int index);
	public abstract void deleteNode (int index);
}
