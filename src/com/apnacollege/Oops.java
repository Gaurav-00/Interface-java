//import Bank;
//import Bank.Bank;
package com.apnacollege;


/*public class Oops {
    public static void main(String args[]) {

      /*  Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
        pen1.printcolor();
        Pen pen2=new Pen();
        pen2.color="red";
        pen2.printcolor();


        Student stu1=new Student();
        stu1.name="gss";
        stu1.age=20;
        stu1.printname();
        Student s2=new Student();
        s2.name="tsm";
        s2.age=22;
        s2.printname();

    }

}
class Pen{
    String color;
    String type;  //ballpen;gelpen;
    public  void write(){
        System.out.println("write your name");
    }
    public void printcolor(){
        System.out.println(this.color);//this tells us that which object trying to access method
    }

}
class Student
{
    String name;
    int age;
    public void printname()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student()
    {
        System.out.println("constructor called");
    }

       */
        /*
        Student s1=new Student();
        s1.name="gss";
        s1.age=22;
        Student s2=new Student(s1);
        s2.printname();

         */


/*
        //copy constructor-:Directly copies the property of s1 in s2.
/*
class Student {
            String name;
            int age;

            Student(Student s2) {
                this.name = s2.name;
                this.age = s2.age;
            }
            public void printname()
            {
                System.out.println(this.name);
                System.out.println(this.age);
            }
            Student(){

            }
        }

 */
/*
//Function Overloading-:same function name with different functionality
                        // compile time polymorphism.

public class Oops
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.name="gss";
        s1.age=22;
        s1.printname();
        Student s2=new Student();
        s2.name="tsm";
        s2.age=33;
        s2.printname();
        s2.printname(22);
        s2.printname("gss");
        s2.printname("gss"+" "+22);
        s1.printname(21);
        s1.printname("tsm");
        s1.printname("tata"+" "+25);
    }

}
class Student
{
    String name;
    int age;
    public  void printname(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public void printname(int age)
    {
        System.out.println(age);
    }
    public void printname(String name)
    {
        System.out.println(name);
    }
    public void printname(String name,int age)
    {
        System.out.println(name);
        System.out.println(age);
    }
}
*/
/*
//Single Level Inheritance
class Shape
{
 String color;
 public void area(){
     System.out.println("display area");
 }
}
class Traingle extends  Shape
{
    public void area(int l,int h){

        System.out.println((l*h)/2);

    }
}
class equilateral extends Traingle{
    public void area(int l,int h)
    {
        System.out.println((l*h)/2);
    }
}
class circle extends Shape{
    public void area(int r)
    {
        System.out.println(3.14*r*r);
    }
}
public class Oops
{
    public static void main(String args[])
    {
    Traingle t1=new Traingle();
    t1.area();    //thus t1 has property color it is derived from Shape
    t1.area(2,4);

    }
}*//*
public class Oops {
    public static void main(String args[])
    {
        //Bank.Account account1=new Bank.Account();
        //Account1.name="customer1";
    }
}
*/
/*
abstract class Animal{               //we can not have  any use of creating object of Animal class therefore
                            //we create it as abstract class.animal is just only concept which is not require for user
   abstract void walk();{ //this walk function is of no use as it not call by any object or anyone.

    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends  Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}

public class Oops {
    public static void main(String args[])
    {
        Horse horse=new Horse();
        horse.walk();
         // we cannot create object of abstract class

        }
    }
*/
//Interfaces-:it is nothing but a pure abstraction.it hides all irrelevant information.
/*interface Animal{
    public void walks();
    //Animal()  interfaces not have constructors.
    void eat();
}
class Horse implements Animal {
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}*/
class Student{
    String name;
   static String school; //everyone has same school name number of objects created for student class has same school name

}
public class Oops {
    public static void main (String args[])
    {
        Student.school="jmv";
        Student s1=new Student();
        s1.name="tsm";
        Student s2=new Student();
        s2.name="gss";
        System.out.println(s2.school);
    }
}

