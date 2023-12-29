package filaEPilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class fila {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		int opcao = 0;			
		
		do {	
			
		System.out.println("**************");
		System.out.println("	1 - Adicionar cliente na fila		");
		System.out.println("	2 - Listar todos os clientes		");
		System.out.println("	3 - Retirar cliente da fila			");
		System.out.println("	0 - Sair							");
		System.out.println("**************");
		System.out.println("\nEntre com a opção desejada:\n");
				opcao = leia.nextInt();		
				
		switch(opcao) {		
		case 1:
			leia.nextLine();
			fila.add(leia.nextLine());			
			System.out.println("\nFila:\n");
			System.out.println(fila);			
			System.out.println("\nCliente adicionado!\n");			
			break;			
		case 2: 
			System.out.println("\nLista de clientes na fila:\n");
			System.out.println(fila);
			
			break;
			
		case 3:
			leia.nextLine();
			if (fila.size() < 1) {
				System.out.println("\nA fila está vazia!\n");
			}else {
				fila.remove();
				System.out.println("\nFila:\n");
				System.out.println(fila);
				System.out.println("\nO cliente foi chamado\n");
					}
			
			break;
			
		}
		
		} while (opcao !=0);
		leia.close();
		
		System.out.println("Programa Finalizado");
	}

}