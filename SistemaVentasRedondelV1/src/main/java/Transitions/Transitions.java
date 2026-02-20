/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transitions;


//Imports
import Principal.frame.Principal;
import Login.frame.Login;
import Ventas.frame.Ventas;

/**
 *
 * @author jarav
 */
public class Transitions {
    
    //Ventana inicio a login
    public void runToLogin(){
    
    Login l = new Login();
    
    l.setLocationRelativeTo(null);
    l.setVisible(true);
    
    }
    
    //Ventana principal a ventas
    public void principalToVentas(Principal p){
    
    Ventas l = new Ventas();
    
    l.setLocationRelativeTo(null);
    l.setVisible(true);
    
    p.dispose();
    }
    
    //Ventana principal a ventas
    public void ventasToPrincipal(Ventas v){
    
    Principal l = new Principal();
    
    l.setLocationRelativeTo(null);
    l.setVisible(true);
    
    v.dispose();
    } 
    
    
    
    
    
    
    //Pasar como parametro la clase frame y login.dispose();
    public void loginToPrincipal(Login login){
    
    Principal p = new Principal();
    
    p.setLocationRelativeTo(null);
    p.setVisible(true);
    
    login.dispose();
    
    
    }
    
    
    
}
