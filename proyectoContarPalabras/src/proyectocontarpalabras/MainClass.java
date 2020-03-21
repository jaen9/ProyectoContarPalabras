
package proyectocontarpalabras;
import java.util.Scanner;
/**
 * 
 * @author Sergio
 */
public class MainClass {

    //PROPIEDADES 
    static Scanner sc = new Scanner(System.in);
    static int iTotalCaracteres=0,iTotalPalabras=0;
    static String sFrase;
    static int aiVecesCaracter[]=new int[38];
    static char acAbecedario[]= {'A','B','C','D','E','F','G','H','I','J','K','L'
                                ,'M','N','Ñ','O','P','Q','R','S','T','U','V','W',
                                'X','Y','Z','.',',',';',':','!','¡','?','¿','\\'
                                ,'/'}; 
    
     //METODOS Mostrar
    
     static String textoCaracteresTotal (int total) {
	   
	   String sResultado="El número total de caracteres es "+total;
	   
	   return sResultado;
   }
      
     static String textoNumeroPalabras (int total) {
	   String sResultado="El número total de palabras es "+total;
	   
	   return sResultado;
   }
      
     static String textoTodosCaracteres (int a[]) {
	   
	   String sResultado="";
	   
	       for (int i=0;i<aiVecesCaracter.length;i++)
	    	   if(aiVecesCaracter[i]!=0)
	    		   sResultado+="Caracter "+ acAbecedario[i]+": "+a[i]+" veces.\n";
	       
	   return sResultado;
	   
   }
   
    public static void main (String [] args) {

        System.out.println("Escribe una frase");
        sFrase = sc.nextLine();
        int iTotalCaracteres1;
        iTotalCaracteres1 = contarCaracteresTotal(sFrase);
        iTotalPalabras = contarNumeroPalabras(sFrase);
        aiVecesCaracter= contarTodosCaracteres(sFrase);
        
        
        System.out.println(textoCaracteresTotal (iTotalCaracteres));
        System.out.println(textoNumeroPalabras (iTotalPalabras));
        System.out.println(textoTodosCaracteres(aiVecesCaracter));

        
    }//Main

}//CContarPalabras
 