package com.Harman.batch04;

import java.util.Scanner;

public class Childclass extends Parentcalculator { //use of keyword extends to inherit property
    //all propety o parent accessible to child class




        public static void main(String[] args)
        {


            int n1,n2,sum;
            //we are taking value from user
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            n1=sc.nextInt();
            System.out.println("enter second input");
            n2=sc.nextInt();
            Childclass cc=new Childclass();
           int a= cc.Multiply(n1,n2);
            System.out.println(a);
            int b=cc.Addition(n1,n2);
            System.out.println(b);
           int c= cc.Substraction(n1,n2);
            System.out.println(c);

        }

    }


