package coreJavaLibraryUsers;

public class Assignment8 {
	
	public static void main(String[] args) {
		
		// test case 1
		KidUser kidUser1 = new KidUser(10, "Kids");
		KidUser kidUser2 = new KidUser(18, "Fiction");
		
		System.out.println("Kid User 1: 10, Kids");
		kidUser1.registerAccount();
		kidUser1.requestBook();
		
		System.out.println("Kid User 2: 18, Fiction");
		kidUser2.registerAccount();
		kidUser2.requestBook();
		
		// test case 2
		AdultUser adultUser1 = new AdultUser(5, "Kids");
		AdultUser adultUser2 = new AdultUser(23, "Fiction");
		
		System.out.println("Adult User 1: 5, Kids");
		adultUser1.registerAccount();
		adultUser1.requestBook();
		
		System.out.println("Adult User 2: 23, Fiction");
		adultUser2.registerAccount();
		adultUser2.requestBook();
	}
}

interface LibraryUser {
	public void registerAccount();
	public void requestBook();
}

class KidUser implements LibraryUser{
	
	int age;
	String bookType;
	
	public KidUser() {
		this.age = 0;
		this.bookType = null;
	}
	
	public KidUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	
	public void registerAccount() {
		if(this.age < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		} else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	
	public void requestBook() {
		if(this.bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
}

class AdultUser implements LibraryUser{
	
	int age;
	String bookType;
	
	public AdultUser() {
		this.age = 0;
		this.bookType = null;
	}
	
	public AdultUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	
	public void registerAccount() {
		if(this.age > 12) {
			System.out.println("You have successfully registered under an Adult Account");
		} else {
			System.out.println("Sorry, Age must be less than 12 to register as an adult");
		}
	}
	
	public void requestBook() {
		if(this.bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
}