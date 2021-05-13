package ase.cts.dp.command;

public class TestCommand {

	public static void main(String[] args) {
	
		TaskManager manager= new TaskManager("Background tasks");
		
		manager.addTask(new AsyncTask(new AutoSaveModule(5), "Finishing current level", 0));
		manager.addTask(new AsyncTask(new UpdateModule(), "Version 10.5", 0));
		
		System.out.println("Game is running");
		manager.doNextTask();
		System.out.println("Game is running");
		manager.doNextTask();
		System.out.println("Game is running");

	}
}
