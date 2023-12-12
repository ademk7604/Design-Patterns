package creationalDesignP.Item2.SingletonDesignP;
/*
 * Projemde bir tane obje olusturuyorum. Nerden istenirse istensin o obje kullanilacak
 * Yani yeni obje new lenmeyecek. Obje bu 
 * ornegin config class olacak nerden istenirse istensin ayni nesneyi kullanilsin
 * 
 */
public class SingletonObject {
	
	String message = "Merhaba";
	
	private static SingletonObject instance = new SingletonObject();
	
	// obje uretmeyi engelledim
	private SingletonObject() {};
	
	public static SingletonObject getInstance()
	{
		return instance;
	}
	
	//bu tet icindi gerek yok aslinda
	public void showMessage() {
		this.message = this.message+" Kardes";
		System.out.println(this.message);
	}
	
	
	// SingletonObject object1 = new SingletonObject();
	// baska siniftan bu sekilde ulasmayi engellemek icin private Constructor yapmaliyim

}
