/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comandosdesaida;



/**
 *
 * @author Thulio Faculdade
 */
public class ComandosDeSaida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

float nota = 8.5f;
System.out.println("Sua nota é " + nota + " e foi aprovada");
System.out.printf("Sua nota é %.2f e foi aprovada \n", nota);
System.out.format("Sua nota é %.2f e foi aprovada \n", nota);
// abaixo vamos criar um codigo com duas variaveis para exemplificar posicionamento delas
String nome = "Thulio";
System.out.println("A nota de " + nome + " é " + nota + " e foi aprovada");
System.out.printf("A nota de %s é %.2f e foi aprovada \n", nome, nota);
System.out.format("A nota de %s é %.2f e foi aprovada \n", nome, nota);

    }
    
}
