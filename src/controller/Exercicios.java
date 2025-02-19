package controller;

import javax.swing.JOptionPane;

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
	
	public void SeparaFrase() {
		//System.out.println("Insira a frase:");
		//String frase = scan.nextLine();
		String frase = JOptionPane.showInputDialog("");
		String[] vetFrase = frase.split(";");
		
		for (String x : vetFrase) {
			System.out.println(x);
		}
		System.out.println("\nQntd. Palavras: " + vetFrase.length);
	}
	
	public void Exercicio3() {
		
	}
}
