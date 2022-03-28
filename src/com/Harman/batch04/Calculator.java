// Taking input from user
package com.Harman.batch04;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    int n1,n2,sum;
    //we are taking value from user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n1=sc.nextInt();
        System.out.println("enter second input");
        n2=sc.nextInt();
        sum=n1+n2;
        System.out.println(sum);
    }
}

