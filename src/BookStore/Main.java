package BookStore;

import java.util.Scanner;

public class Main {
	private static Book bookObj = null;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int function = 0;
		boolean flag=true;
		do {
			showMenu();
			function = sc.nextInt(); 
			
			switch (function) {
				case 1:addBook();break;
				case 2:editBook();break;
				case 3:showBook();;break;
				case 4:
				default:flag = false;break;
			}
		} while(flag == true);
		sc.close();

	}
	
	public static void showMenu() {
		print("-------------BOOK STORE-------------");
		print("Select your option!");
		print("1.Add Book");
		print("2.Edit Info Book");
		print("3.Show Info Book");
		print("4.Exit");
		print("Your choice [1-4]: ");
	}
	
	public static void print(String content) {
		System.out.println(content);
	}
	
	public static void addBook() {
		Scanner sc = new Scanner(System.in);
		print("Book ID: ");
		String bookID = sc.nextLine();
		
		print("Book Name: ");
		String bookName = sc.nextLine();
		
		print("Book Price: ");
		double bookPrice = sc.nextDouble();
		
		bookObj = new Book(bookID, bookName, bookPrice);
	}

	public static void editBook() {
		if(bookObj != null) {
			Scanner sc = new Scanner(System.in);

			print("Book Name: ");
			String bookName = sc.nextLine();
			
			print("Book Price: ");
			double bookPrice = sc.nextDouble();
			
			bookObj.setName(bookName);
			bookObj.setPrice(bookPrice);
		} else {
			print("Book doesn't exist!");
		}
	}
	
	public static void showBook() {
		if(bookObj != null) {
			bookObj.showInfo();
		} else {
			print("Book doesn't exist!");
		}
	}
}