//abstraction implement 1.using abstract class and 2.using interface
package com.Harman.batch04;


abstract class Petrolprice{
    abstract void changePrice(); // can not expand function//hidden from end user
                                    //abstract class donot have function definition


}
class Govt extends Petrolprice{          //only accessible to govt
    void changePrice() {
        System.out.println("Increase by 2%");
    }

    public static void main(String[] args) {
        Petrolprice price=new Govt();//it is hidden there  creating object of abstract class
        price.changePrice();
    }

}