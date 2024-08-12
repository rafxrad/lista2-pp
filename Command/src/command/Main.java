package command;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GarageDoor gd1 = new GarageDoor();
			CeilingFan cf1 = new CeilingFan();
			
			GarageDoorOnCommand abrirGaragem = new GarageDoorOnCommand(gd1);
			CeilingFanOnCommand ligarVentilador = new CeilingFanOnCommand(cf1);
			
			SimpleRemoteControl remote = new SimpleRemoteControl();
			
			remote.setCommand(ligarVentilador);
			remote.buttonWasPressed();
			remote.setCommand(abrirGaragem);
			remote.buttonWasPressed();
			
			remote.load();

	}

}
