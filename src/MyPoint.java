
public class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		double z = (x1-x)*(x1-x) + (y1-y)*(y1-y);
		return Math.sqrt(z);
	}
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2, 2));
	}
}
