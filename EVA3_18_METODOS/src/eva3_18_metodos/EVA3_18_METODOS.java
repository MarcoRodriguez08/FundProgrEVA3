/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_18_metodos;

/**
 *
 * @author bisonte
 */
public class EVA3_18_METODOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args){//CABEZERAS
      // TODO code application logic here
      //llamar o invocar el metodo
      mostrarMensaje("Hola mundo!!!");
      mostrarMensaje("Marco");
      mostrarMensaje("Rodríguez");
      mostrarMensaje("Implementar");
      
      //QUE HACER CON METODOS QUE RFEGRESAN VALORES
      //1. RECUPERAR EL VALOR ´POR QUE LO VAMOS A USAR VARIAS VECES
      int resultado = sumar(10,20);
      System.out.println("Suma de 10 + 20 = " + resultado);
      
      //2. USARLO DIRECTAMENTE(Es de un solo uso)
      System.out.println("Suma de 10 + 20= " + sumar(10,20));
      
      //3. NO IMPORTA EL VALOR DE RETORNO
      sumar(10,20);
   }
   //modificadores, valor de retorno
         //DEBE SER UN VERBO INFINITIVO
         //Varias palabras: Iniciar en minisculas, demas iniciar en mayusculas
   
   
   public static void mostrarMensaje(String mensaje)//CABEZERA
   {
   //CUERPO DEL METODO
   
         System.out.println(mensaje);
   }
   public static int sumar(int val1, int val2)
   {
      int resu = val1 + val2;
      return resu;
   }

           
}
