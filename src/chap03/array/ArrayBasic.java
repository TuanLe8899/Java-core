package chap03.array;

import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {
//		study001();
//		study002();
//		study003();
		study004();
	}
	
	// 004 Sum - Min - Max
	public static void study004(){
		int[] arrInt	= {1, 2, 4, 8, 0};
		
		// sum = 0 + 1 + 2 + 4 + 8
		// min = 1; min = 0
		// max = 1; max < 8
		
		int sum	= 0;
		int min	= arrInt[0];
		int max	= arrInt[0];
		for(int number : arrInt){
			sum = sum + number;
			if(min > number)	min = number;
			if(max < number)	max = number;
		}
		
		System.out.println("sum: " + sum);
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}
		
	// 003 Nhập mảng
	public static void study003(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Length: ");
		int length	= sc.nextInt();
		sc.nextLine();
		
		int[] arrNumber	= new int[length];
		
		for(int i = 0; i < length; i++){
			System.out.printf("Phần tử thứ %d: %n", i+1);
			arrNumber[i]	= sc.nextInt();
			sc.nextLine();
		}
		sc.close();
		
		
		for(int i = 0; i < length; i++){
			System.out.printf("Phần tử thứ %d: %d %n", i+1, arrNumber[i]);
		}
	}
		
	// 002 Truy cập phần tử và in mảng
	public static void study002(){
		int[] arrInt	= {30, 31, 32, 33, 34, 35, 36, 37};
		// 30, 31, 32		31	1	(3-1)/2
		// 30, 31, 32, 33	31	1	(4-1)/2
		
		System.out.println("Phần tử thứ 1: " + arrInt[0]);
		System.out.println("Phần tử thứ 2: " + arrInt[1]);
		System.out.println("Phần tử thứ 3: " + arrInt[2]);
		System.out.println("Phần tử thứ 4: " + arrInt[3]);
		System.out.println("Phần tử thứ 5: " + arrInt[4]);
		
		System.out.println("Tổng số phần tử: " + arrInt.length);
		System.out.println("Phần tử đầu tiên: " + arrInt[0]);
		System.out.println("Phần tử cuối cùng: " + arrInt[arrInt.length - 1]);
		System.out.println("Phần tử ở giữa: " + arrInt[(arrInt.length - 1)/2]);
		
		int length	= arrInt.length;
		for(int i = 0; i < length; i++){
			System.out.printf("Phần tử thứ %d: %d %n", i, arrInt[i]);
		}
		
		for(int n : arrInt){
			System.out.println(n);
		}
		
	}
	
	// 001 Khai báo mảng và truy cập mảng
	public static void study001(){
		// Khai báo mảng
		int arrOne[];
		int[] arrTwo;
		
		// Khai báo mảng và cấp vùng nhớs
//		arrInt[0]		= 30;
//		arrInt[1]		= 31;
//		arrInt[2]		= 32;
//		arrInt[3]		= 33;
//		arrInt[4]		= 34;
		int[] arrInt	= {30,31,32,33,34};
		String arrStr[]	= {"Zend 2", "PHP", "Java"};
		
		System.out.println("Phần tử thứ 1: " + arrInt[0]);
		System.out.println("Phần tử thứ 2: " + arrInt[1]);
		System.out.println("Phần tử thứ 3: " + arrInt[2]);
		System.out.println("Phần tử thứ 4: " + arrInt[3]);
		System.out.println("Phần tử thứ 5: " + arrInt[4]);
		
		System.out.println("Phần tử thứ 1: " + arrStr[0]);
		System.out.println("Phần tử thứ 2: " + arrStr[1]);
		System.out.println("Phần tử thứ 3: " + arrStr[2]);
	}
}
