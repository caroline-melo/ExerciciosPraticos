package exerc11;

public class Ex1103 {

	public static void main(String[] args) {
		//print ij diagonal principal
		//print ij diagonal secundaria
		//print soma ij diagonal principal
		//print soma ij diagonal secundária
		
		//diagonal principal: (0,0),(1,1),(2,2)
		//diagonal secundária (0,2),(1,1),(2,0)
		
		int matrizInt[][] = { { 1,2,3 }, { 4,5,6 }, { 7,8,9 } };

        /*for (int indiceLinha = 0; indiceLinha < 3; indiceLinha++) {
            for (int indiceColuna = 0; indiceColuna < 3; indiceColuna++) {
                System.out.println(
                    "O valor armazenado na posição [" + indiceLinha + "][" + indiceColuna + "] é: " 
                + matrizInteiros[indiceLinha][indiceColuna]);
            }}*/
		
		
		System.out.println("Elementos na diagonal principal: "+matrizInt[0][0]+" "+matrizInt[1][1]+" "+matrizInt[2][2]);
		System.out.println("Elementos na diagonal secundária: "+matrizInt[0][2]+" "+matrizInt[1][1]+" "+matrizInt[2][0]);
		System.out.println("Soma dos elementos na diagonal principal: "+matrizInt[0][0]+matrizInt[1][1]+matrizInt[2][2]);
		System.out.println("Soma de elementos na diagonal secundária: "+matrizInt[0][2]+" "+matrizInt[1][1]+" "+matrizInt[2][0]);

	        
	}

}
	