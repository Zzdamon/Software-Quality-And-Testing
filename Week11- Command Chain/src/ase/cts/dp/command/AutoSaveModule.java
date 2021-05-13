package ase.cts.dp.command;

public class AutoSaveModule implements GameModuleInterface {

	@Override
	public void doTheTask(String details) {
		System.out.println("Autosaving for "+details);
		
	}

	int frequency;

	public AutoSaveModule(int frequency) {
		super();
		this.frequency = frequency;
	}
}
