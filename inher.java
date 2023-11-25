// a simple example of inheritance 
//create a superclass
Class Add {
int my;
int by;
void setmyby (int xy, int hy) {
my=xy;
by=hy;
}
}
/create a sub class
class b extends add {
int total;
void sum () {
public Static void main (String args [ ] ) {
b subOb= new b ( );
subOb. Setmyby (10, 12);
subOb. Sum ( ) ;
System.out.println(“total =” + subOb. Total);
}
} 