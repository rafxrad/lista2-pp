package templatemethod;

public class TudoMinuscula extends ProcessadorTexto{

		@Override
		char[] converterCaracteres(char[] chars) {
			// TODO Auto-generated method stub
			char[] novosCaracteres = new char[chars.length];
			for(int i=0;i<chars.length;i++)
			{
				novosCaracteres[i]= Character.toLowerCase(chars[i]);
			}
			return novosCaracteres;
		}
	}
	