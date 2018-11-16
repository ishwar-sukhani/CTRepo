package com.test;

public class B
{ 
    void B() /* Line 3 */
    {
        System.out.println("Class B"); 
    } 
    public static void main(String[] args) 
    { 
        new B(); 
        System.out.println("Object Created");
    } 
}