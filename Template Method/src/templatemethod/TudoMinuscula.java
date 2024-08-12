package templatemethod;

public class TudoMinuscula extends ProcessadorTexto{

		@Override
		char[] converterCaracteres(char[] chars) {
			// TODO Auto-generated method stub
			char[] newCaracter=new char[chars.length];
			for(int i=0;i<chars.length;i++)
			{
				String temp=String.valueOf(chars[i]);
				newCaracter[i]=temp.toLowerCase().charAt(0);
			}
			return newCaracter;
		}
	}
	