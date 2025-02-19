package view;

import java.util.Scanner;

import controller.*;

public class Main {
	public static void main(String[] args) {
		Exercicios ex = new Exercicios();
		
		Scanner scan = new Scanner(System.in);

		int selecao = 0;
		
		while (selecao != 9) {
			
			System.out.println("\nEscolha um exercício: \n1 - Ex1\n2 - Ex2\n3 - Ex3\n9 - Finaliza");
			selecao = scan.nextInt();
			
			switch (selecao) {
				case 1:
					ex.PreencheVetor();
					break;
				case 2:
					ex.SeparaFrase(scan);
					break;
				case 3:
				
					break;
				case 9:
					System.out.println("Finalizado");
					break;
			}
		}
		scan.close();
		
		
	}
}
