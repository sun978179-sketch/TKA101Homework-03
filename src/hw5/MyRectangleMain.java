package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle r = new MyRectangle();
		r.setWidth(10);
		r.setDepth(20);
		System.out.println(r.getArea());

		MyRectangle n = new MyRectangle(10, 20);
		System.out.println(n.getArea());
	}
}
