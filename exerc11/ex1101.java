package exerc11;

import java.util.Scanner;

import java.util.Arrays;

public class ex1101 {

	public static void main(String[] args) {
		//pesquisar dados no vetor definido
		//exibir na tela a posição em que o número está armazenado
		//caso não exista, exibir "Não encontrado"
		
		Scanner leia = new Scanner(System.in);
		
		int [] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int busca, posicao;
		
		
		System.out.println("Digite o número que você deseja encontrar: ");
		busca = leia.nextInt();
		
		posicao = Arrays.binarySearch(vetor,busca);
		posicao = posicao *-1;
				
		if (posicao >= 0) {
			System.out.println("\nO número " +busca+ " está localizado na posição: " +posicao);
		
		}else { System.out.println("\nElemento não encontrado!");}
		
	
	
	}

}

