package com.dxc.inheritance;

public class Programmer {
    static float add(float a, float b) {
        return a+b;
    }

    static int add(int a, int b) {
        return (char) (a+b);
    }
}
class Developer{
    public static void main(String args[])
    {
        System.out.println(Programmer.add(5,6));
        System.out.println(Programmer.add(6,7));
    }
}
