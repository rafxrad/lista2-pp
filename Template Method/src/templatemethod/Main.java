package templatemethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "FiNalMeNtE aCaBoU eSsE sEmEsTrE!!!!!!!";
		
		ProcessadorTexto processadorMaiusculas = new TudoMaiuscula();
		ProcessadorTexto processadorMinusculas = new TudoMinuscula();
		
		String maiusculas = processadorMaiusculas.converterTexto(texto);
		String minusculas = processadorMinusculas.converterTexto(texto);
		
		System.out.println(maiusculas);
		System.out.println(minusculas);
		
	}

}
