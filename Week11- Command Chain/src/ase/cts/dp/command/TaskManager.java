package ase.cts.dp.command;

import java.util.ArrayList;

public class TaskManager {

	ArrayList<AsyncTaskInterface> tasks = new ArrayList<>();
	String name;
	public TaskManager(String name) {
		super();
		this.name = name;
	}
	
	public void addTask(AsyncTaskInterface task) {
		this.tasks.add(task);
	}
	public void doNextTask() {
		//det the task with the biggest priority
		//...
		//use a priority list
		
		//round-robin approach
		if(tasks.size()>0) {
			AsyncTaskInterface task= tasks.get(0);
			task.startTask();
			tasks.remove(0);
		}
	}
}
