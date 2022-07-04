/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturarepeticaotesteinicio;

/**
 *
 * @author Thulio Faculdade
 */
public class EstruturaRepeticaoTesteInicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int contador = 0;
while(contador < 10){
    contador++;
    if(contador == 2 || contador == 3){
    continue;   //se o codigo achar um CONTINUE ele ignora o restante do bloco e volta ao começo da estrutura
}
    if(contador == 8){
    break; //no break ele interrompe a estrutura a qualquer momento e da sequencia no codigo na linha sequencia da estrutura
}

    System.out.println("Loop " + contador);

}
        System.out.println("FIM");
    }
    
}
