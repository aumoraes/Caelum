package banco;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Data dataEntrada = new Data();
		dataEntrada.dia = 20;
		dataEntrada.mes = 11;
		dataEntrada.ano = 2015;
		f1.setNome("Hugo");
		f1.setSalario(100);
		f1.setDataEntrada(dataEntrada);
		f1.bonificacao(50);
		f1.mostra();
	}
}
