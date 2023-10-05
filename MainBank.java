import java.util.Scanner;

class Bank {
	String acctno, name, dob, type, address;
	int balance;
	Bank (String no, String n, String d, String ty, String add, int bal) {
		acctno = no;
		name = n;
		dob = d;
		type = ty;
		address = add;
		balance = bal;
	}
	void display() {
		System.out.println(acctno + " " + name + " " + balance);
	}
	void withdraw(int p) {
		System.out.println("Before withdraw: " + balance);
		balance -= p;
		System.out.println("After withdraw: " + balance);
	}
	void deposit(int p) {
		System.out.println("Before deposit: " + balance);
		balance += p;
		System.out.println("After deposit: " + balance);
	}
}

class MainBank {
	public static void main(String[] args) {
		Bank b = new Bank("123221", "Balu", "26-09-01", "Savings", "Hyderabad", 500);
		b.withdraw(200);
		b.deposit(100);
		b.display();
	}
}