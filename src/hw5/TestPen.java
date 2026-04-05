package hw5;

public class TestPen {
	public static void main(String[] args) {
	
	Pen a = new Pencil("A牌", 50);
	Pen b = new InkBrush("B牌", 100);
	
	a.write();
	System.out.println(a.getPrice());
	
	b.write();
	System.out.println(b.getPrice());
	
	}
}
