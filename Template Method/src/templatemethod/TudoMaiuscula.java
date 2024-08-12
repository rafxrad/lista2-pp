package templatemethod;

public class TudoMaiuscula extends ProcessadorTexto {

	@Override
	char[] converterCaracteres(char[] chars) {
		// TODO Auto-generated method stub
		char[] novosCaracteres = new char[chars.length];
		for(int i=0;i<chars.length;i++)
		{
			novosCaracteres[i]= Character.toUpperCase(chars[i]);
		}
		return novosCaracteres;
	
	}
	
	
}