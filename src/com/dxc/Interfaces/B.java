package com.dxc.Interfaces;

// Java program to illustrate Cloneable interface
import java.lang.Cloneable;

// By implementing Cloneable interface
// we make sure that instances of class A
// can be cloned.
class C implements Cloneable
{
    int i;
    String s;

    // A class constructor
    public C(int i,String s)
    {
        this.i = i;
        this.s = s;
    }

    // Overriding clone() method
    // by simply calling Object class
    // clone() method.
    @Override
    protected Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class B
{
    public static void main(String[] args)
            throws CloneNotSupportedException
    {
        C a = new C(20, "GeeksForGeeks");

        // cloning 'a' and holding
        // new cloned object reference in b

        // down-casting as clone() return type is Object
        C b = (C)a.clone();

        System.out.println(b.i);
        System.out.println(b.s);
    }
}

