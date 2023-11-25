class DemoParent{  
final void method(){
System.out.println("Parent class final method");
}  
}  
     
class Demo extends DemoParent{  
//error
void method(){
System.out.println("final method modified inside child class");
}  
     
public static void main(String args[]){  
Demo d = new Demo();  
d.method();  
}  
}