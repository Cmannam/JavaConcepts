package com.dxc.Collections;

import  java.util.HashSet;
import java.util.Iterator;
public class HashSets {
    public  static  void  main(String args[])
    {
        HashSet<String> set = new HashSet<String>();
        set.add("book");
        set.add("pencil");
        set.add("pen");
        set.add("scale");
        System.out.println("set is "+set);
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }
        set.remove("pencil");
        if(set.contains("pen"))
        {
            System.out.println("pen is in list");
        }

        System.out.println("set size is "+set.size());
    }
}
