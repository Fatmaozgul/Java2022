package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
//220-284 kendileri hariç pozitif tam bölenlerinin toplamı birbirne eşit.
//yani toplam1=sayı2 ve toplam2=sayı1 olmalıdır
   int sayi1 = 220;
   int sayi2 = 284;
   int toplam1=0;
    int toplam2=0;
//sayı1in bütün bölenlerinş toplamak için bir for döngüsü açıyoruz
    for(int i =1; i<sayi1; i++) {
    	if(sayi1 %i == 0) { // eğer sayi1 iye tam bölünüyorsa
    		toplam1 = toplam1 + i;
    		}
    }
    for(int i=1; i<sayi2; i++) {
    	if(sayi2 %i == 0) {
    		toplam2 = toplam2 +i;
    	}
    }
    if(sayi1 == toplam2 && sayi2 == toplam1) {
    	System.out.println("bu iki sayı arkadaştır");
    	
    } else {
    	System.out.println("bu iki sayı arkadaş değildir");
    }
    
	}

}
