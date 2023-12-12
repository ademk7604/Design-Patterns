package creationalDesignP.Item3.Abstract_FactoryDP;

public abstract class AbstractFactory {

	abstract Color getColor(String color);
	
	abstract Shape getShape(String shape);
}
