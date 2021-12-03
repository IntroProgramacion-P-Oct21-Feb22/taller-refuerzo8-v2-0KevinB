/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg8.v2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Taller8V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Una empresa vende computadoras, con las siguientes condiciones:
• Si el cliente es de tipo 1 se le descuenta 1% • Si el cliente es de tipo 2 
se le descuenta 5% • Si el cliente es de tipo 3 se le descuenta 10% • Si el 
cliente es de tipo 4 se le descuenta 15%
Los productos y computadoras disponibles son:
• Computadora 1: $1000 • Computadora 2: $1100 • Computadora 3: $ 900
Cuando un cliente realiza una compra se pide los siguientes datos:
• Nombre del cliente • Tipo de cliente (1,2,3,4) • Seleccionar computadora de 
las disponibles
El cliente solo compra un computador a lavez*/

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int tipo;
        double descuento;
        double porcentaje;
        int cedula;
        int precio = 0;
        int computadora;
        String nombre;
        int unidades;
        double total = 0;
        double total2 = 0;

        System.out.println("Ingrese  su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su numero de ceduka");
        cedula = entrada.nextInt();
        System.out.println("Ingrese el tipo de cliente");
        tipo = entrada.nextInt();
        System.out.println("Elija el tipo de computadora que desea: • "
                + "Computadora 1: $1000 • Computadora 2: $1100 • Computadora 3: $ 900");
        computadora = entrada.nextInt();
        System.out.println("Ingrese cuantas unidades que desee");
        unidades = entrada.nextInt();
        
        if (computadora == 1) {precio = 1000;}
        if (computadora == 2) {precio = 1100;}
        if (computadora == 3) {precio = 900;}
        {
            if (tipo == 1) {
                porcentaje = 1;
                descuento = (porcentaje * unidades * precio) / 100;
                total = (unidades * precio) - descuento;
            }
            if (tipo == 2) {
                porcentaje = 5;
                descuento = (porcentaje * unidades * precio) / 100;
                total = (unidades * precio) - descuento;
            }
            if (tipo == 3) {
                porcentaje = 10;
                descuento = (porcentaje * unidades * precio) / 100;
                total = (unidades * precio) - descuento;
            }
            if (tipo == 4) {
                porcentaje = 15;
                descuento = (porcentaje * unidades * precio) / 100;
                total = (unidades * precio) - descuento;
            }
                     total2 = total2 + total;
        System.out.printf("El cliente de nombre: %s, con cedula: %s, compra %s"
                + " computadoras con precio individual de: %s y el total a pagar"
                + "es: %s\n\n\n", nombre, cedula, unidades, precio, total);
        System.out.println("Total de ventas de computadoras: " + total2);

        
                        }
            }
        }
