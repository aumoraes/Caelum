
public class ForEncadeado {
	public static void main(String[] args){
		
		int linhas = 4;
		int valorMultiplicado;
		
		for(int i = 1; i< linhas+1;i++){
			for(int j = 1; j<i+1;j++){				
				valorMultiplicado = j * i;
				System.out.print(valorMultiplicado+" ");	
			}
			System.out.println();
		}
			
	}
}
