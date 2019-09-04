/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_assignment1;

/**
 *
 * @author Muhammad Hasan Zahid
 */
public class Erase {
    final int unmodifiable_value = 6;
    
    Erase()
    {
         System.out.println("Erase Class Called");
    }
    
    void Pprint_info()
    {
        System.out.println("This value can not be modified because it is made final " + unmodifiable_value);
    }
}
