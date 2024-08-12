package facade;

public class ServicoEstoque {

	public static boolean isAvailable(Produto product){
		System.out.println("Produto " + product.getName() + " disponível em estoque");
		return true;
	}
}