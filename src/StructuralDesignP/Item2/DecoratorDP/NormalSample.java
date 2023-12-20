package StructuralDesignP.Item2.DecoratorDP;

public class NormalSample {
	/*Alte version
	 * Iphone telefonalrin zayilim ismini gelistiriyoruz
	 * 
	 */
	public static class Iphone11{ 
		public String name() { //100 x100
			return "Iphone 11";
		}
		
		int getCameraCount() {
			return 2;
		}
		
	}
	
	public static class Iphone11Pro{
		public String name() { //120 x120
			return "Iphone 11 Pro";
		}
		
		int getCameraCount() {
			return 3;
		}
		
	}
	
	public static class Iphone11ProMax{
		public String name() { //150 x150
			return "Iphone 11 Pro Max";
		}
		
		int getCameraCount() {
			return 3;
		}
		
	}
}
