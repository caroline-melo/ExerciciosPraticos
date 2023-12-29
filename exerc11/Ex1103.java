package exerc11;

public class Ex1103 {

	public static void main(String[] args) {
		//print ij diagonal principal
		//print ij diagonal secundaria
		//print soma ij diagonal principal
		//print soma ij diagonal secundária
		
		//diagonal principal: (0,0),(1,1),(2,2)
		//diagonal secundária (0,2),(1,1),(2,0)
		
		int matriz[][] = { { 1,2,3 }, { 4,5,6 }, { 7,8,9 } }, soma1=0, soma2 = 0;

		System.out.print("Elementos na diagonal principal: ");
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	if (i == j) {       	
            		System.out.print(matriz[i][j] + " ");
            		soma1 += matriz[i][j];}
                   
            }}
		System.out.println();
		System.out.print("Elementos na diagonal secundária: ");
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	if (i + j == 2) {       	
            		System.out.print(matriz[i][j] + " ");
            		soma2 += matriz[i][j];}
            	
            }}
              
		System.out.println();
		System.out.println("Soma dos elementos na diagonal principal: "+soma1);
		System.out.println("Soma de elementos na diagonal secundária: "+soma2);
	        
	}

}
	