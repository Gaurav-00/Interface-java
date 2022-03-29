package com.Harman.batch04;
//Data Abstraction implementation using an interface
public interface RBI {     //here we declare as interface not as abstract
    void setInterest();
}

class Sbi implements RBI{            //here we use keyword implement instead of extend
   public void setInterest(){
        System.out.println("7% Interest");
    }
}
class Icici implements RBI{
    public void setInterest(){
        System.out.println("8% Interest");
    }
}
class ABC {
    public static void main(String[] args) {
        RBI ob_Sbi=new Sbi();  //abstract_class_nm ob_nm=new class_nm_ofderivedclass
        RBI ob_Icici=new Icici();
        System.out.println("Sbi bank==>");
        ob_Sbi.setInterest();
        System.out.println("Icici bank==>");
        ob_Icici.setInterest();
    }
}