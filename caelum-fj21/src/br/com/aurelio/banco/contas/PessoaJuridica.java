package br.com.aurelio.banco.contas;

public class PessoaJuridica implements Cliente{
	private String cnpj;
	private String nome;
	private String telefone;
	
	public PessoaJuridica(String cnpj, String nome) {		
		this.nome = nome;
		
		if( validaDados(cnpj) ){
			this.cnpj = cnpj;	
		} else {
			return;
		}
	}
	
	public String getCnpf(){
		return this.cnpj;
	}
	
	public void setCnpj( String cnpj){
		this.cnpj = cnpj;
	}
	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getTelefone() {
		return this.telefone;
	}

	@Override
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public boolean validaDados(String numeroRegistro) {
		String[] formatedCnpj = numeroRegistro.split(".|-");
		if(formatedCnpj.length == 10){
			return true;
		} else {
			return false;
		}
	}

}
