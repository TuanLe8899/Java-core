package chap03.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMulti {

	public static void main(String[] args) {
		study007();
	}
	
	// Tìm phần tử lớn nhất trong ma trận	12
	public static void study007(){
		// 1  7 3
		// 2  1 6
		// 12 8 9
		
		
		int[][] arrMulti = { { 1, 37, 3 }, { 2,21, 6 }, { 12, 8, 9 } };
		
		
		int row	= arrMulti.length;
		int max = arrMulti[0][0];
		
		// Cách 1
		for(int i = 0; i < row; i++){
			for(int j = 0; j < arrMulti[i].length; j++){
				if(max < arrMulti[i][j])	max =  arrMulti[i][j];
			}
		}
		
		// Cách 2
		for(int i = 0; i < row; i++){
			Arrays.sort(arrMulti[i]);
			int length	= arrMulti[i].length;
			if(max < arrMulti[i][length-1])	max =  arrMulti[i][length-1];
		}
		System.out.println("Max:" + max);
		
	}
		
	// Tính tổng các phần tử trên đư�?ng chéo của ma trận vuông
	public static void study006(){
		// 3 7 3	00 01 02
		// 2 5 6	10 11 12
		// 0 8 9	20 21 22

		int[][] arrMulti 	= {{3, 7, 3}, {2, 5, 6}, {0, 8, 9}};
		int sum		= 0;
		
		int length	= arrMulti.length;
		for(int i = 0; i < length; i++){
			sum += arrMulti[i][i];
		}
		System.out.println(sum);
	}
		
	// Tính tổng các phần tử trên cùng một cột
	public static void study005(){
		// 1 2 3 1
		// 4 5 6 4
		// 7 8 9 7

		int[][] arrMulti 	= {{1, 2, 3, 1}, {4, 5, 6, 4}, {7, 8, 9, 7}};
		int sum		= 0;
		int column	= 2;
		int length	= arrMulti.length;
		for(int i = 0; i < length; i++){
			System.out.println(arrMulti[i][column - 1]);
			sum += arrMulti[i][column - 1];
		}
		System.out.println(sum);
	}
	
	// Tính tổng các phần tử trên cùng một dòng
	public static void study004(){
		// 1 2 3 1
		// 4 5 6 4
		// 7 8 9 7

		int[][] arrMulti 	= {{1, 2, 3, 1}, {4, 5, 6, 4}, {7, 8, 9, 7}};
		int sum		= 0;
		int row		= 3;	// arrMulti[row-1]
		
		for(int number : arrMulti[row-1]){
			sum += number;
		}
		
		System.out.println(Arrays.toString(arrMulti[row-1]));
		System.out.println(sum);
	}
		
	// Nhập mảng đa chi�?u
	public static void study003(){
		int rows, columns;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Rows: ");
		rows	= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Columns: ");
		columns	= sc.nextInt();
		sc.nextLine();
		
		int[][] arrMulti = new int[rows][columns] ;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				System.out.printf("Dòng %d cột %d: %n", i+1, j+1);
				arrMulti[i][j]	= sc.nextInt();
				sc.nextLine();
			}
		}
		sc.close();
		
		// 2 5 7 3
		// 4 1 2 2
		// 6 7 1 1
		System.out.println(Arrays.deepToString(arrMulti));
		
	}
	
	// Truy cập và in mảng đa chi�?u
	public static void study002(){
		// 2 9 1
		// 3 6 7
		int[][]	arrMulti	= {{2, 9, 1},{3, 6, 7}};
		
		
		// Dòng 2 Cột 1
		System.out.println("Dòng 2 Cột 1: " + arrMulti[1][0]);
		System.out.println("Dòng 1 Cột 3: " + arrMulti[0][2]);
		System.out.println("Test: " + arrMulti[0].length);
		
		// Cách 1
		int row	= arrMulti.length;
		for(int i = 0; i < row; i++){
			for(int j = 0; j < arrMulti[i].length; j++){
				System.out.printf("Dòng %d cột %d: %d %n", i+1, j+1, arrMulti[i][j]);
			}
		}
		
		// Cách 2
		for(int i = 0; i < row; i++){
			for(int j = 0; j < arrMulti[i].length; j++){
				System.out.print(arrMulti[i][j] + " ");
			}
			System.out.println();
		}
		
		// Cách 3
		System.out.println(Arrays.deepToString(arrMulti));
	}
	
	// Khai báo mảng đa chi�?u
	public static void study001(){
		// 2 9 1
		// 3 6 7
		int[][]	arrMulti	= new int[2][3];
		
		// Hàng thứ nhất row = 0
		arrMulti[0][0]		= 2;
		arrMulti[0][1]		= 9;
		arrMulti[0][2]		= 1;
		
		// Hàng thứ hai row = 1
		arrMulti[1][0]		= 3;
		arrMulti[1][1]		= 6;
		arrMulti[1][2]		= 7;
		
		// Dòng 2 Cột 1
		System.out.println("Dòng 2 Cột 1: " + arrMulti[1][0]);
		System.out.println("Dòng 1 Cột 3: " + arrMulti[0][2]);
		
	}
}
