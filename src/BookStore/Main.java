package BookStore;

import java.util.Scanner;

public class Main {
	private static Store storeObj = new Store();
	
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
				case 3:deleteBook();break;
				case 4:findBook();break;
				case 5:listBook();break;
				case 6:
				default:flag = false;break;
			}
		} while(flag == true);
		sc.close();

	}
	
	public static void showMenu() {
		print("");
		print("-------------BOOK STORE-------------");
		print("Select your option!");
		print("1.Add Book");
		print("2.Edit Info Book");
		print("3.Delete Book");
		print("4.Find Book");
		print("5.List Book");
		print("6.Exit");
		print("Your choice [1-6]: ");
	}
	
	public static void print(String content) {
		System.out.println(content);
	}
	
	// Add Book
	public static void addBook() {
		if(storeObj.checkFull() == false) { 
			Scanner sc = new Scanner(System.in);
			print("Book ID: ");
			String bookID = sc.nextLine();
			
			print("Book Name: ");
			String bookName = sc.nextLine();
			
			print("Book Price: ");
			double bookPrice = sc.nextDouble();
			
			Book bookObj = new Book(bookID, bookName, bookPrice);
			storeObj.add(bookObj);
		} else {
			System.out.println("Store is full");
		} 
	}
	
	// Show Book
	public static void listBook() {
		storeObj.list();
	}
	
	// Find Book
	public static void findBook() {
		Scanner sc = new Scanner(System.in);
		print("Enter ID need to find: ");
		String ID = sc.nextLine();
		
		storeObj.find(ID);
	}
	
	// Edit Book
	public static void editBook() { 
		Scanner sc = new Scanner(System.in);
	  
		print("Enter ID Book need to edit: ");
		String ID = sc.nextLine();
	  
		if(storeObj.getItemPosition(ID) != -1) { 
		  
			print("Book ID: ");
			String bookID = sc.nextLine();
		  
			print("Book Name: "); 
			String bookName = sc.nextLine();
		  
			print("Book Price: "); 
			double bookPrice = sc.nextDouble();
		  
			storeObj.edit(ID, bookID, bookName, bookPrice);
		} else {
			print("Book doesn't exist!");
		} 
	}
	 
	// Delete Book
	public static void deleteBook() {
		Scanner sc = new Scanner(System.in);
		print("Enter ID Book to need delete: ");
		String bookID = sc.nextLine();
		
		storeObj.delete(bookID);
	}
}