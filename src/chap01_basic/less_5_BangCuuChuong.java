package chap01_basic;

public class less_5_BangCuuChuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i < 10; i++)
		{
			for(int j = 2; j < 10; j++)
			{
				System.out.printf("%d x %d = %d \t",j,i,j*i);
			}
			System.out.println();
		}
	}

}
