//abstract class area
abstract class Area{
 /* These two are abstract methods, the child class
  * must implement these methods
  */
 public abstract int areaSquare(int s);
 public abstract int areaRectangle(int l, int b);
 //Normal method 
 public void display(){
System.out.println("Normal method in abstract class Area");
 }
}
//Normal class extends the abstract class
class Demo extends Area{

 /* If we don't provide the implementation of these two methods, the
  * program will throw compilation error.
  */
 public int areaSquare(int s){
return s*s;
 }
 public int areaRectangle(int l, int b){
return l*b;
 }
 public static void main(String args[]){
Area a = new Demo();
System.out.println("Area of square " + a.areaSquare(9));
System.out.println("Area of rectangle " + a.areaRectangle(3,4));
a.display();
 }
}