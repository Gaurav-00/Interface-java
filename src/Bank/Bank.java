package Bank;
class Account{
    //String name; it is of type default only within package it can access
    public String name; //it is of type public
    protected String email;//it is access within package only but in other package only subclasses can acess it.
    private String password;
    //getters and setters
    public String getPassword(){
        return this.password;
    }
    public void  setPassword(String pass)
    {
        this.password= pass;
    }
}
public class Bank
{
 public static void main(String args[])
 {
     Account account1=new Account();
     account1.name="apna College";
     account1.email="apnacollege@gmail.com";
    // account1.password="absc"; //thus you cannot access private things directly to accept them there is one concept
                                //getters and setters
    account1.setPassword("abcd");//this is how we can set private functions in java
     System.out.println(account1.getPassword()); //To print our set password

 }
}