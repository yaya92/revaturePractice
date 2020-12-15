package eg1;

public class OddNumbers {
	public static void main(String[] args) {
		
		int limit =51;
		
		System.out.println("Print odd numbers between 1 and " + limit);
		
		for(int i =1; i <+ limit; i++){
			
			if (i %2 !=0) {
				System.out.print(i + " ");
			}
			
			
		}	
	}

}
