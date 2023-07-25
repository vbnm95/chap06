package com.example;

import util.Color;
import util.VT100;

public class AlphaExample {
	
	public static void main(String[] args) {
		VT100.clearScreen();
		
		VT100.cursorMove(10, 10);
		VT100.setFore(Color.Black);
		VT100.setBack(Color.White);
		System.out.print("Hello");
		
		VT100.cursorMove(13, 5);
		VT100.setFore(Color.Cyan);
		VT100.setBack(Color.Red);
		System.out.print("World");
		
		VT100.cursorMove(5, 20);
		VT100.setFore(Color.Magenta);
		VT100.setBack(Color.White);
		System.out.print("Hello World");
		
		VT100.reset();
	}
	
	public static void main3(String[] args) {
		VT100.clearScreen();
		
		VT100.cursorMove(10, 10);
		VT100.setFore(31);
		VT100.setBack(44);
		System.out.print("Hello");
		
		VT100.cursorMove(13, 5);
		VT100.setFore(32);
		VT100.setBack(46);
		System.out.print("World");
		
		VT100.cursorMove(5, 20);
		VT100.setFore(33);
		VT100.setBack(45);
		System.out.print("Hello World");
		
		VT100.reset();
	}
	
	public static void main2(String[] args) {
		System.out.println("com.example");
		
		util.VT100.clearScreen();
	}
}
