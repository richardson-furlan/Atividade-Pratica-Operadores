package Teste;

import java.util.Scanner;

public class Exaercicio2 {

	public static void main(String[] args) {

		float nota1,nota2,nota3,nota4,media;
		Scanner leia = new Scanner (System.in);

	
		System.out.println("Digite a sua primeira nota");
		nota1 = leia.nextFloat();
 
		System.out.println("Digite a sua segunda nota");
		nota2 = leia.nextFloat();
 
		System.out.println("Digite a sua terceira nota");
		nota3 = leia.nextFloat();
 
		System.out.println("Digite a sua quarta nota");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Sua média é: "+media);
 
	}

}
