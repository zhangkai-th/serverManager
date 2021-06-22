package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    System.out.println("hello world");
	    int data[]=new int[3];
	    data[0]=1;
	    data[1]=2;
        System.out.println(data.length);
        System.out.println(Arrays.stream(data).count());
        System.out.println("os.susois");
    }
}
