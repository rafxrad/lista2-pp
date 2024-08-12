package command;

public class HottubOnCommand implements Command {

	Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}


	@Override
	public String execute() {
		// TODO Auto-generated method stub
		hottub.circulate();
		return "estava circulando água na banheira";
	}
	
}
