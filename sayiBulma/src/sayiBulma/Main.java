 package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi=false; //sayı yok varsayıyoruz
	//tüm sayıları dolaşması için for döngüsü kullanılr
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
			 varMi = true;
			 break;
			}
		}
		if(varMi) {
		System.out.println("Sayı mevcututr");
		}else {
			System.out.println("Sayı mevcut değildir");
		}

	}

}
