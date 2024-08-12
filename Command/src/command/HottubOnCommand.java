package command;

public class HottubOnCommand implements Command {

	Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		hottub.circulate();
		System.out.println("circulando água na banheira");
	}



	
}
