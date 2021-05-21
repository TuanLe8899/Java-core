package BookStore;

public class Store {
	private static int totalItems 	= 0;		//Số quyển sách hiện tại trong kho sách
	private final int MAX_ITEMS		= 50;		//Số quyển sách lớn nhất mà kho sách chứa được
	private Book[] listItems		= null;
	
	public Store() {
		listItems = new Book[MAX_ITEMS];
	}
	
	public int getItemPosition(String bookID) {
		for (int i = 0; i < totalItems; i++) {
			if(bookID.equals(listItems[i].getID()) == true) return i;
		}
		return -1;
	}
	
	// Check full book
	public boolean checkFull() {
		if(totalItems == MAX_ITEMS) return true;
		return false;
	}
	
	// Check Empty book
	public boolean checkEmpty() {
		if(totalItems == 0) return true;
		return false;
	}
	
	// Add book
	public void add(Book bookObj) {
		if(this.checkFull() == false) {
			this.listItems[totalItems] = bookObj;
			this.totalItems++;
			System.out.println("Add book Successful!");
		} else {
			System.out.println("Store is full!");
		}
	}
	
	// Edit book
	public void edit(String bookID, String bookIDNew, String bookName, double bookPrice) {
		int bookPosition = this.getItemPosition(bookID);
		if(bookPosition == -1) {
			System.out.println("This book isn't exist!");
		} else {
			listItems[bookPosition].setID(bookIDNew);
			listItems[bookPosition].setName(bookName);
			listItems[bookPosition].setPrice(bookPrice);
			System.out.println("Edit sucessful!");
		}
	}
	
	// Delete book
	public void delete(String bookID) {
		int bookPosition = this.getItemPosition(bookID);
		if(bookPosition == -1) {
			System.out.println("This book isn't exist!");
		} else {
			for (int i = 0; i < totalItems; i++) {
				listItems[i] = listItems[i+1];
			}
			this.totalItems--;
			System.out.println("Delete sucessful!");
		}
		
	}
	
	// Find book
	public void find(String bookID) {
		int bookPosition = this.getItemPosition(bookID);
		if(bookPosition == -1) {
			System.out.println("This book isn't exist!");
		} else {
			listItems[bookPosition].showInfo();
		}
	}
	
	// List book
	public void list() {
		if(this.checkEmpty() == false) {
			for (int i = 0; i < totalItems; i++) {
				this.listItems[i].showInfo();
			}
		} else {
			System.out.println("Store is empty!");
		}
	}
}
