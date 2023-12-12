package creationalDesignP.Item3.Abstract_FactoryDP;

public class AbstractFactoryDPDemo {
	
	public static void main(String[] args) {
		
		AbstractFactory shapFactory = FactoryProducer.getFactory("SHAPE");
		
		//circle objesi olusturuldu
		Shape shape1 = shapFactory.getShape("CIRCLE");
		shape1.draw();
		
		//regtangle objesi olusturuldu
		Shape shape2 = shapFactory.getShape("RECTANGLE");
		shape2.draw();
		
		//color fabrikasi olusturalim
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		//RED objesi olustualim
		
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
		
		//BLUE objesi olusturalim
		Color color2 = colorFactory.getColor("BLUE");
		color2.fill();
	}

}
