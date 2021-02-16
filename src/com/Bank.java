package com;

public class Bank {
	public static void main(String[] args) {
		Account smith=new Account(2000,"Smith",32);
		Account kathy=new Account(3000,"Kathy",24);
		smith.deposit(2000);
		
		System.out.println("Balance in Smith's account is Rs."+smith.getBalance());
		System.out.println(smith.getAccNum());
		System.out.println("*******************************");
		kathy.withdraw(2000);
		System.out.println("Balance in Kathy's account is Rs."+kathy.getBalance());
		
		System.out.println(kathy.getAccNum());
		

	}
}
