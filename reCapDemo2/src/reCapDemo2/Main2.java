package reCapDemo2;

public class Main2 {

	public static void main(String[] args) {
		// en büyük sayıyı yazdıralım
		double[] myList = {1.2,1.3,4.3,5.6};
		double max = myList[0];
		for(double number:myList) {
		if(max<number) {
			max = number;
		 }
		}
		System.out.println("En Büyük = " + max);
          }
}