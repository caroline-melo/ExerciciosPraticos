package filaEPilha;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int opcao = 0;			
		do {		
		System.out.println("**************");
		System.out.println("	1 - Adicionar livro na pilha		");
		System.out.println("	2 - Listar todos os livros			");
		System.out.println("	3 - Retirar cliente da pilha		");
		System.out.println("	0 - Sair							");
		System.out.println("**************");
		System.out.println("\nEntre com a opção desejada:\n");
				opcao = leia.nextInt();		
		switch(opcao) {		
		case 1:
			leia.nextLine();
			System.out.println("\nDigite o nome: \n");
			pilha.push(leia.nextLine());			
			System.out.println("\nPilha:\n");
			System.out.println(pilha);			
			System.out.println("\nLivro adicionado!\n");			
			break;			
		case 2: 
			System.out.println("\nLista de livros na pilha:\n");
			System.out.println(pilha);
			
			break;
			
		case 3:
			leia.nextLine();
			if (pilha.size() < 1) {
				System.out.println("\nA pilha está vazia!\n");
			}else {
				pilha.pop();
				System.out.println("\nPilha:\n");
				System.out.println(pilha);
				System.out.println("\nUm livro foi retirado da pilha\n");
					}
			
			break;
			
		}
		
		} while (opcao !=0);
		leia.close();
		
		System.out.println("Programa Finalizado");
	}

}