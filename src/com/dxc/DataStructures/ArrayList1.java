package com.dxc.DataStructures;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList1 {
    public static void main(String args[])
    {
        ArrayList<String> List1 = new ArrayList<String>();
        ArrayList List2 = new ArrayList();
        List1.add("Apple");
        List1.add("Mango");
        List1.add("Pineapple");
        List2.add("Tulip");
        List2.add("Jasmine");
        List2.add("Daisy");
        System.out.println("List1 is "+List1);
        System.out.println("List2 is "+List2);
        String name = List1.get(1);
        System.out.println("name is "+ name);
        List2.remove(2);
        System.out.println("List2 is "+ List2);
        if(List1.contains("Mango")){
            System.out.println("Mango is in list");
        }
        for(String str:List1)
        {
            System.out.println(str);
        }
        Iterator<String> itr = List1.iterator();
        // System.out.println(itr.next());
        while (itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
            if(str.equals("Apple"))
            {
                itr.remove();
            }
        }
        System.out.println("now List1 is "+List1);
    }
}



