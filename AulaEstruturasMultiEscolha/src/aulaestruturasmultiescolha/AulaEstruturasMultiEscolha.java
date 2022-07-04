/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaestruturasmultiescolha;

import java.util.Scanner;

/**
 *
 * @author Thulio Faculdade
 */
public class AulaEstruturasMultiEscolha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner teclado = new Scanner(System.in);
String tipo;
int pernas;

System.out.println("Selecione por favor o numero de patas");
        System.out.println("1 Pata");
        System.out.println("2 Pata");
        System.out.println("4 Pata");
        System.out.println("8 Pata");

pernas = teclado.nextInt();
switch(pernas){
case 1:
    tipo = "Saci";
    break;
case 2:
    tipo = "Bipede";
    break;
case 4:
    tipo = "Quadrupede";
    break;
case 8:
    tipo = "Ariranha";
    break;
default:
    tipo = "ET";
}
        System.out.println(tipo);



}


    }
    
