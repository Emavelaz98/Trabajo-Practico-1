/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasemain;

import operaciones.SacarIva;

/**
 *
 * @author emanuel
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        
        SacarIva msj = new SacarIva();
        msj.Pedir_Datos();
        msj.IvaProd();
        msj.Sumar();
        msj.MostrarResultado();
    }
}
