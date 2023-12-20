package StructuralDesignP.Item2.DecoratorDP;

public class IPhone11 extends PhoneDecorator{

	public IPhone11(IPhone basicPhone) {
		super(basicPhone);
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName()+" 11";
	}

}
