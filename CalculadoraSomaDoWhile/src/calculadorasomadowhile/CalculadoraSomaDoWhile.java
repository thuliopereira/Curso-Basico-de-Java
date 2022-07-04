/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorasomadowhile;

import java.util.Scanner;

/**
 *
 * @author Thulio Faculdade
 */
public class CalculadoraSomaDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

int soma, res;
String teste;
res = 0;
Scanner teclado = new Scanner(System.in);
do{
    System.out.println("Digite um valor a ser somado: ");
soma = teclado.nextInt();
res = res + soma;
    System.out.println("QUER CONTINUAR? S/N");
teste = teclado.next();
}while(teste.equals("S"));
        System.out.println("A soma dos valores é " + res);


    }
    
}
