/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaestruturascondicionaispt2;

import java.util.Scanner;

/**
 *
 * @author Thulio Faculdade
 */
public class AulaEstruturasCondicionaisPt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner teclado = new Scanner(System.in);
        System.out.println("Qual seu ano de nascimento?");
int ano = teclado.nextInt();
int idade = 2022 - ano;

if(idade < 16){
    System.out.println("Não Vota");
}else if((idade >= 16 && idade < 18) || (idade > 70)){
        System.out.println("Voto Opcional");
}else{
        System.out.println("Voto Obrigatorio");
}
}

    }
    
