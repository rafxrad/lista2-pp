package templatemethod;

public abstract class ProcessadorTexto {
	
	
	final String converterTexto(String entrada) {
		
		char[] caracteres = extrairCaracteres(entrada);
		char[] caracteresExtraidos = converterCaracteres(caracteres);
		String resultado = juntarCaracteres(caracteresExtraidos);
		return resultado;
	}

	
	char[] extrairCaracteres(String texto) {
		return texto.toCharArray();
	}
	
	
	String juntarCaracteres(char[] chars) {
				String string = "";
				for (int i = 0; i<chars.length; i++) {
					string += String.valueOf(chars[i]);
				} return string;
	}
	
	
	abstract char[] converterCaracteres(char[] chars);
}
	
	
