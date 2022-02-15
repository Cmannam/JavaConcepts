package com.dxc.DataStructures;

import java.util.LinkedList;

public class Myclass {
    public static void main(String args[])
    {
        LinkedList<String> name=new LinkedList<String>();
        name.add("cat");
        name.add("dog");
        name.add("cow");
        name.add("ox");
        name.addFirst("rabbit");
        name.addLast("rat");
        name.removeLast();
        name.removeFirst();
        name.remove("cat");
        name.add(0,"cat");
        name.remove(1);
        name.set(1,"dog");
        for(String x: name)
            System.out.println(x);
    }
}
