package com.company;
import java.io.*;

import java.math.*;

import java.util.*;

public class Main<Obj> {

   static class Res implements Runnable {
        private int n;
        private long g[] = new long[10];

        public void GetN(int a) {
            n = a;
        }

        public void Getar(long ar[] , int t){
           n=t;
            for (int i =0; i<n; i++){
                g[i] = ar[i];
            }
        }

        public void run() {
            int y = n;
            long x=0;
            long ar[] = g;
            for (int i = 0; i<y; i++) {
                x = x + ar[i];
            }
            System.out.println(x);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        long ar[] = new long[10];
        for (int i =0; i<n; i++){
            ar[i]=scanner.nextLong();
        }

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Res Obj = new Res();

        Obj.GetN(n);
        Obj.Getar(ar,n);

        Thread Tr = new Thread(Obj);

        Tr.start();
    }
}
