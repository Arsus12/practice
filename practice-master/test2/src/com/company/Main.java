package com.company;
import java.io.*;

import java.math.*;4

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Integer n,x=0;
	Scanner in = new Scanner(System.in);
	System.out.print("n=");
	n = in.nextInt();
	if(n<0 || n>5){
	 return;
    }
	Integer ar[] = new Integer[10];
	for (int i = 1; i<=n; i++){
	    System.out.print("ar"+i+"=");
	 ar[i] = in.nextInt();
	  x = x + ar[i];
    }
    System.out.println("Result="+x);
    }
}
