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
    public static void main(String[] args) {
        for (int i = 97; i <= 122; i++) {
             if ((char)i=='a'|| (char)i=='e'|| (char)i=='i' || 
                     (char)i=='o' || (char)i=='u') {
                System.out.printf("%s |%d|\n", (char)i, i);
            }
            
        }
    }
}
