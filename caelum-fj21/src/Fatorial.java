

public class Fatorial {
	public static void main(String[] args){
		long fatorial = 1;
		int valorFinal = 11;
		for(int i = 1; i < valorFinal+1; i++ ){
			int fatorialAtual = i - 1;
			if(fatorialAtual == 0){
				fatorial = 1;
			} else {
				fatorial = fatorial * i; 
			}
			System.out.println("O fatorial de " + i + " é: " + fatorial);
		}
	}
}
