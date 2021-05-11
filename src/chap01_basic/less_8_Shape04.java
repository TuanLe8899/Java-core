package chap01_basic;

public class less_8_Shape04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		*****
		 ****
		  ***
		   **
		    *
		 */
		for(int number = 5; number >= 1; number--)
		{
			for(int i = 1; i <= 5-number;i++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= number;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
