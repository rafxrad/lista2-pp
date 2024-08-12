package command;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GarageDoor gd1 = new GarageDoor();
			CeilingFan cf1 = new CeilingFan();
			
			GarageDoorOnCommand abrirGaragem = new GarageDoorOnCommand(gd1);
			CeilingFanOnCommand ligarVentilador = new CeilingFanOnCommand(cf1);
			
			Backup br = new Backup();
			br.store(abrirGaragem);
			br.store(ligarVentilador);
			br.load();
	}

}
