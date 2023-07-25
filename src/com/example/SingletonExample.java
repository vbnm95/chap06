package com.example;

class Oracle {
	
	private static Oracle instance = new Oracle();
	
	private Oracle() {
		
	}
	
	public static Oracle getInstance() {
		return instance;
	}
}

public class SingletonExample {
	public static void main(String[] args) {
		
		Oracle o1 = Oracle.getInstance();
		Oracle o2 = Oracle.getInstance();
		
		System.out.println(o1 == o2);
	}
}
