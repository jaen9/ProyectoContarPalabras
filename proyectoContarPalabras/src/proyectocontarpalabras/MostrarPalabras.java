
package proyectocontarpalabras;


public class MostrarPalabras {
    
       
       
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
	   
	       for (int i=0;i<ContarPalabras.aiVecesCaracter.length;i++)
	    	   if(ContarPalabras.aiVecesCaracter[i]!=0)
	    		   sResultado+="Caracter "+ ContarPalabras.acAbecedario[i]+": "+a[i]+" veces.\n";
	       
	   return sResultado;
	   
   }
}
