package StructuralDesignP.Item3.ProxyDP;

public class ProxyRunner {
	public static void main(String[] args) {
		ProxyClass proxyClass1 = new ProxyClass("C:\\resim1.jpg");
		ProxyClass proxyClass2 = new ProxyClass("C:\\resim1.jpg");
		proxyClass1.showImage();
		proxyClass2.showImage();
	}

}
