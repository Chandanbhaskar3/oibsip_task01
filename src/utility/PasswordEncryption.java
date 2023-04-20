/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.Base64;

/**
 *
 * @author ck835
 */
public class PasswordEncryption {
    public static String getEncryptedPassword(String pass){
         Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(pass.getBytes());
    }
    public static void main(String[] args) {
        
        System.out.println(getEncryptedPassword("123456"));
    
    }
}
