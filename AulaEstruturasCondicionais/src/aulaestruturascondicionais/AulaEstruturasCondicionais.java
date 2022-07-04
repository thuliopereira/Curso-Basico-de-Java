/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaestruturascondicionais;

import java.util.Scanner;

/**
 *
 * @author Thulio Faculdade
 */
public class AulaEstruturasCondicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*Scanner teclado = new Scanner (System.in);
        System.out.println("Digite a primeira nota do aluno");
float n1, n2, media;
n1 = teclado.nextFloat();
        System.out.println("Digite  a segunda nota do aluno");
n2 = teclado.nextFloat();
media = (n1 + n2) / 2;
System.out.println("A media do aluno foi: " + media);
if(media >= 9) {
    System.out.println("PARABENS");
    }*/
//ACIMA ESTRUTURA SIMPLES
//ABAIXO ESTRUTURA COMPOSTA

Scanner teclado = new Scanner(System.in);
int anoAtual, anoNasc, idade;
        System.out.println("Qual o ano de nascimento?");
anoAtual = 2022;
anoNasc = teclado.nextInt();
idade = anoAtual - anoNasc;
if(idade >= 18){
    System.out.println("MAIOR DE IDADE");
}else{
    System.out.println("MENOR DE IDADE");
}


  }
}
