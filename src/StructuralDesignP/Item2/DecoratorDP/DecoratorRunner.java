package StructuralDesignP.Item2.DecoratorDP;

public class DecoratorRunner {
	public static void main(String[] args) {
		Phone phone = new IPhone11ProMax(new IPhone());
		System.out.println("name "+phone.getName());
		System.out.println("Price "+phone.getPrice());
		System.out.println("CameraCount "+phone.cameraCount());
	}

}
