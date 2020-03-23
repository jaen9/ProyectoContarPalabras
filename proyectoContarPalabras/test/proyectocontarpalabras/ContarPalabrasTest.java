package proyectocontarpalabras;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *Clase que realiza una serie de pruebas para comprobar que la forma de contar
 * caracteres y palabras es correcta
 * 
 * @author Sergio
 * @version 1.00
 */
public class ContarPalabrasTest {


    /**
     * Test of contarCaracteresTotal method 1, of class ContarPalabras.
     */
    @Test
    public void testContarCaracteresTotal1() {
       ContarPalabras prueba = new ContarPalabras();
        int a = prueba.contarCaracteresTotal("la practica es muy dificl");
        assertEquals(21, a);
    }
    
    /**
     * Test of contarCaracteresTotal method 2, of class ContarPalabras.
     */
    @Test
    public void testContarCaracteresTotal2() {
       ContarPalabras prueba = new ContarPalabras();
        int a = prueba.contarCaracteresTotal("la practica es muy dificl");
        assertNotEquals(20, a);
    }
    
    /**
     * Test of contarNumeroPalabras method 1, of class ContarPalabras.
     */
    @Test
    public void testContarNumeroPalabras1() {
        ContarPalabras prueba = new ContarPalabras();
        int a = prueba.contarNumeroPalabras("hola que tal");
        assertEquals(3, a);
    }
    
    /**
     * Test of contarNumeroPalabras method 2, of class ContarPalabras.
     */
    @Test
    public void testContarNumeroPalabras2() {
        ContarPalabras prueba = new ContarPalabras();
        int a = prueba.contarNumeroPalabras("hola que tal");
        assertNotEquals(2, a);
    }
    
    /**
     * Test of contarTodosCaracteres method 1, of class ContarPalabras.
     */
    @Test
    public void testContarTodosCaracteres1() {
        ContarPalabras prueba = new ContarPalabras();
        int a[] = prueba.contarTodosCaracteres("a");
        assertEquals(1, a[0]);
    }
    
    /**
     * Test of contarTodosCaracteres method 2, of class ContarPalabras.
     */
    @Test
        public void testContarTodosCaracteres2() {
        ContarPalabras prueba = new ContarPalabras();
        int a[] = prueba.contarTodosCaracteres("abb");
        assertEquals(1, a[0]);
        assertEquals(2,a[1]);
        assertNotEquals(2,a[0]);
    }
}
