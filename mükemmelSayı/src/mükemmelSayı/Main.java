package mükemmelSayı;

public class Main {

	public static void main(String[] args) {
//kendinden başka tüm pozitif bölenlerinin toplamı 
//kendisine eşitse bu sayıya mükemmel sayı denir.
//6--->1,2,3 28--->1,2,4,7,14
//sayıyı 1den başlatıp kendisine kadar (kendisi dahil değil) tüm sayılara böldürmek ve toplamı almak
	int number = 5;
	int total = 0;
	for(int i=1; i<number; i++) {
		if(number %i ==0) {
			total = total + i;
			}
	}
	if(total==number) {
		System.out.println("Mükemmel sayıdır");
	}
	else {
		System.out.println("Mükemmel sayı değildir");
	}
  }
}
