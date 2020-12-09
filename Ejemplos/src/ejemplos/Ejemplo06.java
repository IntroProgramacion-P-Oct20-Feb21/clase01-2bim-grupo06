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
        int minusculas;
        int mayusculas; 
        int total; 
        System.out.println(cadena.length()); // 7
        
        
        for (int i = 0; i < cadena.length(); i++) {
            valor = cadena.charAt(i); 
                                       
            valorNumerico = (int) valor; 
            if (valorNumerico>=65 && valorNumerico <=90){
                mayusculas = mayusculas + 1;
               
            } 
            
            if (valorNumerico>=95 && valorNumerico <=122){
                minusculas = minusculas + 1;
            } 
            
            System.out.printf("%d\n%d\n",mayusculas,minusculas);

    }
}
}