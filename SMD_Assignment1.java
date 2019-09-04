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

interface TreeAnimator{
    void method1(); //interface method (does not have a body)
}

interface BirdAnimator{
    void method2(); //interface method (does not have a body)
}

interface SkyAnimator{
    void method3(); //interface method (does not have a body)
}
public class SMD_Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Testing Shapes Here
        Shape s1 = new Shape();
        System.out.println(s1.count);
        
        Shape t1 = new Triangle();
        System.out.println(t1.count);
        
        Shape c1 = new Circle();
        System.out.println(c1.count);
        
        //Testing Animator
        Animator a1 = new Animator();
        a1.method1();
        a1.method2();
        a1.method3();
        
        //Testing Erase Class Here
        Erase e1 = new Erase();
        e1.Pprint_info();
        
        //Testin Pplayer Class Here
        Player.Afridi obj=new Player.Afridi();  
        obj.Print_Info();
        
        //Exception Handling Practice (Attempt for Bonus)
        try{
            int x = 5/0;
        }
        catch(ArithmeticException e){
            System.out.println("Division by Zero is not allowed");
        }
        
    }
    
}
