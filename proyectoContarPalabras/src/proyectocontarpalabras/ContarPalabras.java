
package proyectocontarpalabras;
/**
 * 
 * @author Sergio
 */

public class ContarPalabras {
    
    static int aiVecesCaracter[]=new int[38];
    static char acAbecedario[]= {'A','B','C','D','E','F','G','H','I','J','K','L'
                                ,'M','N','Ñ','O','P','Q','R','S','T','U','V','W',
                                'X','Y','Z','.',',',';',':','!','¡','?','¿','\\'
                                ,'/' }; 
    
     static int contarCaracteresTotal(String cadena) {
    	 char acCaracterFrase[] =cadena.toUpperCase().toCharArray();
    	 int iContadorChar=0;
         for (int i=0;i<acCaracterFrase.length;i++) 
             if(acCaracterFrase[i]!=' ')
                  iContadorChar++;
         
         return iContadorChar;
     }//contarCaracteresTotal
    
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
