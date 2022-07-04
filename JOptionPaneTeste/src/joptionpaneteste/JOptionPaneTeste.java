/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpaneteste;
import javax.swing.JOptionPane;
/**
 *
 * @author Thulio Faculdade
 */
public class JOptionPaneTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//JOptionPane.showMessageDialog(null, "Texto da janela", "Nome da Janela", JOptionPane.WARNING_MESSAGE); //JOptionPane.WARNING_MESSAGE vai mudar o icone da janela
int n;
int soma = 0;
int valores, pares, impares, maisCem;
float media;
valores = 0;
maisCem = 0;
pares = 0;
impares = 0;
media = 0;
do{
n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um Numero (valor 0 interrompe o programa): "));
if(n > 0){
    soma = soma + n;
    valores = valores + 1;
    media = (media + n) / valores;
    if(n > 100){
        maisCem = maisCem + 1;
    }
    if(n % 2 == 0){
        pares = pares + 1;
    }else{
        impares = impares + 1;
    }
}
} while(n != 0);
JOptionPane.showMessageDialog(null, "<html> A soma dos valores digitado foi: " + soma + "<br>Numero de valores digitados: " + valores +
"<br>A media dos valores digitados foi: " + media + "<br>Numeros maiores que 100: " + maisCem +
"<br>Numeros pares: " + pares + "<br>Numeros impares: " + impares + "</html>");


    }
    
}
