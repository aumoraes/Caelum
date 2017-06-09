package br.com.aurelio.banco.contas;

public interface Cliente {
	
	public String getNome();
	public void setNome( String nome);
	
	public String getTelefone();
	public void setTelefone( String telefone );
	
	boolean validaDados( String numeroRegistro);

}
