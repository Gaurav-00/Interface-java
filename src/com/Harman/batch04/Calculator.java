// Taking input from user
package com.Harman.batch04;

import java.util.Scanner;

public class Calculator
{

    public static void main(String[] args)
    {
        Addition adcalc=new Addition();
        // classnm objnm=new classnm();
        Calculator calc=new Calculator();
    int n1,n2,sum;
    //we are taking value from user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n1=sc.nextInt();
        System.out.println("enter second input");
        n2=sc.nextInt();

        //sum=n1+n2;

        sum= adcalc.Addition(n1,n2);
        System.out.println(sum);

        //object creation of substraction
        Substraction sd=new Substraction();
        int result;
        result=sd.Substraction(n1,n2);
        System.out.println(result);

        //create objectfor multiply class
        Multiply mu=new Multiply();
        int y;
        y=mu.Multiply(n1,n2);
        System.out.println(y);

        //create object for division class
        Division di=new Division();
        int x;
        x=di.Division(n1,n2);
        System.out.println(x);
    }

}

