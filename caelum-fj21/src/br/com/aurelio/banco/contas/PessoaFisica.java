package br.com.aurelio.banco.contas;

public class PessoaFisica {
	
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
