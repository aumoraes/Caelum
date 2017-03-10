package br.com.aurelio.banco.contas;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	String formatada(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

}
