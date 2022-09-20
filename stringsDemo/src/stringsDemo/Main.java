package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj );
		System.out.println("Eleman sayısı : "+mesaj.length());
     	System.out.println("5. eleman: "+mesaj.charAt(4 ));
       System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("b"));
       System.out.println(mesaj.endsWith("."));
      char[] karakterler = new char[5];  
//ilk 5 karakteri dediimiz için5 yazdık
    int srcBegin = 0;
	int srcEnd = 5;
	int dstBegin = 0;
	mesaj.getChars( srcBegin, srcEnd, karakterler, dstBegin ); 
//ilk 5 karakteri al 4te bitir
	System.out.println(karakterler); 
      System.out.println(mesaj.indexOf('a'));
//bu karakterin mesajın içinde kaçıncı eleman olduğunu bulmaya yarar
      
      System.out.println(mesaj.lastIndexOf( 'e'));
	

//rePlace operasyonu yani değiştirme:metindeki karakterleri değiştirme
	
		String yeniMesaj = (mesaj.replace(' ', '-'));
		System.out.println(yeniMesaj);
		//metnin içerisinden parça almak 2.indeksten itibaren yazacak.
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,4));
//split fonksiyonu bir metni belli br karakter veya karakter dizsini
//dikkata alarak parçalamaya yarar
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
//lowercase: mesajı küçük harfe çevirme
		System.out.println(mesaj.toLowerCase());
//touppercase: kelimelerin bütün harflerini büyük harfe çevirme
		System.out.println(mesaj.toUpperCase());
//başına ve sonuna boşluk bırakma
		System.out.println(mesaj.trim());
	}
}