class MyPoint2 {
	int x;
	int y;
	
	MyPoint2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		double z = (x1-this.x)*(x1-this.x) + (y1-this.y)*(y1-this.y);
		return Math.sqrt(z);
	}
}

public class Exercise6_7 {
	public static void main(String[] args) {
		MyPoint2 p = new MyPoint2(1,1);
		System.out.println(p.getDistance(2, 2));
	}
}
