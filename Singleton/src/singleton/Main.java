package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameConfiguration game1 = GameConfiguration.getInstance();
		System.out.println(game1.toString());
		
		
		GameConfiguration game2 = GameConfiguration.getInstance();
		game2.setLanguage("English");
		System.out.println(game2.getLanguage());
		
		// Instância 3 com a mesma configuração
		
		GameConfiguration game3 = GameConfiguration.getInstance();
		game3.setDLCName("testeSingleton");
		System.out.println(game3.getDLCName());
		
		
		// Todas as instâncias são a mesma. 
		System.out.println("Instância 1: " + game1.getDLCName() +  " " + game1.getLanguage());
		System.out.println("Instância 2: " + game2.getDLCName() +  " " + game2.getLanguage());
		System.out.println("Instância 3: " + game3.getDLCName() +  " " + game3.getLanguage());
 

	}

}
