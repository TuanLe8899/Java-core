package chap01.basic;

public class Shape {
	
	//Shape01
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		*
		**
		***
		****
		*****
		*/
		for(int number = 1; number <= 5; number++)
		{
			for(int i = 1; i <= number;i++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	//Shape02
	public static void main002(String[] args) {
		// TODO Auto-generated method stub
		/*
		*****
		****
		***
		**
		*
		*/
		for(int number = 5; number >=1; number--)
		{
			for(int i = 1; i <= number;i++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	//Shape03
	public static void main003(String[] args) {
		// TODO Auto-generated method stub
		/*
			*
		   **
		  ***
		 ****
		*****
		*/
		for(int number = 1; number <= 5; number++)
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

	//Shape04
	public static void main004(String[] args) {
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

	//Shape05
	public static void main005(String[] args) {
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

	//Shape06
	public static void main006(String[] args) {
		/*
			1
		   212
		  32123
		 4321234	record = space + left + 1 + right
		543212345
		*/
		String record	= "";
		String space 	= "";
		String left		= "";
		String right	= "";
		String result	= "";
		
		int number = 1;
		while(number <= 5)
		{
			space	="";
			left	="";
			right	="";
			
			for (int s = 1; s <= (5 - number); s++) {
				space += " ";
			}
			for (int l = number; l >= 2; l--) {
				left += l;
			}
			for (int r = 2; r <= number; r++) {
				right += r;
			}
			record=space+left+"1"+right+"\n";
			result+=record;
			number++;
		}
		System.out.print(result);
		
	}

	//Shape07
	public static void main007(String[] args) {
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
	
	//Shape08
	public static void main008(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	HEIGHT		4
		 				line	= space + character
		 	*			1			3			1		space		= HEIGHT - line
		   ***			2			2			3		character	= 2*line - 1
		  *****			3			1			5
		 *******		4			0			7
		 
		 */
		final int HEIGHT = 4;
		String result		="";
		String record		="";
		String space		="";
		String character	="";
		
		for(int line = 1; line <= HEIGHT; line++) {
			space 		="";
			character	="";
			
			for(int s = 1; s <= HEIGHT-line; s++) {
				space +=" ";
			}
			for (int c = 1; c <=2*line-1 ; c++) {
				character += "*";
			}
			record = space + character + "\n";
			result +=record;
		}
		System.out.println(result);
	}
	
}
