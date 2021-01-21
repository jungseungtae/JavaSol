
class Circle {
	
	private int n;
	
	Circle(int n) {
		this.n = n;
	}
	int get() {
		return n;
	}
}

class Ncircle extends Circle {

	private String color;
	
	Ncircle(int n, String c) {
		
		super(n);
		color = c;
	}		
	public void show() {
		System.out.println(get() + color);
	}

}
public class Day121_ClassPrac {	
	public static void main(String[] args) {
		
		Ncircle n = new Ncircle(10,"red");
		n.show();		
	}

}


