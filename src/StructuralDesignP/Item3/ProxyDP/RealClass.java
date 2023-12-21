package StructuralDesignP.Item3.ProxyDP;
/*
 * farzedilim bu clasin icinde yazlasik 100 tane method var
 * icerde Fields methopd islem ler var. Kabarik 
 * Class a dikkat ilgili yere gotururken
 */
public class RealClass implements ImageGenerator{
	private String fullPath;

	public RealClass(String fullPath) {
		this.fullPath=fullPath;
	}
	@Override
	public void showImage() {
		System.out.println("Resim gosteriliyor: "+fullPath);
		
	}

	
	

}
