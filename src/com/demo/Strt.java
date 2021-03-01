package com.demo;
import java.util.*;

public class Strt
{
        public static void main(String[] args) {

        System.out.println("Sorting numbers...");
        //Creating a list of numbers
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list2.add(5);
        list2.add(2);
        list2.add(7);
        list2.add(1);
        list2.add(0);
                Boolean b = list2.contains(1);
                System.out.println("IS it Contains 1 = "+ b);
        list2.remove(3);
        Collections.sort(list2);
//        Collections.reverse(list2);

        for(Object num:list2)
            System.out.println(num);
    }
}

