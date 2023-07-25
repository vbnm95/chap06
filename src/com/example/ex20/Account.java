package com.example.ex20;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1_000_000;
	private int balance;
	
	
	int getBalance() {
		return balance; 
	}
	
	void setBalance(int b) {
		if(b>=MIN_BALANCE && b <= MAX_BALANCE)
			this.balance += b;
	}

}
