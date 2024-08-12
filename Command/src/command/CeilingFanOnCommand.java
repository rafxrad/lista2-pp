package command;

public class CeilingFanOnCommand implements Command{

	CeilingFan ceilingfan;
	
	public CeilingFanOnCommand(CeilingFan ceilingfan) {
		this.ceilingfan = ceilingfan;
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		ceilingfan.low();
		return "ventilador estava em baixa potência";
	}
	

}
