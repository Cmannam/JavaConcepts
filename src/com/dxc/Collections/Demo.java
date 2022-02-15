package com.dxc.Collections;

import java.util.ArrayList;
import java.util.Iterator;
public class Demo {
    public static void main(String args[]){
        ArrayList<String> List1 = new ArrayList<String>();
        ArrayList List2 = new ArrayList();
        List1.add("Rakshitha");
        List1.add("Soumya");
        List1.add("Chandana");
        List2.add("Arpita");
        List2.add("Nandhini");
        List2.add("Prajwala");
        List2.add(123);
        System.out.println("List1 is "+List1);
        System.out.println("List2 is "+List2);
        String name = List1.get(2);
        System.out.println("name is "+ name);
        List2.remove(3);
        System.out.println("List2 is "+ List2);
        if(List1.contains("Soumya")){
            System.out.println("Soumya is in list");
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
            if(str.equals("Rakshitha"))
            {
                itr.remove();
            }
        }
        System.out.println("now List1 is "+List1);
    }
}
