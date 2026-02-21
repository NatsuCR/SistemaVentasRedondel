/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transitions;

//Imports
import Trabajadores.frame.RegistrarTrabajador;
import Login.frame.Login;
import Principal.frame.*;
import Trabajadores.frame.*;
import Ventas.frame.*;

/**
 *
 * @author jarav
 */
public class Transition {

    //Ventana inicio a login
    public void runToLogin() {

        Login l = new Login();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

    }

    //Ventana principal a ventas
    public void principalToVentas(Principal p) {

        RealizarVenta l = new RealizarVenta();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        p.dispose();
    }

    public void principalToRegistrarUsuario(Principal p) {

        RegistrarTrabajador l = new RegistrarTrabajador();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        p.dispose();
    }

    public void principalToTrabajadorRegistrado(Principal p) {

        TrabajadorRegistrado l = new TrabajadorRegistrado();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        p.dispose();
    }

    public void principalToDetalleVenta(Principal p) {

        DetalleVenta l = new DetalleVenta();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        p.dispose();
    }

    //Ventana principal a ventas
    public void ventasToPrincipal(RealizarVenta v) {

        Principal l = new Principal();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        v.dispose();
    }

    //VentasRealizadas to Principal
    public void ventasRealizadasToPrincipal(VentaRealizada v) {

        Principal l = new Principal();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        v.dispose();
    }

    //VentasRealizadas to Principal
    public void detallesToPrincipal(DetalleVenta v) {

        Principal l = new Principal();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        v.dispose();
    }

    //VentasRealizadas to Principal
    public void detallesToVentasRealizdas(DetalleVenta v) {

        VentaRealizada l = new VentaRealizada();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        v.dispose();
    }

    //VentasRealizadas to Principal
    public void detallesToRealizarVentas(DetalleVenta v) {

        RealizarVenta l = new RealizarVenta();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        v.dispose();
    }

    //VentasRealizadas to Realizar Ventas       
    public void ventasRealizadasToRealizarVenta(VentaRealizada v) {

        RealizarVenta l = new RealizarVenta();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        v.dispose();
    }

    //VentasRealizadas to Realizar Ventas       
    public void principalToVentasRealizadas(Principal v) {

        VentaRealizada l = new VentaRealizada();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        v.dispose();
    }

    //VentasRealizadas to Realizar Ventas       
    public void realizarVentasToVentasRealizadas(RealizarVenta v) {

        VentaRealizada l = new VentaRealizada();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        v.dispose();
    }

    //VentasRealizadas to Realizar Ventas       
    public void ventasRealizadasToDetallesVentas(VentaRealizada v) {

        DetalleVenta l = new DetalleVenta();

        l.setLocationRelativeTo(null);
        l.setVisible(true);

        v.dispose();
    }

    //Pasar como parametro la clase frame y login.dispose();
    public void loginToPrincipal(Login login) {

        Principal p = new Principal();

        p.setLocationRelativeTo(null);
        p.setVisible(true);

        login.dispose();

    }

    //Registrar Trabajador - transiciones
    public void registrarTrabajadorToPrincipal(RegistrarTrabajador l) {

        Principal p = new Principal();

        p.setLocationRelativeTo(null);
        p.setVisible(true);

        l.dispose();

    }

    public void registrarTrabajadorToRealizarVenta(RegistrarTrabajador l) {

        RealizarVenta p = new RealizarVenta();

        p.setLocationRelativeTo(null);
        p.setVisible(true);

        l.dispose();

    }

    public void registrarTrabajadorToDetalleVenta(RegistrarTrabajador l) {

        DetalleVenta p = new DetalleVenta();

        p.setLocationRelativeTo(null);
        p.setVisible(true);

        l.dispose();

    }

    public void registrarTrabajadorToVentaRealizada(RegistrarTrabajador l) {

        VentaRealizada p = new VentaRealizada();

        p.setLocationRelativeTo(null);
        p.setVisible(true);

        l.dispose();

    }

    public void registrarTrabajadorToVerTrabajadorRegistrado(RegistrarTrabajador l) {

        TrabajadorRegistrado p = new TrabajadorRegistrado();

        p.setLocationRelativeTo(null);
        p.setVisible(true);

        l.dispose();

    }

}
