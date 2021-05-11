package chap01_basic;

public class less_8_Shape08 {

	public static void main(String[] args) {
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
