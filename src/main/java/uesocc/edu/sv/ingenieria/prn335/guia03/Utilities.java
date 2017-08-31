/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

/**
 *
 * @author usuario
 */
public class Utilities {
      /**
     * METODO PARA RETORNAR LAS PRIMERAS 20 LETRAS
     * @param texto
     * @return 
     */
    
   public String getResumen(String texto){
        
       if(texto.isEmpty()||texto.equals(" ")||texto.equals("null")){
            System.out.println("null");
       }else if(texto.length()>20) {
         String  cadena=texto.replace(" ", "");
         
        cadena= texto.substring(0, 20);
        System.out.println("Las primeras 20 letras del texto son: "+cadena);
        } 
       else  {
        System.out.println("Las primeras 20 letras del texto son: "+texto.replace(" ", " "));
        }
        return null;
       
   }
   
   
   /**
    * METODO PARA CAPITALIZAR Y QUITAR DOBLES ESPACIOS
    * @param texto
    * @return 
    */
   public String capitalizar(String texto){
      
       /**
        * QUITAR DOBLES ESPACIOS 
        */
       texto=texto.replaceAll(" +", " ");
        texto=texto.trim();
        
        if(texto.isEmpty()||texto.equals(" ")){
            System.out.println("");
       }else if(texto.equals("null")){
            System.out.println("null");
       }else{
        texto=texto.toLowerCase();
       /**
        * CAPITALIZANDO EL TEXTO
        */
        char[] caracteres = texto.toCharArray();
         caracteres[0] = Character.toUpperCase(caracteres[0]);
         
          for (int i = 0; i < texto.length()- 2; i++) {
    if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ','){
      caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
    }}
        System.out.println(" ");
        System.out.println("Texto Capitalizado:");
        System.out.println(caracteres);
       }
       return null;
    }
   
   
   
   
   /**
    * METODO PARA BUSCAR LAS COINCIDENCIAS
    * @param texto
    * @param frase
    * @return 
    */
    public String contarCoincidencias(String texto, String frase){
        
       String fraseCopia;
        int contador = 0;
        
        
             
	    while (texto.indexOf(fraseCopia=frase.toLowerCase()) > -1) {
             
	      texto = texto.substring(texto.indexOf(
	        fraseCopia)+fraseCopia.length(),texto.length());
	      contador++; 
	    }
             System.out.println(" ");
	    System.out.println ("la frase: "+frase+", se repite: "+contador);

       return null;
    }
}
