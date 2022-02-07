package com.dxc.inheritance;

class Division {
    public static void main(String[] args)
    {
        int a = 10, b = 7, c = 7, result;
        try {
            result = a / (b - c);
            System.out.println("result" + result);
        }



        finally {
            System.out.println("I am in final block");
        }
    }
}
