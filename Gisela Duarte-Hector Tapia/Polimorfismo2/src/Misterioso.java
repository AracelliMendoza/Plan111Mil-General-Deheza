



public class Misterioso {
    public static void main (String arg []){
        Misterioso objeto = new Misterioso();
        System.out.println(objeto.ifElseMisterioso(0,0 ));
    }
    public String ifElseMisterioso ( int x , int y ) {
	int z = 4;
	if ( z <= x ) {
		z = x + 1;
	} else {
		z = z + 9;
	}
	if ( z <= y ) {
		y ++;
	}
	return z + " " + y ;
}   
}
