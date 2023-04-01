/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author emanuel
 */
public class PedirDatos {

    protected int importe, resul, total;
    protected double resultado;

    Scanner in = new Scanner(System.in);

    //Metodo pide el Importe al Usuario
    public void Pedir_Datos() {
        System.out.print("Ingrese el Importe: $");
        importe = in.nextInt();
    }

    public void Sumar() {
        resul = importe + total;
    }
    
    //Muestra el resultado
    public void MostrarResultado() {

        //Muestro importe del precio del Producto
        System.out.println("Importe Total de la Compra: $" + importe);

        //Resultado del IVA
        total = (int) Math.round(resultado);
        System.out.println("IVA: $" + total);

        //Resultado de Suma del IVA + Importe
        Sumar();
        System.out.println("Importe total a Pagar: $" + resul);
    }

    
}
