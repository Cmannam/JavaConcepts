package com.dxc.inheritance;

class Parent {

    // Method of parent class
    void Print()
    {

        // Print statement
        System.out.println("parent class");
    }
}

// Class 2
// Helper class
class child1 extends Parent {

    // Method
    void Print() { System.out.println("child1"); }
}

// Class 3
// Helper class
class child2 extends Parent {

    // Method
    void Print()
    {

        // Print statement
        System.out.println("child2");
    }
}

// Class 4
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // inside main() method

        a = new child1();
        a.Print();

        a = new child2();
        a.Print();
    }
}