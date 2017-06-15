/*alterado
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author Gustavo Andrades
 */

import java.util.Scanner;

public class Teste2	 {
    public static void main (String args[]){
    	Scanner in = new Scanner(System.in);   
        int num1 = 9;
        int num2 = 0;
        menu(num1,num2);
        //teste
 }
        //Declaração das Classes

	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	public static int subtracao(int num1, int num2){
		return num1 - num2;
	}
	public static int divisao(int num1,int num2){
		return num1 / num2;
	}
	public static int multiplicacao(int num1, int num2){
		return num1 - num2;
	}


    public static void menu(int num1, int num2){
    //  
    Scanner in = new Scanner(System.in);                
    System.out.println("/////////Escolha uma opção\\\\\\\\\\\\");
    System.out.println("1- Soma");  
    System.out.println("2- Subtracao");  
    System.out.println("3- Divisao ");  
    System.out.println("4- Multiplicacao");  
    System.out.println("0- Sair");  
    System.out.println("Operação: ");  
    int opcao = in.nextInt();
        System.out.println("Digite o valor do primeiro Numero: ");
        num1 = in.nextInt();
        System.out.println("Digite o valor do segundo Numero: ");
        num2 = in.nextInt(); 
        switch (opcao) {
    case 1:
        int result = soma(num1,num2);
        System.out.println("O resultado é: "+result);
        menu(num1, num2);
       break;
    case 2:
        result = subtracao(num1,num2);
        System.out.println("O resultado é: "+result);
        menu(num1, num2);
       break;
    case 3:
        result = divisao(num1,num2);
        System.out.println("O resultado é: "+result);
        menu(num1, num2);
        break;
    case 4:
        result = multiplicacao(num1,num2);
        System.out.println("O resultado é: "+result);
        menu(num1, num2);
        break;
    case 5:
         break;
    case 6:
        System.out.println("Digite uma opição valida.");
        //default;
    }
}
//}