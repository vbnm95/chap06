
public class CalcExample {

	static class Calc {
		int n1;
		int n2;
		
		Calc(int n1, int n2) {
			this.n1 = n1;
			this.n2 = n2;
		}
		
		int add() {
			return n1 + n2;
		}
		
		int add(int n3) {
			return add() + 3;
		}
		
		int add(int ... nums) {
			int sum = 0;
			for(int i:nums) {
				sum +=i;
			}
			return sum;
		}
		
		void print() {
			System.out.println("sum =" + (n1 + n2));
		}
	}
	
	public static void main(String[] args) {
		Calc c1 = new Calc(10, 20);
		Calc c2 = new Calc(30, 20);
		
		System.out.println(c1.add());
		System.out.println(c2.add());
		
		c1.print();
		c2.print();
		
		System.out.println(c1.add(new int[] {1,2,3,4,5,6,7,8,9,10}));
		System.out.println(c1.add(1,2,3,4,5,6,7,8,9,10));
	}
}
