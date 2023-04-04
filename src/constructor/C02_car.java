package constructor;

public class C02_car {
	// Java biz bir class olusturdugumuzda, o class'dan obje uretecegimizi bilir
	// ve her class'a default bir constructor yerlestirir
	// Java'nin class'a koydugu bu default constructor gorulmez 
	// ama obje uretmek uzere kod yazdigimizda otomatik olarak devreye girer
	
	// bir constructor olusturmak cok kolaydir
	// method'a benzer ama method'dan farklidir
	// 1- Constructor ismi class ismi ile ayni olmalidir
	// class isimleri buyuk harfle basladigi icin Constructor ismi de buyuk harfle baslar
	// (method'dan 1.farki budur, method'lar kucuk harfle baslar)
	// 2- Constructor'larin return tyope'i olmaz
	// (method'dan 2.farki budur, method'larin mutlaka return type'i olmalidir)
	
	public C02_car() {
		
	}
	// Java'nin her class'da olusturdugu constructor budur.


	public int yil=2000;

	@Override
	public String toString() {
		return "C02_car{" +
				"yil=" + yil +
				", renk='" + renk + '\'' +
				", model='" + model + '\'' +
				", km=" + km +
				", satilikMi=" + satilikMi +
				'}';
	}

	public String renk;
	public String model;
	public int km;
	public boolean satilikMi;
	
	// Bugun itibariyle class'larda main method olma mecburiyeti kaldirilmistir :)
	// Ancak bildigimiz gibi main method olmayan bir class direk calistirilamaz
	// Main method'u olmayan class'lar baska class'lardan obje olusturularak kullanilmak uzere 
	// ihtiyac duyulan variable ve method'lari sakladigimiz bir depo gibidir

}