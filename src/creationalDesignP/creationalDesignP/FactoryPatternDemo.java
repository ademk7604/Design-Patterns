package creationalDesignP.creationalDesignP;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		/* 
		Circle circle1 = new Circle();
		circle1.draw();
		bu sekilde benim fabrikam bilinmis oluyor bayi olan Shape uzerinden istersem bu clasim bilinmez
		*/
		
		// Uretmen gereken her seklin domain sinifini bilmem gerekmiyor
		// peki bu siniflara ihtiyac olmadan obje uretebilseydim :)
		
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
	}
	

}
