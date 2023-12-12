package creationalDesignP.Item2.SingletonDesignP;

public class SingletonDesignPDemo {
	
	public static void main(String[] args) {
		//SingletonObject object2 = new SingletonDesignPDemo();
		
		
		// methodlara class ismi . method ismi ile ulasilir getter setter gibi
		SingletonObject object2 = SingletonObject.getInstance();
		System.out.println(object2.message);
		object2.showMessage();
		
		// ob object singleton is
		SingletonObject object3 = SingletonObject.getInstance();
		System.out.println(object3.message);
		
	}

}
