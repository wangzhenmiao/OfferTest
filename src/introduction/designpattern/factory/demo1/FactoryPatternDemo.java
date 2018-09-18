package introduction.designpattern.factory.demo1;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		//获取 Circle 的对象，并调用它的 draw 方法
		Shape shapeCircle = shapeFactory.getShape("circle");
		shapeCircle.draw();
		//获取 Rectangle 的对象，并调用它的 draw 方法
		Shape shapeRectangle = shapeFactory.getShape("rectangle");
		shapeRectangle.draw();
		//获取 Square 的对象，并调用它的 draw 方法
		Shape shapeSquare = shapeFactory.getShape("square");
		shapeSquare.draw();
	}

}
