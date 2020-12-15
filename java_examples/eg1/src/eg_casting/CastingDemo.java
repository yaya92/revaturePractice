package eg_casting;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Casting/Type casting - conversion of one data type to another
		 * 
		 * 2 types of casting
		 * implicit casting - taken care by the java compiler implicitly when the smaller data type is assigne to the large
		 * explicit casting - Done by programmers- when we would like to convert the larger typ to the smaller one
		 */

		
		int x = 100;
		float m=x;// implicit casting
		System.out.println("x = " +x);
		System.out.println("m= " +m);
		m=89.975f;
		System.out.println("m = "+m);
		double d= m;// implicit casting
		System.out.println("d = " +d);
		
		System.out.println(89.75);
		
		char c = 'Y';
		int q = c; // implicit
		System.out.println("q = " +q);
		q++;
		c=(char)q;//explicit
		System.out.println("c = " +c);
		
		System.out.println("m = "+m);
		x=(int)m;
		System.out.println("x = " + x);
	}

}
