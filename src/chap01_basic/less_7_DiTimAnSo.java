package chap01_basic;

import java.util.Scanner;

public class less_7_DiTimAnSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Thiet lap so ngau nhien
		int hiddenNum = (int)(Math.random()*101);
		System.out.println(hiddenNum);
		
		//Khoi tao so diem
		int score=0;
		
		//Xu ly so lan nhap vao cua nguoi choi
		for(int UserNum = 0;UserNum!=hiddenNum;) 
		{
			//Nhap vao
			System.out.println("Enter your number here(1-100): ");
			UserNum = sc.nextInt();
			
			//Kiem tra
			if(UserNum > hiddenNum) {
				System.out.println("Greater than!");
			} else if (UserNum < hiddenNum) {
				System.out.println("Less than!");
			} else {
				System.out.println("Success ful!");
			}
			
			//Tinh diem
			score++;
		}
		
		System.out.println("Score: "+score);
		sc.close();
	}

}
