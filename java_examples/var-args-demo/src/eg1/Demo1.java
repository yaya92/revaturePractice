package eg1;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfNumbers(10,2,3,4,5,3,7));
		System.out.println(sumOfNumbers(10,2));


		
		
	}

	
	public static int sumOfNumbers (int ...a) {
		
		int sum = 0 ;
		
		for(int i:a) {
			sum=sum+i;// sum=sum+1
		}
		return sum;
	}
}
/*...a represents variable args
 * it takes any number of values as input
 * only rule is that it should be the last parameter of your method
 * 
 * 
 *
 */
 