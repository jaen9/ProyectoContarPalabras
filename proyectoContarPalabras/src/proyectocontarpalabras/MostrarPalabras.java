
package proyectocontarpalabras;
/**
 * Clase que muestra por pantalla los caracteres, las palabras y el número 
 * de veces que aparece cada una de ellas.
 * 
 * @author Sergio
 * @version 1.00
 */

public class MostrarPalabras {
   
    /**
     * Método que muestra cúantos caracteres hay en la cadena independientemente
     * de si se repiten o no 
     * 
     * @param total Es el número total de caracteres
     * @return sResultado Devuelve el resultado con ese formato
     */

         static String textoCaracteresTotal (int total) {
	   
	   String sResultado="El número total de caracteres es "+total;
	   
	   return sResultado;
   }
      
     /**
      * Método que muestra el total de palabras 
      * @param total El número de palabras 
      * @return sResultado Devuelve el resultado con ese formato
      */    
     static String textoNumeroPalabras (int total) {
	   String sResultado="El número total de palabras es "+total;
	   
	   return sResultado;
   }
      
     /**
      * Método que muestra cada caracter cuántas veces se repite cada
      * caracter
      * 
      * @param a Es el número de veces que se repite 
      * @return sResultado Devuelve el resultado con ese formato. Primero el 
      * caracter y a continuación el número de veces repetido
      */
     static String textoTodosCaracteres (int a[]) {
	   
	   String sResultado="";
	   
	       for (int i=0;i<a.length;i++)
	    	   if(a[i]!=0)
	    		   sResultado+="Caracter "+ ContarPalabras.acAbecedario[i]+": "+a[i]+" veces.\n";
	       
	   return sResultado;
	   
   }
}
