
package homework;

import java.util.Scanner;


public class Cipher {

    
    
   /*pseudo code:
   Algorithem Encode (input plaintext, input number) 
           input cipherText ()  
           For int i SET 0 min plaintext.length () i++
                   if (plaintext.charAt(i) then
                         RETURN cipherText SET cipherText + ' ' 
                      Else
                       if (plaintext.charAt(i) + number max 122) then 
                       RETURN cipherText SET cipherText + char plaintext.charAt(i) + number - 26
                      Else 
                      cipherText SET cipherText + char plaintext.charAt(i) number then
                                   RETURN cipherText
                    END IF
*/
    public static String encode(String plaintext, int number) {
        String cipherText = "";
        for (int i = 0; i < plaintext.length(); i++) {
            if (plaintext.charAt(i) == ' ') {
                cipherText = cipherText + ' ';
            } else if (plaintext.charAt(i) + number > 122) {
                cipherText = cipherText + (char) (plaintext.charAt(i) + number - 26);
            } else {
                cipherText = cipherText + (char) (plaintext.charAt(i) + number);
            }
        }
        return cipherText;
    }
   
   /*pseudo code:
   Algorithem Decode (input plaintext, input number) 
           input originalText ()  
           For int i SET 0 min cipherText.length () i++
                   if  (cipherText.charAt(i) == ' ') then
                         RETURN  originalText SET originalText + ' '
                      Else 
                         if (cipherText.charAt(i) - number min 97) then 
                       RETURN  originalText SET originalText + (char) cipherText .charAt(i) + number + 26
                      Else  
                         originalText SET originalText + (char) cipherText..charAt(i) number then
                                   RETURN cipherText
                  END IF
*/
    public static String decode(String cipherText, int number) {
        String originalText = "";
        for (int i = 0; i < cipherText.length(); i++) {
            if (cipherText.charAt(i) == ' ') {
                originalText = originalText + ' ';
            } else if (cipherText.charAt(i) - number < 97) {
                originalText = originalText + (char) (cipherText.charAt(i) - number + 26);
            } else {
                originalText = originalText + (char) ((cipherText.charAt(i) - number));
            }
        }
        return originalText;
    }

}
