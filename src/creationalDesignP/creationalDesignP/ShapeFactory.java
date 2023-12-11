package creationalDesignP.creationalDesignP;

public class ShapeFactory {
	// hepsi Shape int ait birer objedir
	public Shape getShape(String shapeType) {
		if(shapeType.equals(null)) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
		
	}

}
