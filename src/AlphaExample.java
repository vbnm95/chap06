
public class AlphaExample {
	static class Alpha {
		int fg;   // 30-37
		int bg;   // 40-47
		char ch;  // A-Z
		
		public Alpha() {
			this.fg = (int)(Math.random()*8 + 30);
			this.bg = (int)(Math.random()*8 + 40);
			this.ch = (char)(Math.random()*26 + 'A');
		}
		
		void show() {
			System.out.printf("\033[%dm", fg);
			System.out.printf("\033[%dm", bg);
			System.out.print(ch);
			System.out.print("\033[0m");
		}
		
		void hide() {
			//int num;
			//System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++) {
				Alpha a = new Alpha();
				a.show();
			}
			System.out.println();
			
		}
	}
	
	public static void main1(String[] args) {
		System.out.println("Program Start");
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		
		// a1.show();
		// a2.show();
		System.out.println(a1.fg);
		
		System.out.println("\033[0m");
		System.out.println("Program End...");
		
	}
}
