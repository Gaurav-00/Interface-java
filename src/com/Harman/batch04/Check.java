package com.Harman.batch04;

public class Check {
    public static void main(String[] args) {
        //if exception occur we have to handle it.
    try//possibilty of error then put it in try block
    {
        int x=10,y=0,z;
        z=x/y;           //here exception occur after this stmt it goes at catch block.therefore it not print below line.
        System.out.println(z); //thus we have successfully handlec the error
    }
    catch (Exception e) //here in catch you have to give object for exception
    {
        System.out.println(e);
    }
    }
}
