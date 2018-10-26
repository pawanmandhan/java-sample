package com.collection.hashset;

import java.util.HashSet;

public class JavaHungry {
    
    public static void main(String[] args)
    {
        
        HashSet<Object> hashset = new HashSet<Object>();
        hashset.add(3);
        hashset.add("Java Hungry");
        hashset.add("Blogspot");
        System.out.println("Set is "+hashset);
    }
}
