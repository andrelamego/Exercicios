package controller;

import java.util.Scanner;

public class Exercicios {
	public Exercicios() {
		 super();
	}
	 
	public void PreencheVetor(){
		 int[] vet = new int[1000000];
		 
		 double tempoInicial = System.nanoTime();
		 
		 for(int i : vet) {
			 vet[i] = 0;
		 }
		 
		 double tempoFinal = System.nanoTime();
		 
		 double tempoTotal = tempoFinal - tempoInicial;
		 tempoTotal = tempoTotal / Math.pow(10, 9);
		 System.out.println("Tempo total: "+tempoTotal+"s");
	 }
	
	public void SeparaFrase(Scanner scan) {
		
		System.out.println("Insira a frase:");
		String frase = scan.nextLine();
		
		String[] vetFrase = frase.split(";");
		
		for (String x : vetFrase) {
			System.out.println(x);a
		}
		System.out.println("\nQntd. Palavras: " + vetFrase.length);
	}
}
