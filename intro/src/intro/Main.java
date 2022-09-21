package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String ortaMetin ="ilginizi çekebilir.";
		String altMetin ="vade süresi....";
		
		System.out.println(ortaMetin);
		
		int vade =12;
		double dolarDun = 18.20 ;
		double dolarBugun = 18.20;
		boolean dolarNeDustuMu = true;
		
		String okYonu="";
		if (dolarBugun<dolarDun) {
			okYonu="down.svg";
			System.out.println(okYonu);
		}else if(dolarBugun>dolarDun) { 
			okYonu="up.svg";
			System.out.println(okYonu);
		} else if(dolarBugun==dolarDun) {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		String[] krediler= {"hızlı kredi","maaşını halkbanktan","mutlu emekli","maaşını halkbanktan","mutlu emekli","maaşını halkbanktan","mutlu emekli","maaşını halkbanktan","mutlu emekli","maaşını halkbanktan","mutlu emekli","maaşını halkbanktan","mutlu emekli","maaşını halkbanktan","mutlu emekli"};
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
				

	}

}
