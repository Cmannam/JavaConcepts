package com.dxc.Polymorphism;

class SimpleCalculator

{

    int add(int a, int b)

    {

        return a+b;

    }

    int  add(int a, int b, int c)

    {

        return a+b+c;

    }

}

public class Static

{

    public static void main(String args[])

    {

        SimpleCalculator obj = new SimpleCalculator();

        System.out.println(obj.add(25, 25));

        System.out.println(obj.add(25, 25, 30));

    }

}
