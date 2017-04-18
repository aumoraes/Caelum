package br.com.aurelio.banco;

import br.com.aurelio.banco.contas.Empresa;
import br.com.aurelio.banco.contas.Funcionario;
import br.com.aurelio.banco.contas.Gerente;

public class TesteEmpresa {
	
	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		int quantidadeDeFuncionarios = 3;
		
		for( int i = 0 ; i < quantidadeDeFuncionarios; i++ ){
			Gerente f = new Gerente("joao" + i);
			f.setSalario( 1000 + i * 100 );	
			empresa.adiciona(f);
		}

		empresa.mostraEmpregados();		
		
		System.out.println("Total de funcionario criados: " + Funcionario.getIdentificador() );
		
		//Funcionario novoFunc = new Funcionario();
		//novoFunc.setNome("carlos");
		//System.out.println(empresa.contem(empresa.empregado[0]));
		//System.out.println(empresa.contem(novoFunc));
	}
}
