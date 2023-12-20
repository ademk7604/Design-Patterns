package StructuralDesignP.Item2.DecoratorDP;

public class PhoneDecorator implements Phone{
	
	protected IPhone basicPhone;
	
	public PhoneDecorator(IPhone basicPhone) {
		this.basicPhone=basicPhone;
		
	}

	@Override
	public String getName() {
		
		return basicPhone.getName();
	}

	@Override
	public int cameraCount() {
		
		return basicPhone.cameraCount();
	}

	@Override
	public double getPrice() {
		
		return basicPhone.getPrice();
	}

}
