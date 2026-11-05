/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_arreglos;

/**
 *
 * @author bisonte
 */
public class EVA3_1_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //yn arreglo es una estructura de datos
        //ES UNA SECUENCIA DE VALORES 
        //DEL MISMO TIPO 
        //TODOS SON ENTEROS SON DOUBLE Y ASI
        //NO CAMBIA DE TAMAÑO(INMUTABLE)
        // EL ACCERSO ES POR INDICES(ALEATORIO)
        // para especificiar el arreglo se usan corchetes[] 
        int[] arreglo; //solo declare el arreglo, todavias no existe
        //especificar el tamaño
        arreglo = new int[10]; //
        //INT[] ARREGLO NEW INT[10];}
        //ACCESO POR ÍNDICES
        //EN JAVA ELPRIMER ELEMENTO ESTA EN LA POSICION CERO 0
        //EL ULTIMO ES EL DE LA POSUICINO N - 1. DONDE N ES LA CANTIDAD DE ELEMENTOS
        //0 1 2 3 4 5 6 7 8 9
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        arreglo[6] = 700;
        arreglo[7] = 800;
        arreglo[8] = 900;
        arreglo[9] = 1000;
        System.out.println("arreglo[0] = " + arreglo[0]);
        System.out.println("arreglo[1] = " + arreglo[1]);
        System.out.println("arreglo[2] = " + arreglo[2]);
        System.out.println("arreglo[3] = " + arreglo[3]);
        System.out.println("arreglo[4] = " + arreglo[4]);
        System.out.println("arreglo[5] = " + arreglo[5]);
        System.out.println("arreglo[6] = " + arreglo[6]);
        System.out.println("arreglo[7] = " + arreglo[7]);
        System.out.println("arreglo[8] = " + arreglo[8]);
        System.out.println("arreglo[9] = " + arreglo[9]);
        
    }
    
}
