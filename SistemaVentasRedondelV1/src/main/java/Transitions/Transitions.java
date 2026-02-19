/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transitions;


//Imports
import Principal.frame.Principal;
import Login.frame.Login;


/**
 *
 * @author jarav
 */
public class Transitions {
    
    //Pasar como parametro la clase frame y login.dispose();
    public void runToLogin(){
    
    Login l = new Login();
    
    l.setLocationRelativeTo(null);
    l.setVisible(true);
    
    }
    
    
    
    
    
    
    //Pasar como parametro la clase frame y login.dispose();
    public void loginToPrincipal(Login login){
    
    Principal p = new Principal();
    
    p.setLocationRelativeTo(null);
    p.setVisible(true);
    
    login.dispose();
    
    
    }
    
    
    
}
