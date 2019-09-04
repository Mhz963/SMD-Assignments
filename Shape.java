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
public class Shape {
    static int count = 0;
    Shape()
    {
        System.out.println("Shape Constructor Called");
        count++;
    }
    
    void draw()
    {
        System.out.println("Shape draw called");
    }
}
