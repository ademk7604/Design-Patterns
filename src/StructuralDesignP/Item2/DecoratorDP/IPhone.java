package StructuralDesignP.Item2.DecoratorDP;
//Basistelefon und seine Funktionen
public class IPhone implements Phone{

	@Override
	public String getName() {
		
		return "Iphone";
	}

	@Override
	public int cameraCount() {
		//minumim camera
		return 2;
	}

	@Override
	public double getPrice() {
		
		return 799.90;
	}

}
