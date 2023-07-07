package polymorphism_0403;

public class Ex {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		
		s = new Rectangle();
		s.draw();
		
		s = new Triangle();
		s.draw();
		
		System.out.println("---------------");
		
		Shape[] sArr = {new Circle(), new Rectangle(), new Triangle()};
		for(int i = 0; i < sArr.length; i++ ) {
			sArr[i].draw();
		}
		System.out.println("---------------");
		
		polymorphismDraw(sArr);
		
		System.out.println("---------------");
		
		polymorphismDraw2(new Circle());
		polymorphismDraw2(new Rectangle());
		polymorphismDraw2(new Triangle());
		
	}

	public static void polymorphismDraw2(Shape s) {
		s.draw();
	}
	
	public static void polymorphismDraw(Shape[] sArr) {
		for(int i = 0; i < sArr.length; i++) {
			sArr[i].draw();
		}
	}
	
}

class Shape {
	public void draw() {
		System.out.println("도형 그리기");
	}
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("원 그리기");
	}
	
}

class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("사각형그리기");
	}
	
}

class Triangle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("삼각형그리기");
	}
	
}