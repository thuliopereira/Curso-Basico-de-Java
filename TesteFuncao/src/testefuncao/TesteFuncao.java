/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao;

/**
 *
 * @author Thulio Faculdade
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
// METODO SEM RETORNAR VALORES
static void somaSemRetorno(int a, int b){
int somaSemRetorno = a + b;
System.out.println("O resultado da soma é " + somaSemRetorno);
}

// METODO RETORNANDO VALORES
static int somaComRetorno(int a, int b){
int somaComRetorno = a + b;
return somaComRetorno;
}
    public static void main(String[] args) {
        // TODO code application logic here
somaSemRetorno(5,2);

int scr = somaComRetorno(6,3);
System.out.println("O resultado da soma é " + scr);



    }

    
}
