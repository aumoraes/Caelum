
public class FabricaDeCarroSingleton {
	
	private static FabricaDeCarroSingleton uniqueInstance;

	private FabricaDeCarroSingleton() {
	}
		
	private FabricaDeCarroSingletonData data = new FabricaDeCarroSingletonData();

	public void setNome(String nome){
		this.data.nome = nome;
	}
	public String getNome(){
		return this.data.nome;
	}
	public static synchronized FabricaDeCarroSingleton getInstance() {
		if (uniqueInstance == null){
			uniqueInstance = new FabricaDeCarroSingleton();
			System.out.println("Ainda nao existe");
		}
		
		return uniqueInstance;
	}
	
	public String getDados(){
		return "nome: " + this.data.nome;
	}
}