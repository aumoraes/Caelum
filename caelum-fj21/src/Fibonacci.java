
public class Fibonacci {
	public static void main(String[] args) {
		int x1 = 0;
		int x2 = 1;
		int posicao = 9;
		int ponteiro = 2;
		System.out.println("Posição 1 de Fibonacci = " + x1);
		System.out.println("Posição 2 de Fibonacci = " + x2);

		while (ponteiro < posicao) {
			x2 = x1 + x2;
			x1 = x2 - x1;
			ponteiro++;
			System.out.println("Posição " + ponteiro + " de Fibonacci = " + x2);
		}
	}
}
