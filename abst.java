//abstract parent class 
        Abstract class animal {
         //abstract method 
      public abstract void sound ( ) ;
         }
     Public class lion extends animal {
      Public void sound ( ) {
System.out.println (“ roar “ );
}
public Static void main ( String args [ ] ) {
 animal obj = new lion ( );
obj. sound ();
}
}