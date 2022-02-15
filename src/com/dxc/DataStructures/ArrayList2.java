package com.dxc.DataStructures;
import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String args[])
    {
        int simple_array[]=new int[5]; /*{1,2,3,4,5}*/
        ArrayList<Integer>mylist=new ArrayList<Integer>(5);
        mylist.add(1);
        mylist.add(5);
        mylist.add(3);
        mylist.add(25);
        mylist.add(93);
        for(Integer x:mylist)
            System.out.println(x);
        System.out.println("Size="+mylist.size());
        mylist.remove(2);
        for(Integer x:mylist)
            System.out.println(x);
        System.out.println("Size="+mylist.size());
        /*mylist.clear();
        for(Integer x:mylist)
            System.out.println(x);
        System.out.println("Size="+mylist.size());*/
        mylist.set(0,110);
        for(Integer x:mylist)
            System.out.println(x);
        System.out.println("Size="+mylist.size());

    }

}
