package lepirda.damon.g1093.decorator;

public abstract class User {
	 String name;
	 String surname;

	public User(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public abstract void joinSignalRGroup();
}
