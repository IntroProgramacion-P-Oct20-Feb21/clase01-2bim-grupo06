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
public class Ejemplo05 {
    
    public static void main(String[] args){
        for (int i = 97; i <=300 ; i++) {
                                          //    V     || F    >>> V
            if ( (i==101) || (i==105) ) { // 101==101 || 101==105 
                System.out.printf("%s |%d|\n", (char)i, i);
            }
    }
        
            
}
}