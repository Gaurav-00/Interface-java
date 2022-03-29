package com.Harman.batch04;

public class Check {
    public static void main(String[] args) {
        //if exception occur we have to handle it.
    try//possibilty of error then put it in try block
    {
       //String x="Hello";
        //System.out.println(x.length());
        //if instead of Hello we have null
        String x=null;
        System.out.println(x.length());
        // int x=10,y=0,z;
        //z=x/y;           //here exception occur after this stmt it goes at catch block.therefore it not print below line.
        //System.out.println(z); //thus we have successfully handlec the error
    }
    catch (ArithmeticException e) //here in catch you have to give object for exception
    {
        System.out.println("Divide by 0 not possible");
    }
    catch (NullPointerException e)  //this occur if x=null and as error occur the x.length() directly jump here
    {
        System.out.println("Null value is not accepted");
    }
    //By default this exception occur if nothing is occuring
    catch (Exception e){    //if exceptio is neither arithmatic not NullPointer then the exception come in this
                                //default exception block.
                                //Never put general exception at top of arithmatic and nullpointer exception
                                //else it will not enter proper catch block it will allways run in default block
        System.out.println(e);
    }
    }
}
