/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoresforit;

import java.util.Arrays;

/**
 *
 * @author Thulio Faculdade
 */
public class VetoresForIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
double exemplo[] = {3.5, 9.4, 6.5};
int exemplo2[] = new int[20];

Arrays.sort(exemplo);
int pos = Arrays.binarySearch(exemplo, 6.5);


//O DOUBLE do FOR tem que acompanhar o tipo que foi declarado o VETOR. A variavel VALOR é criada para funcionar como o CONT do FOR NORMAL.
for(double valor: exemplo){
    System.out.println(valor);
}

        System.out.println("O valor foi encontrado na posição: " + pos);

// Abaixo teremos o uso do ARRAY FILL para setar a posição de TODOS no vetor com o mesmo valor
Arrays.fill(exemplo2, 0);

for(int valor: exemplo2){
    System.out.print(valor + ", ");
}



    }
    
}
