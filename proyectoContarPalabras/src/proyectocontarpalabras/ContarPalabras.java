
package proyectocontarpalabras;
/**
 * Clase que recibe una cadena de caracteres, cuenta el total, el número de 
 * palabras y el número de cada caracter.
 * 
 * @author Sergio
 * @version 1.00
 */

public class ContarPalabras {
    
    static int aiVecesCaracter[]=new int[38];
    static char acAbecedario[]= {'A','B','C','D','E','F','G','H','I','J','K','L'
                                ,'M','N','Ñ','O','P','Q','R','S','T','U','V','W',
                                'X','Y','Z','.',',',';',':','!','¡','?','¿','\\'
                                ,'/' };  
    /**
     * Método que pasa a mayúsculas el String para guardar cada caracter en un 
     * array y así contar los caracteres excepto " ". 
     * 
     * @param cadena String que recibe para contar todos los caracteres
     * @return iContadorChar Devuelve cúantos caracteres hay en total
     */
     static int contarCaracteresTotal(String cadena) {
    	 char acCaracterFrase[] =cadena.toUpperCase().toCharArray();
    	 int iContadorChar=0;
         for (int i=0;i<acCaracterFrase.length;i++) 
             if(acCaracterFrase[i]!=' ')
                  iContadorChar++;
         
         return iContadorChar;
     }//contarCaracteresTotal
    
      /**
     * Método que pasa a mayúsculas el String para guardar cada caracter en un 
     * array. Si se detecta un " " se uma una palabra.  
     * 
     * @param cadena String que recibe para contar todos los caracteres
     * @return iContadorPalabra Devuelve cúantos palabras hay en total
     */
     static int contarNumeroPalabras(String cadena) {
    	 int iContadorPalabra = 0;
    	 char acCaracterFrase[] =cadena.toUpperCase().toCharArray();
    	 
    	 for (int i=0;i<acCaracterFrase.length;i++) 
             if(acCaracterFrase[i]==' '&& acCaracterFrase[i-1]!=' ')
                  iContadorPalabra++;
    	 
    	 //Esto comprueba si el último caracter es distinto de ' ', si lo es, se suma una palabra.
    	 if(acCaracterFrase[acCaracterFrase.length-1]!=' ')
    		 iContadorPalabra++;
    	 
    	 return iContadorPalabra;
     }//contarNumeroPalabas
    
     /**
     * Método que pasa a mayúsculas el String para guardar cada caracter en un 
     * array,<contar los caracteres excepto " " y devolver cuántas veces
     * se ha repetido un caracter. 
     * 
     * @param cadena String que recibe para contar todos los caracteres
     * @return aiVecesChar Devuelve cada caracter cuántas veces se ha repetido
     */
     static int[ ] contarTodosCaracteres(String cadena) {
    	 
    	 
    	 int []aiVecesChar = new int [aiVecesCaracter.length];
    	 char acCaracterFrase[] =cadena.toUpperCase().toCharArray();
    	 
    	 for (int i=0;i<aiVecesChar.length;i++) 
         	aiVecesChar[i]=0;
    	 
    	 int icontador;
         for (int j=0;j<acAbecedario.length;j++) {
         	icontador=0;
         	for(int k=0;k<acCaracterFrase.length;k++) {
                    if (acAbecedario[j]==acCaracterFrase[k]) {
         		icontador++;
                    }
                    aiVecesChar[j]=icontador;
         	}	
         }
    	 
    	 return aiVecesChar;
     }//contarTodosCaracteres
     
}//ContarPalabras
