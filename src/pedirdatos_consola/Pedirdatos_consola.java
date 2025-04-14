/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedirdatos_consola;

import java.util.Scanner;

/**
 *
 * @author pc-linx
 */
public class Pedirdatos_consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);// scanner (es la clase) teclado es el (objeto)
        System.out.println("escriba el nombre"); // si debajo de esta linea si esta el onjeto scanner esta pidiendo//
        String nombre = teclado.next(); // despues del punto son funciones
        System.out.println("mi nombre es "+ nombre);//debajo de esta linea no esta el objeto de la clase scanner esta mostrando//
    }
    
}
