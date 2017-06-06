package br.com.aurelio.banco;

public class Teste {
	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			String x = "a" + i;
			System.out.println(x);
		}
	}
}