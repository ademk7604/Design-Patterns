package creationalDesignP.Item3.Abstract_FactoryDP;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		} 
		return null;
	}

}
