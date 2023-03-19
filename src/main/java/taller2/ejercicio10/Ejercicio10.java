/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller2.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        int num_inscripcion, estrato;
        double patrimonio, matricula;
        String nombres;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de la inscripcion: ");
        num_inscripcion = leer.nextInt();
        
        System.out.println("Ingrese los nombres de la persona: ");
        nombres = leer.next();
        
        System.out.println("Ingrese el patrimonio de la persona: ");
        patrimonio = leer.nextDouble();
        
        System.out.println("Ingrese el estrato de la persona: ");
        estrato = leer.nextInt();
        
        matricula = 50000;
        
        if ((patrimonio > 2000000) && (estrato > 3)) {
            matricula = matricula + (0.03 * patrimonio);
        }
        
        System.out.println("El estudiante con numero de matricula " + num_inscripcion + " y nombre " + nombres + " debe pagar: $" + matricula);
    }
}
