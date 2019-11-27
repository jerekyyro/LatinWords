/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latin_words;
import java.util.Scanner;
/**
 *
 * @author s4nk4
 */

        
public class Latin_words {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner wordReader = new Scanner(System.in);
        while (true) {
            System.out.println("Latin nouns beta by Jere Kyyrö 2019");
            System.out.println("Based on 'Latinan alkeiskurssi opetusmoniste' by Jyri Vaahtera, Turku: Turun yliopisto, 1999");
            System.out.println("Enter a latin noun to be analysed in any form.");
            System.out.println("Use CAPITAL CASE for long vowels.");
            System.out.println("Entering nothing exits.");
            System.out.println(">");
            String sana = wordReader.nextLine();
            if (sana.equals("")) {
                break;
            }
            Noun noun = new Noun(sana);
            noun.findSuffix();
            noun.makeBody();
            System.out.println(noun);
            System.out.println("");
        }
        
        // TODO code application logic here
    }
    
}
