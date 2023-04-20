/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ck835
 */
public class DateTime {
    public static void main(String[] args) {
        
    
    LocalDateTime today = LocalDateTime.now();
    System.out.println(today);
        DateTimeFormatter obj =DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String str = today.format(obj);
        System.out.println(str);
    }   
}
