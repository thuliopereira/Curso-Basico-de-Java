/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perfiljoptionpane;

import javax.swing.JOptionPane;
/**
 *
 * @author Thulio Faculdade
 */
public class PerfilJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

String nome, email, emailLogin;
int idade, ano;
int senha, senhaLogin;
JOptionPane.showMessageDialog(null, "Vamos prencher um perfil", "Perfil", JOptionPane.QUESTION_MESSAGE);
nome = JOptionPane.showInputDialog(null, "Informe o seu nome: ");
idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade: "));
email = JOptionPane.showInputDialog(null, "Informe seu email: ");
senha = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe uma senha de 8 digitos: "));
ano = 2022 - idade;

emailLogin = JOptionPane.showInputDialog(null, "Email: ");
if(emailLogin.equals(email)){
    senhaLogin = Integer.parseInt(JOptionPane.showInputDialog(null, "Senha: "));
    if(senhaLogin == senha){
        JOptionPane.showConfirmDialog(null, "Confirmar?");
        JOptionPane.showMessageDialog(null, "<html>Bem Vindo " + nome + "<br>Voce nasceu em " + ano + "</html>");
    }else{
        JOptionPane.showMessageDialog(null, "Senha Incorreta");
    }
}else{
    JOptionPane.showMessageDialog(null, "Email não cadastrado");
}
 
   
    }
    
}
