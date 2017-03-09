
public class TesteFabricaCarro {
	
	public static void main(String[] args){
		FabricaDeCarroSingleton fc = FabricaDeCarroSingleton.getInstance();			
		
		fc.setNome("aurelio");
		
		System.out.println(fc.getNome());
		
		
		FabricaDeCarroSingleton fc2 = FabricaDeCarroSingleton.getInstance();
		
		System.out.println(fc2.getDados());
	}
}
