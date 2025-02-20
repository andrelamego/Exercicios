package controller;

import javax.swing.JOptionPane;

public class Exercicios {
    public Exercicios() {
		super();
	}
	 
	public void PreencheVetor(int[] vet){		 
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
		String frase = JOptionPane.showInputDialog("Insira a frase:");
		String[] vetFrase = frase.split(";");
		
		for (String x : vetFrase) {
			System.out.println(x);
		}
		System.out.println("\nQntd. Palavras: " + vetFrase.length + "\n--------------------------");
	}
	
	public void Exercicio3() {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor:"));
		
		while (i > 100) {
			System.out.println("O vetor deve ser menor ou igual a 100");
			
			i = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor:"));
		}		
		int[] vet = new int[i];



		vet = carregarVet(vet);

		verifVet(vet);
	}

	private int[] carregarVet(int[] vet){
		for (int i = 0; i < vet.length; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("vet["+i+"]:"));
		}

		return vet;
	}

	private void verifVet(int[] vet){
		for (int i : vet) {
			System.out.print(i + "  ");
		}
		System.out.println("\n");


		for (int i : vet) {
			if(i % 2 == 1){
				System.out.println(i+" <--- Impar");
			}
			else if(i % 10 == 0) {
				System.out.println(i+" <--- Par & Multiplo de 10");
			}
		}
	}
}
