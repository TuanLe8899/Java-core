package chap01_basic;

public class less_8_Shape07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	* * * * *    11	12 13 14 15
 		 	* 		*	 21 22 23 24 25
		 	* 		* 
		 	* 		* 
		 	* * * * * 
		 */
		final int LENGTH=5;
		
		for (int number = 1; number <= LENGTH; number++) {
			
			for (int i = 1; i <= LENGTH; i++) {
				
				if(i >= 2 && i <= (LENGTH-1) && number >=2 && number <= (LENGTH-1))
				{
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}

}
