
public class Exercise6_6 {
	static double getDistance(int x, int y, int x1, int y1) {
		double z = (x1-x)*(x1-x) + (y1-y)*(y1-y);
		return Math.sqrt(z);
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}
}
