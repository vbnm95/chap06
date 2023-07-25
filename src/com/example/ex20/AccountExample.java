package com.example.ex20;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println(account.getBalance());
		
		account.setBalance(100000);
		System.out.println(account.getBalance());
		
		account.setBalance(30000);
		System.out.println(account.getBalance());
		
		account.setBalance(10000);
		System.out.println(account.getBalance());
	}
}
