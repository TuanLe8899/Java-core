package chap01_basic;

import java.util.Scanner;

public class less_6_NextVsNextLineScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name here:");
		String name = sc.nextLine();
		System.out.println("This name is : "+ name);
		sc.close();
	}
}
