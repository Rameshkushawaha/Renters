/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commoncode;

/**
 *
 * @author Dinesh kushwaha
 */
public class Validation {
    public static void onlyDigitAllowed(java.awt.event.KeyEvent evt){
        // can not enter other then Digits
        char c=evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }
     public static void onlyAlphabetsAllowed(java.awt.event.KeyEvent evt){
         // can not enter then alphabet and space
         char c=evt.getKeyChar();
        if((!Character.isAlphabetic(c)) && !(c==' ')){
            evt.consume();
        }
    }
}
