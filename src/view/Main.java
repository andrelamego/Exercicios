package view;

import javax.swing.JOptionPane;
import controller.Exercicios;

public class Main {
    public static void main(String[] args) {
        Exercicios ex = new Exercicios();
        

        int selecao = 0;
		
		while (selecao != 9) {
			
			selecao = Integer.parseInt(JOptionPane.showInputDialog("\nEscolha um exercício: \n1 - Ex1\n2 - Ex2\n3 - Ex3\n9 - Finaliza"));
			//System.out.println("\nEscolha um exercício: \n1 - Ex1\n2 - Ex2\n3 - Ex3\n9 - Finaliza");
			//selecao = scan.nextInt();
			
			switch (selecao) {
				case 1:
					ex.PreencheVetor();
					break;
				case 2:
					ex.SeparaFrase();
					break;
				case 3:
					ex.Exercicio3();
					break;
				case 9:
					System.out.println("Finalizado");
					break;
			}
		}
    }
}
