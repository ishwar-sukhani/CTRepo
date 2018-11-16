package com.test;

class Sub extends Super {
void method1()
{ 
System.out.println("inside method1 of Sub");
}
public static void main(String[] args)
{
Super b=new Sub();
b.method1();
}
}

