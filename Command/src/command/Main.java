package command;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TV tv1 = new TV();
			CeilingFan cf1 = new CeilingFan();
			
			TVOnCommand ligarTV = new TVOnCommand(tv1);
			CeilingFanOnCommand ligarVentilador = new CeilingFanOnCommand(cf1);
			
			
			SimpleRemoteControl remote = new SimpleRemoteControl();
			
			remote.setCommand(ligarVentilador);
			remote.buttonWasPressed();
			remote.setCommand(ligarTV);
			remote.buttonWasPressed();
			
			remote.load();

	}

}
