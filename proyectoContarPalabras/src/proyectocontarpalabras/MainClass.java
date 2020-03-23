
package proyectocontarpalabras;
import java.util.Scanner;
/**
 * Clase principal para lanzar el programa de contar y mostrar palabras de 
 * una cadena de caracteres pedida al usuario 
 * @author Sergio Jaen
 * @version 1.00
 */
public class MainClass {

 
    static Scanner sc = new Scanner(System.in);
    static int iTotalCaracteres=0,iTotalPalabras=0;
    static String sFrase;

    
    /**
     * Se pidde al usuario que introduzca una frase y a continuación se cuentan
     * los caracteres totales, las palabras y cúantas veces cada caracter.
     * Finalmente se muestra por pantalla el resultado. 
     * 
     * @param args Parámetro por defecto del método main
     */
   
    public static void main (String [] args) {

        System.out.println("Escribe una frase");
        sFrase = sc.nextLine();
        int iTotalCaracteres1;
        iTotalCaracteres1 = ContarPalabras.contarCaracteresTotal(sFrase);
        iTotalPalabras = ContarPalabras.contarNumeroPalabras(sFrase);
        ContarPalabras.aiVecesCaracter= ContarPalabras.contarTodosCaracteres(sFrase);
        
        
        System.out.println(MostrarPalabras.textoCaracteresTotal (iTotalCaracteres));
        System.out.println(MostrarPalabras.textoNumeroPalabras (iTotalPalabras));
        System.out.println(MostrarPalabras.textoTodosCaracteres(ContarPalabras.aiVecesCaracter));

        
    }//Main

}//CContarPalabras
 