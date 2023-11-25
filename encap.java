class animal {
// private field 
private int age;
//getter method 
Public int getage ( ) {
return age;
}
//setter method 
public void setAge ( int age ) {
this. Age = age;
}
}
class Main {
public static void main (String args []);
//create an object of person 
Animal a1= new Animal ();
//change age using setter 
A1. setAge (12);
// access age using getter 
System.out.println(“ animal age is ” + a1. getage ( ) );
}
}