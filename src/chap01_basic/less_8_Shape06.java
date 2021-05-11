package chap01_basic;

public class less_8_Shape06 {
	
	public static void main(String[] args) {
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
}
