package command;

import java.util.ArrayList;

public class Backup {
	
	private ArrayList<Command> listaCommand = new ArrayList<Command>();
	
	public void store(Command command) {
		listaCommand.add(command);
	}

	public void load() {
		for (Command command: listaCommand){
			command.execute();
		}
		
		listaCommand.clear();
	}
}
