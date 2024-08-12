package facade;

public class FacadeAtendimento {
	
	ServicoEstoque estoque;
	ServicoPagamento pagamento;
	ServicoRemessa entrega;
	
	
	public FacadeAtendimento(ServicoEstoque estoque, ServicoPagamento pagamento, ServicoRemessa entrega) {
		this.estoque = estoque;
		this.pagamento = pagamento;
		this.entrega = entrega;
	}

	public void realizarAtendimento(Produto produto) {
		System.out.println("Iniciando atendimento...");
		
		estoque.isAvailable(produto);
		pagamento.makePayment();
		entrega.shipProduct(produto);
		
	}

}
