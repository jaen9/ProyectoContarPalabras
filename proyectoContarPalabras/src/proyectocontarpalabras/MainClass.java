
package proyectocontarpalabras;
import java.util.Scanner;
/**
 * 
 * @author Sergio
 */
public class MainClass {

 
    static Scanner sc = new Scanner(System.in);
    static int iTotalCaracteres=0,iTotalPalabras=0;
    static String sFrase;

    

   
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
 