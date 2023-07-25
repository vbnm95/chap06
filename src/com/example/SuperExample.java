package com.example;

public class SuperExample {

	static class A {
		int i;
		int j = 100;
		
		public A() {
			System.out.println("A() ...");
			System.out.println("A.j =" + j);
		}
		
		public A(int i) {
			this.i = i;
		}
	}
	
	static class B extends A {
		int i = 8;
		
		public B() {
			System.out.println(i);
			super.j = 800;
			System.out.println(super.j);
		}
		
		public B(int i) {
			this.i = i;
		}
	}
	
	static class C {
		int speed;
		
		public C(int speed) {
			this.speed = speed;
		}
	}
	
	static class D extends C {
		
		public D() {
			super(20);
		}
		
	}
	
	public static void main(String[] args) {
		B b = new B();
	}
}
