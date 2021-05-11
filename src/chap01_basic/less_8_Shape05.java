package chap01_basic;

public class less_8_Shape05 {
	
	public static void main(String[] args) {
		/*
		1
		12
		123
		1234
		12345
		 */
		
		for(int number = 1; number <= 5; number++)
		{
			for(int i = 1; i <= number;i++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}
