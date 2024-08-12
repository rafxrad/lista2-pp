package command;

import java.util.ArrayList;

public class SimpleRemoteControl {
	
	Command slot;
	private ArrayList<Command> backup = new ArrayList<Command>();
	
	
	public SimpleRemoteControl() {}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void store(Command command) {
		backup.add(slot);
	}
	
	public void load() {
		System.out.println("Executando comandos guardados na memória.");
		for (Command command: backup){
			command.execute();
			
		}
		
	}
	
	public void buttonWasPressed() {
		slot.execute();
		this.store(slot);
	}
	

}

