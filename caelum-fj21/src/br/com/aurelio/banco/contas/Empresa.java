package br.com.aurelio.banco.contas;

public class Empresa {
	Funcionario[] empregado;
	String cnpj;
	String nome;
	int ponteiro = 0;
	
	public Empresa(int qntDeFuncionarios){
		this.empregado = new Funcionario[qntDeFuncionarios];
	}
	
	public void adiciona(Funcionario f){
		this.empregado[ponteiro] = f;
		ponteiro++;
	}
	
	public Funcionario getFuncionario (int posicao) {
		return this.empregado[posicao];
	}
	
	public void mostraEmpregados(){
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
