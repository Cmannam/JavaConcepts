package com.dxc.loops;

import java.lang.*;
import java.util.*;


class Patient {

    // Attributes of a student
    int id;
    String name, address, medicalreport;

    // Constructor
    public Patient(int id, String name, String address, String medicalreport)
    {

        // This keyword refers to current instance itself
        this.id = id;
        this.name = name;
        this.address = address;
        this.medicalreport = medicalreport;
    }
    public String toString()
    {


        return this.id + " " + this.name + " "
                + this.address + " " + this.medicalreport;
    }
}


class Sortbyid implements Comparator<Patient> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Patient a, Patient b)
    {

        return a.id - b.id;
    }
}

// Class 3
// Helper class implementing Comparator interface
class Sortbyname implements Comparator<Patient> {

    // Method
    // Sorting in ascending order of name
    public int compare(Patient a, Patient b)
    {

        return a.name.compareTo(b.name);
    }
}

// Class 4
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {


        ArrayList<Patient> ar = new ArrayList<Patient>();
        ar.add(new Patient(111, "Mayank", "london","Positive"));
        ar.add(new Patient(131, "Anshul", "nyc","Negative"));
        ar.add(new Patient(121, "Solanki", "jaipur","Positive"));
        ar.add(new Patient(101, "Aggarwal", "Hongkong","Negative"));

        System.out.println("Unsorted");

        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));


        Collections.sort(ar, new Sortbyid());

        // Display message on console for better readability
        System.out.println("\nSorted by id");

        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by name
        Collections.sort(ar, new Sortbyname());

        // Display message on console for better readability
        System.out.println("\nSorted by name");

        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
