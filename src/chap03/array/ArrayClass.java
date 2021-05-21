package chap03.array;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		study004();
	}
	
	// 004 Sort
	public static void study004(){
		int arrInt[] = { 30, 31, 24, 36, 34, 27 };
		System.out.println("Input: " + Arrays.toString(arrInt));
		
		// Tăng dần
		Arrays.sort(arrInt);
		System.out.println("Output: " + Arrays.toString(arrInt));
		
		// Giảm dần
		int length	= arrInt.length;
		for(int i = 0; i < length/2; i++){
			int elmTmp	= arrInt[i];
			arrInt[i]	= arrInt[length - 1 - i];
			arrInt[length - 1 - i]	= elmTmp;
		}
		System.out.println("Output: " + Arrays.toString(arrInt));
		
	}
		
	// 003 In mảng
	public static void study003(){
		String arrString[] 	= { "Zend 2", "PHP", "Java", "Javascript" };
		
		System.out.println("----------------------");
		int length	= arrString.length;
		for(int i = 0; i < length; i++){
			System.out.printf("Phần tử thứ %d: %s %n", i, arrString[i]);
		}
		
		System.out.println("----------------------");
		for(String str : arrString){
			System.out.println(str);
		}
		
		System.out.println("----------------------");
		System.out.println(Arrays.toString(arrString));
		
	}
	
	// 002 Sao chép mảng - copyOfRange
	public static void study002(){
							//		0		1		2		3
		String arrString[] 	= { "Zend 2", "PHP", "Java", "Javascript" };
		
		String newArr[]		= Arrays.copyOfRange(arrString, 1, 3);
		System.out.println(newArr.length);
		System.out.println(newArr[0]);
		System.out.println(newArr[1]);
	}
	
	// 001 Sao chép mảng - copyOf
	public static void study001(){
							//  PT 1 (0)	(1)		(2)
		String arrString[] 	= { "Zend 2", "PHP", "Java", "Javascript" };
		arrString[0]		= "Android";
		
		String newArr[]		= Arrays.copyOf(arrString, 6);	// { "Zend 2", "PHP", "Java", "Javascript", null }
		newArr[4]			= "Android";
		newArr[5]			= "IOS";
		System.out.println(newArr[4]);
		System.out.println(newArr[5]);
	}
}
