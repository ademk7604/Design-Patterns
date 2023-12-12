package creationalDesignP.Item1.FactoryDP;

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
	
	// Aslinda birden fazla interface ye ihtiyacimiz oldugunda bu DP ihtiyacimiza cevap vermiyor 
	// bunun icin Abstract DP daha iyi.

}
