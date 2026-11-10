/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_arreglos_matriz;

/**
 *
 * @author bisonte
 */
public class EVA3_11_ARREGLOS_MATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cubo[][][] = new int [2][3][4]; //este arreglo almacena 24 entero
        for (int i = 0; i <cubo.length; i++) {//primer dimension
            for (int j = 0; j < cubo[i].length; j++) {//segunda dimension
                for (int k = 0; k < cubo[i][j].length; k++) {//tercera dimension
                    cubo[i][j][k]= (int)(Math.random()*100);
                System.out.print("[" + cubo[i][j][k] + "]");
                }
               
                System.out.println("");
            }
            
            System.out.println("");
        }
        //como mostrar los valores?
    }
    
}
