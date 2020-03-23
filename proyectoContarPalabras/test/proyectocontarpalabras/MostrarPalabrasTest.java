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
public class MostrarPalabrasTest {
    

    /**
     * Test 1 of textoCaracteresTotal method, of class MostrarPalabras.
     */
    @Test
    public void testTextoCaracteresTotal1() {
        MostrarPalabras prueba = new MostrarPalabras();
        String a = prueba.textoCaracteresTotal(4);
        assertEquals("El número total de caracteres es 4", a);
    }

    /**
     * Test 2 of textoCaracteresTotal method, of class MostrarPalabras.
     */
    @Test
    public void testTextoCaracteresTotal2() {
        MostrarPalabras prueba = new MostrarPalabras();
        String a = prueba.textoCaracteresTotal(4);
        assertNotEquals("El número total de caracteres es 5", a);
    }
    
    /**
     * Test 1 of textoNumeroPalabras method, of class MostrarPalabras.
     */
    @Test
    public void testTextoNumeroPalabras1() {
        MostrarPalabras prueba = new MostrarPalabras();
        String a = prueba.textoNumeroPalabras(2);
        assertEquals("El número total de palabras es 2", a);
    }
    
    /**
     * Test 2 of textoNumeroPalabras method, of class MostrarPalabras.
     */
    @Test
    public void testTextoNumeroPalabras2() {
        MostrarPalabras prueba = new MostrarPalabras();
        String a = prueba.textoNumeroPalabras(2);
        assertNotEquals("El número total de palabras es 5", a);
    }
    /**
     * Test 1 of textoTodosCaracteres method, of class MostrarPalabras.
     */
    @Test
    public void testTextoTodosCaracteres1() {
        MostrarPalabras prueba = new MostrarPalabras();
        int a[] = {1,2};
        String b = "abb";
        assertEquals("Caracter A: 1 veces.\nCaracter B: 2 veces.\n", 
                    prueba.textoTodosCaracteres(a));
    }
    
        /**
     * Test 2 of textoTodosCaracteres method, of class MostrarPalabras.
     */
    @Test
    public void testTextoTodosCaracteres2() {
        MostrarPalabras prueba = new MostrarPalabras();
        int a[] = {1,2};
        String b = "abb";
        assertNotEquals("Caracter A: 100 veces.\nCaracter B: 2 veces.\n",
                    prueba.textoTodosCaracteres(a));
    }
    
}
