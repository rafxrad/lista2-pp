package facade;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServicoEstoque estoque = new ServicoEstoque();
		ServicoPagamento pagamento = new ServicoPagamento();
		ServicoRemessa entrega = new ServicoRemessa();
		
		Produto produto1 = new Produto(5, "Lava Louças Brastemp");
		
		
		FacadeAtendimento atendimento1 = new FacadeAtendimento(estoque, pagamento, entrega);
		atendimento1.realizarAtendimento(produto1);
		
	}
}