/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comandosdeentrada;

import java.util.Scanner;

/**
 *
 * @author Thulio Faculdade
 */
public class ComandosDeEntrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
float nota = teclado.nextFloat();
        System.out.println("O aluno " + nome + " tirou " + nota + " na prova");
    }
    
}
