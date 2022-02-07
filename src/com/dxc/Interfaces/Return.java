package com.dxc.Interfaces;

class Return
{
    public static void main(String args[])
    {
        boolean f = false;
        System.out.println("Before the return.");

        if (f)
            return;
        System.out.println("This won't execute.");
    }
}