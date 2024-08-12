package command;

public class GarageDoorOnCommand implements Command {
	
	GarageDoor garageDoor;
	

	public GarageDoorOnCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}


	@Override
	public void execute() {
		garageDoor.up();
	}



}
