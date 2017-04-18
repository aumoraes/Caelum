package br.com.aurelio.banco.contas;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	protected double bonificacao;
	private String departamento;
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
	
	public void setBonificacao(double aumento){
		this.bonificacao = this.salario * 1.4;	
	}
	
	public double getBonificacao(){
		return this.bonificacao;
	}
	
	void demite(){
		this.estaNaEmpresa = false;
	}
	
	double getGanhoAnual(){
		return this.salario * 12;
	}
	
	public void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + salario);
		System.out.println("Data de Entrada: " + this.dataEntrada.formatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Esta na empresa? " + this.estaNaEmpresa);
		System.out.println("Bonificação: " + this.getBonificacao());
	}
	
	public static int getIdentificador(){
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




	


