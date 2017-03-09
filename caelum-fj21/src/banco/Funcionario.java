package banco;

abstract class Funcionario {
	protected String nome;
	private String departamento;
	protected double salario;
	private Data dataEntrada = new Data();
	private String rg;
	private boolean estaNaEmpresa = true;
	
	static int identificador = 0;
	
	Funcionario(){
		identificador++;
	}
	
	Funcionario(String nome ){
		identificador++;
		this.nome = nome;
	}
	
	void setBonificacao(double aumento){
		this.salario += aumento;
	}
	abstract double getBonificacao();
	
	void demite(){
		this.estaNaEmpresa = false;
	}
	
	double getGanhoAnual(){
		return this.salario * 12;
	}
	
	void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + salario);
		System.out.println("Data de Entrada: " + this.dataEntrada.formatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Esta na empresa? " + this.estaNaEmpresa);
	}
	
	static int getIdentificador(){
		return identificador;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}
	
	
}

class Data{
	int dia;
	int mes;
	int ano;
	
	String formatada(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}

class Empresa{
	Funcionario[] empregado;
	String cnpj;
	String nome;
	int ponteiro = 0;
	
	Empresa(int qntDeFuncionarios){
		this.empregado = new Funcionario[qntDeFuncionarios];
	}
	
	void adiciona(Funcionario f){
		this.empregado[ponteiro] = f;
		ponteiro++;
	}
	
	public Funcionario getFuncionario (int posicao) {
		return this.empregado[posicao];
	}
	
	void mostraEmpregados(){
		for (int i = 0; i < empregado.length; i++) {
			System.out.println("Funcionário na posição: " + i);
			empregado[i].mostra();
		}
	}
	
	boolean contem(Funcionario f){
		boolean encontrou = false;
		for (Funcionario empregado : this.empregado){
			if(empregado == f){
				encontrou = true;
				break;
			}
		}
		return encontrou;
	}
}


class PessoaFisica {	
	private String cpf;
		private String nome;
	public PessoaFisica(String cpf) {
		if( validaCpf(cpf) ){
			this.cpf = cpf;	
		} else {
			return;
		}
	}
	
	boolean validaCpf(String cpf){
		String[] formatedCpf = cpf.split(".");
		if(formatedCpf.length == 11){
			return true;
		} else {
			return false;
		}
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
