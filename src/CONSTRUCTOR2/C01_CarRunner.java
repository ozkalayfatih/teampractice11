package CONSTRUCTOR2;

import constructor.C02_car;


public class C01_CarRunner {

	public static void main(String[] args) {
		// Dunku Car clss'indan bir obje olusturmak istedigimizde
		// java Car class'ini icinde bulundugumuz class'a import etmek ister
		
		C02_car car=new C02_car();
		System.out.println(car.yil); 
		// ancak baska package'da oldugu icin icinde oldugumuz class'dan 
		// Car class'indaki variable'lara ulasabilmem icin variable'in axcess modifier'i
		// public olmalidir

		C02_car car1=new C02_car();
		System.out.println(car1.yil +" " + car1.model+ " " + car1.renk + " " + car1.km+" " + car1.satilikMi);

		

		
		car1.km=75000;
		car1.model="Corolla";
		car1.renk="Kirmizi";
		System.out.println(car1.km +" " + car1.model + " " + car1.renk + " " + car1.yil+" " + car1.satilikMi);
		// 75000 Corolla Kirmizi 2000 false

		System.out.println(car1.toString());

	}

}