/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Usuario
 */
public class Ejemplo06 {
    public static void main(String[] args) {
        String cadena = "Ecuador sudamerica";
        char valor;
        int valorNumerico;
        
        System.out.println(cadena.length()); // 7
        
        // for (int i = 0; i < 7; i++) { // 0 , 1 , 2, 3, 4 , 5, 6
        for (int i = 0; i < cadena.length(); i++) {
            valor = cadena.charAt(i); 
                                       
            valorNumerico = (int) valor; // 
            System.out.printf("%s (%d)\n", valor, valorNumerico);
    }
}
}