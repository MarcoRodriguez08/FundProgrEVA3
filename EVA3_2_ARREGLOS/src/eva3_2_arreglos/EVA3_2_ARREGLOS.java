/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_arreglos;

/**
 *
 * @author bisonte
 */
public class EVA3_2_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  arreglo[], x ,y;
        //aqui hay uno arreglosd declarados
        arreglo = new int[10];
        //arreglo[10] = 100; eL ÍNDICE Es incorrecto, 10 no es una posicion valida, llega hasta el nueves
        //EL USO DE ARREGLKLOS VA LIGADO AL USO DE CICLOA
        //EN PARTICULAR FOR
        for (int i = 0; i < 10; i++){
        arreglo[i] =(int)( Math.random() * 100); //casting es moldear o adapatar un tipo de dato, en este caso un decimal porque el math random da decimales a enteros
    }
        for (int i = 0; i < 10; i++){
        System.out.print(arreglo[i] + "-");
        }         
    }
    
}
