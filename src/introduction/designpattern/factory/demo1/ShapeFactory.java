package introduction.designpattern.factory.demo1;

public class ShapeFactory {
	 //使用 getShape 方法获取形状类型的对象
	public Shape getShape(String shapeType){
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else if (shapeType.equalsIgnoreCase("square")) {
		    return new Square();	
		}
		return null;
	}
}
