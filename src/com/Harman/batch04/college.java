//Abstact classs example.Implement of data abstraction.
package com.Harman.batch04;

abstract class College {
    abstract void setAcademyfee();


}
class CSE_dept extends College
{
    @Override
    void setAcademyfee() {
        System.out.println(100000);
    }
}
class Mechanical extends College{
    @Override
    void setAcademyfee() {
        System.out.println(200000);
    }
}
class College_office{
    public static void main(String[] args) {
        CSE_dept cs=new CSE_dept();
        System.out.println("Cse fee is");
        cs.setAcademyfee();
        Mechanical me=new Mechanical();
        System.out.println("Mechanical fee is");
        me.setAcademyfee();
    }
}