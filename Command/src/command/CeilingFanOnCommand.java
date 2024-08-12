package command;


public class CeilingFanOnCommand implements Command{

	CeilingFan ceilingfan;
	
	public CeilingFanOnCommand(CeilingFan ceilingfan) {
		this.ceilingfan = ceilingfan;
	}

	@Override
	public void execute() {
		ceilingfan.on();
		
	}

	
	

}
