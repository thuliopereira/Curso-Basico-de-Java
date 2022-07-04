/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

/**
 *
 * @author Thulio Faculdade
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int cont = 0;
int teste1[] = new int[3];
int teste2[] = {0, 1, 2, 3, 4};

teste1[0] = 0;
teste1[1] = 1;
teste1[2] = 2;


    System.out.println("Teste 1");
for(cont = 0; cont < 3; cont++){
    System.out.println(teste1[cont]);
}  
 
    System.out.println("Teste 2");
 for(cont = 0; cont < 5; cont++){
     System.out.println(teste2[cont]);
}
  
}
}