package command;

public class SecurityControlOffCommand implements Command{
	
	SecurityControl securityControl;
	
	public SecurityControlOffCommand(SecurityControl securityControl) {
		this.securityControl = securityControl;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		securityControl.disarm();
	}
	
	
}
