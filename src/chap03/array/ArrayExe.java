package chap03.array;

import java.util.Arrays;

public class ArrayExe {

	public static void main(String[] args) {
		study001();
	}
	
	// Sắp xếp ma trận tăng dần
	public static void study003(){
		// 2 6 7 1	00 01 02 03
		// 7 8 1 3  10 11 12 13
		// 7 1 9 4  21 22 23 24
		// 1 4 3 1  31 32 33 34
		
		int[][] arrMulti 	= {{2, 6, 7, 1}, {7, 8, 1, 3}, {7, 1, 9, 4}, {1, 4, 3, 1}};
		System.out.println("Input: " + Arrays.deepToString(arrMulti));
		
		// Chuyển sang mảng 1 chiều
		int rows	= arrMulti.length;
		int columns	= arrMulti[0].length;
		int[] arrNumber		= new int[rows*columns];
		for (int i = 0; i < rows*columns; i++) arrNumber[i] = arrMulti[i / rows][i % rows];
		
		// Sắp xếp mảng 1 chiều
		Arrays.sort(arrNumber);
		
		// Chuyển mảng 1 chiều thành mảng 2 chiều
		for (int i = 0; i < rows*columns; i++) arrMulti[i / rows][i % rows] = arrNumber[i];
		
		System.out.println("Array: " + Arrays.toString(arrNumber));
		System.out.println("Output: " + Arrays.deepToString(arrMulti));
	}
		
	public static void study002(){
		// 2 6 7 1	00 01 02 03
		// 7 8 1 3  10 11 12 13
		// 7 1 9 4  21 22 23 24
		// 1 4 3 1  31 32 33 34
		
		int[][] arrMulti 	= {{2, 6, 7, 1}, {7, 8, 1, 3}, {7, 1, 9, 4}, {1, 4, 3, 1}};
		
		int length	= arrMulti.length;
		int sum	= 0;
		for(int i = 0; i < length; i++){
			Arrays.sort(arrMulti[i]);
			System.out.printf("Phần tử lớn nhất ở dòng %d: %d %n", i+1, arrMulti[i][length-1]);
			sum += arrMulti[i][length-1];
		}
		System.out.println("Tổng các phần tử lớn nhất: " + sum);
	}
		
	public static void study001(){
		// 2 6 7 1	00 01 02 03
		// 7 8 1 3  10 11 12 13
		// 7 1 9 4  21 22 23 24
		// 1 4 3 1  31 32 33 34
		
		int[][] arrMulti 	= {{2, 6, 7, 1}, {7, 8, 1, 3}, {7, 1, 9, 4}, {1, 4, 3, 1}};
		
		// Nằm trên đường chéo
		System.out.println("-------- Nằm trên đường chéo -------- "); 
		int length	= arrMulti.length;
		for(int i = 1; i < length; i++){
			for(int j = 0; j < i; j++){
				System.out.print(arrMulti[i][j] + " ");
			}		
			System.out.println();
		}
		
		// Nằm dưới đường chéo 
		System.out.println("-------- Nằm dưới đường chéo -------- "); 
		for(int i = 0; i < length; i++){
			for(int j = i + 1; j < length; j++){
				System.out.print(arrMulti[i][j] + " ");
			}		
			System.out.println();
		}
	}
}
