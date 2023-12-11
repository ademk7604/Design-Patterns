package creationalDesignP.creationalDesignP;

public interface Shape {
	// hangi class uzeirnden cagrildiginda o cizildi
	void draw();
	
	
	
	/** Domain nin bilgisi olmaksizin bir nesneyi dogru bir sekilde uretmemizi sagliyor**
	 * A marka arac uretildi, bayi fabrikadan su kadar arac istiyorum.
	 * firma araclari uretip bayie gonderiyor
	 * fabrika baskadir bayi baska. bayiler sadece talepte buunur neyin uretilecegi konusunda
	 * fabrikadaki ic detaylari bayi bilmez
	 * Domain tarafindan bilinmesini istemedigi kisimlari nasil koruyabilirim?
	 */
	
	/*					#looselty coupling#
	 * neden interface uzerinde diger class lara ulasip obje uretiyoruz?
	 * 1) Direk objelerimiz uzerinden cagirma yapmiyoruz
	 * 2) interface ler uretip, o interfeace lerde ilgili objelrle alakali class lar create ediyoruz
	 * 3) Biz bir talepte bulunacagimiz zaman direk sinifa degilde, O siniflarin turetilmis oldugu 
	 * 4) parent dedigimiz o interfaceler uzerinden talepte bulunuyorduk
	 * 5) Bunun sebebi? 
	 * a) applicationumuzin dahada rahat bir sekilde genisleyebilir olmasini sagliyor
	 * b) Degisikliklere kapali ama gelisime acik bir hale getiriyoruz
	 * 					#looselty coupling#
	 */

}
