package chap01_basic;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Input
		int numberFirst,numberSecond;
		String calculated;
		
		System.out.println("Nhap vao so thu nhat: ");
		numberFirst = sc.nextInt();
		
		System.out.println("Nhap vao so thu hai:");
		numberSecond = sc.nextInt();
		
		System.out.println("Chon phep tinh ma ban mong muon: +,-,*,/");
		calculated = sc.next();
		sc.nextLine();
		
		sc.close();
		
		//Output
		switch (calculated) {
		case "+":
			System.out.printf("%d %s %d = %d",numberFirst,calculated,
					numberSecond,numberFirst+numberSecond);
			break;
		case "-":
			System.out.printf("%d %s %d = %d",numberFirst,calculated,
					numberSecond,numberFirst-numberSecond);
			break;
		case "*": case "x":
			System.out.printf("%d %s %d = %d",numberFirst,calculated,
					numberSecond,numberFirst*numberSecond);
			break;
		case "/": case ":":
			System.out.printf("%d %s %d = %d",numberFirst,calculated,
					numberSecond,numberFirst/numberSecond);
			break;
		default:
			System.out.println("Vui long chon 1 trong 4 phep tinh:+,-,*,/");
			break;
		}
	}

}
