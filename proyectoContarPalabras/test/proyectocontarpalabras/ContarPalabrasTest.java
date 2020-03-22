/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocontarpalabras;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio
 */
public class ContarPalabrasTest {


    /**
     * Test of contarCaracteresTotal method, of class ContarPalabras.
     */
    @Test
    public void testContarCaracteresTotal1() {
       ContarPalabras prueba = new ContarPalabras();
        int a = prueba.contarCaracteresTotal("la practica es muy dificl");
        assertEquals(21, a);
    }
    
    /**
     * Test of contarCaracteresTotal method, of class ContarPalabras.
     */
    @Test
    public void testContarCaracteresTotal2() {
       ContarPalabras prueba = new ContarPalabras();
        int a = prueba.contarCaracteresTotal("la practica es muy dificl");
        assertNotEquals(20, a);
    }
    /**
     * Test of contarNumeroPalabras method, of class ContarPalabras.
     */
    @Test
    public void testContarNumeroPalabras1() {
        ContarPalabras prueba = new ContarPalabras();
        int a = prueba.contarNumeroPalabras("hola que tal");
        assertEquals(3, a);
    }
    
    /**
     * Test of contarNumeroPalabras method, of class ContarPalabras.
     */
    @Test
    public void testContarNumeroPalabras2() {
        ContarPalabras prueba = new ContarPalabras();
        int a = prueba.contarNumeroPalabras("hola que tal");
        assertNotEquals(2, a);
    }
    

    /**
     * Test of contarTodosCaracteres method, of class ContarPalabras.
     */
    @Test
    public void testContarTodosCaracteres1() {
        ContarPalabras prueba = new ContarPalabras();
        int a[] = prueba.contarTodosCaracteres("a");
        assertEquals(1, a[0]);
    }
    /**
     * Test of contarTodosCaracteres method, of class ContarPalabras.
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
