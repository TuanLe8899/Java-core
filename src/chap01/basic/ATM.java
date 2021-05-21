package chap01.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formatter = new DecimalFormat("#,###");
		System.out.println(formatter.format(1500000));
		
		//Các mệnh giá ti�?n
		final int FIVE_HUNDRED_THOUSAND = 500000;
		final int TWO_HUNDRED_THOUSAND 	= 200000;
		final int ONE_HUNDRED_THOUSAND 	= 100000;
		final int FIFTY_THOUSAND 		= 50000;
		final int TWENTY_THOUSAND 		= 20000;
		final int TEN_THOUSAND 			= 10000;
		
		//khởi tạo giá trị ti�?n
		int money 		= 0;
		int newMoney 	= 0;
		
		//số các t�? ti�?n
		int countFiveHundredThousand = 0;
		int countTwoHundredThousand = 0;
		int countOneHundredThousand = 0;
		int countFiftyThousand = 0;
		int countTwentyThousand = 0;
		int countTenThousand = 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Your money:");
			money = sc.nextInt(); 
		} while (money % 10000 != 0);
		sc.close();
		
		System.out.println("________________________________");
		
		//500,000
		countNumberMoney(money, FIVE_HUNDRED_THOUSAND, countFiveHundredThousand);
		newMoney = returnValMoney(money, FIVE_HUNDRED_THOUSAND);
		//200,000
		countNumberMoney(newMoney, TWO_HUNDRED_THOUSAND, countTwoHundredThousand);
		newMoney = returnValMoney(newMoney, TWO_HUNDRED_THOUSAND);
		//100,000
		countNumberMoney(newMoney, ONE_HUNDRED_THOUSAND, countOneHundredThousand);
		newMoney = returnValMoney(newMoney, ONE_HUNDRED_THOUSAND);
		//50,000
		countNumberMoney(newMoney, FIFTY_THOUSAND, countFiftyThousand);		
		newMoney = returnValMoney(newMoney, FIFTY_THOUSAND);
		//20,000
		countNumberMoney(newMoney, TWENTY_THOUSAND, countTwentyThousand);	
		newMoney = returnValMoney(newMoney, TWENTY_THOUSAND);
		//10,000
		countNumberMoney(newMoney, TEN_THOUSAND, countTenThousand);
		newMoney = returnValMoney(newMoney, TEN_THOUSAND);
	}
	
	//Tính số t�? ti�?n cùng loại và in ra kết quả
	public static void countNumberMoney(int money, int denoOfMoney, int countMoney) {
		DecimalFormat formatter = new DecimalFormat("#,###");
		if (money >= denoOfMoney) {
			countMoney 	= money / denoOfMoney;
			System.out.printf("Số t�? ti�?n %s là: %d \n",formatter.format(denoOfMoney),countMoney);
		}
	}
	
	//Trả v�? giá trị ti�?n còn lại
	public static int returnValMoney(int money, int denoOfMoney) {
			money 		= money % denoOfMoney;
			return money;
	}

	
}
