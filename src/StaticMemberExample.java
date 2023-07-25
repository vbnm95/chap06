
public class StaticMemberExample {
	static class Alpha {
		static int count;
		
		int cnt;
		int line;
		int column;
		int fg;
		int bg;
		int ch;
		
		static {
			System.out.println("******");
			System.out.println("static");
			System.out.println("******");
		}
		
		public Alpha() {
			Alpha.count++;
			this.cnt++;
		}
		
		void show() {
			int num = 10;
			System.out.println(Alpha.count);
			System.out.println(this.cnt);
			System.out.println(this.line);
		}
		
		void hide() {
			
		}
		
		static void clearScreen() {
			System.out.println("clearScreen");
			System.out.println(count);
//			System.out.println(line);
			Alpha a = new Alpha();
			System.out.println(a.line);
		}
		
	}
	
	public static void main(String[] args) {
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		Alpha a3 = new Alpha();
		
		System.out.println(a1.cnt);
		System.out.println(a2.cnt);
		System.out.println(a3.cnt);
		System.out.println(Alpha.count);
		
		Alpha.clearScreen();
		
	}
	
}
