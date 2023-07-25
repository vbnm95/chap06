package com.example;

import util.Alpha;
import util.VT100;
import java.util.HashSet;

public class RectangleExample {
	public static void main(String[] args) throws InterruptedException {
		VT100.clearScreen();
		
		HashSet<String> set = new HashSet<String>();
		int count = 0;
		
		while(true) {
			Alpha a = new Alpha();
			a.show();
			int line = a.getLine();
			int column = a.getColumn();
			
			String coordi = String.format("%02d%02d", line, column);
			set.add(coordi);
			
			count++;
						
			VT100.reset();
			VT100.cursorMove(1, 42);
			System.out.printf("count = [%05d]", count);
			//Thread.sleep(10);
			
			if(set.size() == 800)
				break;
		}
		
		VT100.reset();
		VT100.cursorMove(21, 1);
		System.out.println("Program End");
	}
	
	
	public static void main2(String[] args) throws InterruptedException {
		int[][] pos = new int[20][40];
		
		VT100.clearScreen();
		
		int count = 0;
		int forCount = 0;
		
		while(true) {
			Alpha a = new Alpha();
			a.show();
			int line = a.getLine() - 1;
			int column = a.getColumn() - 1;
			
			if(pos[line][column] == 0) {
				pos[line][column] = 1;
				count++;
			}
			
			VT100.reset();
			VT100.cursorMove(1, 42);
			System.out.printf("forCount = [%05d]", ++forCount);
			//Thread.sleep(10);
			
			if(count == 800)
				break;
		}
		
		VT100.reset();
		VT100.cursorMove(21, 1);
		System.out.println("Program End");
	}
	
}
