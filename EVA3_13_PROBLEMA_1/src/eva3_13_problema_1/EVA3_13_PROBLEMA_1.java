/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_problema_1;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA3_13_PROBLEMA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int[] arreglo = new int[10]; 
        int contador = 0;
        
        // Generar y mostrar el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 10);
            

            System.out.print(arreglo[i]);
        }
        
        System.out.println("");

        // pedir el valor
        System.out.print("Ingresa el valor que deseas buscar entre 0 y 9: ");
        int valorBuscado = captu.nextInt();

        // contar cuantas veces se repite recorriendo todo el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                contador++;                               
                                                                 
            }
            
        }

        System.out.println("el numero " + valorBuscado + " se repite " + contador + " veces ");
    }

    }
    

