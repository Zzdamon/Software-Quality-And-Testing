package lepirda.damon.g1093.factory;

public abstract class User {
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	protected String name;
	 protected String surname;
	public User(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public abstract void joinSignalRGroup();
}
