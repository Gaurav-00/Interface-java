//Abstact classs example.Implement of data abstraction.
package com.Harman.batch04;

abstract class College {
    abstract void setAcademyfee();   //we couldnot define function in abstract class


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
        College cs=new CSE_dept();   //object creation -: abstract_cls_nm obj_nm=new derived_cls_nm
        System.out.println("Cse fee is");
        cs.setAcademyfee();
        College me=new Mechanical(); //object creation -: abstract_cls_nm obj_nm=new derived_cls_nm
        System.out.println("Mechanical fee is");
        me.setAcademyfee();

    }
}