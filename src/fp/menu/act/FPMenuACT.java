/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu.act;
import java.util.*;
/**
 *
 * @author Enano
 */
public class FPMenuACT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int op;
        double area;
        //Resolucion
        op=menu();
        System.out.println("La opción elegida es: "+op);
        area=calculaAreas(op);
        imprimirResultado(area, op);
    }
 public static int menu ()
 {
     int opcion;
     do
     {
        Scanner entrada = new Scanner(System.in);
        System.out.println("****   Cálculo de Áreas    ****");
        System.out.println("****         Menú          ****");
        System.out.println("Introducza la opción deseada:");
        System.out.println("1.- Área de cuadrados.");
        System.out.println("2.- Área de círculos.");
        System.out.println("3.- Área de tríangulos.");
        System.out.println("0.- Salir.");
        opcion = entrada.nextInt();
     }
     while (opcion<0 || opcion >=4);
     return opcion;
 }
    public static double calculaAreas (int op)
    {
        double area;
        area=0;
        switch(op){
            case 1:
                System.out.println("*** Cuadrado ***");
                area=areaCuadrado();
                break;
            case 2:
                System.out.println("*** Círculo ***");
                area=areaCirculo();
                break;
            case 3:
                System.out.println("*** Tríangulo ***");
                area=areaTriangulo();
                break;
            default:
                mensajeSalida();
                break;
        }
        return area;
       }
    public static double areaCuadrado ()
    {
        double lado;
        System.out.println("Ingrese el valor de un lado:");
        Scanner entrada = new Scanner (System.in);
        lado=entrada.nextDouble();
        return (lado*lado);
    }
    public static double areaCirculo ()
    {
        double radio;
        System.out.println("Ingrese el valor del radio:");
        Scanner entrada = new Scanner (System.in);
        radio=entrada.nextDouble();
        return (radio*radio*3.14);
    }
    public static double areaTriangulo ()
    {
        Scanner entrada = new Scanner (System.in);
        double base,altura;
        System.out.println("Ingrese el valor de la base: ");
        base=entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        altura=entrada.nextDouble();
        return ((base*altura)/2);
    }
    public static void mensajeSalida ()
    {
        System.out.println("Gracias por usar este programa");
        System.exit(0);
    }
    public static void imprimirResultado(double area, int op)
    {
        switch (op)
        {
            case 1:
            System.out.println("La área de ese cuadrado es: "+area);
              break;
            case 2:
            System.out.println("La área de ese círculo es: "+area);
              break;
            case 3:
            System.out.println("La área de ese tríangulo es: "+area);
              break;
        }
    }
}

    
