/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication39;

/**
 *
 * @author bisonte
 */
public class JavaApplication39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Un arreglo puede tener multiples dimensiones
        //ARREGLO DE UNA DIMENSION
            //FILAS, COLUMNAS
        int daotos[] = new int [10];// [][][][]...
        // ARREGLO DE DOS  DIMENSIONES (MARTRIZ)
        int matriz[][] = new int [3][3];
        /*
        [][][]
        [][][]
        [][][]
        */
        for (int i = 0; i <matriz.length; i++) {//LO PRIMERO SON LAS FILAS
            for (int j = 0; j <matriz[i].length; j++) {//COLUMNAS
                matriz[i][j] = (int)(Math.random()*100);
                
            }
            
        }
                
        for (int i = 0; matriz.length < 10; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                System.out.println("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
