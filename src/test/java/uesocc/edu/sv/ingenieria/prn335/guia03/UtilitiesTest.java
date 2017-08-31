/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
/**
 *
 * @author usuario
 */
@RunWith(Arquillian.class)
public class UtilitiesTest {
     Utilities prueba= new Utilities();
     
     @Test
    public void getResumen() {
        String texto="Bienvenidos a la materia de programacion 3 ciclo II 2017";
       
        prueba.getResumen(texto);
       }
      @Test
    public void getResumen1() {
        String texto="Hola Mundo!";
       
        prueba.getResumen(texto);
        
    }
      @Test
    public void getResumen2() {
        String texto="";
       
        prueba.getResumen(texto);
      }
    
   
     @Test
    public void capitalizar() {
        String texto="prueBaS dE unIDAD cOn JUniT & aRquiLLan";
     
      prueba.capitalizar(texto);
      }
    @Test
    public void capitalizar1() {
        String texto="";
     
      prueba.capitalizar(texto);
      }
    
    @Test
    public void capitalizar2() {
        String texto="null";
     
      prueba.capitalizar(texto);
      }
    
    
    
    @Test
    public void contarCoincidencias() {
        String texto="Bienvenidos a la materia de programacion 3 ciclo II 2017";
       String frase="2017";
        prueba.contarCoincidencias(texto, frase);
      }
     @Test
    public void contarCoincidencias1() {
        String texto="Bienvenidos a la materia de programacion 3 ciclo II 2017";
       String frase="MA";
        prueba.contarCoincidencias(texto,frase);
      }
     @Test
    public void contarCoincidencias2() {
        String texto="Bienvenidos a la materia de programacion 3 ciclo II 2017";
       String frase="bienvenidos";
        prueba.contarCoincidencias(texto,frase);
      }
    
         
       
       
         
        
 
}
