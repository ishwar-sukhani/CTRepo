package com.test;

public class A
{
public static void main(String[] args)
{
Abst e = new Abst();
Abst e1=e;
System.out.println(e);
System.out.println(e1);
if(e==e1)
{
System.out.println("false");
}
else
{
System.out.println("true");
}
}
}
