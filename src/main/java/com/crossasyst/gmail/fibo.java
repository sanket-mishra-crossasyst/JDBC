package com.crossasyst.gmail;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int limit=sc.nextInt();

        int previous =0,next=1,result=0;

        for(int i=0;i<=limit;i++)
        {
            System.out.println(previous +" ");
            result=previous+next;
            previous=next;
            next=result;
        }

    }
}
